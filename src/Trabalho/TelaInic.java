/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JPanel;

/**
 *
 * @author CALVIN
 * @version 1.0
 * Este metodo cria a tela inical do programa
 * @see setsize
 * @see setDefaultCloseOperation
 * @see Jlabel
 */
public class TelaInic extends JFrame{
  
    JLabel lblNome;
    JTextField txtNome;
    JLabel lblFam;
    JTextField txtFam;
    JLabel lblExp;
    JFormattedTextField txtExp;
    JLabel lblTam;
    JTextField txtTam;
    JLabel lblStatus;
    JComboBox cmbStatus;
    JButton btnEnviar;
    JLabel lblTeste;
    
    
    
      public TelaInic(){
          setTitle("Tela Inicial");
          setSize(800, 600);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
           lblNome = new JLabel("Nome:");
           txtNome = new JTextField();
           
           lblFam = new JLabel("Familia:");
           txtFam = new JTextField();
          
          lblExp = new JLabel("Expectativa de vida em anos:");
          try {
            txtExp = new JFormattedTextField(new MaskFormatter("##"));
        } catch (ParseException ex) { 
            Logger.getLogger(TelaInic.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          lblTam = new JLabel("Tamanho em centimetros:");
          txtTam = new JTextField();
          
          lblStatus = new JLabel("Status:");
          String[] stat = {"Extinta","Ameaçada","Pouca preocupante"};
          cmbStatus = new JComboBox(stat);
          
          btnEnviar = new JButton("Enviar");
           btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastraPassaro();
            }
           });
              
          
          
          
          
          lblTeste = new JLabel(".");
          
          lblNome.setBounds(0, 0, 200, 25);
          txtNome.setBounds(200, 0, 200, 25);
          
          lblFam.setBounds(0, 50, 200, 25);
          txtFam.setBounds(200, 50, 200, 25);
          
          lblExp.setBounds(0,100, 200, 25);
          txtExp.setBounds(200, 100, 200, 25);
          
          lblTam.setBounds(0, 150, 200, 25);
          txtTam.setBounds(200, 150, 200, 25);
          
          lblStatus.setBounds(0, 200, 200, 25);
          cmbStatus.setBounds(200, 200, 200, 25);
          
          btnEnviar.setBounds(200, 250, 100, 100);
          
          getContentPane().add(lblNome);
          getContentPane().add(txtNome);
          getContentPane().add(lblFam);
          getContentPane().add(txtFam);
          getContentPane().add(lblExp);
          getContentPane().add(txtExp);
          getContentPane().add(lblTam);
          getContentPane().add(txtTam);
          getContentPane().add(lblStatus);
          getContentPane().add(cmbStatus);
          getContentPane().add(btnEnviar);
          getContentPane().add(lblTeste);
      
          
          
          setVisible(true);
        }
      /**
 *
 * @author CALVIN
 * @version 1.0
 * Este metodo cadastra o passaro
 * @param nome recebe o nome do passaro
 * @param familia recebe a familia do passaro
 * @param exp recebe a expectativa de vida do passaro
 * @param tamanho recebe o tamanho do passaro
 * @param status recebe o status de perigo do passaro
 */
      private void cadastraPassaro() {
          String nome = txtNome.getText();
          String familia = txtFam.getText();
          Float exp = Float.parseFloat(txtExp.getText());
          Float tamanho = Float.parseFloat(txtTam.getText());
          String status = (String)cmbStatus.getSelectedItem();
          
          Registro func = new Registro(nome,familia,exp,tamanho,status);
          func.gravaRegistro();
          System.out.println(func);
          
              }
        
      }

