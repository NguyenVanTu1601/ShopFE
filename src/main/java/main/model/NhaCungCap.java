package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class NhaCungCap {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNhaCungCap;
	
	@NotNull
	@NotBlank(message = "Tên nhà cung cấp không được để trống")
	private String tenNhaCungCap;
	
	@NotNull
	@NotBlank(message = "Tên chủ cửa hàng không được để trống")
	private String tenChuCuaHang;
	
	@NotNull
	@NotBlank(message = "Địa chỉ không được để trống")
	private String diaChi;
	
	@NotNull
	@NotBlank(message = "Số điện thoại không được để trống")
	private String soDienThoai;
	
	private int active;
	
	@PrePersist
	void createActive() {
		this.active = 1;
	}
	public NhaCungCap() {}
}
