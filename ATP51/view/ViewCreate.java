package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import model.Categoria;
import utils.ConnectionFactory;

public class ViewCreate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDao dao  = new CategoriaDao(conn);
            Categoria model = new Categoria("TesteCreate");
                
            dao.create(model);
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}