package com.sswh.platform.functions.service.impl;

import com.sswh.platform.functions.entity.Employee;
import com.sswh.platform.functions.service.FilterEmployee;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployeeBySalary implements FilterEmployee<Employee> {

    @Override
    public boolean filterEmployee(Employee employee) {
        return false;
    }
}
