package com.ylz.dict.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.dict.bean.DeptInfo;
import com.ylz.dict.dao.DeptInfoMapper;
import com.ylz.dict.service.IDeptInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DeptInfoServiceImpl extends ServiceImpl<DeptInfoMapper, DeptInfo> implements IDeptInfoService {

    private static final Logger log = LoggerFactory.getLogger(DeptInfoServiceImpl.class);

    @Override
    public boolean mergeData(DeptInfo deptInfo) {
        try {
            QueryWrapper<DeptInfo> queryWrapper = new QueryWrapper<>();
            queryWrapper.lambda()
                    .eq(DeptInfo::getDeptId, deptInfo.getDeptId())
                    .eq(DeptInfo::getParentDeptId, deptInfo.getParentDeptId())
                    .eq(DeptInfo::getSendId, deptInfo.getSendId());
            DeptInfo hisData = this.getOne(queryWrapper);
            if (null != hisData) {
                this.update(deptInfo, queryWrapper);
            } else {
                this.save(deptInfo);
            }
            return true;
        } catch (Exception e) {
            log.error("新增或者修改科室出错，{}，{}", e.getMessage(), e);
        }
        return false;
    }
}