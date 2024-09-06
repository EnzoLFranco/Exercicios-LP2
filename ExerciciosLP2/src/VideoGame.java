public class VideoGame {
    private String nome;
    private String genero;
    private int classificacaoEtaria;
//Construtor
    public VideoGame(String nome, String genero, int classificacaoEtaria) {
        this.nome = nome;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }
//Get() e Set()
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }
    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }
//Métodos próprios
    public void iniciar() {
        System.out.println("Iniciando o jogo " + nome + "...");
    }
    public void salvarProgresso() {
        System.out.println("Salvando progresso do jogo " + nome + ".");
    }
    public void carregarProgresso() {
        System.out.println("Carregando progresso do jogo " + nome + ".");
    }
}
