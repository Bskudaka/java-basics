public class TesteIR {

    public static void main(String[] args){

        double salario = 4000.0;

        if (salario >= 1900.0 && salario <= 2800.0){
              System.out.println("Aliquota de 7.5 %");
              System.out.println("Deduzir na declaração o valor de R$ 142");
        } else if (salario >= 2800.1 && salario <= 3751.0){
            System.out.println("Aliquota de 15 %");
            System.out.println("Deduzir na declaração o valor de R$ 350");
        } else if(salario >= 3751.0 && salario <= 4664.0){
              System.out.println("Aliquota de 22.5 %");
              System.out.println("Deduzir na declaração o valor de R$ 636");
            }




    }
}
