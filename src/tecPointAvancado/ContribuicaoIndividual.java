package tecPointAvancado;
public class ContribuicaoIndividual {
    static void contribuicao(int x) {
        
         String dadosAntigos[] = tecPointAvancado.ProcessamentoDeDados.Dados(1);
         String dadosNovos[] = tecPointAvancado.ProcessamentoDeDados.Dados(0);
         String status[] = tecPointAvancado.ObterStatus.obterStatus(false);
         String taxaSemanal[] = new String[status.length],aux[] = null, aux1[] = null, aux2;
         String primeiro[] = null, segundo[] = null;
         int cont = 0;
         boolean verificacao;
         String completados[] = new String[taxaSemanal.length];
         
         for(int i = 0; i < status.length; i++){
             if(status[i] != null){
             aux = status[i].split(" ");
             verificacao = true;
             
             if(aux[1].equals("membro!")){
                 
                 for(int j = 0; j < dadosNovos.length; j++){
                     aux1 = dadosNovos[j].split(" ");
                     if(aux1[0].equals(aux[0])){
                         primeiro = dadosNovos[j].split(" ");
                     }
                 }
                 for(int j = 0; j < dadosAntigos.length; j++){
                     aux1 = dadosAntigos[j].split(" ");
                     if(aux1[0].equals(aux[0])){
                         segundo = dadosAntigos[j].split(" ");
                     }
                 }
                 int novo1, novo2, novo3;
                 int antigo2, antigo3;
                 int total1, total2, total3;
                 
                 novo1 = Integer.parseInt(primeiro[1]);
                 novo2 = Integer.parseInt(primeiro[2]);
                 novo3 = Integer.parseInt(primeiro[3]);
                 
                 antigo2 = Integer.parseInt(segundo[2]);
                 antigo3 = Integer.parseInt(segundo[3]);
                 
                 total1 = novo1;
                 total2 = novo2 - antigo2;
                 total3 = novo3 - antigo3;
                 
                 taxaSemanal[cont] = primeiro[0]+"  ----------------------------------------------";
                 
                 //saber se a contribuição foi alcaçada
                 int minimo = tecPointAvancado.CONFIGURACOES.DoacoesNecessarias(1);
                 if(minimo <= total1){
                     taxaSemanal[cont] += "\n contribuição de bank concluida com: "+String.valueOf(total1)+" pontos (+)BANK";  
                 }else{
                     verificacao = false;
                     taxaSemanal[cont] += "\n contribuição de bank não concluida com: "+String.valueOf(total1)+" pontos (-)BANK"; 
                 }
                 
                 minimo = tecPointAvancado.CONFIGURACOES.DoacoesNecessarias(2);
                 if(minimo <= total2){
                     taxaSemanal[cont] += "\n contribuição de tec concluida com: "+String.valueOf(total2)+" pontos (+)TEC";  
                 }else{
                     verificacao = false;
                     taxaSemanal[cont] += "\n contribuição de tec não concluida com: "+String.valueOf(total2)+" pontos (-)TEC"; 
                 }
                 
                 minimo = tecPointAvancado.CONFIGURACOES.DoacoesNecessarias(3);
                 
                 
                 if(minimo <= total3){
                     taxaSemanal[cont] += "\n contribuição de tax concluida com: "+String.valueOf(total3)+" pontos (+)TAX";  
                 }else{
                     verificacao = false;
                     taxaSemanal[cont] += "\n contribuição de tax não concluida com: "+String.valueOf(total3)+" pontos (-)TAX"; 
                 }
                 
                 
                 if(x == 0){System.out.println(taxaSemanal[cont]+"\n");
                 }
                 else{
                     if(verificacao == true){
                         completados[cont] = "(+) "+primeiro[0];
                     }else{
                         completados[cont] = "(-) "+primeiro[0];
                     }
                 }
             cont++;}
             }else{}
         }
          if(x == 1){
              for(int i = 0; i < completados.length; i++){
                  if(completados[i]!=null){
                  String auxiliar[] = completados[i].split(" ");
                  if(auxiliar[0].equals("(-)")){
                      System.out.println(completados[i]);
                      }
                  }
              }
              
              for(int i = 0; i < completados.length; i++){
                  if(completados[i]!=null){
                  String auxiliar[] = completados[i].split(" ");
                  if(auxiliar[0].equals("(+)")){
                      System.out.println(completados[i]);
                     }
                  }
               }
            }
         }
      } 
