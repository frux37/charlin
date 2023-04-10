package br.edu.ifsul.bcc.too.topico3.exercicios;


import br.edu.ifsul.bcc.too.topico3.TratamentoExcecoes;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 * @author telmo junior
 */

public class Teste2 {
        
    //metodo especial: 
    //esse método é o construtor da classe Teste.
    //o nome do método construtor deverá ser o mesmo da classe
    //é possível ter mais do que um método construtor na mesma classe, no entanto,
    //devem ser assinaturas diferentes.
    public Teste2(){
        
        Float v1 = recebeValorGUI();
        Float v2 = recebeValorGUI();
        Float r = metodoMedia(v1, v2);
        JOptionPane.showMessageDialog(null, "Media: " + r);
        //System.out.println("Media: " + r);
        
                      
    }
    
    //definicao de um método em java.
    //assinatura do método: retorno, nome e parâmetros.
    public float metodoMedia(float v1, float v2){        
        return (v1 + v2) / 2.0f;
    }
    
   
    
    public static void main(String args[]){        
        System.out.println("chamou a main");
        
        //criacao de variável/objeto
        //nesse caso o tipo objeto t é do tipo Teste. 
        //o objeto t está sendo inicializado com uma nova instância da classe Teste.
        Teste2 t;
        t = new Teste2();
        
      
    }
    
    public Float recebeValorGUI(){
        //Atividade 1 
        //implementar o bloco try/catch
        //float v1 = Float.parseFloat(JOptionPane.showInputDialog("Informe um valor decimal:"));
        //em caso de erro imprimir mensagem vai showMessageDialog
        //return v1;
   
        //Atividade 2
        //implementar uma rotina para solicitar valor enquanto a informação for inválido.
        float retorno = 0f;
        
        boolean erro = false;
        
        do{
            
            try{
                
                //recebe a informação e converte
                retorno = Float.parseFloat(JOptionPane.showInputDialog("Informe um valor decimal:"));
                erro = false;
                
            }catch(NumberFormatException e){
                erro = true;
                JOptionPane.showMessageDialog(null, "Valor inválido, digite novamente!");
            }
            
        }while(erro);
        
        return retorno;
        
    }
    
    public Float recebeValorCommandLine(){
        
        Scanner myObj = new Scanner(System.in); 
        System.out.println("Informe o primeiro valor float: ");
        String valor_lido = myObj.nextLine(); 
        
        //converter de String para float
        return Float.parseFloat(valor_lido);      
    
    }

    
    
    
    
}
