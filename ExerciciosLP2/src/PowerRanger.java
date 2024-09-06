public class PowerRanger {
    private String nome;
    private String corUniforme;
    private String zord;
//Construtor
    public PowerRanger(String nome, String corUniforme, String zord) {
        this.nome = nome;
        this.corUniforme = corUniforme;
        this.zord = zord;
    }
//Get() e Set()
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCorUniforme() {
        return corUniforme;
    }
    public void setCorUniforme(String corUniforme) {
        this.corUniforme = corUniforme;
    }
    public String getZord() {
        return zord;
    }
    public void setZord(String zord) {
        this.zord = zord;
    }
//Métodos próprios
    public void morfar() {
        System.out.println(nome + " morfou com o uniforme " + corUniforme + "!");
    }
    public void atacar() {
        System.out.println(nome + " está atacando!");
    }
    public void chamarZord() {
        System.out.println(nome + " chamou o Zord " + zord + "!");
    }
}
