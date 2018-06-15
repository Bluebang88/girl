package com.example.girl.utils;

import com.example.girl.domain.Result;
import com.example.girl.enums.ResultEnum;

/**
 * @author Blue
 * @date 2018/6/13 22:48
 *
 * 0：表示成功
 * 1：表示错误，错误信心在msg中，
 * 2：表示bean的验证错误，不管多少个错误都以map的形式返回
 * 3：表示被拦截
 */
public class ResultUtil {


    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }


    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code,String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result errorMap(Object object) {
        Result result = new Result();
        result.setCode(2);
        result.setMsg("后台检验失败");
        result.setData(object);
        return result;
    }
}
