package com.zr.dao;

import com.zr.entity.NewsType;

import java.util.List;

/**
 * @author: LiGX
 * @Date: 2019/3/11 0011
 */
public interface NewsTypeDao {
    public List<NewsType> findAll();
}
