package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 
  Utilize as tabelas e os registros criados durante as atividades ATP41 e ATP42.
  Faça o download do driver JDBC para o postgres e configure no seu projeto.
  Crie uma conexão com o banco de dados postgresql utilizando JDBC(java.sql.*).
  Crie 4 classes para realizar as 4 operações de CRUD.
  Na classe1, liste todos os dados de todas as colunas da tabela produto.
 */

public class View1{
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM produto");
            ResultSet result = statement.getResultSet();
            
            //Imprimir resultado
            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                int codigo = result.getInt("codigo");
                float preco = result.getFloat("preco");
                System.out.printf("%d - %s - %s - %d - R$ %.2f\n", id, nome, descricao, codigo, preco);
            }
        
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}