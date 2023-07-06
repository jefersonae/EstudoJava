import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] vetorA = new int[50];
        int[] vetorB = new int[50];
        double somaVetores = 0;
        byte tamanhoA = 0;
        byte tamanhoB = 0;
        int contador = 0;
        int maiorPrimo = 0;
        byte opcao;

        System.out.println("==================================");
        System.out.println("Menu Principal");
        System.out.println("==================================");
        System.out.println("1. Inserir dois Vetores");
        System.out.println("2. Listar Vetores");
        System.out.println("3. Interseção de Vetores");
        System.out.println("4. Maior Primo");
        System.out.println("5. Gerar Vetor Acima da Média");
        System.out.println("6- Sair");
        do{
            System.out.print("Digite a opção desejada: ");
            opcao = ler.nextByte();
        }while((opcao != 1) && (opcao != 6) );

        while (opcao != 6) {
            if(opcao == 1){
                System.out.println("=============VetorA=====================");
                do{
                    System.out.print("Informe o tamanho do vetor (obs.: máximo 50): ");
                    tamanhoA = ler.nextByte();
                }while ((tamanhoA > 50) || (tamanhoA < 1));

                for (int i = 0; i < tamanhoA ;i++){
                    boolean igual = false;
                    int numero = 0;
                    do {
                        System.out.print("Posição "+(i+1)+" : ");
                        numero = ler.nextInt();
                        for (int p = i; p >= 0; p--){
                            if(numero == vetorA[p]){
                                igual = true;
                                break;
                            } else if (p == 0) {
                                igual = false;
                            }
                        }
                    }while (igual);
                    vetorA[i] = numero;
                    somaVetores += vetorA[i];
                }
                System.out.println("========================================");
                System.out.println("===============VetorB===================");
                do{
                    System.out.print("Informe o tamanho do vetor (obs.: máximo 50): ");
                    tamanhoB = ler.nextByte();
                }while ((tamanhoB > 50) || (tamanhoB < 1));

                for (int i = 0; i < tamanhoB ;i++){
                    boolean igual = false;
                    int numero = 0;
                    do {
                        System.out.print("Posição "+(i+1)+" : ");
                        numero = ler.nextInt();
                        for (int p = i; p >= 0; p--){
                            if(numero == vetorB[p]){
                                igual = true;
                                break;
                            } else if (p == 0) {
                                igual = false;
                            }
                        }
                    }while (igual);
                    vetorB[i] = numero;
                    somaVetores += vetorB[i];
                }
                System.out.println("========================================");
            }else if (opcao == 2) {
                System.out.println("=============VetorA=====================");
                for (int i = 0; i < tamanhoA ;i++){
                    System.out.println("Posição "+(i+1)+" :"+vetorA[i]);
                }
                System.out.println("========================================");
                System.out.println("===============VetorB===================");
                for (int i = 0; i < tamanhoB ;i++){
                    System.out.println("Posição "+(i+1)+" : "+vetorB[i]);
                }
                System.out.println("========================================");
            } else if (opcao == 3) {
                int k = 0;
                for (int i = 0; i < tamanhoA; i++){
                    for (int j = 0; j < tamanhoB; j++){
                        if (vetorA[i] == vetorB[j]){
                            contador++;
                        }
                    }
                }
                int[] vetorInter = new int[contador];
                for (int i = 0; i < tamanhoA; i++){
                    for (int j = 0; j < tamanhoB; j++){
                        if (vetorA[i] == vetorB[j]){
                            vetorInter[k] = vetorA[i];
                            k++;
                        }
                    }
                }
                for (int i = 0; i < vetorInter.length; i++){
                    System.out.print(vetorInter[i]+" // ");
                }
            } else if (opcao == 4) {
                for (int i = 0; i < tamanhoA; i++){
                    contador = 0;
                    for (int j = 0; j < tamanhoB; j++){
                        if (vetorA[i] == vetorB[j]){
                            for (int p = vetorA[i]; p >= 1; p--){
                                if(vetorA[i] % p == 0){
                                    contador += 1;
                                }
                            }
                            if (contador == 2){
                                if (vetorA[i] > maiorPrimo){
                                    maiorPrimo = vetorA[i];
                                }
                            }
                        }
                    }
                }
                System.out.println("O maior número primo encontrado foi "+maiorPrimo);
            }else{
                contador = 0;
                int[] acimaMedia = new int[50];
                double media = somaVetores / (tamanhoA + tamanhoB);
                for (int i = 0; i < tamanhoA; i++){
                    if (vetorA[i] >= media){
                        acimaMedia[contador] = vetorA[i];
                        contador++;
                    }
                }
                for (int i = 0; i < tamanhoB; i++){
                    if (vetorB[i] >= media){
                        acimaMedia[contador] = vetorB[i];
                        contador++;
                    }
                }
                for (int i = 0; i < acimaMedia.length; i++){
                    System.out.print(acimaMedia[i]+" // ");
                }
            }

            System.out.println("==================================");
            System.out.println("Menu Principal");
            System.out.println("==================================");
            System.out.println("1. Inserir dois Vetores");
            System.out.println("2. Listar Vetores");
            System.out.println("3. Interseção de Vetores");
            System.out.println("4. Maior Primo");
            System.out.println("5. Gerar Vetor Acima da Média");
            System.out.println("6- Sair");

            System.out.print("Digite a opção desejada: ");
            opcao = ler.nextByte();
        }
    }
}