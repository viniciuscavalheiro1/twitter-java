package Service;

import Data.BancoDadosVirtual;
import Entities.Usuario;

public class Service {

    public void menu() {
        System.out.println("+-----------------------------------------+");
        System.out.println("+                 MENU                    +");
        System.out.println("+        1 - Publicar Twitter             +");
        System.out.println("+        2 - TimeLine                     +");
        System.out.println("+        3 - Meus Twitter                 +");
        System.out.println("+        4 - Logout                       +");
        System.out.println("+-----------------------------------------+");
        System.out.print("Digite uma opção: ");
    }

    public void Login() {
        System.out.println("+-----------------------------------------+");
        System.out.println("+                Login                    +");
        System.out.println("+        1 - Login                        +");
        System.out.println("+        2 - Criar Conta                  +");
        System.out.println("+        3 - Sair                         +");
        System.out.println("+-----------------------------------------+");
        System.out.print("Digite uma opção: ");
    }

    public void Entrar() {
        System.out.println("+-----------------------------------------+");
        System.out.println("+                Entrar                   +");
        System.out.println("+      Informe seu login e senha          +");
        System.out.println("+-----------------------------------------+");
    }

    public void CriarConta() {
        System.out.println("+-----------------------------------------+");
        System.out.println("+              Criar conta                +");
        System.out.println("+-----------------------------------------+");
    }

    public void LimpaTela()
    {
        for(int i = 0; i < 25; i++)
            System.out.println("");
    }

    public int buscarUser(String email, String senha, BancoDadosVirtual bancoDadosVirtual) {
        int cont = 0;
        int id = -1;
        for (Usuario usuario: bancoDadosVirtual.usuarios) {
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
                id = cont;
                return id;
            }
            cont++;
        }
        return id;
    }
}
