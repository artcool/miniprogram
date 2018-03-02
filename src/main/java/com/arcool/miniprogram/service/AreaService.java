package com.arcool.miniprogram.service;

import com.arcool.miniprogram.entity.Area;

import java.util.List;

public interface AreaService {

    /**
     * 获取区域列表
     * @return
     */
    List<Area> getAreaList();

    /**
     * 通过区域ID获取区域信息
     * @param areaId
     * @return
     */
    Area getAreaById(int areaId);

    /**
     * 添加区域信息
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改区域信息
     * @param area
     * @return
     */
    boolean modifyArea(Area area);

    /**
     * 删除指定区域
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
