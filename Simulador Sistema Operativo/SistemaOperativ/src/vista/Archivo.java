package vista;

import java.util.LinkedList;

public class Archivo {
    private String identificador;
    private LinkedList<String> mislineas;

    public Archivo(String identificador) {
        this.mislineas = new LinkedList<>();
        this.identificador = identificador;
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the mislineas
     */
    public LinkedList<String> getMislineas() {
        return mislineas;
    }

    /**
     * @param mislineas the mislineas to set
     */
    public void setMislineas(LinkedList<String> mislineas) {
        this.mislineas = mislineas;
    }
    
}
