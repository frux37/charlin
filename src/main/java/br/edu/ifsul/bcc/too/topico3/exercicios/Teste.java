
package br.edu.ifsul.bcc.too.topico3.exercicios;

//import java.lang.*

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 * @author telmo junior
 */

public class Teste {
    
    
    //metodo especial: 
    //esse método é o construtor da classe Teste.
    //o nome do método construtor deverá ser o mesmo da classe
    //é possível ter mais do que um método construtor na mesma classe, no entanto,
    //devem ser assinaturas diferentes.
    public Teste(){
        
        //opcao 3
        /*
        Float v1 = recebeValorGUI();
        Float v2 = recebeValorGUI();
        Float r = metodoMedia(v1, v2);
        JOptionPane.showMessageDialog(null, "Media: " + r);
        */
      
                
    }
    public Teste(float v1, float v2){
                
    }
    
    //definicao de um método em java.
    //assinatura do método: retorno, nome e parâmetros.
    public float metodoMedia(float v1, float v2){        
        return (v1 + v2) / 2.0f;
    }
    
    //1)definir um método que receba por parâmetros dois valores inteiros
    //esse metodo deverá calcular a media dos valores recebidos
    //e retornar um valor float.
    
    public Float metodoMedia(Float v1, Float v2){
        Float resultado = v1 + v2;
        resultado = resultado / 2f;        
        return resultado;
    }
    
    //método main: é um método especial (é o primeiro a ser executado).
    //2) criar o método main, chamar o método criado no exercicio 1,
    //informando os valores para os parâmetros
    //imprimir na saída padrão o valor correspondente a média.

    
    public static void main(String args[]){        
        System.out.println("chamou a main");
        
        //criacao de variável/objeto
        //nesse caso o tipo objeto t é do tipo Teste. 
        //o objeto t está sendo inicializado com uma nova instância da classe Teste.
        Teste t;
        t = new Teste();
        
         
        //Exercicio: alterar esse rotina para que o usuário informe os dois valores.
        //opção 1: por interface gráfica. (javax.swing.JOptionPane)
        /*
        String v1 = JOptionPane.showInputDialog("Informe um valor decimal:");
        String v2 = JOptionPane.showInputDialog("Informe um valor decimal:");
        float resultado = t.metodoMedia(Float.parseFloat(v1), 
                                        Float.parseFloat(v2));
        System.out.println("Media: " + resultado);
        
        //operador + nesse caso está realizando uma concatencao de string com float.
        System.out.println("Media: " + resultado);
        */
        
        
        //opção 2: por linha de comando. (java.util.Scanner)
        /*
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Informe o primeiro valor float: ");
        String v1_scanner = myObj.nextLine(); 
        
        System.out.println("Informe o segundo valor float: ");
        String v2_scanner = myObj.nextLine(); 
         
         //chamada do metodo metodoMedia através do objeto t.
        //o retorno do método é armazenado na variável resultado.
      
        float resultado = t.metodoMedia(Float.parseFloat(v1_scanner), 
                                        Float.parseFloat(v2_scanner));
        
        
        //operador + nesse caso está realizando uma concatencao de string com float.
        System.out.println("Media: " + resultado);
        */
    }
    
    public Float recebeValorGUI(){
        
        float v1 = Float.parseFloat(JOptionPane.showInputDialog("Informe um valor decimal:"));
        
        return v1;
   
    }
    
    public Float recebeValorCommandLine(){
        
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Informe o primeiro valor float: ");
        String valor_lido = myObj.nextLine(); 
        
        //converter de String para float
        return Float.parseFloat(valor_lido);      
    
    }

    
    
    
    
}
