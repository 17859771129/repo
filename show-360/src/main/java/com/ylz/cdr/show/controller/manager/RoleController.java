package com.ylz.cdr.show.controller.manager;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerRole;
import com.ylz.manager.service.IRoleService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService roleService;

    @PostMapping("/addRole")
    public String addRole(@RequestBody JSONObject jsonObject) {
        JSONArray funList = jsonObject.getJSONArray("funList");
        jsonObject.remove("funList");
        ManagerRole role = (ManagerRole) JSONObject.toBean(jsonObject, ManagerRole.class);
        ResponseBean responseBean = roleService.addRole(role, funList);
        return responseBean.toString();
    }

    @PostMapping("/updateRole")
    public String updateRole(@RequestBody JSONObject jsonObject) {
        JSONArray funList = jsonObject.getJSONArray("funList");
        jsonObject.remove("funList");
        ManagerRole role = (ManagerRole) JSONObject.toBean(jsonObject, ManagerRole.class);
        ResponseBean responseBean = roleService.updateRole(role, funList);
        return responseBean.toString();
    }

    @PostMapping("/listRole")
    public String listRole(String enableFlag) {
        ResponseBean responseBean = roleService.listRole(enableFlag);
        return responseBean.toString();
    }

    @PostMapping("/pageRole")
    public String pageRole(String enableFlag, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = roleService.pageRole(enableFlag, page, size);
        return responseBean.toString();
    }

}
