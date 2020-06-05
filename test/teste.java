/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcio
 */
public class teste {
    public static void main(String[] args) {
       teste.Dados();
    }
     static String inputDeDados(){
        String dados = ""
                + "KGLIVA 2000 48166 640077 BRECALO 2000 35676 550282 RMALTA 2000 33034 379169 KAAH 2300 23961 101576 TJLUA 2300 22919 113599 QLMAIA 2300 7239 91528 PALADNO 2000 5613 2468 AKQIA 2300 5060 35782 QMUMER 2000 5043 28570 007KK 2300 4393 44258 INVERNO 0 2506 9847 SAPATO 0 2188 12825 JVECTOR 0 1727 7304 COMUNAA 0 1572 29786 TJWES 0 1441 12339 ALAN 0 1369 8029 REXBR 0 580 4105 IGOR69 0 20 4441 NAIROBI 0 0 80264 KHRISG 0 0 21241 TEDDY 0 0 20278 TATEBR 60 0 0 JUGER 50 0 47121 LEKO 40 4046 6930 LFCAI 20 1738 7500 NAYLUH 20 0 8751 DIHFPS 0 29832 132082 KAUDK 0 25633 155138 KKREX 0 25154 252245 BOB1 0 23180 309750 ERK 0 22757 338225 ROKT 2000 3696 24955 HZEMY 2300 3088 103183 LAALVES 2000 1693 13738 KIMY 2000 1423 8206 MALDITA 2300 0 39310 JACKMEI 2300 0 0 WFLEO 1600 2030 7274 OMIAJE 1200 15208 195145 LAYS3R 958 4947 33793 CLEITON 600 18543 125535 UFZAC 580 1960 7874 LPLIPE 0 16157 122023 LILI 0 15628 120342 URFORD 0 12488 238184 PERSEU 0 11767 59288 COMUNA 0 8715 60793";
    return dados;}
    
    static String[] Dados(){
        int aux = 0, cont;
        String save[] = teste.inputDeDados().split(" ");
        String dados[] = new String[(save.length)/4];
        
        for(int i = 0; i < dados.length; i ++){
            for(cont = 0; cont < 4; cont++, aux++){
                if(cont == 0){
                    dados[i] = save[aux];
                }else{
                dados[i] += " "+save[aux];
                }
            }
            cont = 0;
        }
        for(int i = 0; i < dados.length; i++){
            System.out.println(dados[i]);
        }
    return dados;}
}
