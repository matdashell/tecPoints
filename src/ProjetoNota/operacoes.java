package ProjetoNota;
import java.util.Scanner;
public class operacoes {
    
    public static int obterNumero(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de notas que deseja adicionar: ");
        int numero = input.nextInt();
        return numero;
    }
    
    public static String[][] REG1(int numero){
        Scanner input = new Scanner(System.in);
        String REG1[][] = new String[numero][2];
        
        for(int i = 0; i < numero; i++){
            for(int j = 0; j < 2; j++){
                if(j == 0){System.out.println("Digite o nome da nota "+ (1+i));}else{
                    System.out.println("Digite o conteúdo da nota "+ REG1[i][0]);
                }REG1[i][j] = input.next();
            }
        }
        return REG1;
    }
    
    public static String[][] REG2(int numero, int contador, String REG1[][]){
        Scanner input = new Scanner(System.in);
        String REG2[][] = new String[numero+contador][2];
        
        for(int i = 0; i < REG1.length; i++){
            for(int j = 0; j < 2; j++){
                REG2[i][j] = REG1[i][j]; 
            }
        }
        for(int i = contador; i < (contador+numero); i ++){
            for(int j = 0; j < 2; j++){
                if(j == 0){System.out.println("Digite o nome da nota "+ (1+i));}else{
                    System.out.println("Digite o conteúdo da nota "+ REG2[i][0]);
                }REG2[i][j] = input.next();
            }
        }return REG2;
        
    }
    
    public static void lerNotas(String REG2[][]){
        ProjetoNota.mensagens.mensagemLeitura();
        for(int i = 0; i < REG2.length; i++){
            System.out.println("Nota "+(i+1)+": "+REG2[i][0]);
        }
    }
    
    
        
}
