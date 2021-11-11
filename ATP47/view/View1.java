package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/* 
_  Utilize as tabelas e os registros criados durante as atividades ATP41 e ATP42.
_  Crie uma conexão com o banco de dados postgresql utilizando JDBC(java.sql.*).
_  Crie 4 classes para realizar as 4 operações de CRUD.
_  Na classe1, liste id e nome de todas as linhas da tabela Categoria.
_  Na classe2, insira uma nova Categoria e imprima o id gerado.
_  Na classe3, altere o nome da primeira e segunda categoria da tabela e exiba a quantidade de linhas afetadas.
_  Na classe4, delete as ultimas categorias cadastradas.
 */

 public class View1{
     public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM categoria");
            ResultSet result = statement.getResultSet();
            
            //Imprimir resultado
            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                System.out.printf("%d - %s \n", id, nome);
            }
            
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     }
 }
