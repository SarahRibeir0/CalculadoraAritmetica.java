import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner dados = new Scanner(System.in);
    int opcao, mult, div, soma, sub, n1=0, n2=0; 

    do{
    System.out.println("Calculadora Aritmética\n");

    System.out.println("1 - Multiplicação de inteiros");
    System.out.println("2 - Divisão de inteiros");
    System.out.println("3 - Adição de inteiros");
    System.out.println("4 - Subtração de inteiros");
    System.out.println("5 - Sair do Programa");

    System.out.println("\n Escolha de acordo com os números acima:");

    opcao=dados.nextInt();

    switch (opcao) {
     case 1:
       System.out.println("Você escolheu Multiplicação.\n Entre com dois números inteiros para efetuar a operação:");
      n1=dados.nextInt();
      n2=dados.nextInt();
      System.out.println("Resultado: "+(mult=(n1*n2)));
       break;

     case 2:
        System.out.println("Você escolheu Divisão.\nEntre com dois números inteiros para efetuar a operação:");
        n1=dados.nextInt();
        n2=dados.nextInt();
        if (n2 != 0)
        {div = (n1 / n2);
        System.out.println("Resultado: "+div);}
        else
          {System.out.println("ERROR, não pode ser divido por 0");
        }
      break;

     case 3:
       System.out.println("Você escolheu Adição\nEntre com dois números inteiros para efetuar a operação:");
       n1=dados.nextInt();
       n2=dados.nextInt();
       System.out.println("Resultado: "+(soma=(n1+n2)));
       break;
     
     case 4:
       System.out.println("Você escolheu Subtração\nEntre com dois números inteiros para efetuar a operação:");
       n1=dados.nextInt();
       n2=dados.nextInt();
       System.out.println("Resultado: "+(sub=(n1-n2)));
       break;
     default:
       System.out.println("Você saiu!");
    }
    }while(opcao!=5);
  }
}