package com.ylz.hf.monitor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.hf.monitor.bean.HfDocIndex;
import com.ylz.hf.monitor.daoDto.HfDocIndexDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface HfDocIndexMapper extends BaseMapper<HfDocIndex> {

    HfDocIndexDTO getHfDocIndexDTOByEntity(@Param(value = "hfDocIndexDTO") HfDocIndexDTO hfDocIndexDTO);

    int selectTotal(@Param(value = "docCategory") String docCategory, @Param(value = "startTime") String startTime);

    List<Map<String, Object>> selectGroupTotal(String docCategory, String startTime);
}
