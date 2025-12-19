package bai1;

public class TestPerson {
    public static void main(String[] args) {
        Person[] ds = new Person[5];
        ds[0] = new SinhVien("ho thanh do", "QN", 2007, "SV016", 7);
        ds[1] = new SinhVien("nguyen anh khoa", "DN", 2007, "SV030", 8);
        ds[2] = new SinhVien("do xuan anh duc", "DN", 2007, "SV017", 9);
        ds[3] = new GiangVien(" nguyen van a", "qn", 1989, "GV03", 0);
        System.out.println();
        for (Person p : ds) {
            p.inThongTin();
            System.out.println();
        }
    }
}





