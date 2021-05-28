package main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
@Entity
public class MatHang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMatHang;
	
	@NotNull
	private String loaiMatHang;
	
	@NotNull
	private String tenMatHang;

	private int soLuong;
	
	@NotNull
	private int giaNhap;
	
	@NotNull
	private int giaBan;
	
	private int active;
	
	@PrePersist
	void createActive() {
		this.active = 1;
	}
	
	public MatHang() {
		
	}
}
