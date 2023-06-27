package com.atguigu.springcloud.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //响应码
    public Integer code;
    //信息
    public String message;
    //数据
    public T data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
