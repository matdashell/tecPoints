package tecPointAvancado;

public class Start {
    public static void main(String[] args) {
        System.out.println("\n\n-----DADOS DO FLUXO SEMANAL DOS MEMBROS DO CAMP-----\n(+) = novo"
                + "\n(-) = saiu do camp\n\n");
        tecPointAvancado.ObterStatus.obterStatus(true);
        System.out.println("\n\n-----DADOS DA CONTRIBUIÇÃO SEMANAL-----\n(+) = meta batida\n(-) = meta não batida\n\n");
        tecPointAvancado.ContribuicaoIndividual.contribuicao(1);
        System.out.println("\n\n-----DADOS COMPLETOS DA CONTRIBUIÇÃO SEMANAL-----\n\n");
        tecPointAvancado.ContribuicaoIndividual.contribuicao(0);
    }
}
