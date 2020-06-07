package tecPointAvancado;
public class ObterStatus {
    static String[] obterStatus(boolean x){
        //obtendo dados:
        
       String dadosAntigos[] = tecPointAvancado.ProcessamentoDeDados.Dados(1);
       String dadosNovos[] = tecPointAvancado.ProcessamentoDeDados.Dados(0);
       String status[] = new String[tecPointAvancado.CONFIGURACOES.TotalDeMembros()]; //armazenar status do player | NUMERO DE PLAYERS
       int cont = 0;
       String auxNovo[], auxAntigo[] = null, aux[];
       boolean auxStatus;
        
       //declarar a variável status para caber Todos os membros no status(relatório).
       
        
       
        //comparar dados:

       for(int i = 0; i < dadosNovos.length; i++){
           //desfragmentar o novo e colocar ele na variavel auxNovo para percorrer
           //todos os antigos e verificar situação.
           
           auxNovo = dadosNovos[i].split(" ");
           auxStatus = false;
           
           for(int j = 0; j < dadosAntigos.length; j++){
               //verificar se o dado novo em algm momento se encontra no dado antigo
               //e salvar na variável status.
               auxAntigo = dadosAntigos[j].split(" ");
               if(auxAntigo[0].equals(auxNovo[0])){
                   auxStatus = true;
               }else{}
           }
           //se durante o ciclo for acima tiver encontrado um nome novo == nome antigo
           //a boolena auxStatus ficará true e sera usada na decisão entre "membro" ou
           //"novato".
           if(auxStatus == true){
               status[cont] = auxNovo[0]+" membro!"; cont ++;
               
           }else{
               status[cont] = auxNovo[0]+" novato!"; cont ++;
               
           }
       }
       
       for(int i = 0; i < dadosAntigos.length; i++){
           //verificar se os antigos se encontram dentre os membros novos, caso
           //estejam == ignore, caso não estejam isso significa que o membro saiu
           //do camp igual um teretão saindo do cuzin nhaimmmmmmmmmmmmmm.
           
           auxAntigo = dadosAntigos[i].split(" ");
           auxStatus = false;
           
           for(int j = 0; j < dadosNovos.length; j++){
               //verificar se o dado antigo em algm momento se encontra no dado novo
               //e salvar na variável status caso não encontre.
               auxNovo = dadosNovos[j].split(" ");
               if(auxNovo[0].equals(auxAntigo[0])){
                   auxStatus = true;
               }else{}
           }
           
           //se durante o ciclo for acima tiver encontrado um nome antigo == nome novo
           //a boolena auxStatus ficará true e sera usada na decisão entre "membro" ou
           //"saiu".
           
           if(auxStatus == true){}else{
               status[cont] = auxAntigo[0]+" saiu!"; cont ++;
           }
       }
        if(x == true){
        for(int i = 0; i < cont; i++){
            aux = status[i].split(" ");
            if("novato!".equals(aux[1])){
            System.out.println("(+) "+status[i]);
                }
            }
        /*for(int i = 0; i < cont; i++){
            aux = status[i].split(" ");
            if("membro!".equals(aux[1])){
            System.out.println("(=) "+status[i]);
                }
            }*/
        for(int i = 0; i < cont; i++){
            aux = status[i].split(" ");
            if("saiu!".equals(aux[1])){
            System.out.println("(-) "+status[i]);
                }
            }
        }
        
        
        return status;
    }
}
