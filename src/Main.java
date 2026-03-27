public class Main {
    public static void main(String[] args) {
        // 1. Criamos o objeto do Herói (O DNA)
        Heroi h1 = new Heroi();
        h1.nome = "Arqueiro Verde";
        h1.superPoder = "Pontaria";
        h1.nivelForca = 50;

        // 2. Criamos o Gerenciador (A Máquina)
        GerenciadorHeroi gerenciador = new GerenciadorHeroi();

        // Passamos o objeto 'h1' para dentro do metodo gerenciador
        // É aqui que o 'this.heroiAtivo = heroiRecebido' acontece!
        gerenciador.adicionarHeroi(h1);

        // O gerenciador agora consegue treinar o h1 porque ele o "conhece"
        gerenciador.treinar();

        // Se pedirmos para o herói se exibir, veremos que a força subiu
        h1.exibirFicha();
    }
}