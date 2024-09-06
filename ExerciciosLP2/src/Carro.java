public class Carro {
    private String placa;
    private String marca;
    private String modelo;
//Construtor
    public Carro(String placa, String marca, String modelo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
//Métodos get() e set()
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String pl) {
        this.placa = pl;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String mc) {
        this.marca = mc;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String md) {
        this.modelo = md;
    }
//Métodos próprios
    public void ligar(){
        System.out.println("Você ligou o " + modelo);
    }
    public void acelerar(){
        System.out.println("Você acelerou o " + modelo);
    }
    public void frear(){
        System.out.println("Você freou o " + modelo);
    }
}
