
package aulas;

import java.util.Scanner;


public class aula4 {
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salario");
        double salario = scanner.nextDouble();
        double descontoInss = salario * 0.08;
        double descontoFgts = salario * 0.09;
        
        double salarioLiquido = salario - (descontoInss + descontoFgts);
        
        System.out.println("o salario liquido e " + salarioLiquido);
    }
}
