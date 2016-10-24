public class Potatoe implements GreenStuff {
    
    private String sort;
    private int months;

    public Potatoe(String sort) {
        this.sort = sort;
        months = 0;
    }

    public void show() {
        System.out.println("This potatoe is of sort :" + sort + " and it is this"  
           + "many months old :" + months);
    }
    
    //Override annotation, not really necessary 
    @Override
    public void growOneMonth() {
        months += 1;

    }

    public void growManyMonths(int noOfMonths) {
        // while loops 
        while(noOfMonths > 0) {
            growOneMonth();
            noOfMonths--;
        }
    }


}