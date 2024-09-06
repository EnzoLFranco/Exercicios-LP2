import java.util.Scanner;
public class subtracao {
    Scanner scanner = new Scanner(System.in);
    private int numerador;
    private int denominador;

    public int getDenominador() {
        return denominador;
    }
    public int getNumerador() {
        return numerador;
    }
    public void setDenominador(int den) {
        this.denominador = den;
    }
    public void setNumerador(int num) {
        this.numerador = num;
    }

    public void subtracaoFracoes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A subtração vai envolver quantas frações? ");
        int numFracoes = scanner.nextInt();
        System.out.println("Informe a primeira fração");
        System.out.print("Numerador: ");
        int numeradorFinal = scanner.nextInt();

        System.out.print("Denominador: ");
        int denominadorFinal = scanner.nextInt();

        for (int i = 2; i <= numFracoes; i++) {
            System.out.println("Informe a fração " + i);
            System.out.print("Numerador: ");
            int numerador = scanner.nextInt();

            System.out.print("Denominador: ");
            int denominador = scanner.nextInt();
            numeradorFinal = (numeradorFinal * denominador) - (numerador * denominadorFinal);
            denominadorFinal *= denominador;

            for (int j = 2; j <= Math.min(Math.abs(numeradorFinal), Math.abs(denominadorFinal)); j++) {
                while (numeradorFinal % j == 0 && denominadorFinal % j == 0) {
                    numeradorFinal /= j;
                    denominadorFinal /= j;
                }
            }
        }
        System.out.println("A fração final da subtração é: " + numeradorFinal + "/" + denominadorFinal);
    }
}
