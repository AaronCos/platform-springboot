package com.sswh.platform.functions;


import com.alibaba.fastjson.JSONObject;
import com.sswh.platform.functions.entity.Employee;
import com.sswh.platform.functions.service.FilterEmployee;
import com.sswh.platform.functions.service.MyFun;
import com.sswh.platform.functions.service.UseFun;
import com.sswh.platform.functions.service.impl.FilterEmployeeByAge;
import com.sswh.platform.functions.service.impl.FilterEmployeeBySalary;
import org.junit.Test;

import java.text.MessageFormat;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class LambdaTest {


    @Test
    public void test1() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        TreeSet<Integer> ts = new TreeSet<Integer>(com);
        ts.add(5);
        ts.add(6);
        ts.add(3);
        ts.stream().forEach(x -> System.out.println(x));
    }

    @Test
    public void test2() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
    }

    List<Employee> employees = Arrays.asList(
            new Employee("A", 25, 5555.55),
            new Employee("D", 35, 6666.55),
            new Employee("B", 35, 7777.55),
            new Employee("E", 55, 8888.55),
            new Employee("C", 69, 9999.55)
    );

    // 获取当前公司中年龄大于35的员工
    public List<Employee> getAgeBeyond35(List<Employee> list) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() > 35) {
                result.add(employee);
            }
        }
        return result;
    }

    @Test
    public void test3() {
        List<Employee> ageBeyond35 = getAgeBeyond35(employees);
        for (Employee employee : ageBeyond35) {
            System.out.println(employee);

        }
    }

    // 需要工资大于7000的
    public List<Employee> getSalay7000(List<Employee> list) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getSalary() > 7000) {
                result.add(employee);
            }
        }
        return result;
    }

    @Test
    public void test4() {
        List<Employee> salay7000 = getSalay7000(employees);
        for (Employee employee : salay7000) {
            System.out.println(employee);
        }
    }

    /**
     * 优化方式一 ：通过策略模式编写
     * @param employees
     * @param filterEmployee
     * @return
     */
    List<Employee> filterEmployee(List<Employee> employees, FilterEmployee<Employee> filterEmployee) {

        return null;
    }

    // 按照年龄过滤>35
    @Test
    public void test5() {
        List<Employee> employees = filterEmployee(this.employees, new FilterEmployeeByAge());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    @Test
    public void test6() {
        List<Employee> employees1 = filterEmployee(employees, new FilterEmployeeBySalary());
        for (Employee employee : employees1) {
            System.out.println(employee);
        }
    }

    /**
     * 使用内部类的方式
     */
    @Test
    public void test7(){
        List<Employee> employs = filterEmployee(employees, new FilterEmployee<Employee>(){

            @Override
            public boolean filterEmployee(Employee employee) {
                return employee.getAge()>50;
            }
        });

        for (Employee ss : employs) {
            System.out.println(ss);
        }
    }

    @Test
    public void test8(){
        filterEmployee(employees, (e) -> e.getAge()>0);
    }

    @Test
    public void test9() {
        helloMyFun(x -> x, 5);
    }

    public void helloMyFun(MyFun myFun, Integer num){
        Integer value = myFun.getValue(num);
        System.out.println(value);
    }

    @org.junit.Test
    public void test10() {
       BiPredicate<Employee, Integer> biPredicate = (x,y) -> Integer.compare(x.getAge(),y)>0;
        BiPredicate<Employee, Integer> biPredicate1 = (x,y) -> Integer.compare(x.getAge(),y)>0;
    }

    public void useFun(UseFun fun, Integer num){


    }

    @Test
    public void test() {
        JSONObject jo = new JSONObject();
        jo.put("cid", "21e1221321312");
        jo.put("injectContent", "gggg");
        System.out.println(jo);
    }

    @Test
    public void test11(){
        List<String> collect = employees.stream().filter(x -> x.getAge()>35).map(Employee::getName).map(x->x+"gg").collect(Collectors.toList());
        System.out.println(collect);
    }


    @Test
    public void test12() {
        List<Employee> collect = employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary, (s1,s2) -> {
           return s2.compareTo(s1);
        })).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }

    @Test
    public void test13() {
        BiPredicate<Integer,Integer> bi = (x, y) -> x>y;
        boolean test = bi.test(5, 4);
        System.out.println(test);
        //Assert.assertTrue(test);
    }

    /**
     * MessageFormat
     */
    @Test
    public void test14() {
        String good = MessageFormat.format("[{1}]", 5,"fafda");
        System.out.println(good);
    }

    @Test
    public void test15() {
        System.out.println();
    }
}