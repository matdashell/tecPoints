package tecPointAvancado;
public class ProcessamentoDeDados {
    
    
    
    
    
    static String inputDeDadosNovos(){
        String novos = tecPointAvancado.CONFIGURACOES.ListaDeMembrosNova();
                return novos;}
    
    
    
    static String inputDeDadosAntigos(){
        String antigos = tecPointAvancado.CONFIGURACOES.ListaDeMembrosAntiga();
                return antigos;}
    
    
    static String[] Dados(int x){
        String save[] = null;
        String dados[] = null;
        int aux = 0, cont;
        if(x == 0){
        save = tecPointAvancado.ProcessamentoDeDados.inputDeDadosNovos().split(" ");
        dados = new String[(save.length)/4];
        
        for(int i = 0; i < dados.length; i ++){
            for(cont = 0; cont < 4; cont++, aux++){
                if(cont == 0){dados[i] = save[aux];}else{
                dados[i] += " "+save[aux];}}
            cont = 0; //System.out.println(dados[i]);
            }
        
        }else{save = tecPointAvancado.ProcessamentoDeDados.inputDeDadosAntigos().split(" ");
        dados = new String[(save.length)/4];
        
        for(int i = 0; i < dados.length; i ++){
            for(cont = 0; cont < 4; cont++, aux++){
                if(cont == 0){dados[i] = save[aux];}else{
                dados[i] += " "+save[aux];}}
            cont = 0; //System.out.println(dados[i]);
            }
        }
    return dados;}
}
