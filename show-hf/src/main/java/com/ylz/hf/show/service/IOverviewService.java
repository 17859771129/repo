package com.ylz.hf.show.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.bean.*;
import com.ylz.hf.show.bean.BsInfo;
import com.ylz.hf.show.bean.GxyInfo;
import com.ylz.hf.show.bean.ItemInfoView;
import com.ylz.hf.show.bean.MassIndexInfo;
import com.ylz.hf.show.vo.HistoryInfo;
import com.ylz.hf.show.vo.RelationVo;
import net.sf.json.JSONObject;

import java.util.List;

public interface IOverviewService {

    JSONObject getBodyInfo(String globalId);

    List<MassIndexInfo> getBmiInfo(String globalId, String startTime);

    List<GxyInfo> getGxyInfo(String globalId, String startTime);

    List<BsInfo> getTnbInfo(String globalId, String startTime);

    HistoryInfo getHistoryInfo(String globalId);

    IPage<BloodHistoryInfo> getBloodInfo(String globalId, String startTime, Integer page, Integer size);

    IPage<OperHistoryInfo> getOperInfo(String globalId, String startTime, Integer page, Integer size);

    IPage<FamilyHistoryInfo> getFamilyInfo(String globalId, String startTime, Integer page, Integer size);

    IPage<DiseaseHistoryInfo> getDiseaseInfo(String globalId, String startTime, Integer page, Integer size);

    IPage<AllergyInfo> getAllergyInfo(String globalId, String startTime, Integer page, Integer size);

    IPage<InoculationInfo> getInoculationInfo(String globalId, String startTime, Integer page, Integer size);

    ResponseBean getDrugInfo(String globalId, String startTime, Integer page, Integer size);

    IPage<ItemInfoView> inspectInfo(String globalId, String startTime, Integer page, Integer size);

    List<RelationVo> getGuardianData(String globalId, String identifyNo);
}
