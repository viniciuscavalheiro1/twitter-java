package Entities;

import java.rmi.server.UID;
import java.util.List;
import java.util.Objects;

public class Twitter {
    private UID Id;
    private UID IdUser;
    private String nomeUser;
    private String comentario;
    private int Like;
    private int Deslike;
    private List<Comentarios> Comentarios;

    public Twitter(UID idUser, String nomeUser, String comentario) {
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

    public List<Entities.Comentarios> getComentarios() {
        return Comentarios;
    }

    public void setComentarios(List<Entities.Comentarios> comentarios) {
        Comentarios = comentarios;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Twitter twitter = (Twitter) o;
        return Like == twitter.Like && Deslike == twitter.Deslike && Objects.equals(Id, twitter.Id) && Objects.equals(IdUser, twitter.IdUser) && Objects.equals(nomeUser, twitter.nomeUser) && Objects.equals(Comentarios, twitter.Comentarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, IdUser, nomeUser, Like, Deslike, Comentarios);
    }

    @Override
    public String toString() {
        return "Twitter{" +
                "Id=" + Id +
                ", IdUser=" + IdUser +
                ", nomeUser='" + nomeUser + '\'' +
                ", Like=" + Like +
                ", Deslike=" + Deslike +
                ", Comentarios=" + Comentarios +
                '}';
    }
}
