package com.chongligong.controller;

import com.chongligong.MyException.BusinessException;
import com.chongligong.MyException.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectException {
    @ExceptionHandler(BusinessException.class)
    public Result businessException(BusinessException ex)
    {
//一系列联系人员操作
        return new Result(ex.getCode(),null,ex.getMessage());
    }

  @ExceptionHandler(SystemException.class)
    public Result systemException(SystemException ex)
  {
      //一系列联系人员操作
      return new  Result(ex.getCode(),null,ex.getMessage());
  }

  @ExceptionHandler(Exception.class)
    public Result exception(Exception e)
  {
      //一系列联系人员操作
      return new Result(Code.SYSTEM_UNKNOW_ERR,null,"系统繁忙");
  }




}
