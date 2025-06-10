
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class con {
    Connection connection;
    Statement statement;

    public con(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelms", "root", "123");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getSelectedText() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSelectedText'");
    }

}