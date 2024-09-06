public class Pokemon {
    private int numeroPokedex;
    private String nome;
    private String tipos;
//Construtor
    public Pokemon(int numeroPokedex, String nome, String tipos) {
        this.numeroPokedex = numeroPokedex;
        this.nome = nome;
        this.tipos = tipos;
    }
//Get() e Set()
    public int getNumeroPokedex() {
        return numeroPokedex;
    }
    public void setNumeroPokedex(int numeroPokedex) {
        this.numeroPokedex = numeroPokedex;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipos() {
        return tipos;
    }
    public void setTipos(String tipos) {
        this.tipos = tipos;
    }
//Métodos próprios
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
    public void atacar() {
        System.out.println(nome + " está atacando!");
    }
    public void comer() {
        System.out.println(nome + " está comendo para recuperar energia.");
    }

}
