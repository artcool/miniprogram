package com.arcool.miniprogram.web;

import com.arcool.miniprogram.entity.Area;
import com.arcool.miniprogram.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping(value = "/listarea", method = RequestMethod.GET)
    private Map<String,Object> queryArea() {
        Map<String,Object> modelMap = new HashMap<>();
        List<Area> areaList = areaService.getAreaList();
        modelMap.put("areaList",areaList);
        return modelMap;
    }

    @RequestMapping(value = "/queryareabyid", method = RequestMethod.GET)
    private Map<String,Object> queryById(Integer areaId) {
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("area",areaService.getAreaById(areaId));
        return modelMap;
    }

    @RequestMapping(value = "/addarea",method = RequestMethod.POST)
    private Map<String,Object> addArea(@RequestBody Area area) {
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",areaService.addArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/modifyarea", method = RequestMethod.POST)
    private Map<String,Object> modifyArea(@RequestBody Area area) {
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success", areaService.modifyArea(area));
        return modelMap;
    }

    @RequestMapping(value = "/deletearea",method = RequestMethod.GET)
    private Map<String,Object> deleteArea(Integer areaId) {
        Map<String,Object> modelMap = new HashMap<>();
        modelMap.put("success",areaService.deleteArea(areaId));
        return modelMap;
    }
}
