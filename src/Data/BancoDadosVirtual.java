package Data;

import Entities.Twitter;
import Entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BancoDadosVirtual {
    public List<Usuario> usuarios = new ArrayList<>();
    public List<Twitter> twitters = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Twitter> getTwitters() {
        return twitters;
    }

    public void setTwitters(List<Twitter> twitters) {
        this.twitters = twitters;
    }
}
