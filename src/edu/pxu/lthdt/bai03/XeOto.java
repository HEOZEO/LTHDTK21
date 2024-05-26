package edu.pxu.lthdt.bai03;

public class XeOto {
    // Khai báo các thuộc tính 
    private String hangxe;       
    private int namsanxuat;       
    private float dongco;  //    

    // Constructor không tham số để tạo đối tượng XeOTO trống 
    public XeOto() {
        super();
    }

    // Constructor 
    public XeOto(String hangxe, int namsanxuat, float dongco) {
        super();
        this.hangxe = hangxe;
        this.namsanxuat = namsanxuat;
        this.dongco = dongco;
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

    // Ghi đè phương thức toString() để cung cấp chuỗi mô tả đối tượng XeOTO
    @Override
    public String toString() {
        return "XeOTO [hangxe=" + hangxe + ", namsanxuat=" + namsanxuat + ", dongco=" + dongco + "]";
    }
}
