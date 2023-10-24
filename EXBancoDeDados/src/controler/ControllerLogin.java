/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import DAO.AlunoDAO;
import DAO.Conexao;
import javax.swing.JOptionPane;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.SQLException;
import model.Aluno;
import java.sql.ResultSet;
import view.UsuarioFrame;

/**
 *
 * @author unifjjesus
 */
public class ControllerLogin {
    private LoginFrame view;

    public ControllerLogin(LoginFrame view) {
        this.view = view;
    }

    public void Logar(){
    Aluno aluno = new Aluno("",view.getEntrada_user().getText(),view.getEntrada_senha().getText());

        Conexao conexao = new Conexao();
        try {
           Connection conn = conexao.getConnection();
           AlunoDAO dao = new AlunoDAO(conn);
            ResultSet res = dao.consultar(aluno);
             if (res.next()) {
                 if ((aluno.getSenha().equals(res.getString(3)))) {
                     JOptionPane.showMessageDialog(view, "Login feito! \n Nome: "+res.getString(1)+"\n Usuario: "+res.getString(2), "Aviso", JOptionPane.INFORMATION_MESSAGE);
                     String nome = res.getString("nome");
                     String usuario = res.getString("usuario");
                     String senha = res.getString("senha");
                     UsuarioFrame uf = new UsuarioFrame(new Aluno(nome, usuario, senha));
                     uf.setVisible(true);
                     view.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(view, "Login não efetuado!", "Aviso", JOptionPane.ERROR_MESSAGE);
                    }
             }       
        }catch(SQLException ex) {
            System.out.println("Falha na conexão!");
            ex.printStackTrace();
        }
}
}
        

