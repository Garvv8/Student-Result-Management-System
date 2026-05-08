
import java.sql.*;

public class StudentDAO {
    public void addStudent(Student student) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO students(name, email) VALUES (?, ?)"
            );

            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());

            ps.executeUpdate();
            System.out.println("Student Added Successfully");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
