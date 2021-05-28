package main.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class DonNhapHang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDonNhap;
	
	private long tongTien;
	
	@ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "idNhanVien")
    private NhanVien nhanVien;
	
	@ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "idNhaCungCap")
    private NhaCungCap nhaCungCap;
	
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name = "idDonNhap" ,referencedColumnName = "idDonNhap")
	private List<HangNhap> listHangNhap = new ArrayList<>();
	
	public void addHangNhap(HangNhap hangNhap) {
		listHangNhap.add(hangNhap);
	}
	
	public DonNhapHang() {
		
	}
}
