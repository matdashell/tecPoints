package ProjetoNota;
public class principal {
    
    public static void main(String[] args){
        int escolha, numero, contador = 0;
        boolean ativo = true, exibirMensagem = false;
        String REG1[][] = null, REG2[][] = null;
        
        System.out.println("Bem vindo(a) a plataforma");
        while(ativo == true){
            
            escolha = ProjetoNota.mensagens.mensagensInicial(exibirMensagem);
            exibirMensagem = true;
            ProjetoNota.operacoes.limpar();
            
            switch (escolha) {
                case 1:
                    ProjetoNota.mensagens.mensagemAviso();
                    numero = ProjetoNota.operacoes.obterNumero();
                    if(contador == 0){
                        REG1 = ProjetoNota.operacoes.REG1(numero);
                        REG2 = REG1;
                    }else{
                        REG2 = ProjetoNota.operacoes.REG2(numero, contador, REG1);
                        REG1 = REG2;
                        
                    }   contador += numero;
                    break;
                case 2:
                    ProjetoNota.operacoes.lerNotas(REG2);
                    break;
                case 3:
                    REG2 = ProjetoNota.operacoes.editarNotas(REG2);
                    break;
                default:
                    System.out.println("opção inválida.");
                    break;
            }
        }
    }
}
