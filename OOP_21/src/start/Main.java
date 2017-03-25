package start;

import objects.Camry30;
import objects.Camry50;

public class Main {

    public static void main(String[] args) {
        Camry50 camry50 = new Camry50();
        camry50.drive();
        camry50.stop();
        System.out.printf("i =  " + camry50.getI());

    }

}
