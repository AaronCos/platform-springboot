package com.sswh.platform.functions.service.impl;

import com.sswh.platform.functions.entity.Employee;
import com.sswh.platform.functions.service.FilterEmployee;
import com.sswh.platform.service.MyPredict;


public class FilterEmployeeByAge implements FilterEmployee<Employee> {

    @Override
    public boolean filterEmployee(Employee employee) {
        return false;
    }

    public void test11(MyPredict<Employee> emp) {

    }


}
