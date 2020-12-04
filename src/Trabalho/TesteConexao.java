
package Trabalho;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
*@author Calvin
*Esta classe faz a conexao com o banco de dados 
*@see Registro
*@param getNome pega o nome do registro
*@param getFamilia pega a familia do registro
*@param getExp pega a espectativa de vida do registro
*@param getTamanho pega o tamanho do registro
*@param getStatus pega o status do registro
*/
public class TesteConexao {
    public static String URL = "jdbc:mysql://localhost:3306/bancodepassaros";
    
    
    public static void gravaRegistro(Registro f)throws SQLException{
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(URL,"root","");
            String inserePassaro = "INSERT INTO PASSAROS (nome,familia,expectativa,tamanho,status) "
                    +"VALUES ('" + f.getNome() + "',"
                    + "'" +f.getFamilia() + "', " +f.getExp()+ ", "+f.getTamanho()+ 
                    ", '" +f.getStatus()  + "')";
             Statement comandoSql = (Statement) con.createStatement();
            comandoSql.execute(inserePassaro);
            
            con.close();
        } catch (ClassNotFoundException ex) {
             System.out.println(ex.getMessage());
        }
    }

}
