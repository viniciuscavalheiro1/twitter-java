package Entities;

import java.rmi.server.UID;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private UID Id;
    private String nome;
    private String email;
    private String senha;

    private List<Twitter> twitterList = new ArrayList<>();

    public Usuario(String nome, String email, String senha) {
        Id = new UID();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public List<Twitter> getTwitterList() {
        return twitterList;
    }

    public void setTwitterList(Twitter twitterList) {
        this.twitterList.add(twitterList);
    }

    public UID getId() {
        return Id;
    }

    public void setId(UID id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(Id, usuario.Id) && Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email) && Objects.equals(senha, usuario.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, nome, email, senha);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
