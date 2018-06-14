package com.example.girl.exception;

import com.example.girl.enums.ResultEnum;

/**
 * @author Blue
 * @date 2018/6/13 23:18
 */
public class GirlException extends RuntimeException {
    private Integer code;

    public GirlException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
