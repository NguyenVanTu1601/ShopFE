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
	@NotNull
	@Size(min=4, message="Mã nhân viên tối thiểu 4 kí tự có dạng NVxx")
	@Pattern(regexp = "^NV[0-9]{2,}", message = "Mã nhân viên dạng NVxx")
	private String idNhanVien;
	
	@Size(min=6, message="Tên đăng nhập tối thiểu 6 kí tự")
	@NotNull
	@NotBlank(message = "Tên đăng nhập không được để trống")
	private String tenDangNhap;
	
	@Size(min=6, message="Mật khẩu tối thiểu 6 kí tự")
	@NotNull
	@NotBlank(message = "Mật khẩu không được để trống")
	private String matKhau;
	
	@Size(min=9, max = 9, message="CMND có 9 kí tự")
	@NotNull
	@NotBlank(message = "CMND không được để trống")
	private String CMND;
	
	@NotBlank(message = "Họ tên không được để trống")
	private String hoTen;
	
	@NotBlank(message = "Ngày sinh không được để trống")
	//@Pattern(regexp = "^NV[0-9]{2,}", message = "Mã nhân viên dạng NVxx")
	private String ngaySinh;
	
	@NotBlank(message = "Địa chỉ không được để trống")
	private String diaChi;
	
	@NotBlank(message = "Vị trí công việc không được để trống")
	private String viTriCongViec;
	
	private int active;
	
	@PrePersist
	void createActive() {
		this.active = 1;
	}
	public NhanVien() {}
}
