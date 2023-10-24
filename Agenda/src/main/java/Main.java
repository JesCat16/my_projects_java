
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifjjesus
 * 
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <Pessoa> pe = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int id  = 0;
        int parada = 0;
        System.out.println("Agenda:");
        while(true){
            System.out.println("Entre com uma das opcoes: ");
            System.out.println("n [nova entrada]");
            System.out.println("d [apagar contato]");
            System.out.println("r [atualizar telefone]");
            System.out.println("p [imprimir agenda no terminal]");
            System.out.println("i [imprimir agenda em arquivo txt]");
            System.out.println("q [saia do programa]");
            
            String entrada = input.nextLine();
            
            if(entrada.equals("n")){
                Scanner inputN = new Scanner(System.in);
                System.out.println("Digite o nome: ");
                String nome = inputN.nextLine();
                System.out.println("Digite a telefone: ");
                int telefone = inputN.nextInt();
                pe.add(new Pessoa(nome,telefone,++id));
            }
            else if(entrada.equals("d")){
                try{
                    Scanner inputD = new Scanner(System.in);
                    System.out.println("Digite o nome a ser deletado: ");
                    String nomeDel = inputD.nextLine();
                    for(int i = 0; i < pe.size();i++){
                        if(pe.get(i).getNome().equals(nomeDel)){
                            pe.remove(i);
                        }
                } 
                }catch(Exception e){
                    e.printStackTrace();
                }
                
                
                
            }
            else if(entrada.equals("p")){
                for(Pessoa pessoa: pe){
                    System.out.println("Nome: " + pessoa.getNome());
                    System.out.println("Telefone: " + pessoa.getTelefone());
                    System.out.println("Id: " + pessoa.getId());
                    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
                }
            }
            else if (entrada.equals("r")){
                try{
                    Scanner inputA = new Scanner(System.in);
                    System.out.println("Digite o nome a ser atualizado: ");
                    String nomeAtual = inputA.nextLine();
                    for(int i = 0; i < pe.size();i++){
                        if(pe.get(i).getNome().equals(nomeAtual)){
                            Scanner inp = new Scanner(System.in);
                            System.out.println("Digite o novo telefone: ");
                            int Telef = inp.nextInt();
                            pe.get(i).setTelefone(Telef);
                        }
                    }
              }catch(Exception e){
                    e.printStackTrace();
               } 
            }
            else if(entrada.equals("q")){
                break;
            }
            else if (entrada.equals("i")){
                try{
                    FileWriter arquivo = new FileWriter("agenda.txt");
                    PrintWriter escrever = new PrintWriter(arquivo);
                    escrever.println("Agenda:");
                        for (int i = 0; i < pe.size(); i++) {
                            escrever.println("Nome: " + pe.get(i).getNome() +" | Contato: " + pe.get(i).getTelefone());
                            escrever.println("-----------------------------------------------------------");
                        }
                    arquivo.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println("Feito!!");
            }
            else{
                System.out.println("Opcao Invalida! Tente novamente...");
            }
        }
        
    }
}
