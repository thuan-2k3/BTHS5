/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth5;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args) {
         QuanLy quanLyPhongHoc = new QuanLy();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Thêm phòng học");
            System.out.println("2. Tìm kiếm phòng học");
            System.out.println("3. In danh sách phòng học");
            System.out.println("4. In danh sách phòng học đạt chuẩn");
            System.out.println("5. Sắp xếp danh sách theo dãy nhà");
            System.out.println("6. Sắp xếp danh sách theo diện tích");
            System.out.println("7. Sắp xếp danh sách theo số bóng đèn");
            System.out.println("8. Cập nhật số máy tính cho phòng máy tính");
            System.out.println("9. Xóa phòng học");
            System.out.println("10. Tổng số phòng học");
            System.out.println("11. In danh sách phòng máy có 60 máy");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine();
             switch (choice) {
                case 1:
                    System.out.println("\n----- THÊM PHÒNG HỌC -----");
                    System.out.print("Nhập mã phòng: ");
                    String maPhong = scanner.nextLine();
                    System.out.print("Nhập dãy nhà: ");
                    String dayNha = scanner.nextLine();
                    System.out.print("Nhập diện tích: ");
                    double dienTich = scanner.nextDouble();
                    System.out.print("Nhập số bóng đèn: ");
                    int soBongDen = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Loại phòng học (1: Lý thuyết, 2: Máy tính, 3: Thí nghiệm): ");
                    int loaiPhong = scanner.nextInt();
                    scanner.nextLine();
                    switch (loaiPhong) {
                        case 1:
                             System.out.print("Có máy chiếu (true/false): ");
                            boolean coMayChieu = scanner.nextBoolean();
                            scanner.nextLine();
                            PhongLyThuyet phongLyThuyet = new PhongLyThuyet(maPhong, dayNha, dienTich, soBongDen,
                                    coMayChieu);
                            quanLyPhongHoc.themPhongHoc(phongLyThuyet);
                            break;
                        case 2:
                            System.out.print("Số máy tính: ");
                            int soMayTinh = scanner.nextInt();
                            scanner.nextLine();
                            PhongMayTinh phongMayTinh = new PhongMayTinh(maPhong, dayNha, dienTich, soBongDen,
                                    soMayTinh);
                            quanLyPhongHoc.themPhongHoc(phongMayTinh);
                            break;
                        case 3:
                            System.out.print("Chuyên ngành: ");
                            String chuyenNganh = scanner.nextLine();
                            System.out.print("Sức chứa: ");
                            int sucChua = scanner.nextInt();
                            scanner.nextLine();
                              System.out.print("Có bồn rửa (true/false): ");
                            boolean coBonRua = scanner.nextBoolean();
                            scanner.nextLine();
                            PhongThiNghiem phongThiNghiem = new PhongThiNghiem(maPhong, dayNha, dienTich, soBongDen,
                                    chuyenNganh, sucChua, coBonRua);
                            quanLyPhongHoc.themPhongHoc(phongThiNghiem);
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\n----- TÌM KIẾM PHÒNG HỌC -----");
                    System.out.print("Nhập mã phòng: ");
                    maPhong = scanner.nextLine();
                    Phonghoc phongHoc = quanLyPhongHoc.timPhongHoc(maPhong);
                    if (phongHoc != null) {
                          System.out.println("Thông tin phòng học:");
                        System.out.println(phongHoc);
                    } else {
                        System.out.println("Không tìm thấy phòng học có mã phòng " + maPhong);
                    }
                    break;
                case 3:
                    System.out.println("\n----- IN DANH SÁCH PHÒNG HỌC -----");
                    quanLyPhongHoc.inDanhSachPhongHoc();
                    break;
                case 4:
                    System.out.println("\n----- IN DANH SÁCH PHÒNG HỌC ĐẠT CHUẨN -----");
                    quanLyPhongHoc.inDanhSachPhongHocDatChuan();
                    break;
                case 5:
                    System.out.println("\n----- SẮP XẾP DANH SÁCH THEO DÃY NHÀ -----");
                    quanLyPhongHoc.sapXepTheoDayNha();
                    break;
                case 6:
                      System.out.println("\n----- SẮP XẾP DANH SÁCH THEO DIỆN TÍCH -----");
                    quanLyPhongHoc.sapXepTheoDienTich();
                    break;
                case 7:
                    System.out.println("\n----- SẮP XẾP DANH SÁCH THEO SỐ BÓNG ĐÈN -----");
                    quanLyPhongHoc.sapXepTheoSoBongDen();
                    break;
                case 8:
                    System.out.println("\n----- CẬP NHẬT SỐ MÁY TÍNH CHO PHÒNG MÁY TÍNH -----");
                    System.out.print("Nhập mã phòng máy tính: ");
                    maPhong = scanner.nextLine();
                    System.out.print("Nhập số máy tính mới: ");
                    int soMayTinhMoi = scanner.nextInt();
                    scanner.nextLine();
                    quanLyPhongHoc.capNhatSoMayTinh(maPhong, soMayTinhMoi);
                    break;
              case 9:
                    System.out.println("\n----- XÓA PHÒNG HỌC -----");
                    System.out.print("Nhập mã phòng: ");
                    maPhong = scanner.nextLine();
                    quanLyPhongHoc.xoaPhongHoc(maPhong);
                    break;
                case 10:
                    System.out.println("\n----- TỔNG SỐ PHÒNG HỌC -----");
                    int tongSoPhongHoc = quanLyPhongHoc.tinhTongSoPhongHoc();
                    System.out.println("Tổng số phòng học: " + tongSoPhongHoc);
                    break;
                case 11:
                    System.out.println("\n----- DANH SÁCH PHÒNG MÁY CÓ 60 MÁY -----");
                    quanLyPhongHoc.inDanhSachPhongMay60May();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
                    break;
      }
        } while (choice != 0);
        scanner.close();
    }

}
