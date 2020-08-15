package com.ylz.hf.monitor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.hf.monitor.bean.HfLoginLog;
import com.ylz.hf.monitor.daoDto.HfLoginLogDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfLoginLogMapper extends BaseMapper<HfLoginLog> {
    HfLoginLogDTO getCountDocCategoriesByType(@Param(value = "dTO") HfLoginLogDTO dTO);
}
