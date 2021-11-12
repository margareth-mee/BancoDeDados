package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import utils.ConnectionFactory;

 public class View1{
     public static void main(String[] args) {

        //try with resources
        try(Connection conn = new ConnectionFactory().getConnection()) {
            
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

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
 }
