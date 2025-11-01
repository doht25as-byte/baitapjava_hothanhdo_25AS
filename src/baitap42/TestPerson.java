package baitap42;

public class TestPerson {
    public static void main(String[] args) {
        // Create Person
        Person p1 = new Person("John Doe", "123 Main St");
        System.out.println(p1);

        // Create Student
        Student s1 = new Student("Alice", "Dorm 4", "Computer Science", 2, 12000.0);
        System.out.println(s1);

        // Create Staff
        Staff t1 = new Staff("Dr. Smith", "Faculty Office", "Engineering School", 75000.0);
        System.out.println(t1);
    }
}
