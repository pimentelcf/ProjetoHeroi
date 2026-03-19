   public class Main {
       public static void main(String[] args) {
           // Seu código de controle vai aqui dentro

           Gerenciador_Heroi gerenciado = new Gerenciador_Heroi();
           Heroi h1 = new Heroi("Pimentel", 20);

           //  Usar o nome da variável (gerenciador)
           // para chamar o método adicionar;
           gerenciado.adicionar(h1);
       }

}