// Import statements from java.util package
import java.util.ArrayList;
import java.util.List;

// Class definition
public class Garden {

    // Instance variables
    private List<GreenStuff> veggieList;
    private int capacity;

    // Constructor with 1 parameter
    public Garden(int capacity) {
        if(capacity < 0) {
            // Throwing unchecked exception 
            throw new IllegalArgumentException("Give a proper capacity!");
        }
        this.capacity = capacity;
        veggieList = new ArrayList<GreenStuff>();
    }

    /*
    Method to show all the veggies in the garden
    */
    public void show() {
        for(GreenStuff veggie : veggieList) {
            veggie.show();
        }
    }

    public void growOneMonth() {
        // For-each loop
        for(GreenStuff veggie : veggieList) {
            veggie.growOneMonth();
        }
    }

    // Declaring a checked exception
    public void addVeggie(GreenStuff veggie) throws TooMuchGreenStuffException {
        if(veggieList.size() == capacity) {
            // Throwing checked exception - same as unchecked!
            throw new TooMuchGreenStuffException();
        }
        veggieList.add(veggie);
    }

    // Test method or main entrypoint
    public static void main(String[] args) {

        Garden garden = new Garden(5);
        Potatoe veggie = new Potatoe("Russet");
        Strawberry strawberry = new Strawberry("Red stuff");
        // Try catch block to catch exception
        try {
            garden.addVeggie(veggie);
            garden.addVeggie(strawberry);
        }
        // Catching the exception and doing nothing
        catch(TooMuchGreenStuffException exception) {}

        garden.show();
        
        int monthsToGrow = 5;
        veggie.growManyMonths(monthsToGrow);
        strawberry.growManyMonths(monthsToGrow);


        garden.show();

        Garden smallGarden = new Garden(1);
        
        Strawberry strawberry1 = new Strawberry("Yes");
        Strawberry strawberry2 = new Strawberry("No");
        try {
            smallGarden.addVeggie(strawberry1);
            System.out.println("So far so good..");
            smallGarden.addVeggie(strawberry2);
            System.out.println("This line shouldn't be here");
        }
        // Here we actually do something with the catch block
        catch(TooMuchGreenStuffException exception) {
            System.out.println("Exception was thrown, good for you");
        } 
        

    }


}

