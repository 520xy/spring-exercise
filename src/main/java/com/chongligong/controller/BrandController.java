package com.chongligong.controller;

import com.chongligong.domain.Brand;
import com.chongligong.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping
    public Result add(@RequestBody Brand brand)
    {
        Boolean add = brandService.add(brand);
        return new Result(add?Code.ADD_OK:Code.ADD_ERR,null);
    }












}
