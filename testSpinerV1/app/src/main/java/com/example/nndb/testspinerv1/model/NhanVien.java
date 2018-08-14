package com.example.nndb.testspinerv1.model;

import androidx.annotation.NonNull;

public class NhanVien {
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getThuCongTac() {
        return thuCongTac;
    }

    public void setThuCongTac(String thuCongTac) {
        this.thuCongTac = thuCongTac;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    private  String tenNhanVien;
    private String thuCongTac;
    private int soNgay;

    public NhanVien() {
    }

    public NhanVien(String tenNhanVien, String thuCongTac, int soNgay) {
        this.tenNhanVien = tenNhanVien;
        this.thuCongTac = thuCongTac;
        this.soNgay = soNgay;
    }

    @NonNull
    @Override
    public String toString() {
        return this.tenNhanVien+"\n Bắt đầu đi công tác vào thứ ["+this.thuCongTac+"]"+"\n"+this.soNgay;
    }
}
