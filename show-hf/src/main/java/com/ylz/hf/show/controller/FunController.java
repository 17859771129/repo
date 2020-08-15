package com.ylz.hf.show.controller;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerFun;
import com.ylz.manager.service.IFunService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/fun")
public class FunController {
    @Resource
    private IFunService funService;

    @PostMapping("/addFun")
    public String addFun(ManagerFun managerFun) {
        funService.addFun(managerFun);
        return new ResponseBean(Constants.SUCCESS_CODE, "").toString();
    }

    @PostMapping("/updateFun")
    public String updateFun(ManagerFun managerFun) {
        funService.updateFun(managerFun);
        return new ResponseBean(Constants.SUCCESS_CODE, "").toString();
    }

    @PostMapping("/listFun")
    public String listFun() {
        ResponseBean responseBean = funService.listFun();
        return responseBean.toString();
    }

    @PostMapping("/pageFun")
    public String pageFun(@RequestParam(defaultValue = "1")
                                  Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = funService.pageFun(page, size);
        return responseBean.toString();
    }

}
