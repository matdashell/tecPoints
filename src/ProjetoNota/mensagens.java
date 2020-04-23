package ProjetoNota;
import java.util.Scanner;
public class mensagens {
    
    public static int mensagensInicial(boolean exibirMensagem){
        
        Scanner input = new Scanner(System.in);
        System.out.println("1- Criar Notas");
            if(exibirMensagem == true){System.out.println("2- Ler Notas\n3- Editar Notas");}
            int escolha = input.nextInt();
            return escolha;
    }
    
    public static void mensagemAviso(){
        System.out.println("Para o programa funcionar corretamente não se esqueça"
                + "de usar (. , - _) para separar palavras ao invés de espaço...\n"
                + "pois vetores conseguem armazenar apenas uma char...\n\n\n");
    }
    
    
}
