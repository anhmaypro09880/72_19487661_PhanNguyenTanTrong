package com.example.a72_19487661_phannguyentantrong;

public class Bussiness {
    private String tenCv;
    private String mucDo;
    private String thoiGian;

    public Bussiness() {
    }

    public Bussiness(String tenCv, String mucDo, String thoiGian) {
        this.tenCv = tenCv;
        this.mucDo = mucDo;
        this.thoiGian = thoiGian;
    }

    public String getTenCv() {
        return tenCv;
    }

    public void setTenCv(String tenCv) {
        this.tenCv = tenCv;
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
