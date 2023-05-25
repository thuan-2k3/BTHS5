/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class QuanLy {
    private List<Phonghoc> danhSachPhongHoc;

    public QuanLy() {
        danhSachPhongHoc = new ArrayList<>();
    }

    public void themPhongHoc(Phonghoc phongHoc) {
        if (!danhSachPhongHoc.contains(phongHoc)) {
            danhSachPhongHoc.add(phongHoc);
            System.out.println("Thêm phòng học thành công.");
        } else {
            System.out.println("Phòng học đã tồn tại.");
        }
    }

    public Phonghoc timPhongHoc(String maPhong) {
        for (Phonghoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                return phongHoc;
            }
        }
        return null;
    }
     public void inDanhSachPhongHoc() {
        if (danhSachPhongHoc.isEmpty()) {
            System.out.println("Danh sách phòng học rỗng.");
        } else {
            System.out.println("Danh sách phòng học:");
            for (Phonghoc phongHoc : danhSachPhongHoc) {
                System.out.println(phongHoc);
            }
        }
    }

    public void inDanhSachPhongHocDatChuan() {
        if (danhSachPhongHoc.isEmpty()) {
            System.out.println("Danh sách phòng học rỗng.");
        } else {
            System.out.println("Danh sách phòng học đạt chuẩn:");
            for (Phonghoc phongHoc : danhSachPhongHoc) {
                if (phongHoc instanceof PhongLyThuyet) {
                    if (((PhongLyThuyet) phongHoc).isCoMayChieu()) {
                        System.out.println(phongHoc);
                    }
                } else if (phongHoc instanceof PhongMayTinh) {
                    if (((PhongMayTinh) phongHoc).getSoMayTinh() >= (phongHoc.getDienTich() / 1.5)) {
                        System.out.println(phongHoc);
                               }
                } else if (phongHoc instanceof PhongThiNghiem) {
                    if (((PhongThiNghiem) phongHoc).isCoBonRua()) {
                        System.out.println(phongHoc);
                    }
                }
            }
        }
    }

    public void sapXepTheoDayNha() {
        Collections.sort(danhSachPhongHoc, new Comparator<Phonghoc>() {
            @Override
            public int compare(Phonghoc ph1, Phonghoc ph2) {
                return ph1.getDayNha().compareTo(ph2.getDayNha());
            }
        });
        System.out.println("Đã sắp xếp danh sách theo dãy nhà.");
    }

    public void sapXepTheoDienTich() {
        Collections.sort(danhSachPhongHoc, new Comparator<Phonghoc>() {
            @Override
            public int compare(Phonghoc ph1, Phonghoc ph2) {
                return Double.compare(ph1.getDienTich(), ph2.getDienTich());
            }
        });
        System.out.println("Đã sắp xếp danh sách theo diện tích.");
    }

    public void sapXepTheoSoBongDen() {
        Collections.sort(danhSachPhongHoc, new Comparator<Phonghoc>() {
            @Override
            public int compare(Phonghoc ph1, Phonghoc ph2) {
                return Integer.compare(ph1.getSoBongDen(), ph2.getSoBongDen());
            }
        });
        System.out.println("Đã sắp xếp danh sách theo số bóng đèn.");
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinhMoi) {
        Phonghoc phongHoc = timPhongHoc(maPhong);
        if (phongHoc instanceof PhongMayTinh) {
            ((PhongMayTinh) phongHoc).setSoMayTinh(soMayTinhMoi);
            System.out.println("Cập nhật số máy tính thành công.");
        } else {
            System.out.println("Không tìm thấy phòng máy tính có mã phòng " + maPhong);
        }
    }

    public void xoaPhongHoc(String maPhong) {
        Phonghoc phongHoc = timPhongHoc(maPhong);
        if (phongHoc != null) {
            if (danhSachPhongHoc.remove(phongHoc)) {
                System.out.println("Xóa phòng học thành công.");
            } else {
                System.out.println("Xóa phòng học thất bại.");
            }
        } else {
            System.out.println("Không tìm thấy phòng học có mã phòng " + maPhong);
        }
    }

    public int tinhTongSoPhongHoc() {
        return danhSachPhongHoc.size();
    }

    public void inDanhSachPhongMay60May() {
        System.out.println("Danh sách các phòng máy có 60 máy:");
        for (Phonghoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh) {
                if (((PhongMayTinh) phongHoc).getSoMayTinh() == 60) {
                    System.out.println(phongHoc);
                }
            }
        }
    }
}
