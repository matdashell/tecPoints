package tecPointAvancado;
public class Principal {
    public static void main(String[] args) {
        //obtendo dados:
        
       String dadosAntigos[] = tecPointAvancado.InputDeDados.Dados(1);
       String dadosNovos[] = tecPointAvancado.InputDeDados.Dados(0);
       String status[] = new String[dadosNovos.length]; 
       int aux = 0;
       String aux1[], aux2[] = null, aux3[];
       
        //comparar dados:

        for(int i = 0; i < dadosNovos.length; i++){
            aux1 = dadosNovos[i].split(" ");
            if(i < dadosAntigos.length){
            aux2 = dadosAntigos[i].split(" ");}
            
            //verificando se o nome atual se encontra entre os nomes antigos
            
            boolean atualEstaNosAntigos = false;
            for(int j = 0; j < dadosAntigos.length; j++){
                aux3 = dadosAntigos[j].split(" ");
                
                if(aux1[0].equals(aux3[0])){
                    atualEstaNosAntigos = true;
                }else{} 
            }
            
            
            //verificar se o nome antigo se encontra entre os novos
            
            boolean antigoEstaNoAtual = false;
            for(int j =0; j < dadosNovos.length; j++){
                aux3 = dadosNovos[j].split(" ");
                
                if(aux2[0].equals(aux3[0])){
                    antigoEstaNoAtual = true;
                }else{}
                }
            
            //virificar status
            
            if(antigoEstaNoAtual && atualEstaNosAntigos){status[i] = aux1[0]+" é membro do camp";}
            if(antigoEstaNoAtual == true && atualEstaNosAntigos == false){status[i] = aux1[0]+" saiu do camp";}
            if(antigoEstaNoAtual == false && atualEstaNosAntigos == true){status[i] = aux2[0]+" é novo no camp";}
        }
        
        for(int i = 0; i < status.length; i++){
            System.out.println(status[i]);
        }
    }
}
