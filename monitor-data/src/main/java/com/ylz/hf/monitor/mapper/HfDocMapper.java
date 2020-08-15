package com.ylz.hf.monitor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.hf.monitor.bean.HfDoc;
import com.ylz.hf.monitor.daoDto.HfAccessLogDTO;
import com.ylz.hf.monitor.daoDto.HfDocDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HfDocMapper extends BaseMapper<HfDoc> {

    List<HfDocDTO> getHfDocs();

    HfDocDTO getCountDocCategoriesByInterval(@Param(value = "hfDocDTO") HfDocDTO hfDocDTO) throws Exception;

    HfDocDTO getCountCategoryByServe(@Param(value = "hfDocDTO") HfDocDTO hfDocDTO) throws Exception;

    List<HfAccessLogDTO> getCountDocCategoriesTops(@Param(value = "hfDocDTO") HfDocDTO hfDocDTO) throws Exception;

}
