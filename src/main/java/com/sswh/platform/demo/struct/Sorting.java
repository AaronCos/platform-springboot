package com.sswh.platform.demo.struct;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        List<Integer> a;
        a = getRand(10);
        // 通过格式化输出日期
        java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        Date time1 = cal.getTime();
        System.out.println("beginTime:"+time1);
        List<Integer> ss = bubbleSort1(a);
        System.out.println(ss);

        Date time2 = cal.getTime();
        System.out.println("endTime:"+time2);
        System.out.println("时间："+(time2.getTime()-time1.getTime()));
    }
    /**
     * 获取任意个数的整形随机数列表
     * @return
     */
    public static List<Integer> getRand(int num){
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<num;i++){
            Integer rand = (int) Math.ceil(Math.random()*1000);
            list.add(rand);
        }
        return list;
    }
    /**
     * 接受一个整型列表，返还升序的列表
     * @param list
     * @author Aaron
     */
    public static List<Integer> selectSort(List<Integer> list){
        for(int j = 0;j<list.size()-1;j++){
            int min = j;
            for(int k = j+1;k<list.size();k++){
                if(list.get(k)<list.get(min)){
                    min  = k;
                }
            }
            if(min != j){
                int temp = list.get(j);
                list.set(j, list.get(min));
                list.set(min, temp);
            }
        }
        return list;
    }
    /**
     * 插入排序 20171228
     * @param list
     * @return
     * @author Aaron
     */
    public static List<Integer> insertSort(List<Integer> list){
        for(int i = 1;i<list.size();i++){
            if(list.get(i)<list.get(i-1)){
                int temp = list.get(i); //取出i位置上的元素
                int j = i;			    //取出待比较的位置
                while(j>0&&list.get(j-1)>temp){//将排序好的前面序列分别与   temp比较
                    list.set(j,list.get(j-1));
                    j--;
                }
                list.set(j, temp);
            }
        }
        return list;
    }
    /**
     * 冒泡排序 20171228
     * @param list
     * @return
     * @author Aaron
     */
    public static List<Integer> bubbleSort(List<Integer> list){
        for(int i = 0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-i;j++){
                if(list.get(j)<list.get(j-1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j-1));
                    list.set(j-1,temp);
                }
            }
        }
        return list;
    }
    /**
     * 冒泡排序的第二种实现插入排序 20171229
     * @param list
     * @return
     * @author Aaron
     */
    public static List<Integer> bubbleSort1(List<Integer> list){
        for(int i = 0;i<list.size()-1;i++){
            for(int j=0;j<list.size()-i-1;j++){
                if(list.get(j)>list.get(j+1)){
                    int temp = list.get(j+1);
                    list.set(j+1, list.get(j));
                    list.set(j,temp);
                }
            }
        }
        return list;
    }
}
