import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op;
        double num1, num2;

        do {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Somar dois números");
            System.out.println("2. Subtrair dois números");
            System.out.println("3. Multiplicar dois números");
            System.out.println("4. Dividir dois números");
            System.out.println("5. Raiz quadrada de um número");
            System.out.println("6. Sair");
            System.out.print("Digite a opção desejada: ");
            
            op = scan.nextInt();

            switch(op) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println("Resultado da soma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println("Resultado da subtração: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    System.out.println("Resultado da multiplicação: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    num1 = scan.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scan.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Resultado da divisão: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Não é possível dividir por zero.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o número: ");
                    num1 = scan.nextDouble();
                    if (num1 >= 0) {
                        System.out.println("Resultado da raiz quadrada: " + Math.sqrt(num1)); 
                    } else {
                        System.out.println("Erro: Não existe raiz quadrada real de número negativo.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (op != 6); // Agora o loop continua enquanto a opção for diferente de 6
        
        scan.close();
    }
}