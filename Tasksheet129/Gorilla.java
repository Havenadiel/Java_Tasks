interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

public class Gorilla implements Animal {

    //public static void main (String [] args);
    private boolean isHungry;

    public Gorilla() {
        this.isHungry = true;
    }
    // put gorilla food into cage
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat && isHungry) {
            System.out.println("The gorilla is being fed.");
            isHungry = false; 
            return true;
        } else if (!timeToEat) {
            System.out.println("The gorilla is not in the mood to eat right now.");
            return false;
        } else {
            System.out.println("The gorilla is not hungry.");
            return false;
        }
    }
    // lather, rinse, repeat
    @Override
    public void groom() {
        System.out.println("The gorilla is being groomed.");
    }
    // pet at your own risk
    @Override
    public void pet() {
        System.out.println("You pet the gorilla. It seems to enjoy the attention.");
    }

    public boolean isHungry() {
        return isHungry;
    }
}
