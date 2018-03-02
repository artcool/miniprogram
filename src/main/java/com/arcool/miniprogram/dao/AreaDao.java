package com.arcool.miniprogram.dao;

import com.arcool.miniprogram.entity.Area;

import java.util.List;

/**
 * 区域操作接口
 */
public interface AreaDao {

    /**
     * 查询所有区域列表
     * @return
     */
    List<Area> queryArea();

    /**
     * 查询单条数据
     * @param areaId 区域ID
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 插入区域信息
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 删除一条区域信息
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);

    /**
     * 更新区域信息
     * @param area
     * @return
     */
    int updateArea(Area area);
}
