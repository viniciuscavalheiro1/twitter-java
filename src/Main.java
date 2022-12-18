import Data.BancoDadosVirtual;
import Service.Service;
import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner scanner = new Scanner(System.in);
        BancoDadosVirtual banco = new BancoDadosVirtual();
        Service service = new Service();
        String login, senha;
        int teclado = -123;
        do{
            service.LimpaTela();
            service.Login();
            teclado = scanner.nextInt();
            switch (teclado) {
                case 1:
                    service.LimpaTela();
                    service.Entrar();
                    System.out.print("Login: ");
                    clearBuffer(scanner);
                    login = scanner.nextLine();
                    System.out.print("Senha: ");
                    clearBuffer(scanner);
                    senha = scanner.nextLine();
                    service.LimpaTela();
                    break;
                case 2:
                    service.LimpaTela();
                    service.CriarConta();
                    System.out.print("Login: ");
                    login = scanner.nextLine();
                    System.out.print("Senha: ");
                    senha = scanner.nextLine();
                    service.LimpaTela();
                    break;
                case 3:
                    System.out.println("Tio Musk diz: BYE BYE!!");
                    teclado = 4;
                    break;
                default:
                    System.out.println("Comando inválido.");
                    service.Login();
                    break;
            }

        }while(teclado != 4);
    }

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}