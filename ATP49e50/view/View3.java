package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.ConnectionFactory;

public class View3 {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
            String nome = "esporte";
            int id1 = 1;
            int id2 = 2;
            
            PreparedStatement prepStatement = conn.prepareStatement("update categoria SET nome  = ? where id = ? or id = ?");
            prepStatement.setString(1, nome);
            prepStatement.setInt(2, id1);
            prepStatement.setInt(3, id2);

            prepStatement.execute();
                         
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println("O número de linhas afetadas foi: " + linhasAfetadas);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
