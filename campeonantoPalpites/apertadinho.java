import java.util.Scanner;
import java.util.Random;
/*
*  Criar um sistema de palpites
*/
public class apertadinho {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Bem vindo ao campeonato de Chutes");
        System.out.println("------------------------------------------------------");
        System.out.println("Regras: será sorteado um número para cada jogador");
        System.out.println("onde deverá entrar com os valores dentro de 0 e 100");
        byte chutesP1 = 0;
        byte chutesP2 = 0;

        for(int i = 1; i <=2;i++){
            byte menor = 0;
            byte maior = 100;
            Random gerador = new Random();
            int numSorteado = gerador.nextInt(101);

            boolean acertou = false;
            while(!acertou){
                System.out.println("Jogador "+i+": Chute um número > "+menor+" < "+maior);
                System.out.print("Jogador "+i+": Entre com o palpite: ");
                byte palpite = ler.nextByte();
                if(palpite == numSorteado){
                    acertou = true;
                    System.out.println("Jogador "+i+": Você acertou o número!");
                }else{
                    if(i==1){
                        chutesP1 += 1;
                    }else{
                        chutesP2 += 1;
                    }
                    if(maior < palpite){
                        maior = palpite;
                    }else{
                        menor = palpite;
                    }
                }
            }
        }
        if(chutesP1 > chutesP2){
            System.out.println("O jogador 1 venceu a partida!");
        }else if(chutesP1 < chutesP2){
            System.out.println("O jogador 2 venceu a partida!");
        }else{
            System.out.println("A partida deu empate!");
        }
    }
}