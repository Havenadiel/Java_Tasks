interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
public class Gorilla implements Animal {

   @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            System.out.println("Gorilla is Hungry.");
            return true;  
        } else {
            System.out.println("Gorilla is not hungry.");
            return false;  
        }
    }
    // lather, rinse, repeat
    @Override
    public void groom() {
        System.out.println("Lather, rinse, repeat");
    }
    // pet at your own risk
    @Override
    public void pet() {
        System.out.println("Pet at your own risk");
    }
    // put gorilla food into cage
    public void feedInCage() {
        System.out.println("Put gorilla food into cage");
    }
}
