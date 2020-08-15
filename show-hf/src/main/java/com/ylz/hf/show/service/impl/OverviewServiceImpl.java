package com.ylz.hf.show.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.cda.dao.TdyListDrugMapper;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.common.bean.SubBaseBean;
import com.ylz.hf.bean.*;
import com.ylz.hf.dao.*;
import com.ylz.hf.show.bean.BsInfo;
import com.ylz.hf.show.bean.GxyInfo;
import com.ylz.hf.show.bean.ItemInfoView;
import com.ylz.hf.show.bean.MassIndexInfo;
import com.ylz.hf.show.dao.*;
import com.ylz.hf.show.service.IOverviewService;
import com.ylz.hf.show.vo.HistoryInfo;
import com.ylz.hf.show.vo.RelationVo;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class OverviewServiceImpl implements IOverviewService {

    private static final Logger log = LoggerFactory.getLogger(OverviewServiceImpl.class);


    @Autowired
    private Hsdb0101Mapper hsdb0101Mapper;
    @Autowired
    private Hsda0001Mapper hsda0001Mapper;
    @Autowired
    private DiseaseHistoryInfoMapper diseaseHistoryInfoMapper;
    @Autowired
    private AllergyInfoMapper allergyInfoMapper;
    @Autowired
    private FamilyHistoryInfoMapper familyHistoryInfoMapper;
    @Autowired
    private OperHistoryInfoMapper operHistoryInfoMapper;
    @Autowired
    private BloodHistoryInfoMapper bloodHistoryInfoMapper;
    @Autowired
    private Hsdb0301Mapper hsdb0301Mapper;
    @Autowired
    private InoculationInfoMapper inoculationInfoMapper;
    @Autowired
    private TdyListDrugMapper tdyListDrugMapper;
    @Autowired
    private BsInfoMapper bsInfoMapper;
    @Autowired
    private GxyInfoMapper gxyInfoMapper;
    @Autowired
    private HeightInfoMapper heightInfoMapper;
    @Autowired
    private LengthInfoMapper lengthInfoMapper;
    @Autowired
    private MassIndexInfoMapper massIndexInfoMapper;
    @Autowired
    private ItemInfoViewMapper itemInfoViewMapper;

    @Override
    public JSONObject getBodyInfo(String globalId) {
        QueryWrapper queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("global_id", globalId);
        queryWrapper.orderByDesc("start_time");
        JSONObject jsonObject = new JSONObject();
        IPage page = new Page(1, 1);
        IPage heightInfo = heightInfoMapper.selectPage(page, queryWrapper);
        if (CollectionUtils.isNotEmpty(heightInfo.getRecords())) {
            jsonObject.putAll(JSONObject.fromObject(heightInfo.getRecords().get(0)));
        }
        IPage lengthInfo = lengthInfoMapper.selectPage(page, queryWrapper);
        if (CollectionUtils.isNotEmpty(lengthInfo.getRecords())) {
            jsonObject.putAll(JSONObject.fromObject(lengthInfo.getRecords().get(0)));
        }
        IPage hfDocIndex = massIndexInfoMapper.selectPage(page, queryWrapper);
        if (CollectionUtils.isNotEmpty(hfDocIndex.getRecords())) {
            jsonObject.putAll(JSONObject.fromObject(hfDocIndex.getRecords().get(0)));
        }
        return jsonObject;
    }

    @Override
    public List<MassIndexInfo> getBmiInfo(String globalId, String startTime) {
        QueryWrapper<MassIndexInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(MassIndexInfo::getGlobalId, globalId)
                .le(MassIndexInfo::getStartTime, startTime)
                .orderByDesc(MassIndexInfo::getStartTime);
        List<MassIndexInfo> massIndexInfoList = massIndexInfoMapper.selectList(queryWrapper);
        return massIndexInfoList;
    }

    @Override
    public List<GxyInfo> getGxyInfo(String globalId, String startTime) {
        QueryWrapper<GxyInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(GxyInfo::getGlobalId, globalId)
                .le(GxyInfo::getStartTime, startTime)
                .orderByDesc(GxyInfo::getStartTime);
        List<GxyInfo> gxyInfoList = gxyInfoMapper.selectList(queryWrapper);
        return gxyInfoList;
    }

    @Override
    public List<BsInfo> getTnbInfo(String globalId, String startTime) {
        QueryWrapper<BsInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(BsInfo::getGlobalId, globalId)
                .le(BsInfo::getStartTime, startTime)
                .orderByDesc(BsInfo::getStartTime);
        List<BsInfo> bsInfoList = bsInfoMapper.selectList(queryWrapper);
        return bsInfoList;
    }

    @Override
    public HistoryInfo getHistoryInfo(String globalId) {
        /*
        allergy_info	过敏信息
        disease_history_info	既往疾病史
         family_history_info	家族遗传病
         接种史
         **生育史
         药物史
        oper_history_info	手术史
        blood_history_info	输血史

        injury_history_info	外伤史
        disability_history_info	残疾史*/
        return null;
    }

    /**
     * 获取输血史分页数据
     *
     * @param globalId
     * @return
     */
    public IPage<BloodHistoryInfo> getBloodInfo(String globalId, String startTime, Integer page, Integer size) {
        QueryWrapper<Hsda0001> Hsda0001Query = new QueryWrapper<>();
        Hsda0001Query.lambda()
                .eq(Hsda0001::getEmpi, globalId)
                .eq(Hsda0001::getStatus, Constants.SUCCESS_STATUS);
        Hsda0001 hsda0001 = hsda0001Mapper.selectOne(Hsda0001Query);
        IPage<BloodHistoryInfo> pageInfo = new Page<>(page, size);
        if (null == hsda0001) {
            return pageInfo;
        }
        QueryWrapper<BloodHistoryInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(BloodHistoryInfo::getDomainId, hsda0001.getDomainId())
                .eq(BloodHistoryInfo::getUniqueId, hsda0001.getUniqueId())
                .eq(BloodHistoryInfo::getXdsType, hsda0001.getXdsType())
                .eq(BloodHistoryInfo::getXdsVersion, hsda0001.getXdsVersion())
                .gt(BloodHistoryInfo::getBloodDate, startTime)
                .orderByDesc(BloodHistoryInfo::getBloodDate);
        IPage<BloodHistoryInfo> infoIPage = bloodHistoryInfoMapper.selectPage(pageInfo, queryWrapper);
        return infoIPage;
    }

    /**
     * 获取手术史分页数据
     *
     * @param globalId
     * @return
     */
    public IPage<OperHistoryInfo> getOperInfo(String globalId, String startTime, Integer page, Integer size) {
        QueryWrapper<Hsda0001> Hsda0001Query = new QueryWrapper<>();
        Hsda0001Query.lambda()
                .eq(Hsda0001::getEmpi, globalId)
                .eq(Hsda0001::getStatus, Constants.SUCCESS_STATUS);
        Hsda0001 hsda0001 = hsda0001Mapper.selectOne(Hsda0001Query);
        IPage<OperHistoryInfo> pageInfo = new Page<>(page, size);
        if (null == hsda0001) {
            return pageInfo;
        }
        QueryWrapper<OperHistoryInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(OperHistoryInfo::getDomainId, hsda0001.getDomainId())
                .eq(OperHistoryInfo::getUniqueId, hsda0001.getUniqueId())
                .eq(OperHistoryInfo::getXdsType, hsda0001.getXdsType())
                .eq(OperHistoryInfo::getXdsVersion, hsda0001.getXdsVersion())
                .gt(OperHistoryInfo::getOperDate, startTime)
                .orderByDesc(OperHistoryInfo::getOperDate);

        IPage<OperHistoryInfo> infoIPage = operHistoryInfoMapper.selectPage(pageInfo, queryWrapper);
        return infoIPage;
    }

    /**
     * 获取家族遗传病分页数据
     *
     * @param globalId
     * @return
     */
    public IPage<FamilyHistoryInfo> getFamilyInfo(String globalId, String startTime, Integer page, Integer size) {
        QueryWrapper<Hsda0001> Hsda0001Query = new QueryWrapper<>();
        Hsda0001Query.lambda()
                .eq(Hsda0001::getEmpi, globalId)
                .eq(Hsda0001::getStatus, Constants.SUCCESS_STATUS);
        Hsda0001 hsda0001 = hsda0001Mapper.selectOne(Hsda0001Query);
        IPage<FamilyHistoryInfo> pageInfo = new Page<>(page, size);
        if (null == hsda0001) {
            return pageInfo;
        }
        QueryWrapper<FamilyHistoryInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(FamilyHistoryInfo::getDomainId, hsda0001.getDomainId())
                .eq(FamilyHistoryInfo::getUniqueId, hsda0001.getUniqueId())
                .eq(FamilyHistoryInfo::getXdsType, hsda0001.getXdsType())
                .eq(FamilyHistoryInfo::getXdsVersion, hsda0001.getXdsVersion());

        IPage<FamilyHistoryInfo> infoIPage = familyHistoryInfoMapper.selectPage(pageInfo, queryWrapper);
        return infoIPage;
    }


    /**
     * 获取既往疾病分页数据
     *
     * @param globalId
     * @return
     */
    public IPage<DiseaseHistoryInfo> getDiseaseInfo(String globalId, String startTime, Integer page, Integer size) {
        QueryWrapper<Hsda0001> Hsda0001Query = new QueryWrapper<>();
        Hsda0001Query.lambda()
                .eq(Hsda0001::getEmpi, globalId)
                .eq(Hsda0001::getStatus, Constants.SUCCESS_STATUS);
        Hsda0001 hsda0001 = hsda0001Mapper.selectOne(Hsda0001Query);
        IPage<DiseaseHistoryInfo> pageInfo = new Page<>(page, size);
        if (null == hsda0001) {
            return pageInfo;
        }
        QueryWrapper<DiseaseHistoryInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(DiseaseHistoryInfo::getDomainId, hsda0001.getDomainId())
                .eq(DiseaseHistoryInfo::getUniqueId, hsda0001.getUniqueId())
                .eq(DiseaseHistoryInfo::getXdsType, hsda0001.getXdsType())
                .eq(DiseaseHistoryInfo::getXdsVersion, hsda0001.getXdsVersion());

        IPage<DiseaseHistoryInfo> infoIPage = diseaseHistoryInfoMapper.selectPage(pageInfo, queryWrapper);
        return infoIPage;
    }

    /**
     * 获取过敏信息分页数据
     *
     * @param globalId
     * @return
     */
    public IPage<AllergyInfo> getAllergyInfo(String globalId, String startTime, Integer page, Integer size) {
        QueryWrapper<Hsda0001> Hsda0001Query = new QueryWrapper<>();
        Hsda0001Query.lambda()
                .eq(Hsda0001::getEmpi, globalId)
                .eq(Hsda0001::getStatus, Constants.SUCCESS_STATUS);
        Hsda0001 hsda0001 = hsda0001Mapper.selectOne(Hsda0001Query);
        IPage<AllergyInfo> pageInfo = new Page<>(page, size);
        if (null == hsda0001) {
            return pageInfo;
        }
        QueryWrapper<AllergyInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(AllergyInfo::getDomainId, hsda0001.getDomainId())
                .eq(AllergyInfo::getUniqueId, hsda0001.getUniqueId())
                .eq(AllergyInfo::getXdsType, hsda0001.getXdsType())
                .eq(AllergyInfo::getXdsVersion, hsda0001.getXdsVersion())
                .gt(AllergyInfo::getAllergenDate, startTime)
                .orderByDesc(AllergyInfo::getAllergenDate);
        IPage<AllergyInfo> infoIPage = allergyInfoMapper.selectPage(pageInfo, queryWrapper);
        return infoIPage;
    }

    /**
     * 获取接种分页数据
     *
     * @param globalId
     * @return
     */
    public IPage<InoculationInfo> getInoculationInfo(String globalId, String startTime, Integer page, Integer size) {
        QueryWrapper<Hsdb0301> hsdb0301QueryWrapper = new QueryWrapper<>();
        hsdb0301QueryWrapper.lambda()
                .eq(Hsdb0301::getEmpi, globalId)
                .eq(Hsdb0301::getStatus, Constants.SUCCESS_STATUS);
        Hsdb0301 hsdb0301 = hsdb0301Mapper.selectOne(hsdb0301QueryWrapper);
        IPage<InoculationInfo> pageInfo = new Page<>(page, size);
        if (null == hsdb0301) {
            return pageInfo;
        }
        QueryWrapper<InoculationInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(SubBaseBean::getDomainId, hsdb0301.getDomainId())
                .eq(SubBaseBean::getUniqueId, hsdb0301.getUniqueId())
                .eq(SubBaseBean::getXdsType, hsdb0301.getXdsType())
                .eq(SubBaseBean::getXdsVersion, hsdb0301.getXdsVersion())
                .gt(InoculationInfo::getInoculationDate, startTime)
                .orderByDesc(InoculationInfo::getInoculationDate);

        IPage<InoculationInfo> inoculationInfoList = inoculationInfoMapper.selectPage(pageInfo, queryWrapper);
        return inoculationInfoList;
    }

    /**
     * 获取药物分页数据
     *
     * @param globalId
     * @return
     */
    public ResponseBean getDrugInfo(String globalId, String startTime, Integer page, Integer size) {
        ResponseBean responseBean = new ResponseBean();
        responseBean.setCode(Constants.SUCCESS_CODE);
        int count = tdyListDrugMapper.count(globalId, startTime);
        if (count == 0) {
            return responseBean;
        }
        responseBean.setTotal(count);
        Integer start = (page - 1) * size;
        List<Map<String, String>> tdyListDrugList = tdyListDrugMapper.queryInfo(globalId, startTime, start, size);
        if (CollectionUtils.isNotEmpty(tdyListDrugList)) {
            responseBean.setRows(tdyListDrugList);
        }
        return responseBean;
    }

    @Override
    public IPage<ItemInfoView> inspectInfo(String globalId, String startTime, Integer page, Integer size) {
        QueryWrapper<ItemInfoView> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(ItemInfoView::getEmpi, globalId)
                .gt(ItemInfoView::getInspectDate, startTime)
                .orderByDesc(ItemInfoView::getInspectDate);
        IPage<ItemInfoView> pageInfo = new Page<>(page, size);
        IPage<ItemInfoView> itemInfoViewIPage = itemInfoViewMapper.selectPage(pageInfo, queryWrapper);
        return itemInfoViewIPage;
    }

    public List<RelationVo> getGuardianData(String globalId, String identifyNo) {
        List<RelationVo> relationVoList = new ArrayList<>();
        relationVoList.addAll(getChildren(identifyNo));
        QueryWrapper<Hsdb0101> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(Hsdb0101::getEmpi, globalId)
                .eq(Hsdb0101::getStatus, Constants.SUCCESS_STATUS);
        Hsdb0101 hsdb0101 = hsdb0101Mapper.selectOne(queryWrapper);

        if (null != hsdb0101) {
            relationVoList.addAll(getBrotherInfo(hsdb0101));
            RelationVo relationVoM = new RelationVo("母亲", hsdb0101.getMname());
            List<DiseaseHistoryInfo> mDisease = getParentInfo(hsdb0101.getMidentifyNo());
            if (CollectionUtils.isNotEmpty(mDisease)) {
                relationVoM.setDiseaseHistoryInfo(mDisease);
            }
            relationVoList.add(relationVoM);
            RelationVo relationVoF = new RelationVo("父亲", hsdb0101.getFname());
            List<DiseaseHistoryInfo> fDisease = getParentInfo(hsdb0101.getFidentifyNo());
            if (CollectionUtils.isNotEmpty(fDisease)) {
                relationVoF.setDiseaseHistoryInfo(fDisease);
            }
            relationVoList.add(relationVoF);
        }

        return relationVoList;
    }

    private List<RelationVo> getChildren(String identifyNo) {
        QueryWrapper<Hsdb0101> queryWrapperChild = new QueryWrapper<>();
        queryWrapperChild.lambda()
                .and(wrapper -> wrapper.eq(Hsdb0101::getFidentifyNo, identifyNo).or().eq(Hsdb0101::getMidentifyNo, identifyNo))
                .eq(Hsdb0101::getStatus, Constants.SUCCESS_STATUS);
        List<Hsdb0101> list = hsdb0101Mapper.selectList(queryWrapperChild);
        List<RelationVo> relationVoList = new ArrayList<>();
        if (CollectionUtils.isEmpty(list)) {
            return relationVoList;
        }
        for (Hsdb0101 child : list) {
            QueryWrapper<Hsda0001> Hsda0001Query = new QueryWrapper<>();
            Hsda0001Query.lambda()
                    .eq(Hsda0001::getEmpi, child.getEmpi())
                    .eq(Hsda0001::getStatus, Constants.SUCCESS_STATUS);
            Hsda0001 hsda0001 = hsda0001Mapper.selectOne(Hsda0001Query);
            if (null == hsda0001) {
                continue;
            }
            RelationVo relationVo = new RelationVo();
            String sex = child.getSex();
            relationVo.setName(child.getPatientName());
            if (StringUtils.equals(sex, "男")) {
                relationVo.setRelationName("女儿");
            } else if (StringUtils.equals(sex, "女")) {
                relationVo.setRelationName("儿子");
            }
            QueryWrapper<DiseaseHistoryInfo> diseaseQuery = new QueryWrapper<>();
            diseaseQuery.lambda()
                    .eq(DiseaseHistoryInfo::getDomainId, hsda0001.getDomainId())
                    .eq(DiseaseHistoryInfo::getUniqueId, hsda0001.getUniqueId())
                    .eq(DiseaseHistoryInfo::getXdsType, hsda0001.getXdsType())
                    .eq(DiseaseHistoryInfo::getXdsVersion, hsda0001.getXdsVersion());
            List<DiseaseHistoryInfo> diseaseHistoryInfoList = diseaseHistoryInfoMapper.selectList(diseaseQuery);
            if (CollectionUtils.isNotEmpty(diseaseHistoryInfoList)) {
                relationVo.setDiseaseHistoryInfo(diseaseHistoryInfoList);
            }
            relationVoList.add(relationVo);
        }
        return relationVoList;
    }

    private List<DiseaseHistoryInfo> getParentInfo(String identifyNo) {
        QueryWrapper<Hsda0001> Hsda0001Query = new QueryWrapper<>();
        Hsda0001Query.lambda()
                .eq(Hsda0001::getIdentifyNo, identifyNo)
                .eq(Hsda0001::getStatus, Constants.SUCCESS_STATUS);
        Hsda0001 hsda0001 = hsda0001Mapper.selectOne(Hsda0001Query);
        if (null == hsda0001) {
            return null;
        }
        QueryWrapper<DiseaseHistoryInfo> diseaseQuery = new QueryWrapper<>();
        diseaseQuery.lambda()
                .eq(DiseaseHistoryInfo::getDomainId, hsda0001.getDomainId())
                .eq(DiseaseHistoryInfo::getUniqueId, hsda0001.getUniqueId())
                .eq(DiseaseHistoryInfo::getXdsType, hsda0001.getXdsType())
                .eq(DiseaseHistoryInfo::getXdsVersion, hsda0001.getXdsVersion());
        List<DiseaseHistoryInfo> diseaseHistoryInfoList = diseaseHistoryInfoMapper.selectList(diseaseQuery);
        if (CollectionUtils.isEmpty(diseaseHistoryInfoList)) {
            return null;
        }
        return diseaseHistoryInfoList;
    }

    private List<RelationVo> getBrotherInfo(Hsdb0101 hsdb0101) {
        String matherInfo = hsdb0101.getMidentifyNo();
        String fatherInfo = hsdb0101.getFidentifyNo();
        QueryWrapper<Hsdb0101> queryWrapperChild = new QueryWrapper<>();
        queryWrapperChild.lambda()
                .and(wrapper -> wrapper.eq(Hsdb0101::getFidentifyNo, fatherInfo).or().eq(Hsdb0101::getMidentifyNo, matherInfo))
                .eq(Hsdb0101::getStatus, Constants.SUCCESS_STATUS);
        List<Hsdb0101> list = hsdb0101Mapper.selectList(queryWrapperChild);
        List<RelationVo> relationVoList = new ArrayList<>();
        if (CollectionUtils.isEmpty(list)) {
            return relationVoList;
        }
        for (Hsdb0101 child : list) {
            QueryWrapper<Hsda0001> Hsda0001Query = new QueryWrapper<>();
            Hsda0001Query.lambda()
                    .eq(Hsda0001::getEmpi, child.getEmpi())
                    .eq(Hsda0001::getStatus, Constants.SUCCESS_STATUS);
            Hsda0001 hsda0001 = hsda0001Mapper.selectOne(Hsda0001Query);
            if (null == hsda0001) {
                continue;
            }
            RelationVo relationVo = new RelationVo();
            String sex = child.getSex();
            relationVo.setName(child.getPatientName());
            if (StringUtils.equals(sex, "男")) {
                relationVo.setRelationName("兄弟");
            } else if (StringUtils.equals(sex, "女")) {
                relationVo.setRelationName("姐妹");
            }
            QueryWrapper<DiseaseHistoryInfo> diseaseQuery = new QueryWrapper<>();
            diseaseQuery.lambda()
                    .eq(DiseaseHistoryInfo::getDomainId, hsda0001.getDomainId())
                    .eq(DiseaseHistoryInfo::getUniqueId, hsda0001.getUniqueId())
                    .eq(DiseaseHistoryInfo::getXdsType, hsda0001.getXdsType())
                    .eq(DiseaseHistoryInfo::getXdsVersion, hsda0001.getXdsVersion());
            List<DiseaseHistoryInfo> diseaseHistoryInfoList = diseaseHistoryInfoMapper.selectList(diseaseQuery);
            if (CollectionUtils.isNotEmpty(diseaseHistoryInfoList)) {
                relationVo.setDiseaseHistoryInfo(diseaseHistoryInfoList);
            }
            relationVoList.add(relationVo);
        }
        return relationVoList;
    }


}
