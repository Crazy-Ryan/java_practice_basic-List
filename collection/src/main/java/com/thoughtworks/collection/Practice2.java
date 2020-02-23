package com.thoughtworks.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice2 {

    public static void main(String[] args) {
        //分别用for循环、增强for循环、迭代器遍历并打印getNumbers返回的List
        List<Integer> list = getNumbers();
        for (int index = 0; index < list.size(); index++) {
            System.out.print(list.get(index) + " ");
        }

        System.out.println();

        for (Integer num : list){
            System.out.print(num + " ");
        }

        System.out.println();

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }

    /**
     * 创建一个List 然后在List中添加0到100整数
     */
    public static List<Integer> getNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index <= 100; index++) {
            list.add(index);
        }
        return list;
    }


}
