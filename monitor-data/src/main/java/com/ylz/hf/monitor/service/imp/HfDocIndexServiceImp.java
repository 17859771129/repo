package com.ylz.hf.monitor.service.imp;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.bean.HfDoc;
import com.ylz.hf.monitor.daoDto.HfDocIndexDTO;
import com.ylz.hf.monitor.mapper.HfDocIndexMapper;
import com.ylz.hf.monitor.service.HfDocIndexService;
import com.ylz.hf.monitor.service.IHfDocService;
import com.ylz.hf.monitor.vo.DocGroupTotal;
import com.ylz.hf.monitor.vo.response.HfDocIndexResponse;
import com.ylz.hf.monitor.vo.reuqest.HfDocIndexRequest;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "hfDocIndexService")
public class HfDocIndexServiceImp implements HfDocIndexService {
    private static final Logger log = LoggerFactory.getLogger(HfDocIndexServiceImp.class);
    @Autowired
    private HfDocIndexMapper hfDocIndexMapper;

    @Autowired
    private IHfDocService hfDocService;
    private final String proLog = "索引表";

    @Override
    public HfDocIndexResponse getHfDocIndexDTOByEntity(HfDocIndexRequest hfDocIndexRequest) {
        HfDocIndexResponse hfDocIndexResponse = new HfDocIndexResponse();
        hfDocIndexResponse.setCode(Constants.SUCCESS_CODE);
        hfDocIndexResponse.setMessage(proLog + "共享文档cda查看 查询成功！！！");
        try {
            HfDocIndexDTO hfDocIndexDTO = getHfDocIndexDTO(hfDocIndexRequest);
            log.info(proLog + "共享文档cda查看查询参数hfDocIndexDTO[]", hfDocIndexDTO);
            HfDocIndexDTO dto = hfDocIndexMapper.getHfDocIndexDTOByEntity(hfDocIndexDTO);
            log.info(proLog + "共享文档cda查看查询结果 dto[]", dto);
            HfDocIndexDTO returndtO = new HfDocIndexDTO();
            if (dto != null) {
                returndtO.setCdaPath(dto.getCdaPath() != null ? dto.getCdaPath() : "");
            }

            hfDocIndexResponse.setDate(returndtO);
        } catch (Exception e) {
            log.error(proLog + "共享文档cda查看异常" + e.getMessage());
            hfDocIndexResponse.setMessage(proLog + "共享文档cda查看异常");
        }
        return hfDocIndexResponse;
    }

    private HfDocIndexDTO getHfDocIndexDTO(HfDocIndexRequest hfDocIndexRequest) throws Exception {
        HfDocIndexDTO hfDocIndexDTO = new HfDocIndexDTO();
        if (StringUtils.isEmpty(hfDocIndexRequest.getRepositoryUniqueId())) {
            throw new Exception(proLog + "共享文档cda查看入参 repositoryUniqueId 不可为空");
        }
        hfDocIndexDTO.setRepositoryUniqueId(hfDocIndexRequest.getRepositoryUniqueId());
        return hfDocIndexDTO;
    }

    @Override
    public ResponseBean getTotal(String docCategory, String startTime) {
        ResponseBean responseBean = new ResponseBean();
        try {
            int total = hfDocIndexMapper.selectTotal(docCategory, startTime);
            responseBean.setTotal(total);
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("文档统计查询失败，{}，{}", e.getMessage(), e);
            responseBean.setMessage("文档总数统计查询失败!");
        }
        return responseBean;
    }

    @Override
    public ResponseBean getGroupTotal(String docCategory, String startTime) {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<Map<String, Object>> mapList = hfDocIndexMapper.selectGroupTotal(docCategory, startTime);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(mapList)) {
                return responseBean;
            }
            List<HfDoc> hfDocList = hfDocService.getByCategory(docCategory);
            Map<String, Long> map = new HashMap<>();
            mapList.forEach(list -> {
                map.put((String) list.get("code"), (Long) list.get("total"));
            });
            List<DocGroupTotal> list = new ArrayList<>();
            hfDocList.forEach(hfDoc -> {
                String code = hfDoc.getDocCode();
                DocGroupTotal docGroupTotal = new DocGroupTotal(hfDoc.getDocCn(), code);
                if (map.containsKey(code)) {
                    docGroupTotal.setTotal(map.get(code).intValue());
                }
                list.add(docGroupTotal);
            });
            responseBean.setTotal(list.size());
            responseBean.setRows(list);
        } catch (Exception e) {
            log.error("文档分组统计查询失败，{}，{}", e.getMessage(), e);
            responseBean.setMessage("文档分组统计查询失败!");
        }
        return responseBean;
    }
}
