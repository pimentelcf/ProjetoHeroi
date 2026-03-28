import java.util.Scanner;

public class GerenciadorHeroi {

    public Heroi heroiAtivo;
    private Scanner leitor = new Scanner(System.in);

    public void criarPersonagem() {
        Heroi novo = new Heroi();

        System.out.println("\n--- Setup de Personagem ---");
        System.out.print("Nome: ");
        novo.nome = leitor.nextLine();

        System.out.print("Poder: ");
        novo.poder = leitor.nextDouble();


        leitor.nextLine();

        //  Pergunta como TEXTO (String)
        System.out.print("Ele é um vilão? (sim/nao): ");
        String resposta = leitor.nextLine().toLowerCase(); // Lê o "sim"

        //  Traduz o texto para o booleano do objeto
        if (resposta.equals("sim")) {
            novo.ehVilao = true;
            System.out.println("CUIDADO: O vilão " + novo.nome + " surgiu!");
        } else {
            novo.ehVilao = false;
            System.out.println("ESPERANÇA: O herói " + novo.nome + " chegou estaremos todos salvos!");

        }

        this.heroiAtivo = novo;

        // AQUI É O LUGAR PARA PUXAR O GRITO DA CLASSE HEROI
        System.out.println("------------------------------");
        System.out.println(this.heroiAtivo.obterGritoDeGuerra());
        System.out.println("------------------------------");

        System.out.println("Personagem pronto para a ação!\n");
    }
    public void treinar() {
        //  Verifica se o usuário já criou um personagem
        if (this.heroiAtivo == null) {
            System.out.println("Erro: Você precisa criar um personagem antes de treinar!");
            return; // Sai do metodo
        }

        //  Vilões não treinam aqui
        if (this.heroiAtivo.ehVilao) {
            System.out.println("ACESSO NEGADO: O sistema identificou que " + heroiAtivo.nome + " é um vilão!");
        } else {
            //  Aumenta o poder e avisa o usuário
            this.heroiAtivo.poder += 100;
            System.out.println("--- TREINO FINALIZADO ---");
            System.out.println(heroiAtivo.nome + " treinou pesado! Poder atual: " + heroiAtivo.poder);
        }
    }
}