public class Personagem {

    private String nome;
    private String classe;
    private int vidaAtual;
    private int vidaMaxima;
    private int nivel;
    private int moedas;

    public Personagem(String nome, String classe, int vidaMaxima){
        this.nome = nome;
        this.classe = classe;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.nivel = 1;
        this.moedas = 100;

    }

    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getMoedas() {
        return moedas;
    }

    public int getNivel(){
        return nivel;
    }

    void mostrarPersonagem() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Vida: " + vidaAtual + "/" + vidaMaxima);
        System.out.println("Nível: " + nivel);
        System.out.println("Moedas: " + moedas);

    }

    public void receberDano(int dano) {
        if (dano < 0) {
            System.out.println("Dano invalido");
        }

        else {
            vidaAtual -= dano;

        }

    }

    public void recuperarVida(int cura) {
        if (cura < 0) {
            System.out.println("impossivel curar");
        }

        else if (cura > vidaMaxima) {
            vidaAtual = vidaMaxima;
        }

        else {
            vidaAtual += cura;
        }

    }

    public void receberMoeda(int quantidade) {
        if (quantidade < 0) {
            System.out.println("quantidade rejeitada");
        }
        else {
            moedas += quantidade;
        }
    }

    public void comprar(int valor) {
        if (valor < 0 ) {
            System.out.println("quantidade rejeitada");
        }
        else if (valor > moedas) {
            System.out.println("Dinheiro insuficiente");
        }

        else {
            moedas -= valor;
        }
    }

    public void subirDeNivel() {
        nivel ++;
    }

}
