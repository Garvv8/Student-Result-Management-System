
public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        Student s1 = new Student(1, "Garv", "garv@email.com");
        dao.addStudent(s1);

        System.out.println("Application Running...");
    }
}
