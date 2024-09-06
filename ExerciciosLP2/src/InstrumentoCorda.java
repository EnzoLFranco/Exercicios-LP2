public class InstrumentoCorda {
    private int IDInstrumento;
    private String nome;
    private int numeroCordas;
//Construtor
    public InstrumentoCorda(int IDInstrumento, String nome, int numeroCordas){
        this.IDInstrumento = IDInstrumento;
        this.nome = nome;
        this.numeroCordas = numeroCordas;
    }
//Métodos get() e set()
    public int getIDInstrumento() {
        return IDInstrumento;
    }
    public void setIDInstrumento(int IDIns) {
        this.IDInstrumento = IDIns;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumeroCordas() {
        return numeroCordas;
    }
    public void setNumeroCordas(int numCordas) {
        this.numeroCordas = numCordas;
    }
//Métodos próprios
public void tocar(String nome1, String musica){
    System.out.println("Você tocou a música " + musica + " no " + nome1);
}
public void afinar(String nome1){
    System.out.println("Você afinou o " + nome1);
}
public void trocarCordas(String nome1, int numTrocado){
    System.out.println("Você trocou " + numTrocado + " cordas do " + nome1 );
}
}
