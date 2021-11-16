package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import model.Categoria;
import utils.ConnectionFactory;

public class ViewUpdate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()) {
                       
            CategoriaDao dao  = new CategoriaDao(conn);
            Categoria model = new Categoria(3, "TesteUpdate");
            int linhasAfetadas = dao.update(model);
            System.out.println("O número de linhas afetadas foi: " + linhasAfetadas);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
