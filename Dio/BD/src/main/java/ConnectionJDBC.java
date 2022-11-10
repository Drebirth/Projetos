import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) throws SQLException {


        try( Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Estudos", "postgres", "aluno")){
            System.out.println("Sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Falha!");
        }

    }
}
