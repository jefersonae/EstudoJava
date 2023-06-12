// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner ler = new Scanner(System.in);
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