package baithi2;

public abstract class NhanVien {
    private String maNV;
    private String hoTen;
    private double luongCoBan;


    public NhanVien(String maNV, String hoTen, double luongCoBan) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        setLuongCoBan(luongCoBan);
    }


    public String getMaNV() {
        return maNV;
    }


    public String getHoTen() {
        return hoTen;
    }


    public double getLuongCoBan() {
        return luongCoBan;
    }


    public void setLuongCoBan(double luongCoBan) {
        if (luongCoBan >= 0)
            this.luongCoBan = luongCoBan;
        else
            this.luongCoBan = 0;
    }


    public void inThongTin() {
        System.out.println("[" + maNV + "] " + hoTen + " (" + this.getClass().getSimpleName() + ")");
    }


    public abstract double tinhLuong();
    public abstract void lamViec();
}
