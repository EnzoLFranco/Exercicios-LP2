public class AparelhoEletrônico {
    private int numeroSerie;
    private String marca;
    private String tipo;
//Construtor
    public AparelhoEletrônico(int numeroSerie, String marca, String tipo) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.tipo = tipo;
    }
//Get() e Set()
    public int getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
//Métodos próprios
    public void ligar() {
        System.out.println("O aparelho " + marca + " do tipo " + tipo + " está ligado.");
    }
    public void desligar() {
        System.out.println("O aparelho " + marca + " do tipo " + tipo + " está desligado.");
    }
    public void redefinirConfigurações() {
        System.out.println("As configurações do aparelho " + marca + " do tipo " + tipo + " foram redefinidas.");
    }
}
