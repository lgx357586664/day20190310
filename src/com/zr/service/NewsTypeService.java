package com.zr.service;

import com.zr.dao.NewsTypeDao;
import com.zr.dao.daoImpl.NewsTypeDaoImpl;
import com.zr.entity.NewsType;

import java.util.List;

/**
 * @author: LiGX
 * @Date: 2019/3/11 
 */
public class NewsTypeService {
    private NewsTypeDao dao=new NewsTypeDaoImpl();
    public List<NewsType> findAll(){
        return dao.findAll();
    }
}
