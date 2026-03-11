
    import java.util.Scanner;
    
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double impostoRenda=0;
     double inss=0;
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double qtdHoras = entrada.nextDouble();
         
        System.out.println("Digite o salario por horaa: ");
        double salarioHora = entrada.nextDouble();
   
      System.out.println("Digite o número de dependentes: ");
        int nmrDependentes = entrada.nextInt();

        double salarioBruto =   qtdHoras * salarioHora +(50*nmrDependentes);
         if (salarioBruto<=1000){
              inss = salarioBruto*(8.5/100);
         }else{
             inss = salarioBruto *(9/100);
         }
        if (salarioBruto<=500){
            impostoRenda = 0;
        }
        if (salarioBruto>500 && salarioBruto<=1000){
            impostoRenda = salarioBruto*(5/100);
        }
        if (salarioBruto>1000){
            impostoRenda = salarioBruto*(7/100);
        }
        double salarioLiquido = salarioBruto - inss - impostoRenda;
    System.out.println("O salário líquido é: "+ salarioLiquido);
    entrada.close();
}


