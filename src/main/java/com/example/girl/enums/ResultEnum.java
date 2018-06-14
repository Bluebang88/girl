package com.example.girl.enums;

/**
 * @author Blue
 * @date 2018/6/13 23:38
 */
public enum ResultEnum {
    UNKONW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    ERROR(1,"错误"),
    ERROR_AVLIDATION(2,"后台校验失败"),
    PRIMARY_SCHOOL(100,"你可能在上小学吧"),
    MIDDLE_SCHOOL(101,"你可能在上初中吧"),
    ;
    private Integer code;
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
