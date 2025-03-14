package package3_exercise.part1_text_file;

import java.io.Serializable;
import java.util.Date;

public class KhachHang {
	private int ma;
	private String ten;
	private Date namSinh;
	
	public KhachHang() {
	}
	
	public KhachHang(int ma, String ten, Date namSinh) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.namSinh = namSinh;
	}
	
	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Date getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(Date namSinh) {
		this.namSinh = namSinh;
	}
}
