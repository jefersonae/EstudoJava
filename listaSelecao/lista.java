package listaSelecao;
import java.util.Scanner;

public class lista{
   public static void main(String[] args){
      Scanner ler = new Scanner(System.in);
/* 
      //Questão 1
      System.out.println("Informe um número inteiro para verificar se é maior que 10");
      int num = ler.nextInt();
      if (num > 10) {
         System.out.println("O número "+num+"é maior que 10!");
      }
      //Questão 2
      System.out.println("Digite dois números inteiros para verificar se são iguais:");
      int num1 = ler.nextInt();
      int num2 = ler.nextInt();
      if(num1 == num2){
         System.out.println("Os números informados são identicos");
      }
      //Questão 3
      System.out.println("Digite um número inteiro: ");
      int num = ler.nextInt();
      if(num % 2 == 0){
         System.out.println("O número "+num+" é par");
      }else{
         System.out.println("O número "+num+" é ímpar");
      }

      //Questão 4
      System.out.println("Informe o numerador da divisão: ");
      int num = ler.nextInt();
      System.out.println("Digite o denominador da divisão: ");
      int num2 = ler.nextInt();
      if(num % num2 == 0){
         System.out.println("O número "+num+" é divisivel por "+num2);
      }else{
         System.out.println("O número "+num+" não é divisivel por "+num2);
      }

      //Questão 6
      System.out.println("Digite os dois números inteiros p/ coloca-los em ordem crescente: ");
      int num = ler.nextInt();
      int num2 = ler.nextInt();
      if(num > num2){
         int f = num2;
         num2 = num;
         num = f;
      }
      System.out.println("Os números em ordem crescente são: "+num+" e "+num2);

      //Questão 8
      System.out.println("Digite os coeficientes da equação de segundo grau em ordem: a, b e c");
      float a = ler.nextFloat();
      float b = ler.nextFloat();
      float c = ler.nextFloat();

      double delta = b*b - (4*a*c);
      if(delta > 0){
         double x1 = -b + Math.sqrt(delta)/(2*a);
         double x2 = -b - Math.sqrt(delta)/(2*a);
         System.out.println("X1 = "+x1+" e X2 ="+x2);
      }else if(delta == 0){
         double x1 = -b + Math.sqrt(delta)/(2*a);
         System.out.println("Possuem as mesmas raízes: "+x1);
      }else{
         System.out.println("Não possuem raízes reais");
      }

      //Questão 9
      System.out.println("Informe os valores dos três lados de um triângulo:");
      double num = ler.nextDouble();
      double num2 = ler.nextDouble();
      double num3 = ler.nextDouble();

      if((num2 + num3 < num) && (num +num3 < num2) &&(num+num2 < num3)){
         System.out.println("Os números informados formam um triângulo!");
      }else{
         System.out.println("Os números informados não formam um triângulo!");
      }

      // Questão 10
      System.out.println("Informe os valores dos três lados de um triângulo:");
      double num = ler.nextDouble();
      double num2 = ler.nextDouble();
      double num3 = ler.nextDouble();

      if((num == num2) && (num2 == num3)){
         System.out.println("O Triângulo é do tipo Equilátero");
      }else if((num != num2) && (num2 != num3) && (num != num3)){
         System.out.println("O Triângulo é do tipo Escaleno");
      }else{
         System.out.println("O Triângulo é do tipo Isósceles ");
      }

      //Questão 11
      System.out.println("Digite os dois números positivos p/ coloca-los em ordem crescente: ");
      double num = ler.nextDouble();
      double num2 = ler.nextDouble();
      if(num > num2){
         double f = num2;
         num2 = num;
         num = f;
      }
      System.out.println("Os números em ordem crescente são: "+num+" e "+num2);

      //Questão 12
      System.out.println("Digite o nome do Aluno: ");
      String aluno = ler.nextLine();
      System.out.println("Digite as três notas de "+aluno+":");
      float nota1 = ler.nextFloat();
      float nota2 = ler.nextFloat();
      float nota3 = ler.nextFloat();
      System.out.println("Digite o número de faltas do aluno "+aluno+":");
      byte faltas = ler.nextByte();

      float media = (nota1+nota2+nota3)/3;

      if(faltas <= 27){
         if(media >= 5){
            System.out.println("O aluno "+aluno+" foi aprovado!");
         }else{
            System.out.println("O aluno "+aluno+" foi reprovado!");
         }
      }else{
         System.out.println("O aluno "+aluno+" foi reprovado!");
      }

      //Questão 13
      System.out.println("Informe o salário para atualiza-lo: ");
      float salario = ler.nextFloat();
      float porcentagem;

      if(salario <= 500){
         porcentagem = 50;
      }else if(salario <= 1000){
         porcentagem = 40;
      }else if (salario <= 2000){
         porcentagem = 30;
      }else if (salario <= 2500){
         porcentagem = 20;
      }else{
         porcentagem = 10;
      }
      float novoSal = (salario * porcentagem) / 100 + salario;
      System.out.println("O novo salário será de: "+novoSal);

      // Calculadora
      System.out.println("Qual a operação que deseja fazer?");
      System.out.println("* Multiplicação");
      System.out.println("- Subtração ");
      System.out.println("+ Soma");
      System.out.println("/ Divisão");
      char operacao = ler.next().charAt(0);
      System.out.println("Digite os dois números");
      double num1 = ler.nextDouble();
      double num2 = ler.nextDouble();
      double resultado;

      switch (operacao) {
         case '+':
            resultado = num1 + num2;
            break;
         case '-':
            resultado = num1 - num2;
            break;
         case '*':
            resultado = num1 * num2;
            break;
         default:
            resultado = num1 / num2;
            break;
      }
      System.out.println("O resultado da operação é "+resultado);
*/
      //Verificar mês
      System.out.println("Digite o valor do mês para verificar qual o nome dele: ");
      byte mes = ler.nextByte();
      String nomeMes ;

      switch (mes) {
         case 1:
            nomeMes = "Janeiro";
            break;
         case 2:
            nomeMes = "Fevereiro";
            break;
         case 3:
            nomeMes = "Março";
            break;
         case 4:
            nomeMes = "Abril";
            break;
         case 5:
            nomeMes = "Maio";
            break;
         case 6:
            nomeMes = "Junho";
            break;
         case 7:
            nomeMes = "Julho";
            break;
         case 8:
            nomeMes = "Agosto";
            break;
         case 9:
            nomeMes = "Setembro";
            break;
         case 10:
            nomeMes = "Outubro";
            break;
         case 11:
            nomeMes = "Novembro";
            break;
         case 12:
            nomeMes = "Dezembro";
            break;
         default:
            nomeMes = "O valor informado "+mes+" não corresponde a nenhum mês do ano";
            break;
      }
      System.out.println(nomeMes);
   }
}