public class Aviao {
    private int numeroSerie;
    private String fabricante;
    private String modelo;
//Construtor
    public Aviao(int numeroSerie, String fabricante, String modelo) {
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }
//Get() e Set()
    public int getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
//Métodos próprios
    public void abastecer() {
        System.out.println(modelo + " abastecido.");
    }
    public void decolar() {
        System.out.println(modelo + " decolando.");
    }
    public void pousar() {
        System.out.println(modelo + " pousando.");
    }
}
