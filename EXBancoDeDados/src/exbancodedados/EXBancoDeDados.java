/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exbancodedados;

import DAO.Conexao;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author unifjjesus
 */
public class EXBancoDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        
//        Conexao conexao = new Conexao();
//        try {
//            Connection conn = conexao.getConnection();
//        } catch (SQLException ex) {
//            System.out.println("Falha na conexão!");
//            ex.printStackTrace();
//        }
    }
    
}
