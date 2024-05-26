package edu.pxu.lthdt.bai03;

public class XeBus {

    // Khai báo các thuộc tính
    private String hangxe;   
    private int namsanxuat;   
    private float dongco;       
    private int soghe;         

    // Phương thức toString để cung cấp chuỗi đại diện cho đối tượng XeBUS
    @Override
    public String toString() {
        return "XeBus [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + ", soghe=" + soghe + "]";
    }

    // Constructor có tham số để khởi tạo đối tượng XeBUS
    public XeBus(String hangxe, int namsanxuat, float dongco, int soghe) {
        super();
        this.hangxe = hangxe;
        this.namsanxuat = namsanxuat;
        this.dongco = dongco;
        this.soghe = soghe;
    }

    // Các phương thức getter và setter cho các thuộc tính
    public String getHangxe() {
        return hangxe;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }

    public int getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public float getDongco() {
        return dongco;
    }

    public void setDongco(float dongco) {
        this.dongco = dongco;
    }

    public int getSoghe() {
        return soghe;
    }

    public void setSoghe(int soghe) {
        this.soghe = soghe;
    }
}
