public class Animal {
    private int IDAnimal;
    private String nome;
    private String especie;
//Construtor
    public Animal(int IDAnimal, String especie, String nome){
        this.IDAnimal = IDAnimal;
        this.especie = especie;
        this.nome = nome;
    }
//Métodos get() e set()
    public int getIDAnimal() {
        return IDAnimal;
    }
    public void setIDAnimal(int ID) {
        this.IDAnimal = ID;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String espc) {
        this.especie = espc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nm) {
        this.nome = nm;
    }
//Métodos próprios
public void andar(int distancia){
    System.out.println(nome + " andou " + distancia + " metros.");
}
public void comer(String comida){
        System.out.println(nome + " começou a comer " + comida);
}
public void dormir(String nome1){
        System.out.println(nome1 + " começou a dormir");
}

}
