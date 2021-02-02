package com.sswh.platform.functions.service;

import com.sswh.platform.functions.entity.Employee;

import java.util.List;

public interface FilterEmployee<T> {

    boolean filterEmployee(T t);
}
