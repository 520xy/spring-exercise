package com.chongligong.service;


import com.chongligong.domain.Brand;

public interface BrandService {
     Boolean add(Brand brand);
     Boolean delete(int id);
     Boolean update(Brand brand);
     Brand select(int id);
}
