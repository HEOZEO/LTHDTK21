package edu.pxu.lthdt.bai03;

public class QuanLyXe {
    public static void main(String[] args) {
        XeOto xeOto = new XeOto("Toyota", 2020, 300);
        XeBus xeBus = new XeBus("Ford", 2019, 400, 30);
        System.out.println(xeOto.toString());
        System.out.println(xeBus.toString());
    }
}
