package model;

public class ControleRemotoSimples {

    private Luz luz;
    private Som som;
    private ArCondicionado ar;

    public ControleRemotoSimples(Luz luz, Som som, ArCondicionado ar) {
        this.luz = luz;
        this.som = som;
        this.ar = ar;
    }

    // MACRO RÍGIDO
    public void modoCinema() {
        System.out.println("--- Iniciando Modo Cinema ---");
        luz.desligar();
        som.ligar();
        ar.ligar();
    }
}
