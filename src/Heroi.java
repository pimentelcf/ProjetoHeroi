  import java.util.Scanner;

  public class Heroi {
   String nome;
   double poder;
   int xp;
   public boolean ehVilao; // Se for 'true', é vilão. Se 'false', é herói.


   // metodo para o heroi ou vilao se apresentar

   public String obterGritoDeGuerra() {
    if (this.ehVilao) {
     return "MUAHAHA! Eu sou o vilão mais terrivel de todos os tempos " ;
    } else {
     return "Olá! Eu sou o herói e irei te salvar! " ;
      }
    }
  }