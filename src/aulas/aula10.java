package aulas;



public class aula10 {
    public static void main(String[] args) {
        
        double nota1 = 7.0;
        double nota2 = 3.0;
        double media = (nota1 + nota2) / 2;
        int participacao = 2;
        
        if (media > 5.5 || participacao > 1) {
            System.out.println("Esta aprovado");
        } else {
            System.out.println("Esta reprovado");
        } 
    }
}
