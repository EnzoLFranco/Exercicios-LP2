public class PlanetaSistemaSolar {
    private String nome;
    private float raio;
    private String massa;

    public PlanetaSistemaSolar(String nome, float raio, String massa){
        this.nome = nome;
        this.raio = raio;
        this.massa = massa;
    }
//Métodos get() e set()
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public String getMassa() {
        return massa;
    }
    public void setMassa(String massa) {
        this.massa = massa;
    }
//Métodos próprios
    public void orbitar(){
        System.out.println("O planeta " + nome + " está orbitando o Sol.");
    }
    public void rotacionar(){
        System.out.println("O planeta " + nome + " está rotacionando.");
    }
    public void mostrarComposição(){
        if(nome == "Mércurio" || nome == "Vênus" || nome == "Terra" || nome == "Marte"){
            System.out.println("O planeta é terrestre.");
        } else {
            System.out.println("O planeta é gasoso.");
        }
    }
}
