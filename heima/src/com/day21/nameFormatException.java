package com.day21;

public class nameFormatException extends RuntimeException {

    /*1定义异常类-----------类名要见名字知意
     * 2写继承关系--运行时期异常---RuntimeException
     *             编译时期异常---Exception
     * 3空参构造
     * 4带参构造*/

    public nameFormatException() {
    }

    public nameFormatException(String message) {
        super(message);
    }
}
