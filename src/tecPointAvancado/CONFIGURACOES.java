
package tecPointAvancado;
public class CONFIGURACOES {
    //NUMERO TOTAL DE MEMBROS
    static int TotalDeMembros(){
        //NUMERO TOTAL DE MEMBROS QUE O CAMP PODE ABRIGAR!
        //alterar somente o entre parentese!
        
        int total = /*margem de erro*/ 10 + (((((120)))));
        return total;}
    
    //LISTA DE MEMBROS PARA INPUT DE DADOS
    static String ListaDeMembrosNova(){
        String lista = "TateBr 100 90909 232323 juger 50 0 47121 9LeKoW 0 0 0 uhdushuhd 6 6 6 jojo 40 4046 6930 LF•Cai 20 1738 7500 nayluh 20 0 6751 DIHfps 0 29832 132082 kaudk 0 25633 155138 KK•Rex1 0 25154 262246 bob_1 0 23180 309750 mateus 0 0 0 yelingthon 7 7 7 ERK00 0 22757 338225 ";
                return lista;}
     static String ListaDeMembrosAntiga(){
        String lista = "TateBr 60 0 0 juger 50 0 47121 9LeKoW 40 4046 6930 LF•Cai 20 1738 7500 nayluh 20 0 6751 DIHfps 0 29832 132082 kaudk 0 25633 155138 testeUnido 9 9 9 KK•Rex1 0 25154 262246 kiko 0 0 0 bob_1 0 23180 309750 ERK00 0 22757 338225 ";
                return lista;}
   
    static int DoacoesNecessarias(int tipo){
     int taxa = 0, total;   
        if(tipo == 1){
        //doação necessária para doação do bank por semana
        taxa = 1950;}
        if(tipo == 2){
        //doação necessária de tec por semana    
        taxa = 1950;}
        if(tipo == 3){
        //taxa de farm mínima por semana    
        taxa = 10000;}
        
    return taxa;}
    
    
     
}
