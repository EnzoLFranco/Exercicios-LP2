import java.util.*;
public class Main {
    public static void main(String[] args) {
        int opcao = 1;
        int opcao2 = 0;
        Scanner sc = new Scanner(System.in);
    Animal am = new Animal(02, "gato", "Jason");
    Aviao av = new Aviao(123, "Embraer", "BOEING 289");
    Carro crr = new Carro("12355", "Renault", "Sandero");
    InstrumentoCorda inst = new InstrumentoCorda(01, "Violão", 6);
    AparelhoEletrônico ape = new AparelhoEletrônico(1234556, "Dell", "Notebook");
    Pokemon pk = new Pokemon(359,"Absol","Dark,Dark");
    Roupa rp = new Roupa(12314314,"Calça","GG");
    VideoGame vg = new VideoGame("No Man's Sky", "Exploração", 10);
    PowerRanger pr = new PowerRanger("Tommy", "Branco","Tigre");
    PlanetaSistemaSolar ps = new PlanetaSistemaSolar("Terra",6371,"5.97 x 10²¹");
    while(opcao != 0) {
        System.out.println("| Insira qual classe você deseja testar os métodos: ");
        System.out.println("| 1 - Animal ");
        System.out.println("| 2 - Avião ");
        System.out.println("| 3 - Carro ");
        System.out.println("| 4 - Instrumento de Corda ");
        System.out.println("| 5 - Roupa ");
        System.out.println("| 6 - Pokemon ");
        System.out.println("| 7 - Video Game");
        System.out.println("| 8 - Power Ranger");
        System.out.println("| 9 - Planeta Sistema Solar");
        System.out.println("| 10 - Aparelho Eletrônico ");
        System.out.println("| 11 - Sair ");
        opcao = sc.nextInt();
        switch(opcao){
            case 1:
            System.out.println("| Você acessou a classe Animal, qual método deseja testar? ");
            System.out.println("| 1 - Comer ");
            System.out.println("| 2 - Dormir ");
            opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                       am.comer("ração");
                    break;
                    case 2:
                        am.dormir("Dominicc");
                    break;
                }
            break;
            case 2:
                System.out.println("| Você acessou a classe Avião, qual método deseja testar? ");
                System.out.println("| 1 - Decolar ");
                System.out.println("| 2 - Pousar ");
                opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                        av.decolar();
                    break;
                    case 2:
                        av.pousar();
                    break;
                }
                break;
            case 3:
                System.out.println("| Você acessou a classe Carro, qual método deseja testar? ");
                System.out.println("| 1 - Acelerar ");
                System.out.println("| 2 - Frear ");
                opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                        crr.acelerar();
                        break;
                    case 2:
                        crr.frear();
                        break;
                }
                break;
            case 4:
                System.out.println("| Você acessou a classe Instrumento de Corda, qual método deseja testar? ");
                System.out.println("| 1 - Tocar ");
                System.out.println("| 2 - Afinar ");
                opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                        inst.tocar("viola","Come as You are");
                        break;
                    case 2:
                        inst.afinar("violino");
                        break;
                }
                break;
            case 5:
                System.out.println("| Você acessou a classe Roupa, qual método deseja testar? ");
                System.out.println("| 1 - Vestir ");
                System.out.println("| 2 - Lavar ");
                opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                        rp.vestir("calça","azul");
                        break;
                    case 2:
                        rp.lavar("camisa");
                        break;
                }
                break;
            case 6:
                System.out.println("| Você acessou a classe Pokémon, qual método deseja testar? ");
                System.out.println("| 1 - Atacar ");
                System.out.println("| 2 - Comer ");
                opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                        pk.atacar();
                        break;
                    case 2:
                        pk.comer();
                        break;
                }
                break;
            case 7:
                System.out.println("| Você acessou a classe Video Game, qual método deseja testar? ");
                System.out.println("| 1 - Salvar Progresso ");
                System.out.println("| 2 - Carregar Progresso ");
                opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                        vg.salvarProgresso();
                        break;
                    case 2:
                        vg.carregarProgresso();
                        break;
                }
                break;
            case 8:
                System.out.println("| Você acessou a classe Power Ranger, qual método deseja testar? ");
                System.out.println("| 1 - Atacar ");
                System.out.println("| 2 - Chamar Zord ");
                opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                        pr.atacar();
                        break;
                    case 2:
                        pr.chamarZord();
                        break;
                }
                break;
            case 9:
                System.out.println("| Você acessou a classe Planeta do Sistema Solar, qual método deseja testar? ");
                System.out.println("| 1 - Orbitar ");
                System.out.println("| 2 - Mostrar composição ");
                opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                        ps.orbitar();
                        break;
                    case 2:
                        ps.mostrarComposição();
                        break;
                }
                break;
            case 10:
                System.out.println("| Você acessou a classe Aparelho Eletrônico, qual método deseja testar? ");
                System.out.println("| 1 - Ligar ");
                System.out.println("| 2 - Desligar ");
                opcao2 = sc.nextInt();
                switch(opcao2){
                    case 1:
                        ape.ligar();
                        break;
                    case 2:
                        ape.desligar();
                        break;
                }
                break;
            case 11:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inviável.");
        }
    }

    }
}