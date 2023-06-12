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
                */
                //Questão 8
                String nome = "a";
                char sexo;
                float p1,p2,p3,media;
                byte faltas;

                byte alunoH = 0;
                byte alunoM = 0;
                byte reprovadoH = 0;
                byte reprovadoM = 0;
                float mediaH = 0;
                float mediaM = 0;
                while (!nome.equals("fim")){
                    System.out.println("Qual é o nome do aluno?");
                    nome= ler.next();
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
                        System.out.println("O aluno "+nome+"ficou com a média "+media+" está reprovado!");
                        if (sexo == 'M'){
                             reprovadoM += 1;
                        }else{
                            reprovadoH += 1;
                        }
                    }
                    if (sexo == 'M'){
                        mediaM += media;
                        alunoM += 1;
                    }else{
                        mediaH += media;
                        alunoH += 1;
                    }
                };
        System.out.println("A média das notas dos Homens da turma foi de : "+mediaH/alunoH);
        System.out.println("A média das notas das Mulheres da turma foi de: "+mediaM/alunoM);
        System.out.println("O percentual de Homens reprovados foi de : "+((alunoM+alunoH)/reprovadoH));
        System.out.println("O percentual de Homens reprovados foi de : "+((alunoM+alunoH)/reprovadoM));
        System.out.println("O percentual de reprovados foi de : "+((alunoM+alunoH)/(reprovadoM+reprovadoH)));
        }
    }