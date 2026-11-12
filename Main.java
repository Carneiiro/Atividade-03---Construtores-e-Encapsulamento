public class Main {
    public static void main(String[] args) {

        Personagem personagem = new Personagem("Guardiao Celta ","Guerreiro",15);


        System.out.println("\n --personagem--");
        personagem.mostrarPersonagem();
        System.out.println("\n");

        personagem.receberDano(5);
        System.out.println(personagem.getNome() + "perdeu vida!!!");
        personagem.receberMoeda(50);
        System.out.println(personagem.getNome() + "encontrou " + personagem.getMoedas() + " moedas!!!!");
        personagem.comprar(80);
        System.out.println(personagem.getNome() + " comprou uma pocao de cura");
        System.out.println(personagem.getNome() + " usou a pocao");
        personagem.recuperarVida(3);
        System.out.println("vida:" + personagem.getVidaAtual() + "/" + personagem.getVidaMaxima());
        personagem.subirDeNivel();

        System.out.println("\n --personagem--");
        personagem.mostrarPersonagem();










    }
}