package bai1;

public class SinhVien extends Person {
    private String maSV;
    private double diemTB;

    public SinhVien(String hoTen, String diaChi, int namSinh, String maSV, double diemTB) {
        super(hoTen, diaChi, namSinh);
        this.maSV = maSV;
        this.diemTB = diemTB;
    }

    @Override
    public String getLoai() {
        return " sinh vien ";
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.println("ma sv" + maSV);
        System.out.println("diem tb" + diemTB);

    }
}
