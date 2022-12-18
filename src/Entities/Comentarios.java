package Entities;

import java.rmi.server.UID;
import java.util.Objects;

public class Comentarios {
    private UID Id;
    private UID IdUser;
    private String nomeUser;
    private String comentario;
    private int Like;
    private int Deslike;

    public Comentarios(UID idUser, String nomeUser, String comentario) {
        Id = new UID();
        IdUser = idUser;
        this.nomeUser = nomeUser;
        this.comentario = comentario;
        Like = 0;
        Deslike = 0;
    }

    public UID getId() {
        return Id;
    }

    public void setId(UID id) {
        Id = id;
    }

    public UID getIdUser() {
        return IdUser;
    }

    public void setIdUser(UID idUser) {
        IdUser = idUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getLike() {
        return Like;
    }

    public void setLike(int like) {
        Like = like;
    }

    public int getDeslike() {
        return Deslike;
    }

    public void setDeslike(int deslike) {
        Deslike = deslike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comentarios that = (Comentarios) o;
        return Like == that.Like && Deslike == that.Deslike && Objects.equals(Id, that.Id) && Objects.equals(IdUser, that.IdUser) && Objects.equals(nomeUser, that.nomeUser) && Objects.equals(comentario, that.comentario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, IdUser, nomeUser, comentario, Like, Deslike);
    }

    @Override
    public String toString() {
        return "Comentarios{" +
                "Id=" + Id +
                ", IdUser=" + IdUser +
                ", nomeUser='" + nomeUser + '\'' +
                ", comentario='" + comentario + '\'' +
                ", Like=" + Like +
                ", Deslike=" + Deslike +
                '}';
    }
}
