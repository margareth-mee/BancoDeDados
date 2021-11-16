package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import model.Categoria;
import utils.ConnectionFactory;

 public class ViewList{
     public static void main(String[] args) {

        //try with resources
        try(Connection conn = new ConnectionFactory().getConnection()) {
            
            CategoriaDao dao = new CategoriaDao(conn);

            for (Categoria c : dao.list()) {
                System.out.println(c);
             }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
 }
