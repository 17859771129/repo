package com.ylz.hf.monitor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.hf.monitor.bean.HfDocLog;
import com.ylz.hf.monitor.daoDto.HfDocLogDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HfDocLogMapper extends BaseMapper<HfDocLog> {
    IPage<HfDocLogDTO> getHfDocLogPages(Page page, @Param(value = "hfDocLogDTO") HfDocLogDTO hfDocLogDTO);

}
