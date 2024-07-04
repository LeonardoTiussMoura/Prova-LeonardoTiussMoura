import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int feminino = 1;
      int masculino = 2;
    System.out.println("Digite seu nome:");
      String nome = sc.next();
      System.out.println("");
      System.out.println("Digite seu sobrenome:");
      String sobrenome = sc.next();
      System.out.println("");
      System.out.println("Digite sua idade:");
      int idade = sc.nextInt();
      System.out.println("");
      System.out.println("Digite sua altura:");
      double altura = sc.nextDouble();
      System.out.println("");
      System.out.println("Digite seu sexo (1-Feminino, 2-Masculino.)");
      int sexo = sc.nextInt();
      System.out.println("");
      double pesofemi = (62.1*altura);
      double pesomasc = (72.7*altura);
      System.out.println("Olá " + nome + " " + sobrenome + ", fizemos uma breve análise das informações passadas e temos as seguintes informações a repassar:");
      if (sexo == 1) {
        System.out.printf("O seu peso ideal é: %f", pesofemi);
      }
    sc.close();
  }
}