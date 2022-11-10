import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private ConnectionFactory(){
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Estudos", "postgres", "aluno");
            System.out.println("Sucesso!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("Falhou");
        }

//        try( connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Estudos", "postgres", "aluno")){
//            System.out.println("Sucesso!");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Falha!");
//        }

        return connection;
    }

}
