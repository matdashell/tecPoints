package ProjetoNota;
import java.util.Scanner;
public class operacoes {
    
    public static int obterNumero(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de notas que deseja adicionar: ");
        int numero = input.nextInt();
        limpar();
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
            limpar();
        }return REG1;
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
            }limpar();
        }return REG2;
    }
    
    public static void lerNotas(String REG2[][]){
        boolean acess = true;
        Scanner input = new Scanner(System.in);
        while(acess == true){
        System.out.println("As notas disponíveis são: \n\n\n");
        
        for(int i = 0; i < REG2.length; i++){
            System.out.println("Nota "+(i+1)+": "+REG2[i][0]);
        }
        System.out.println("\n\n\nDigite o numero da nota que deseja acessar...");
        int notaLer = input.nextInt();
        limpar();
        System.out.println("Conteúdo da nota "+REG2[(notaLer-1)][0]+" é: \n");
        System.out.println(REG2[(notaLer-1)][1]+ "\n\nDeseja ler outra nota?"
                + "\n1 - sim \n2 - não");
        int escolha = input.nextInt();
        
        switch(escolha){
            case 1: limpar();
                continue;
                
            case 2: limpar(); 
                acess = false;
            
        }
    }
}
    
    public static String[][] editarNotas(String REG2[][]){
        boolean acess = true;
        Scanner input = new Scanner(System.in);
        while(acess == true){
        System.out.println("As notas que estão disponíveis são: \n\n\n");
        
        for(int i = 0; i < REG2.length; i++){
            System.out.println("Nota "+(i+1)+": "+REG2[i][0]);
        }
        System.out.println("\n\n\nDigite o numero da nota que deseja editar...");
        int notaEditar = input.nextInt();
        limpar();
        System.out.println("você deseja...\n1 - editar nome da nota."
                + "\n2 - editar conteúdo da nota."
                + "\n3 - editar nome e conteúdo da nota.");
        
        int escolha = input.nextInt();
        limpar();
        
        switch(escolha){
            case 1: 
                System.out.println("\nDigite o novo nome da nota.");
                REG2[(notaEditar-1)][0] = input.next();
                limpar();
                break;
                
            case 2: 
                System.out.println("\nDigite o novo conteúdo da nota.");
                REG2[(notaEditar-1)][1] = input.next();
                limpar();
                break;
                
            case 3:
                System.out.println("\nDigite o novo nome da nota.");
                REG2[(notaEditar-1)][0] = input.next();
                limpar();
                
                System.out.println("\nDigite o novo conteúdo da nota.");
                REG2[(notaEditar-1)][1] = input.next();
                limpar();
        }
        
        System.out.println("\n\n\n Deseja editar outra nota?"
                + "\n1 - sim \n2 - não");
        escolha = input.nextInt();
        
        switch(escolha){
            case 1: limpar();
                continue;
            
            case 2: limpar();
                acess = false;
            
            }
        }return REG2;
    }
    
    public static void limpar(){
        for(int i = 0; i < 30; i++){
            System.out.println();
        }
    }
}
