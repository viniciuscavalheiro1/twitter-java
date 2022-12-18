package Data;

import Entities.Twitter;
import Entities.Usuario;

import java.util.List;

public class BancoDadosVirtual {
    private List<Usuario> usuarios;
    private List<Twitter> twitters;

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
