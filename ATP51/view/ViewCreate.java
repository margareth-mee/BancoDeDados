package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.ConnectionFactory;

public class ViewCreate {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()){
            String nome = "frios";
            String descricao = "alimentos sob baixa temperatura";
            
            PreparedStatement prepStatement = conn.prepareStatement("insert into categoria(nome, descricao)values(?,?)", Statement.RETURN_GENERATED_KEYS);
            
            prepStatement.setString(1, nome);
            prepStatement.setString(2, descricao);

            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();
                
            //Imprimir resultado
            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println("Categoria com id " + id + " inserido com sucesso!");
            }
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}