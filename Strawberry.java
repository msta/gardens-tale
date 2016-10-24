// Class declaration
public class Strawberry implements GreenStuff {
    
    // Instance variables
    private String sort;
    private int months;
    private boolean tooOld;


    // Constructor
    public Strawberry(String sort) {
        tooOld = false;
        // This operator because of naming conflict
        this.sort = sort;
        months = 0;
    }

    public void show() {
        System.out.println("This strawberry is of sort : " + sort + " and it is this"  
           + " many months old : " + months);
        if(tooOld) {
            System.out.println("This will probably not taste good");
        }
    }
    
    public void growOneMonth() {
        growManyMonths(1);   
    }

    public void growManyMonths(int noOfMonths) {
        for(int i = 0; i < noOfMonths; i++) {
            if(months >= 3) {
            tooOld = true;
        } 
            months += 1;
        }
    }
    
}