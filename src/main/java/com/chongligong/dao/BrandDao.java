package com.chongligong.dao;

import com.chongligong.domain.Brand;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandDao {

@Insert("insert into tb_brand (brand_name, company_name, ordered, description, status) values (#{brandName},#{companyName},#{ordered},#{description},#{status})")
int add(Brand brand);

@Delete("delete from tb_brand where id=#{id}")
int delete(int id);

@Update("update tb_brand set brand_name = #{brandName},company_name=#{companyName},ordered=#{ordered},description=#{description},status=#{status} where id=#{id} ")
int update(Brand brand);


@Select("select * from tb_brand where id=#{id}")
@Results(id="brandResultMap",value = {
        @Result(column ="brand_name",property ="brandName"),
        @Result(column = "company_name",property = "companyName")
})
Brand select(int id);


}
