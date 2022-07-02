package com.chongligong.service.BrandServiceImpl;

import com.chongligong.dao.BrandDao;
import com.chongligong.domain.Brand;
import com.chongligong.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl1 implements BrandService {

    @Autowired
    private BrandDao brandDao;

    public Boolean add(Brand brand)
    {
        return brandDao.add(brand)>0;
    }

    public Boolean delete(int id)
    {
        return brandDao.delete(id)>0;
    }

    public Boolean update(Brand brand)
    {
        return brandDao.update(brand)>0;
    }

    public Brand select(int id)
    {
        return brandDao.select(id);
    }

}
