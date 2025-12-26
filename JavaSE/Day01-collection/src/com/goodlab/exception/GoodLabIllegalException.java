package com.goodlab.exception;

// 自定义的编译异常
// 1.继承 Exception
// 2. 重写Exception的构造器
// 3. 哪里需要用这个异常返回，哪里就throw

public class GoodLabIllegalException extends Exception{
    public GoodLabIllegalException() {
    }

    public GoodLabIllegalException(String message) {
        super(message);
    }
}
