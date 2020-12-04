/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho;


import static Trabalho.TesteConexao.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
*@author Calvin
*Esta classe faz a conexao com o banco de dados
*@see statement
*@see Connection
*@see TesteConexao
*@see Registro
*@param getNome pega o nome do registro
*@param getFamilia pega a familia do registro
*@param getExp pega a espectativa de vida do registro
*@param getTamanho pega o tamanho do registro
*@param getStatus pega o status do registro
*/

public class TesteConexaoSingleton {
    private static TesteConexaoSingleton conexao;
    private Connection conJDBC;
    private Statement st;
    public static String URL = "jdbc:mysql://localhost:3306/bancodepassaros";
    public static void gravaRegistro(Registro f)throws SQLException{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try (Connection con = (Connection) DriverManager.getConnection(URL,"root","")) {
                    String inserePassaro = "INSERT INTO PASSAROS (nome,familia,expectativa,tamanho,status) "
                            +"VALUES ('" + f.getNome() + "',"
                            + "'" +f.getFamilia() + "', " +f.getExp()+ ", "+f.getTamanho()+
                            ", '" +f.getStatus()  + "')";
                    com.mysql.jdbc.Statement comandoSql = (com.mysql.jdbc.Statement) con.createStatement();
                    comandoSql.execute(inserePassaro);
                }
                } catch (Exception e) {}
                }
    /*
*@author Calvin
*Esta classe pega o statement
*@return st retorna o statement
*/
    public Statement getStatement()
    {
    return st;
    }
        /*
*@author Calvin
*Esta classe pega a conexao
*@return conJDBC retorna a conexao
*/
    
    public Connection getConexao()
    {
    return conJDBC;
    }
           /*
*@author Calvin
*Esta classe faz a instancia singleton se nao houver uma conexao
*cria-se uma nova TesteConexaoSingleton
*@return conexao 
*/ 
    public static TesteConexaoSingleton getInstanciaBD()
    {
    if(conexao == null)
    {
    conexao = new TesteConexaoSingleton();
    }
    return conexao;
    }
    

}