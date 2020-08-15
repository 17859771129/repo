package com.ylz.hf.show.controller;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerApp;
import com.ylz.manager.service.IAppService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/app")
public class AppController {
    @Resource
    private IAppService appService;

    @PostMapping("/addApp")
    public String addApp(ManagerApp managerApp) {
        appService.addApp(managerApp);
        return new ResponseBean(Constants.SUCCESS_CODE, "").toString();
    }

    @PostMapping("/updateApp")
    public String updateApp(ManagerApp managerApp) {
        appService.updateApp(managerApp);
        return new ResponseBean(Constants.SUCCESS_CODE, "").toString();
    }

    @PostMapping("/listApp")
    public String listApp() {
        ResponseBean responseBean = appService.listApp();
        return responseBean.toString();
    }

    @PostMapping("/pageApp")
    public String pageApp(@RequestParam(defaultValue = "1")
                                  Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = appService.pageApp(page, size);
        return responseBean.toString();
    }

}
