package com.sswh.platform.service;


@FunctionalInterface
public interface MyPredict<T> {
    boolean apply(T t);
}
