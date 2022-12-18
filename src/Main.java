import Data.BancoDadosVirtual;
import Entities.Twitter;
import Entities.Usuario;
import Service.Service;
import java.io.IOException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner scanner = new Scanner(System.in);
        BancoDadosVirtual banco = new BancoDadosVirtual();
        Service service = new Service();
        String login, senha, nomeUsuario;
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
                    int posicao = service.buscarUser(login, senha, banco);
                    service.LimpaTela();
                    if(posicao == -1){
                        System.out.println("Usuário não cadastrado!");
                    } else {

                        service.menu();
                        int op = scanner.nextInt();
                        switch (op)
                        {
                            case 1:
                                System.out.println("Digite o que você está pensando: ");
                                String twitter = scanner.nextLine();
                                Twitter twitter1 = new Twitter(banco.usuarios.get(op).getId(), banco.usuarios.get(op).getNome(), twitter);
                                banco.usuarios.get(op).setTwitterList(twitter1);
                                banco.twitters.add(twitter1);
                                System.out.println("Twitter cadastrado.");
                                break;
                            case 2:
                                service.LimpaTela();
                                System.out.println("Timeline.");
                                System.out.println(banco.twitters);
                                break;
                            case 3:
                                service.LimpaTela();
                                System.out.println("Meus Twitters.");
                                System.out.println(banco.usuarios.get(op).getTwitterList());
                                break;
                        }
                    }

                    break;
                case 2:
                    service.LimpaTela();
                    service.CriarConta();
                    System.out.print("Nome usuário: ");
                    clearBuffer(scanner);
                    nomeUsuario = scanner.nextLine();
                    System.out.print("Login: ");
                    login = scanner.nextLine();
                    System.out.print("Senha: ");
                    senha = scanner.nextLine();
                    Usuario novoUsuario = new Usuario(nomeUsuario, login, senha);
                    banco.usuarios.add(novoUsuario);
                    System.out.println("Usuário cadastrado com sucesso!");

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