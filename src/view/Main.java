package view;

import model.ArCondicionado;
import model.ControleRemotoSimples;
import model.Luz;
import model.Som;

public class Main {

    public static void main(String[] args) {

        Luz luz = new Luz();
        Som som = new Som();
        ArCondicionado ar = new ArCondicionado();

        ControleRemotoSimples controle =
                new ControleRemotoSimples(luz, som, ar);

        controle.modoCinema();
    }
}
