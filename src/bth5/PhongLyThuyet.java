/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth5;

/**
 *
 * @author ADMIN
 */
public class PhongLyThuyet extends Phonghoc {
     private boolean coMayChieu;

    public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieu = coMayChieu;
    }

    public boolean isCoMayChieu() {
        return coMayChieu;
    }

    @Override
    public String toString() {
        return "PhongLyThuyet [maPhong=" + getMaPhong() + ", dayNha=" + getDayNha() + ", dienTich=" + getDienTich()
                + ", soBongDen=" + getSoBongDen() + ", coMayChieu=" + coMayChieu + "]";
    }
    
}
