package com.ylz.cdr.show.controller.manager;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.service.IDocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doc")
public class DocController {
    @Autowired
    private IDocService docService;

    @PostMapping("/addDoc")
    public String addDoc(ManagerDoc managerDoc) {
        docService.addDoc(managerDoc);
        return new ResponseBean(Constants.SUCCESS_CODE, "").toString();
    }

    @PostMapping("/updateDoc")
    public String updateDoc(ManagerDoc managerDoc) {
        docService.updateDoc(managerDoc);
        return new ResponseBean(Constants.SUCCESS_CODE, "").toString();
    }

    @PostMapping("/listDoc")
    public String listDoc(String enableFlag) {
        ResponseBean responseBean = docService.listDoc(enableFlag);
        return responseBean.toString();
    }

    @PostMapping("/pageDoc")
    public String pageDoc(String enableFlag, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = docService.pageDoc(enableFlag, page, size);
        return responseBean.toString();
    }

}
