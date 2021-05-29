package main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


import lombok.Data;

@Data
@Entity
public class NhanVien {
	
	@Id
	private String idNhanVien;

	private String tenDangNhap;

	private String matKhau;
	
	private String CMND;

	private String hoTen;
	
	private String ngaySinh;
	
	private String diaChi;
	
	private String viTriCongViec;
	
	private int active;
	
	@PrePersist
	void createActive() {
		this.active = 1;
	}
	public NhanVien() {}
	public NhanVien(String idNhanVien, String tenDangNhap, String matKhau, String cMND, String hoTen, String ngaySinh,
			String diaChi, String viTriCongViec, int active) {
		super();
		this.idNhanVien = idNhanVien;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		CMND = cMND;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.viTriCongViec = viTriCongViec;
		this.active = active;
	}
	public String getIdNhanVien() {
		return idNhanVien;
	}
	public void setIdNhanVien(String idNhanVien) {
		this.idNhanVien = idNhanVien;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getViTriCongViec() {
		return viTriCongViec;
	}
	public void setViTriCongViec(String viTriCongViec) {
		this.viTriCongViec = viTriCongViec;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	
}
