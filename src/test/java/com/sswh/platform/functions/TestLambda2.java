package com.sswh.platform.functions;

import com.sswh.platform.functions.entity.Employee;
import com.sswh.platform.functions.service.MyFun;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * lambda的基础：java8引入了新的操作符，箭头操作符
 * 将lambda拆分成左侧和右侧
 * 左侧：lambda的参数列表，接口中对应的方法的参数列表
 * 右侧：功能，lambda体
 *
 */
public class TestLambda2 {

    /**
     * 只有一条语句并且有ruturn，可以省略不写。
     */
    @Test
    public void test1(){
        Integer operation = operation(500, x -> x * x);
        System.out.println(operation);
    }
    @Test
    public void test2(){

    }

    public Integer operation(Integer num, MyFun mf){
        return mf.getValue(num);
    }

    List<Employee> employees = Arrays.asList(
            new Employee("张三", 25, 5555.55),
            new Employee("李四", 35, 6666.55),
            new Employee("王五", 45, 7777.55),
            new Employee("赵六", 55, 8888.55),
            new Employee("田七", 69, 9999.55)
    );

    /**
     * 几何内元素的排序
     */
    @Test
    public void test3(){
        List<Employee> collect = employees.stream().map(x -> x).collect(Collectors.toList());
        for (Employee employee : collect) {
            System.out.println(employee);
        }
    }


    @Test
    public void test4() {
        List<Employee> collect = employees.stream().sorted((e1, e2) -> {
            return e2.getAge() - e1.getAge();
        }).collect(Collectors.toList());
        for (Employee employee : collect) {
            System.out.println(employee);
        }
    }

    /**
     * 测试stream
     */
    @Test
    public void test5() {
        List<Employee> hello = employees.stream().filter(o1 -> !o1.getName().equals("张三")).collect(Collectors.toList());
        for (Employee employee : hello) {
            System.out.println(employee);
        }
    }

    @Test
    public void test6() {
        List<Employee> collect = employees.stream().map(o1 -> o1).collect(Collectors.toList());
        for (Employee o : collect) {
            System.out.println(o);
        }
    }

    @Test
    public void test7() {
        List<Employee> collect = employees.stream().filter(x -> x.getAge() > 5).collect(Collectors.toList());
        for (Employee employee : collect) {
            System.out.println(employee);
        }
    }

    @Test
    public void test8() {
        String collect = employees.stream().map(Employee::getName).collect(Collectors.joining(","));
        System.out.println(collect);
    }

    @Test
    public void test9() {
        BigDecimal bigDecimal = new BigDecimal("95");
        BigDecimal ten = new BigDecimal("10");
        BigDecimal num = bigDecimal.divide(ten, 0,RoundingMode.FLOOR);

        BigDecimal decimal = bigDecimal.divideAndRemainder(ten)[1];
        if (decimal.compareTo(new BigDecimal("5")) >= 0) {
            BigDecimal add = num.add(new BigDecimal("0.5"));
            System.out.println(add.toString());
        }
        System.out.println(num.toString());
    }

    @Test
    public void test10() {
        employees.stream().forEach(System.out::println);
        List<String> collect = employees.stream().map(Employee::getName).map(x->x+"gggg").map(y->y+"yyy").filter(z -> !z.startsWith("张三")).map(k -> k + "hello").map(String::valueOf).collect(Collectors.toList());
        collect.forEach(this::addOne);

    }

    public void addOne(String abc){

    }

    @Test
    public void count() {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> integers1 = Arrays.asList(1, 3, 45, 6, 8, 6);
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            Integer result = integers.get(i)-integers1.get(i);
            resultList.add(result);

        }
        resultList.stream().forEach(System.out::println);



    }

}
