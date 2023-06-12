// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
                /*
                //Questão 6
                int num;
                do{
                    System.out.println("Digite o valor do mês para verificar qual o nome dele: ");
                    num = ler.nextInt();
                }while(num != 0);

                //Questão 7
                float sal;
                do{
                    System.out.print("Informe o salário do funcionário: R$");
                    sal = ler.nextFloat();
                }while(sal != 0);

                //Questão 8
                String nome = "a";
                char sexo;
                float p1,p2,p3,media;
                byte faltas;

                byte alunoM = 0;
                byte alunoF = 0;
                byte reprovadoM = 0;
                byte reprovadoF = 0;
                float mediaF = 0;
                float mediaM = 0;
                System.out.println("Qual é o nome do aluno? (digite fim p/sair)");
                nome= ler.next();
                while (!nome.equals("fim")){
                    System.out.print("Qual o sexo de "+nome+" (M - p/ Masculino e F - p/ Feminino): ");
                    sexo = ler.next().charAt(0);
                    System.out.print("Qual a primeira nota de "+nome+": ");
                    p1 = ler.nextFloat();
                    System.out.print("Qual a segunda nota de "+nome+": ");
                    p2 = ler.nextFloat();
                    System.out.print("Qual a terceira nota de "+nome+": ");
                    p3 = ler.nextFloat();
                    System.out.print("Quantas faltas o aluno "+nome+" tem: ");
                    faltas = ler.nextByte();
                    media = (p1+p2+p3)/3;
                    if(media >= 6 && faltas < 16){
                        System.out.println("O aluno "+nome+" ficou com a média "+media+" está aprovado!");
                    }else{
                        System.out.println("O aluno "+nome+" ficou com a média "+media+" está reprovado!");
                        if (sexo == 'M'){
                             reprovadoM += 1;
                        }else{
                            reprovadoF += 1;
                        }
                    }
                    if (sexo == 'M'){
                        mediaM += media;
                        alunoM += 1;
                    }else{
                        mediaF += media;
                        alunoF += 1;
                    }
                    System.out.println("Qual é o nome do aluno? (digite fim p/sair)");
                    nome= ler.next();
                };
                System.out.println("A média das notas dos Homens da turma foi de : "+mediaM/alunoM);
                System.out.println("A média das notas das Mulheres da turma foi de: "+mediaF/alunoF);
                System.out.println("O percentual de Homens reprovados foi de : "+(reprovadoM*100)/(alunoF+alunoM));
                System.out.println("O percentual de Mulheres reprovados foi de : "+(reprovadoF*100)/(alunoF+alunoM));
                System.out.println("O percentual de reprovados foi de : "+((reprovadoM+reprovadoF)*100)/(alunoF+alunoM));

                //Questão 9
                int proximo;
                int primeiro = 0; // primeiro termo
                int segundo = 1; // segundo termo

                System.out.print(primeiro + " , " + segundo); // imprime os dois primeiros termos
                int n = 5000;

                for(int i = 2; i < n; i++){
                    proximo = primeiro + segundo;
                    System.out.print(" , "+proximo);
                    primeiro = segundo;
                    segundo = proximo;
                }

                //Questão 10
                int soma = 1;
                System.out.print("Digite algum número positivo: ");
                int fatorial = ler.nextInt();
                for (int i = 1; i <= fatorial ;i++){
                    soma = soma*i;
                }
                System.out.println("O fatorial de "+fatorial+"! é "+soma);
                */
                //Questão 11
                float soma = 0;
                System.out.println("Digite o valor de H que será usado na sequência 1/1 , 1/2 ,1/3 , 1/h");
                int h = ler.nextInt();
                for (int i = 1; i<=h ; i++){
                    soma += ((float) 1 / i);
                }
                System.out.print("A soma da sequência é : "+soma);
    }
}