package com.lingbei.lesson3;

/***
 * 必须满足转换前的数据类型的位数要低于转换后的数据类型
 */
public class TypeChange {
    public static void main(String[] args) {
        char c1 = 'a';
        int i1 = c1;
        System.out.println("char类型自动转换成int型的值是"+i1);

        char c2 = 'A';
        int i2 = c2+1;
        System.out.println("char类型和int计算后的值等于"+i2);
    }
}
