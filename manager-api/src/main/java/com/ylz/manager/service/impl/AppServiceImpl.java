package com.ylz.manager.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerApp;
import com.ylz.manager.dao.ManagerAppMapper;
import com.ylz.manager.service.IAppService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service("appService")
public class AppServiceImpl extends ServiceImpl<ManagerAppMapper, ManagerApp> implements IAppService {

    private static final Logger log = LoggerFactory.getLogger(AppServiceImpl.class);

    @Resource
    private ManagerAppMapper managerAppMapper;

    @Override
    public ResponseBean pageApp(Integer pageSize, Integer size) {
        ResponseBean responseBean = new ResponseBean();
        try {
            Page<ManagerApp> page = new Page<>(pageSize, size);
            IPage<ManagerApp> iPage = this.page(page);
            responseBean.setTotal((int) iPage.getTotal());
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setRows(iPage.getRecords());
        } catch (Exception e) {
            log.error("查询分页APP信息出错！", e.getMessage(), e);
            responseBean.setMessage("查询分页APP信息出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean listApp() {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<ManagerApp> managerAppList = this.list();
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(managerAppList)) {
                return responseBean;
            }
            responseBean.setTotal(managerAppList.size());
            responseBean.setRows(managerAppList);
        } catch (Exception e) {
            log.error("查询APP信息出错！", e.getMessage(), e);
            responseBean.setMessage("查询APP信息出错！");
        }
        return responseBean;
    }

    @Override
    public void updateApp(ManagerApp managerApp) {
        this.updateById(managerApp);
    }

    @Override
    public void addApp(ManagerApp managerApp) {
        managerApp.setEmpowerCode(UUID.randomUUID().toString());
        managerAppMapper.insert(managerApp);
    }
}
