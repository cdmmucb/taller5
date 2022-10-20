import java.util.Random;

public class Person {
    int pisoInicial = randomNumber();
    int pisoFinal = inicializarPisoFinal();



    private int randomNumber() {
        return (int) ((Math.random() * 3) + 1);
    }

    private int inicializarPisoFinal() {
        do{
            pisoFinal=randomNumber();
        }while(pisoFinal == pisoInicial);
        return pisoFinal;
    }
}

