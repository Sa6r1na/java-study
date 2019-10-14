package com.lingbei.lesson3;

/***
 * 低  ------------------------------------>  高
 *
 * byte,short,char—> int —> long—> float —> double
 * 条件是转换的数据类型必须是兼容的。
 */
public class ForceTypeChange {
    public static void main(String[] args) {
        int i1 = 123;
        byte b1 = (byte)i1;
        System.out.println("int型强制转换成byte后值为"+b1);
    }
}
