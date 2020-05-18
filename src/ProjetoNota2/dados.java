package ProjetoNota2;
import java.util.Scanner;
public class dados {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean acess = true, primeiraVez = true, ativo;
        int escolha, notas,contador = 0;
        String REG1[][], REG2[][] = null;
        System.out.println("Bom teste helice :)");
        
        while(acess == true){
            System.out.println("1- Adicionar notas");
            if(primeiraVez == false){
                System.out.println("2- Ler Notas \n3- Editar Notas");
            }
            escolha = input.nextInt();
            ativo = true;
            
            
//------------------------------------------------------------------------------
            switch(escolha){
                case 1:
                    System.out.println("Digite o numero de notas que deseja adicionar");
                    notas = input.nextInt();
                    if(primeiraVez == true){
                        REG1 = new String[notas][2];
                       
                       for(int i = 0; i < notas; i++){
                           for(int j = 0; j < 2; j++){
                               
                               dados.mensagem(i, j, REG1);
                               REG1[i][j] = dados.replace(null, 1);
                                
                        }
                    }REG2 = REG1; contador = notas; primeiraVez = false;
                }
                    else{
                       REG1 = new String[(contador + notas)][2];
                       
                       for(int i = 0; i < contador; i++){
                           for(int j = 0; j < 2; j ++){
                               REG1[i][j] = REG2[i][j];
                           }
                       }
                       
                       for(int i = contador; i < (notas+contador); i++){
                           for(int j = 0; j < 2; j++){
                               
                               dados.mensagem(i, j, REG1);
                               REG1[i][j] = dados.replace(null, 1);
                        }
                    }contador += notas; REG2 = REG1;
                }break;
                    
//------------------------------------------------------------------------------
                case 2: 
                    while(ativo == true){
                    escolha = dados.mostrarNotas(REG2, "ler");
                    
                    System.out.println("A nota: "+ REG2[(escolha-1)][0].replace("¨¨", " ")+" "
                            + "Diz:\n"+REG2[(escolha-1)][1].replace("¨¨", " "));
                    System.out.println("Deseja ler outra nota? \n1- sim \n2- não");
                    
                    escolha = input.nextInt();
                    if(escolha == 1){}
                    else if(escolha == 2){ativo = false;}
                    else{System.out.println("opção inválida");}
                }break;
//------------------------------------------------------------------------------
                
                case 3: 
                   while(ativo == true){
                   escolha = dados.mostrarNotas(REG2, "editar");
                   System.out.println("Você deseja: \n1- Editar o nome"
                           + "\n2- Editar texto da nota \n3- Editar nome e texto");
                   int escolha2 = input.nextInt();
                   
                switch (escolha2) {
                    case 1:
                        System.out.println("Digite o novo nome da nota"+ REG2[(escolha-1)][0].replace("¨¨", " "));
                        REG2[(escolha-1)][0] = dados.replace(null, 1);
                        break;
                    case 2:
                        System.out.println("Digite o novo texto da nota"+ REG2[(escolha-1)][0].replace("¨¨", " "));
                        REG2[(escolha-1)][1] = dados.replace(null, 1);
                        break;
                    case 3:
                        System.out.println("Digite o novo nome da nota"+ REG2[(escolha-1)][0].replace("¨¨", " "));
                        REG2[(escolha-1)][0] = dados.replace(null, 1);
                        System.out.println("Digite o novo texto da nota"+ REG2[(escolha-1)][0].replace("¨¨", " "));
                        REG2[(escolha-1)][1] = dados.replace(null, 1);
                        break;
                    default:
                        System.out.println("opção inválida");
                        break;
                }
                System.out.println("Deseja alterar mais notas? \n1- sim \n2- não");
                escolha = input.nextInt();
                if(escolha == 1){}else{ativo = false;}
                   }
            }
        }
    }
    public static String replace(String palavra, int type){
        Scanner input = new Scanner(System.in);
        String novo;
        switch (type) {
            case 1:
                palavra = input.nextLine();
            case 2:
                novo = palavra.replace(" ", "¨¨");
                break;
            default:
                novo = palavra.replace("¨¨", " ");
                break;
        }
    return novo;}
    
    public static void mensagem(int i, int j, String REG1[][]){
         if(j == 0){
             System.out.println("Digite o nome da nota numero "+(i+1));}else{
             System.out.println("Insira o texto em:     "+REG1[i][0].replace("¨¨", " "));}
    }
    
    public static int mostrarNotas(String REG2[][], String acao){
        Scanner input = new Scanner(System.in);
        System.out.println("As notas disponíveis são: ");
        for(int i = 0; i < REG2.length; i++){
            System.out.println("nota numero "+(i+1)+" - De nome : "+REG2[i][0].replace("¨¨", " "));
        }
        System.out.println("Digite o numero da nota que deseja "+acao);
        int escolha = input.nextInt();
        
    return escolha;}
}
