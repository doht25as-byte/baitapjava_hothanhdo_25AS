package bai1;

public abstract class Person {
    private String hoTen;
    private String diaChi;
    private int namSinh;

    public Person() {
    }

    public Person(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public abstract String getLoai();

   public void inThongTin(){
       System.out.printf(" ho ten "+ hoTen);
       System.out.printf(" dia chi " + diaChi);
       System.out.println( " nam sinh "+ namSinh);
   }
}
