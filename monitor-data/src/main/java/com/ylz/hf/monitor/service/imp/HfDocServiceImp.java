package com.ylz.hf.monitor.service.imp;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.bean.HfDoc;
import com.ylz.hf.monitor.daoDto.HfAccessLogDTO;
import com.ylz.hf.monitor.daoDto.HfDocDTO;
import com.ylz.hf.monitor.mapper.HfDocMapper;
import com.ylz.hf.monitor.service.IHfDocService;
import com.ylz.hf.monitor.vo.response.HfDocResponse;
import com.ylz.hf.monitor.vo.reuqest.HfDocRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service(value = "hfDocService")
public class HfDocServiceImp implements IHfDocService {
    private static final Logger log = LoggerFactory.getLogger(HfDocServiceImp.class);
    @Autowired
    private HfDocMapper hfDocMapper;

    private List<HfDoc> hfDocs = new ArrayList<>();
    private Map<String, List<HfDoc>> hfMap = new HashMap<>();

    /***
     * 档案统计 （本月新增）
     * 健康档案
     * 电子病历
     */
    @Override
    public HfDocResponse getCountDocCategoriesByInterval(HfDocRequest hfDocRequest) {
        HfDocResponse hfDocResponse = new HfDocResponse();
        hfDocResponse.setMessage("查询成功!!!");
        HfDocDTO hfDocDTO = new HfDocDTO();

        try {
            hfDocDTO.setDocCategory(hfDocRequest.getDocCategory());
            if (hfDocRequest.getStartProcTime() != null && hfDocRequest.getEndProcTime() != null) {
                hfDocDTO.setStartProcTime(hfDocRequest.getStartProcTime());
                hfDocDTO.setEndProcTime(hfDocRequest.getEndProcTime());
            }
            HfDocDTO dto = hfDocMapper.getCountDocCategoriesByInterval(hfDocDTO);
            log.info("档案统计查询结果hfDocDTO={}", dto);
            hfDocResponse.setCode(Constants.SUCCESS_CODE);
            hfDocResponse.setCountNumber(dto != null ? dto.getCountNumber() : 0);
        } catch (Exception e) {
            log.error("档案统计查询有误："+e.getMessage());
            hfDocResponse.setMessage("查询失败!!!");
        }
        return hfDocResponse;
    }


    /*
     *档案服务器调用次数
     * 1.健康档案
     * 2.电子档案
     *
     */
    @Override
    public HfDocResponse getCountCategoryByServe(HfDocRequest hfDocRequest) {
        HfDocResponse hfDocResponse = new HfDocResponse();
        hfDocResponse.setMessage("查询成功!!!");
        HfDocDTO hfDocDTO = new HfDocDTO();

        try {
            hfDocDTO.setDocCategory(hfDocRequest.getDocCategory());
            HfDocDTO dto = hfDocMapper.getCountCategoryByServe(hfDocDTO);
            log.info("档案服务器调用次数统计查询结果hfDocDTO={}", dto);
            hfDocResponse.setCode(Constants.SUCCESS_CODE);
            hfDocResponse.setCountNumber(dto != null ? dto.getCountNumber() : 0);
        } catch (Exception e) {
            log.error("档案服务器调用次数统计查询有误："+e.getMessage());
            hfDocResponse.setMessage("查询失败!!!");
        }
        return hfDocResponse;
    }

    /**
     * 健康档案 电子病历 统计 获取top10
     */
    @Override
    public ResponseBean getCountDocCategoriesTops(HfDocRequest hfDocRequest) {
        ResponseBean responseBean = new ResponseBean();
        HfDocDTO hfDocDTO = new HfDocDTO();
        try {
            hfDocDTO.setDocCategory(hfDocRequest.getDocCategory());
            if (hfDocRequest.getStartProcTime() != null && hfDocRequest.getEndProcTime() != null) {
               hfDocDTO.setStartProcTime(hfDocRequest.getStartProcTime());
                hfDocDTO.setEndProcTime(hfDocRequest.getEndProcTime());
            }
            List<HfAccessLogDTO> dtoList = hfDocMapper.getCountDocCategoriesTops(hfDocDTO);
            log.info("健康档案电子病历汇总结果,dtoList={}", dtoList.toArray().toString());
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setTotal(dtoList.size());
            responseBean.setRows(dtoList);
        } catch (Exception e) {
            log.error("健康档案,电子病历统计top查询"+e.getMessage());
            responseBean.setMessage("健康档案,电子病历统计top查询失败!");
        }
        return responseBean;
    }


    @Override
    public ResponseBean getHfDocs() {
        ResponseBean responseBean = new ResponseBean();
        try {
            log.info("字典表hfDoc查询开始");

            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setTotal(hfDocs.size());
            responseBean.setRows(hfDocs);
            log.info("字典表hfDoc查询成功！！！长度size="+responseBean.getRows());
        }catch (Exception e){
            log.error("共享文档字典表查询失败" + e.getMessage());
            responseBean.setMessage("共享文档字典表查询失败!");
        }
        return responseBean;
    }

    @Override
    public List<HfDoc> getByCategory(String docCategory) {
        List<HfDoc> hfDocList = hfMap.get(docCategory);
        return hfDocList;
    }

    @PostConstruct
    public void init() {
        hfDocs = hfDocMapper.selectList(new QueryWrapper<>());
        hfMap = hfDocs.stream().collect(Collectors.groupingBy(HfDoc::getDocCategory));
    }
}
