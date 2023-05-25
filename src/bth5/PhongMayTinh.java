/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth5;

/**
 *
 * @author ADMIN
 */
public class PhongMayTinh extends Phonghoc {
     private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayTinh = soMayTinh;
    }

    public int getSoMayTinh() {
        return soMayTinh;
    }

    public void setSoMayTinh(int soMayTinh) {
        this.soMayTinh = soMayTinh;
    }

    @Override
    public String toString() {
     return "PhongMayTinh [maPhong=" + getMaPhong() + ", dayNha=" + getDayNha() + ", dienTich=" + getDienTich()
                + ", soBongDen=" + getSoBongDen() + ", soMayTinh=" + soMayTinh + "]";
    }
}
