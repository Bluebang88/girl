package com.example.girl.handle;

import com.example.girl.domain.Result;
import com.example.girl.exception.GirlException;
import com.example.girl.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Blue
 * @date 2018/6/13 23:26
 */
@ControllerAdvice
public class MyExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(MyExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof GirlException) {
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else {
            logger.error("[系统异常]={}",e);
            return ResultUtil.error(-1,"未知错误");
        }
    }
}
