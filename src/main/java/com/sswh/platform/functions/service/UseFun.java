package com.sswh.platform.functions.service;
@FunctionalInterface
public interface UseFun<T> {

    String countLength(T t);
}
