package ProjetoNota;
import java.util.Scanner;
public class principal {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int escolha, numero = 0, contador = 0;
        boolean ativo = true, exibirMensagem = false;
        String REG1[][] = null, REG2[][];
        
        System.out.println("Bem vindo(a) a plataforma");
        while(ativo == true){
            
            escolha = ProjetoNota.mensagens.mensagensInicial(exibirMensagem);
            exibirMensagem = true;
            
            switch(escolha){
            case 1:
            numero = ProjetoNota.operacoes.obterNumero();
            if(contador == 0){
                REG1 = ProjetoNota.operacoes.REG1(numero);
            }else{
                REG2 = ProjetoNota.operacoes.REG2(numero, contador, REG1);
                REG1 = REG2;
            }
            
        }contador += numero;
        }
    }
}
