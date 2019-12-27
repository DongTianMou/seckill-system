package com.dongtian.seckillsystem.vo;

import com.dongtian.seckillsystem.enums.ResultCode;
import lombok.Data;

@Data
public class ResultVo<T> {

    private Integer code;

    private String message;

    private T data;

    public static ResultVo success(Object object) {
        ResultVo resultVO = new ResultVo();
        resultVO.setData(object);
        resultVO.setCode( ResultCode.SUCCESS.getCode() );
        resultVO.setMessage("成功");
        return resultVO;
    }

    public static ResultVo success() {
        return success(null);
    }

    public static ResultVo error(Integer code, String msg) {
        ResultVo resultVO = new ResultVo();
        resultVO.setCode(code);
        resultVO.setMessage(msg);
        return resultVO;
    }

}
