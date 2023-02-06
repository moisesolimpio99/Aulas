package aulas;

public class aula8 {

    public static void main(String[] args) {

        double nota1 = 7.9;
        double nota2 = 4.8;
        double media = (nota1 + nota2) / 2;
        int faltas = 4;

        if (media > 5.5) {
            if (faltas < 3) {
                System.out.println("Voce esta aprovado");
            } else {
                System.out.println("Voce reprovou por falta");
            }
        } else {
            System.out.println("Voce reprovou por nota");
        }
    }

}
