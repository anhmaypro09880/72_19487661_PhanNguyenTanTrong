package com.example.a72_19487661_phannguyentantrong;

public class Bussiness {
    private String tenCongViec;
    private String mucDo;
    private String thoiGian;

    public Bussiness() {
    }

    public Bussiness(String tenCongViec, String mucDo, String thoiGian) {
        this.tenCongViec = tenCongViec;
        this.mucDo = mucDo;
        this.thoiGian = thoiGian;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public String getMucDo() {
        return mucDo;
    }

    public void setMucDo(String mucDo) {
        this.mucDo = mucDo;
    }

    public String getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(String thoiGian) {
        this.thoiGian = thoiGian;
    }
}
