package view;

import java.sql.Connection;
import java.sql.SQLException;

import dao.CategoriaDao;
import utils.ConnectionFactory;

 public class ViewList{
     public static void main(String[] args) {

        //try with resources
        try(Connection conn = new ConnectionFactory().getConnection()) {
            
            CategoriaDao dao = new CategoriaDao(conn);

            dao.list().forEach(c->System.out.println());

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
 }
