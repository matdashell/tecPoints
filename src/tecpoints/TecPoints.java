package tecpoints;
public class TecPoints {
    public static void main(String[] args) {
        String listaAnterior[][] = tecpoints.Lista.listaAnterior();
        String listaAtual[][] = tecpoints.Lista.listaAtual();
        String mensagemFinal[] = new String[listaAtual.length];
        String dados[] = new String[listaAtual.length];
        int pontuacaoAnterior[] = new int[listaAtual.length];
        
        for(int i = 0; i < listaAtual.length; i++){
            pontuacaoAnterior[i] = Integer.parseInt(listaAnterior[i][1]);
            int pontuacaoAtual = Integer.parseInt(listaAtual[i][1]);
            int pontos = pontuacaoAtual - pontuacaoAnterior[i];
            if(pontos < 2000) {
                dados[i] = listaAtual[i][0] + "      -";
                mensagemFinal[i] = "Olá "+ listaAtual[i][0] + "! faltou vc contribuir "+(2000-pontos)+" pontos"
                        + " essa semana, pfv doe pois é importante.";
            }else{
                dados[i] = listaAtual[i][0] + "      +";
                mensagemFinal[i] = listaAtual[i][0]+" completou";
            }
        }System.out.println("DADOS GERAIS: (+) = doou  (-) = não doou");
        
        for(int i = 0; i < dados.length; i ++){
            System.out.println(dados[i]+"");
        }System.out.println("\n\nDADOS PARTICULARES"); System.out.println("\n");
        
        for(int i = 0; i < mensagemFinal.length; i++){
            String aux[] = mensagemFinal[i].split(" ");
            if("Olá".equals(aux[0])){
                System.out.println(mensagemFinal[i]);
            }
        }
        
        for(int i = 0; i < mensagemFinal.length; i++){
            String aux[] = mensagemFinal[i].split(" ");
            if(!"Olá".equals(aux[0])){
                System.out.println(mensagemFinal[i]);
            }
        }System.out.println("\n\nLISTA PARA SER USADA COMO ANTERIOR!\n\n");
        System.out.print("{");
        
        for(int i = 0; i < listaAtual.length; i++){
            System.out.print("{\""+listaAtual[i][0]+"\",\""+listaAtual[i][1]+"\"}");
            if(i+1 < listaAtual.length){
                System.out.print(",");
            }else{System.out.print("};");}
            System.out.println("");
        }System.out.println("\n\nLISTA PARA SER USADA COMO ATUAL!\n\n");
        System.out.print("{");
        
        for(int i = 0; i < listaAtual.length; i++){
            System.out.print("{\""+listaAtual[i][0]+"\",\"\"}");
            if(i+1 < listaAtual.length){
                System.out.print(",");
            }else{System.out.print("};");}
            System.out.println("");
        }
    }
}
