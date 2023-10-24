/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import model.Aluno;
import view.UsuarioFrame;
import DAO.AlunoDAO;
import DAO.Conexao;
import javax.swing.JOptionPane;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author unifjjesus
 */
public class ControllerUsuario {
    private UsuarioFrame view;
    private Aluno aluno;

    public ControllerUsuario(UsuarioFrame view, Aluno aluno) {
        this.view = view;
        this.aluno = aluno;
    }
    
    public void atualizar(){
        String usuario = view.getjTextField1().getText();
        String novasenha = view.getjTextField2().getText();
        Aluno aluno = new Aluno ("",usuario,novasenha);
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            dao.atualiza(aluno);
            JOptionPane.showMessageDialog(view, "Atualizado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Troca não efetuada!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void remover(){
        String usuario = aluno.getUsuario();
        int option = JOptionPane.showConfirmDialog(view, "Deseja mesmo excluir?", "Aviso!", JOptionPane.YES_NO_CANCEL_OPTION);
        if(option != 1){
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            dao.remover(aluno);
            JOptionPane.showMessageDialog(view, "Deletado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(view, "Não foi deletado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }}
        else{
           JOptionPane.showMessageDialog(view, "Não foi deletado!", "Aviso", JOptionPane.INFORMATION_MESSAGE); 
        }
    }
}
