package objects;

public class Camry50 extends Camry30{

    @Override
    public void drive() {
//        super.drive();
        System.out.println("Camry50 drive");
    }

    @Override
    public void stop(){
        super.stop();
        System.out.printf("Camry50 stop");
    }

    public void light(){

    }


}
