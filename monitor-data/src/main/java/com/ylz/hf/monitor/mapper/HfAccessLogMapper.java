package com.ylz.hf.monitor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.hf.monitor.bean.HfAccessLog;
import com.ylz.hf.monitor.daoDto.HfAccessLogDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfAccessLogMapper extends BaseMapper<HfAccessLog> {

    IPage<HfAccessLogDTO> getHfAccessLogDTOListPage(Page page, @Param(value = "hfAccessLogDTO") HfAccessLogDTO hfAccessLogDTO);

    HfAccessLogDTO getHfDocLogAvgTime(@Param(value = "hfAccessLogDTO") HfAccessLogDTO hfAccessLogDTO);
}
