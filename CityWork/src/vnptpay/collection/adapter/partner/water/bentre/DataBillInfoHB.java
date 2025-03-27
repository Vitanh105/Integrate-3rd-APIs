/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vnptpay.collection.adapter.partner.water.bentre;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataBillInfoHB {

    @SerializedName("idHoaDon")
    @Expose
    private Integer idHoaDon;
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
    @SerializedName("maSoThue")
    @Expose
    private String maSoThue;
    @SerializedName("thang")
    @Expose
    private Integer thang;
    @SerializedName("nam")
    @Expose
    private Integer nam;
    @SerializedName("ngayDauKy")
    @Expose
    private String ngayDauKy;
    @SerializedName("ngayCuoiKy")
    @Expose
    private String ngayCuoiKy;
    @SerializedName("ngayDauKyStr")
    @Expose
    private String ngayDauKyStr;
    @SerializedName("ngayCuoiKyStr")
    @Expose
    private String ngayCuoiKyStr;
    @SerializedName("chiSoDau")
    @Expose
    private Integer chiSoDau;
    @SerializedName("chiSoCuoi")
    @Expose
    private Integer chiSoCuoi;
    @SerializedName("tieuThu")
    @Expose
    private Integer tieuThu;
    @SerializedName("maDoiTuongGia")
    @Expose
    private String maDoiTuongGia;
    @SerializedName("thanhTien")
    @Expose
    private Integer thanhTien;
    @SerializedName("mucVAT")
    @Expose
    private Integer mucVAT;
    @SerializedName("phiVAT")
    @Expose
    private Integer phiVAT;
    @SerializedName("mucBVMT")
    @Expose
    private Integer mucBVMT;
    @SerializedName("phiBVMT")
    @Expose
    private Integer phiBVMT;
    @SerializedName("phiDuyTriDauNoi")
    @Expose
    private Integer phiDuyTriDauNoi;
    @SerializedName("soTienGiamTru")
    @Expose
    private Integer soTienGiamTru;
    @SerializedName("tongTien")
    @Expose
    private Integer tongTien;
    @SerializedName("tongTienBangChu")
    @Expose
    private String tongTienBangChu;
    @SerializedName("soHoaDon")
    @Expose
    private String soHoaDon;
    @SerializedName("seriHoaDon")
    @Expose
    private String seriHoaDon;
    @SerializedName("ngayLap")
    @Expose
    private String ngayLap;
    @SerializedName("ngayLapStr")
    @Expose
    private String ngayLapStr;
    @SerializedName("maToChuc")
    @Expose
    private String maToChuc;
    @SerializedName("maDonVi")
    @Expose
    private String maDonVi;
    @SerializedName("dsChiTiet")
    @Expose
    private List<Object> dsChiTiet = null;
    @SerializedName("chiSoDauCu")
    @Expose
    private Integer chiSoDauCu;
    @SerializedName("chiSoCuoiCu")
    @Expose
    private Integer chiSoCuoiCu;
    @SerializedName("phiThoatNuoc")
    @Expose
    private Integer phiThoatNuoc;

    public Integer getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(Integer idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

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

    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public Integer getThang() {
        return thang;
    }

    public void setThang(Integer thang) {
        this.thang = thang;
    }

    public Integer getNam() {
        return nam;
    }

    public void setNam(Integer nam) {
        this.nam = nam;
    }

    public String getNgayDauKy() {
        return ngayDauKy;
    }

    public void setNgayDauKy(String ngayDauKy) {
        this.ngayDauKy = ngayDauKy;
    }

    public String getNgayCuoiKy() {
        return ngayCuoiKy;
    }

    public void setNgayCuoiKy(String ngayCuoiKy) {
        this.ngayCuoiKy = ngayCuoiKy;
    }

    public String getNgayDauKyStr() {
        return ngayDauKyStr;
    }

    public void setNgayDauKyStr(String ngayDauKyStr) {
        this.ngayDauKyStr = ngayDauKyStr;
    }

    public String getNgayCuoiKyStr() {
        return ngayCuoiKyStr;
    }

    public void setNgayCuoiKyStr(String ngayCuoiKyStr) {
        this.ngayCuoiKyStr = ngayCuoiKyStr;
    }

    public Integer getChiSoDau() {
        return chiSoDau;
    }

    public void setChiSoDau(Integer chiSoDau) {
        this.chiSoDau = chiSoDau;
    }

    public Integer getChiSoCuoi() {
        return chiSoCuoi;
    }

    public void setChiSoCuoi(Integer chiSoCuoi) {
        this.chiSoCuoi = chiSoCuoi;
    }

    public Integer getTieuThu() {
        return tieuThu;
    }

    public void setTieuThu(Integer tieuThu) {
        this.tieuThu = tieuThu;
    }

    public String getMaDoiTuongGia() {
        return maDoiTuongGia;
    }

    public void setMaDoiTuongGia(String maDoiTuongGia) {
        this.maDoiTuongGia = maDoiTuongGia;
    }

    public Integer getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Integer thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Integer getMucVAT() {
        return mucVAT;
    }

    public void setMucVAT(Integer mucVAT) {
        this.mucVAT = mucVAT;
    }

    public Integer getPhiVAT() {
        return phiVAT;
    }

    public void setPhiVAT(Integer phiVAT) {
        this.phiVAT = phiVAT;
    }

    public Integer getMucBVMT() {
        return mucBVMT;
    }

    public void setMucBVMT(Integer mucBVMT) {
        this.mucBVMT = mucBVMT;
    }

    public Integer getPhiBVMT() {
        return phiBVMT;
    }

    public void setPhiBVMT(Integer phiBVMT) {
        this.phiBVMT = phiBVMT;
    }

    public Integer getPhiDuyTriDauNoi() {
        return phiDuyTriDauNoi;
    }

    public void setPhiDuyTriDauNoi(Integer phiDuyTriDauNoi) {
        this.phiDuyTriDauNoi = phiDuyTriDauNoi;
    }

    public Integer getSoTienGiamTru() {
        return soTienGiamTru;
    }

    public void setSoTienGiamTru(Integer soTienGiamTru) {
        this.soTienGiamTru = soTienGiamTru;
    }

    public Integer getTongTien() {
        return tongTien;
    }

    public void setTongTien(Integer tongTien) {
        this.tongTien = tongTien;
    }

    public String getTongTienBangChu() {
        return tongTienBangChu;
    }

    public void setTongTienBangChu(String tongTienBangChu) {
        this.tongTienBangChu = tongTienBangChu;
    }

    public String getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(String soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public String getSeriHoaDon() {
        return seriHoaDon;
    }

    public void setSeriHoaDon(String seriHoaDon) {
        this.seriHoaDon = seriHoaDon;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getNgayLapStr() {
        return ngayLapStr;
    }

    public void setNgayLapStr(String ngayLapStr) {
        this.ngayLapStr = ngayLapStr;
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

    public List<Object> getDsChiTiet() {
        return dsChiTiet;
    }

    public void setDsChiTiet(List<Object> dsChiTiet) {
        this.dsChiTiet = dsChiTiet;
    }

    public Integer getChiSoDauCu() {
        return chiSoDauCu;
    }

    public void setChiSoDauCu(Integer chiSoDauCu) {
        this.chiSoDauCu = chiSoDauCu;
    }

    public Integer getChiSoCuoiCu() {
        return chiSoCuoiCu;
    }

    public void setChiSoCuoiCu(Integer chiSoCuoiCu) {
        this.chiSoCuoiCu = chiSoCuoiCu;
    }

    public Integer getPhiThoatNuoc() {
        return phiThoatNuoc;
    }

    public void setPhiThoatNuoc(Integer phiThoatNuoc) {
        this.phiThoatNuoc = phiThoatNuoc;
    }

    @Override
    public String toString() {
        return "DataBillInfoHB{" + "idHoaDon=" + idHoaDon + ", maKhachHang=" + maKhachHang + ", soHopDong=" + soHopDong + ", tenKhachHang=" + tenKhachHang + ", diaChi=" + diaChi + ", maSoThue=" + maSoThue + ", thang=" + thang + ", nam=" + nam + ", ngayDauKy=" + ngayDauKy + ", ngayCuoiKy=" + ngayCuoiKy + ", ngayDauKyStr=" + ngayDauKyStr + ", ngayCuoiKyStr=" + ngayCuoiKyStr + ", chiSoDau=" + chiSoDau + ", chiSoCuoi=" + chiSoCuoi + ", tieuThu=" + tieuThu + ", maDoiTuongGia=" + maDoiTuongGia + ", thanhTien=" + thanhTien + ", mucVAT=" + mucVAT + ", phiVAT=" + phiVAT + ", mucBVMT=" + mucBVMT + ", phiBVMT=" + phiBVMT + ", phiDuyTriDauNoi=" + phiDuyTriDauNoi + ", soTienGiamTru=" + soTienGiamTru + ", tongTien=" + tongTien + ", tongTienBangChu=" + tongTienBangChu + ", soHoaDon=" + soHoaDon + ", seriHoaDon=" + seriHoaDon + ", ngayLap=" + ngayLap + ", ngayLapStr=" + ngayLapStr + ", maToChuc=" + maToChuc + ", maDonVi=" + maDonVi + ", dsChiTiet=" + dsChiTiet + ", chiSoDauCu=" + chiSoDauCu + ", chiSoCuoiCu=" + chiSoCuoiCu + ", phiThoatNuoc=" + phiThoatNuoc + '}';
    }

}
