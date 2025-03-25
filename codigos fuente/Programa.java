package vista;

import java.util.LinkedList;

public class Programa {
    private LinkedList<Archivo> misArchivos;
    public Programa() {
        this.misArchivos = new LinkedList<>();
    }

    /**
     * @return the misArchivos
     */
    public LinkedList<Archivo> getMisArchivos() {
        return misArchivos;
    }

    /**
     * @param misArchivos the misArchivos to set
     */
    public void setMisArchivos(LinkedList<Archivo> misArchivos) {
        this.misArchivos = misArchivos;
    }
     
    
}
