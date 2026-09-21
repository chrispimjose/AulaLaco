import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Aula sobre Repetições - Laços em Java
        int acumular=0;
        int i=0;

        System.out.println ("\n" );

        int opcao;
        boolean condicao=true;
        Scanner scanner = new Scanner(System.in);

        //Definir um Menu
        do {
            //Definição do Menu
            //Limpar a tela do terminal
            System.out.print("\033[H\033[2J");
            System.out.println("\n=== Menu de Controle ===");
            System.out.println("1. Contar de 1 a 100");
            System.out.println("2. Contar números pares");
            System.out.println("3. While contanto com acumulador");
            System.out.println("4. Sair do sistema");
    
            //Recebimento da seleção
            opcao = scanner.nextInt();
            scanner.nextLine();
            //Condição de escolha

            switch (opcao) {                
                case 1:
                    //Opção 1 Contar de 1 a 100
                    System.out.println("Foi escolhido a Opção 1");
                    //Contando de 1 a 100
                    for (i=1; i<=100; i++){
                        System.out.println (i);
            
                    }
                    System.out.println("Valor final de i");
                    System.out.println(i);

                    scanner.nextLine();
                    i=0;
                    break;
                case 2:
                    //Opção 2 Contar os pares
                    System.out.println("Foi escolhido a Opção 2");
                    //Contando os pares
                    for (i=0; i<=100; i+=2){
                        System.out.println (i);            
                    }
                    scanner.nextLine();
                    i=0;
                    break;
                case 3:
                    //Opção 3 While contanto com acumulado
                    System.out.println("Foi escolhido a Opção 3");
                    while (i<=5) {
                        System.out.println (i + " - " + i*3 );
                        acumular = acumular + i*3;
                        //Cuidado....
                        i++;
                    }
                    //Resuyltado da contagem
                    System.out.println("Valor final de i");
                    System.out.println(i);
                    //Resultado do acumulador
                    System.out.println("Valor acumulado será");
                    System.out.println(acumular);
                    i=0;
                    acumular=0;

                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("Você escolheu sair do sistema");
                    condicao=false;    
                    break;
                
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    scanner.nextLine();
                    break;

            }

        } while (condicao);
        System.out.println("Finalizando o programa");
        System.out.println ("\n" );
        scanner.close();
    }
}
