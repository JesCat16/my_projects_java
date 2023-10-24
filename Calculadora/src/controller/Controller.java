/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Multiplicacao;
import model.OperacaoMatematica;
import model.Soma;
import model.Subitracao;
import model.divisao;
import view.Janela;

/**
 *
 * @author unifjjesus
 */
public class Controller {
    private Janela jan;
    private OperacaoMatematica calc;
    private String n1,n2;
    
    public Controller(Janela jan){
        this.jan = jan;
    }
    public void cum(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "1");
    }
    public void cdois(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "2");
    }
    public void ctres(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "3");
    }
    public void cquatro(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "4");
    }
    public void ccinco(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "5");
    }
    public void cseis(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "6");
    }
    public void csete(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "7");
    }
    public void cnoito(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "8");
    }
    public void cnove(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "9");
    }
    public void czero(){
        String texto = jan.getDisplay().getText();
        jan.getDisplay().setText(texto + "0");
    }
    public void soma(){
        n1 = jan.getDisplay().getText();
        calc = new Soma();
        jan.getDisplay().setText("");
    }
    public void subtracao(){
        n1 = jan.getDisplay().getText();
        calc = new Subitracao();
        jan.getDisplay().setText("");
    }
    public void divisao(){
        n1 = jan.getDisplay().getText();
        calc = new divisao();
        jan.getDisplay().setText("");
    }
    public void multiplicacao(){
        n1 = jan.getDisplay().getText();
        calc = new Multiplicacao();
        jan.getDisplay().setText("");
    }
    
    public void clean(){
        jan.getDisplay().setText("");
    }
    public void igual(){
        n2 = jan.getDisplay().getText();
        double resposta = calc.calcular(Double.parseDouble(n1), Double.parseDouble(n2));
        jan.getDisplay().setText(String.valueOf(resposta));
    }
}
