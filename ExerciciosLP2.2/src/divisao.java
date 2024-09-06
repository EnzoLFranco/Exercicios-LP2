import java.util.Scanner;
public class divisao {
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

    public void divisaoFracoes() {
        System.out.print("Quantas frações você deseja dividir? ");
        int numFractions = scanner.nextInt();
        int numeradorFinal = 1;
        int denominadorFinal = 1;
        for (int i = 1; i <= numFractions; i++) {
            System.out.println("Informe a fração " + i);
            System.out.print("Numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("Denominador: ");
            int denominador = scanner.nextInt();
            if (i == 1) {
                numeradorFinal = numerador;
                denominadorFinal = denominador;
            } else {
                numeradorFinal *= denominador;
                denominadorFinal *= numerador;
            }
        }
        for (int i = 2; i <= Math.min(Math.abs(numeradorFinal), Math.abs(denominadorFinal)); i++) {
            while (numeradorFinal % i == 0 && denominadorFinal % i == 0) {
                numeradorFinal /= i;
                denominadorFinal /= i;
            }
        }
        System.out.println("A fração final da divisão é: " + numeradorFinal + "/" + denominadorFinal);
    }
}
