/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnptpay.collection.adapter.partner.water.bentre;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataCustomerHB {

    @SerializedName("maKhachHang")
    @Expose
    private String maKhachHang;
    @SerializedName("soHopDong")
    @Expose
    private String soHopDong;
    @SerializedName("tenKhachHang")
    @Expose
    private String tenKhachHang;
    @SerializedName("diaChi")
    @Expose
    private String diaChi;
    @SerializedName("soDienThoai")
    @Expose
    private String soDienThoai;
    @SerializedName("soGiayTo")
    @Expose
    private String soGiayTo;
    @SerializedName("ngayCap")
    @Expose
    private Object ngayCap;
    @SerializedName("ngayCapStr")
    @Expose
    private Object ngayCapStr;
    @SerializedName("noiCap")
    @Expose
    private String noiCap;
    @SerializedName("maToChuc")
    @Expose
    private String maToChuc;
    @SerializedName("maDonVi")
    @Expose
    private String maDonVi;

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getSoHopDong() {
        return soHopDong;
    }

    public void setSoHopDong(String soHopDong) {
        this.soHopDong = soHopDong;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getSoGiayTo() {
        return soGiayTo;
    }

    public void setSoGiayTo(String soGiayTo) {
        this.soGiayTo = soGiayTo;
    }

    public Object getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(Object ngayCap) {
        this.ngayCap = ngayCap;
    }

    public Object getNgayCapStr() {
        return ngayCapStr;
    }

    public void setNgayCapStr(Object ngayCapStr) {
        this.ngayCapStr = ngayCapStr;
    }

    public String getNoiCap() {
        return noiCap;
    }

    public void setNoiCap(String noiCap) {
        this.noiCap = noiCap;
    }

    public String getMaToChuc() {
        return maToChuc;
    }

    public void setMaToChuc(String maToChuc) {
        this.maToChuc = maToChuc;
    }

    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    @Override
    public String toString() {
        return "DataHB{" + "maKhachHang=" + maKhachHang + ", soHopDong=" + soHopDong + ", tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", soGiayTo=" + soGiayTo + ", ngayCap=" + ngayCap + ", ngayCapStr=" + ngayCapStr + ", noiCap=" + noiCap + ", maToChuc=" + maToChuc + ", maDonVi=" + maDonVi + '}';
    }

}
