/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifjjesus
 */
public class Pessoa {
    private String nome;
    private int telefone;
    private int id;
    
    public Pessoa(String nome, int telefone, int id){
        setNome(nome);
        setTelefone(telefone);
        setId(id);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }
    public int getTelefone(){
        return telefone;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
}
