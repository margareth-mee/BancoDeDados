package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View2 {
    public static void main(String[] args) {
        try {
            String nome = "frios";
            String descricao = "alimentos sob baixa temperatura";
            
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "123456");
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
            
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}