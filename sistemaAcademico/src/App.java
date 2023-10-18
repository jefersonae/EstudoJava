import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Menu menu = new Menu();
        System.out.println(menu.getMenu());
        Scanner ler = new Scanner(System.in);
        int opcao = 14;
        opcao = ler.nextInt();
        while(opcao != 0){
            switch (opcao){
                case 1:
                    System.out.println("opcao 1");
                    break;
                case 2:
                    System.out.println("opcao 2");
                    break;
                case 3:
                    System.out.println("opcao 3");
                    break;
                case 4:
                    System.out.println("opcao 4");
                    break;
                case 5:
                    System.out.println("opcao 5");
                    break;
                case 6:
                    System.out.println("opcao 6");
                    break;
                case 7:
                    System.out.println("opcao 7");
                    break;
                case 8:
                    System.out.println("opcao 8");
                    break;
                case 9:
                    System.out.println("opcao 9");
                    break;
                case 10:
                    System.out.println("opcao 10");
            }
        }
    }
}