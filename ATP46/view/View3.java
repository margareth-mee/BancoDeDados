package view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Na classe3, altere todos os produtos para a mesma categoria e exiba a quantidade de linhas afetadas.
public class View3 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "update produto SET categoria_id  = 2";
            statement.execute(sql, statement.RETURN_GENERATED_KEYS);
            
            //ResultSet ids = statement.getGeneratedKeys();
            int linhasAfetadas = statement.getUpdateCount();
            System.out.println("Linhas afetadas: " + linhasAfetadas);
            
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
