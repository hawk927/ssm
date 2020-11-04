package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsService {
    /*
    查询商品列表
     */
    List<Items> findAll();
    /*
    保存商品
     */
    int save(Items items);
}
