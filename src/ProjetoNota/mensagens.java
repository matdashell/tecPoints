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
    
    public static void mensagemLeitura(){
        System.out.println("\n\n\n\nDigite o numero da nota que deseja acessar..."
                + "\nAs notas que estão disponíveis são: \n\n");
    }
}
