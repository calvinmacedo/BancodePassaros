/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Registro {
    private String nome;
    private String familia;
    private float  exp;
    private float  tamanho;
    private String status;
/*
*@author Calvin
*Esta classe faz o registro do nome,familia,expectativa de vida tamanho e status
*de preservação do passaro  
*@param nome recebe o nome do passaro
*@param familia recebe a familia do passaro
*@param exp recebe a expectativa de vida do passaro
*@param tamanho recebe o tamanho do passaro
*@param status recebe o status de perigo do passaro
*/
    public Registro(String nome,String familia,Float exp,Float tamanho,String status){
        this.nome = nome;
        this.familia = familia ;
        this.exp = exp;
        this.tamanho = tamanho;
        this.status = status;       
    }
/*
*@author Calvin
*Esta classe grava o registro no banco de dados do nome,familia,expectativa de vida tamanho e status
*de preservação do passaro 
*@see TesteConexaoSingleton
*/
    public void gravaRegistro(){
      try{
         TesteConexaoSingleton.gravaRegistro(this);
     }catch (SQLException ex) {
         Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
     }
     }
/*
*@author Calvin
*Esta classe retorna para o registro no banco de dados do nome,familia,expectativa de vida tamanho e status
*de preservação do passaro 
*@param nome recebe o nome do passaro
*@param familia recebe a familia do passaro
*@param exp recebe a expectativa de vida do passaro
*@param tamanho recebe o tamanho do passaro
*@param status recebe o status de perigo do passaro
*return nome familia exp tamanho status
*/
    @Override
    public String toString() {
        return "Registro{" + "nome=" + nome +",familia=" +familia + ",exp=" + exp + ",tamanho=" + tamanho + ",status=" + status + '}';
    }
/*
*@author Calvin
*Esta classe pega o nome do passaro
*@param nome recebe o nome do passaro
*@return nome
*/
    
        public String getNome() {
        return nome;
    }
        /*
*@author Calvin
*Esta classe pega a familia do passaro
*@param familia recebe a familia do passaro
*@return familia
*/
        public String getFamilia(){
         return familia;
        }
        /*
*@author Calvin
*Esta classe pega a expectativa de vida do passaro
*@param exp recebe a expectativa de vida do passaro
*@return exp
*/
        public float getExp(){
            return exp;
        }
        /*
*@author Calvin
*Esta classe pega o tamanho do passaro
*@param tamanho recebe o tamanho do passaro
*@return tamanho
*/
        public float getTamanho(){
            return tamanho;
        }
        /*
*@author Calvin
*Esta classe pega o status de preservacao do passaro
*@param status recebe o status de preservacao do passaro
*@return tamanho
*/
        public String getStatus(){
            return status;
        }
}
