package snackBar;

public class Customer{

    //maxId - keep track of last used customer id
    private int maxID = 0;

    //id - automatically generated field
    private int id;

    //name
    private String name;

    //cash on hand
    private int cash;

    public Customer(String name, int cash){
        // Auto increment maxID;
        maxID += maxID;

        // Set ID to current maxID;
        id = maxID;

        // Set Name and Cash to the appropriate variables;
        this.name = name;
        this.cash = cash;
    }

    // get id
    public int getID(){
        return id;
    }

    //set and get name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //add cash to cash on hand
    public void addCash(double moreCash){
        this.cash += moreCash;
    }


    //get cash on hand
    public double getCash(){
        return cash;
    }

    //buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
    public void buy(double total){
        this.cash -= total;
    }
}