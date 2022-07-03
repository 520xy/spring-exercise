package com.chongligong.controller;

import com.chongligong.domain.Brand;
import com.chongligong.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping
    public Result add(@RequestBody Brand brand)
    {
        Boolean add = brandService.add(brand);
        return new Result(add?Code.ADD_OK:Code.ADD_ERR,add);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable int id)
    {
        Boolean delete = brandService.delete(id);
        return new Result(delete?Code.DELETE_OK:Code.DELETE_ERR,delete);
    }

    @PutMapping
     public Result update(@RequestBody Brand brand)
    {
        Boolean update = brandService.update(brand);
        return new Result(update?Code.UPDATE_OK:Code.UPDATE_ERR,update);
    }

    @GetMapping("/{id}")
    public Result select(@PathVariable int id)
    {
        Brand select = brandService.select(id);
        return new Result(select!=null?Code.SELECT_OK:Code.SELECT_ERR,select);
    }


}
