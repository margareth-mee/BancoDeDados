package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ConnectionFactory;

public class View4 {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            int id = 4;
            
            PreparedStatement prepStatement = conn.prepareStatement("delete from categoria where id > ?", Statement.RETURN_GENERATED_KEYS); 
            prepStatement.setInt(1, id);
    
            prepStatement.execute();
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println("O número de linhas afetadas foi: " + linhasAfetadas);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
