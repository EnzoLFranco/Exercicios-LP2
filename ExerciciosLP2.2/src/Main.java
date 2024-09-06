import java.util.*;
public class Main {
    public static void main(String[] args) {
        int opcao = 1;
        Scanner sc = new Scanner(System.in);
        adicao ad =new adicao();
        subtracao sub =new subtracao();
        multiplicacao mult =new multiplicacao();
        divisao div =new divisao();
        while(opcao != 5){
            System.out.println("| Insira qual operação com frações você deseja: ");
            System.out.println("| 1 - Adição ");
            System.out.println("| 2 - Subtração ");
            System.out.println("| 3 - Multiplicação ");
            System.out.println("| 4 - Divisão ");
            System.out.println("| 5 - Sair ");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    ad.adicaoFracoes();
                break;
                case 2:
                    sub.subtracaoFracoes();
                break;
                case 3:
                    mult.multiplicacaoFracoes();
                break;
                case 4:
                    div.divisaoFracoes();
                break;
                case 5:
                    System.exit(0);
                break;
                default:
                    System.out.println("Insira uma das opções acima.");
                break;
            }
        }
    }
}