
package aulas;

import java.util.Scanner;




public class aula5 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("media " + media);
    }
}
