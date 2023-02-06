
package aulas;


public class aula9 {
    
    public static void main(String[] args) {
        
        double nota1 = 7.0;
        double nota2 = 3.0;
        double media = (nota1 + nota2) / 2;
        int faltas = 4;
        
        if (media > 4.5 && faltas < 3) {
            System.out.println("Voce esta aprovado");
        } else {
            System.out.println("Voce reprovado");
        }
        
    }

}
