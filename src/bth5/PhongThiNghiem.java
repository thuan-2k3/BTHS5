/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth5;

/**
 *
 * @author ADMIN
 */
public class PhongThiNghiem extends Phonghoc {
     private String chuyenNganh;
    private int sucChua;
    private boolean coBonRua;

    public PhongThiNghiem(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
            boolean coBonRua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.coBonRua = coBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public int getSucChua() {
        return sucChua;
    }

    public boolean isCoBonRua() {
        return coBonRua;
    }
    
     @Override
    public String toString() {
        return "PhongThiNghiem [maPhong=" + getMaPhong() + ", dayNha=" + getDayNha() + ", dienTich=" + getDienTich()
                + ", soBongDen=" + getSoBongDen() + ", chuyenNganh=" + chuyenNganh + ", sucChua=" + sucChua
                + ", coBonRua=" + coBonRua + "]";
    }
    
}
