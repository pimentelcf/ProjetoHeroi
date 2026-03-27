import java.util.Scanner;

public class GerenciadorHeroi {
    // ATRIBUTO: A "gaveta" que vai guardar o objeto Heroi
    public Heroi heroiAtivo;

    // metodo adicionar o heroi da main
    public void adicionarHeroi(Heroi heroiRecebido) {
        this.heroiAtivo = heroiRecebido;
        System.out.println("Gerenciador: Herói " + heroiAtivo.nome + " foi vinculado!");
    }

    public void treinar() {
        if (this.heroiAtivo != null) {
            this.heroiAtivo.nivelForca += 10;
            System.out.println("Treino concluído! Nova força de " + heroiAtivo.nome + ": " + heroiAtivo.nivelForca);
        } else {
            System.out.println("Erro: Nenhum herói vinculado para treinar!");
        }
    }
}