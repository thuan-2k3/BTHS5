/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth5;

/**
 *
 * @author ADMIN
 */
public class Phonghoc {
     private String maPhong;
    private String dayNha;
    private double dienTich;
    private int soBongDen;

    public Phonghoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public String getDayNha() {
        return dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    @Override
    public String toString() {
        return "PhongHoc [maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen="
                + soBongDen + "]";
    }

}
