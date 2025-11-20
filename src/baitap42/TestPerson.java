package baitap42;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Thanh do", "Da Nang");
        System.out.println(p1);

        Student s1 = new Student("Alice", "Da nang", "Computer Science", 2, 12000.0);
        System.out.println(s1);

        Staff st1 = new Staff("Thanh do","Da Nang","Vku",  2000);
        System.out.println(st1);
    }
}
