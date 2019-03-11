package com.zr.service;

import com.zr.dao.LinkDao;
import com.zr.dao.daoImpl.LinkDaoImpl;
import com.zr.entity.Link;

import java.util.List;

/**
 * @author: LiGX
 * @Date: 2019/3/11 0011
 */
public class LinkService {
    private LinkDao dao=new LinkDaoImpl();
    public List<Link> findAll(){
        return dao.findAll();
    }
}
