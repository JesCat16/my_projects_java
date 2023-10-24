/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import DAO.AlunoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluno;
import view.CadastroFrame;

/**
 *
 * @author unifjjesus
 */
public class ControllerCadastro {
    private CadastroFrame view;

    public ControllerCadastro(CadastroFrame view) {
        this.view = view;
    }
    public void salvarAluno(){
        String nome = view.getEntrada_c_nome().getText();
        String usuario = view.getEntrada_c_user().getText();
        String senha = view.getEntrada_c_senha().getText();
        Aluno aluno = new Aluno(nome,usuario,senha);
        
        Conexao conexao = new Conexao();
         try {
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            dao.inserir(aluno);
            JOptionPane.showMessageDialog(view, "Cadastrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Cadastro não efetuado!", "Aviso", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
}
