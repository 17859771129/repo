package com.ylz.manager.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerFun;
import com.ylz.manager.dao.ManagerFunMapper;
import com.ylz.manager.service.IFunService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FunServiceImpl extends ServiceImpl<ManagerFunMapper, ManagerFun> implements IFunService {
    private static final Logger log = LoggerFactory.getLogger(FunServiceImpl.class);

    @Override
    public ResponseBean pageFun(Integer pageSize, Integer size) {
        ResponseBean responseBean = new ResponseBean();
        try {
            Page<ManagerFun> page = new Page<>(pageSize, size);
            IPage<ManagerFun> iPage = this.page(page);
            responseBean.setTotal((int) iPage.getTotal());
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setRows(iPage.getRecords());
        } catch (Exception e) {
            log.error("分页查询功能信息出错！", e.getMessage(), e);
            responseBean.setMessage("分页查询功能信息出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean listFun() {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<ManagerFun> managerFunList = this.list();
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(managerFunList)) {
                return responseBean;
            }
            responseBean.setTotal(managerFunList.size());
            responseBean.setRows(managerFunList);
        } catch (Exception e) {
            log.error("查询功能信息出错！", e.getMessage(), e);
            responseBean.setMessage("查询功能信息出错！");
        }
        return responseBean;
    }

    @Override
    public void updateFun(ManagerFun managerFun) {
        this.updateById(managerFun);
    }

    @Override
    public void addFun(ManagerFun managerFun) {
        this.save(managerFun);
    }
}
