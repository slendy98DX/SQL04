import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Start {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Inazumaeleven1#");

            Statement statement = connection.createStatement();

            statement.executeUpdate("alter table students add country varchar(30)");

            statement.executeUpdate("update students set country = 'Italy' where student_id = 1");
            statement.executeUpdate("update students set country = 'Italy' where student_id = 2");
            statement.executeUpdate("update students set country = 'Germany' where student_id = 3");
            statement.executeUpdate("update students set country = 'Germany' where student_id = 4");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
