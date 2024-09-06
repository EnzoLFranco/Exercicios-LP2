public class Roupa {
    private int IDRoupa;
    private String tipo;
    private String tamanho;
//Construtor
    public Roupa(int IDRoupa, String tipo, String tamanho){
        this.IDRoupa = IDRoupa;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }
//Métodos get() e set()
    public int getIDRoupa() {
        return IDRoupa;
    }
    public void setIDRoupa(int ID) {
        this.IDRoupa = ID;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tm) {
        this.tamanho = tm;
    }
//Métodos próprios
    public void vestir(String tipo, String cor){
        System.out.println("Você vestiu um(a) " + tipo + cor);
    }
    public void dobrar(String tipo){
        System.out.println("Você dobrou um(a) " + tipo);
    }
    public void lavar(String tipo){
        System.out.println("Você lavou um(a) " + tipo);
    }
}
