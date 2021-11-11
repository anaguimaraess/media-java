import java.util.Scanner;

public class Media {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo à calculadora de média para salários!");

        System.out.println("Digite o primeiro salário: ");
        double salario1 = sc.nextDouble();
        while (salario1 <=0){
            System.out.println("Não existe esse salário! Tente novamente:");
            salario1 = sc.nextDouble();
        }

        System.out.println("Digite o segundo salário: ");
        double salario2 = sc.nextDouble();
        while (salario2 <=0){
            System.out.println("Não existe esse salário! Tente novamente:");
            salario2 = sc.nextDouble();
        }

        System.out.println("Digite o terceiro salário: ");
        double salario3 = sc.nextDouble();
        while (salario3 <=0){
            System.out.println("Não existe esse salário! Tente novamente:");
            salario3 = sc.nextDouble();
        }

        System.out.println("Digite o quarto salário: ");
        double salario4 = sc.nextDouble();
        while (salario4 <=0){
            System.out.println("Não existe esse salário! Tente novamente:");
            salario4 = sc.nextDouble();
        }

        System.out.println("Digite o quinto salário: ");
        double salario5 = sc.nextDouble();
        while (salario5 <=0){
            System.out.println("Não existe esse salário! Tente novamente:");
            salario5 = sc.nextDouble();
        }

        double media = (salario1 + salario2 + salario3 + salario4 + salario5)/5;
        System.out.println("A media entre os salários digitados é igual a " + media);

    }
}

