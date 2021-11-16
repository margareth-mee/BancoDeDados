package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import utils.ConnectionFactory;

public class ViewDelete {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {           
            CategoriaDao dao = new CategoriaDao(conn);
            int linhasAfetadas = dao.delete(11); 

            System.out.println("O número de linhas afetadas foi: " + linhasAfetadas);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
