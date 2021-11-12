package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 public class View1{
     public static void main(String[] args) {
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "123456");
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
                
            prepStatement.execute();
            ResultSet ids = prepStatement.getResultSet();

            //Imprimir resultado
            while(ids.next()){
                int id = ids.getInt("id");
                String nome = ids.getString("nome");
                System.out.printf("ID: %d | Nome: %s \n", id, nome);
                System.out.println("--------------------------------");
            }
            
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
 }
