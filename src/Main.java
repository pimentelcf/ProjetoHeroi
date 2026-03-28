public class Main {
    public static void main(String[] args) {
        // --- CRIAÇÃO DO HERÓI ---
        Heroi h1 = new Heroi();
        GerenciadorHeroi gerenciador = new GerenciadorHeroi();
        MissaoHeroi sistemaDeMissoes = new MissaoHeroi();

        //  Criando e Treinando o Herói
        gerenciador.criarPersonagem();
        gerenciador.treinar();

        //  Tentando treinar o Vilão
        gerenciador.criarPersonagem();
        gerenciador.treinar();
    }
}