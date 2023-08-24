package com.day27;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static  star createProxy(bigStar bigStar){
        star star=(star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),
                new Class[]{com.day27.star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        return null;
                    }
                }
        );
        return star;
    }
}
