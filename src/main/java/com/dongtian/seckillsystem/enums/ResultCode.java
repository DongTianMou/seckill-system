package com.dongtian.seckillsystem.enums;

import lombok.Getter;

@Getter
public enum ResultCode {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    ;
    private int code;
    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
