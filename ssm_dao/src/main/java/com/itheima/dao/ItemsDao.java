package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsDao {
    /*
    查询商品列表
     */
    List<Items> findAll();
    /*
    保存商品
     */
    int save(Items items);
}
