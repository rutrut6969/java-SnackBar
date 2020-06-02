package snackBar;

public class Snack{

    // maxId - keep track of last used snack id
    // To keep track of the ID's
    private static int maxId = 0;


    //id - automatically generated field
    private int id;

    //name
    private String name;

    //quantity
    private int quantity;

    //cost
    private double cost;

    //vending machine id
    private int vendID;

    // Create a method to create a snack;
    public Snack(String name, int quantity, double cost, int vendID){
        // increment the ID;
        maxId++;
        id=maxId;

        // Assign the rest of the parameters;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendID = vendID;
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
    //set and get cost
    public double getCost(){
        return cost;
    }

    public void setCost(int cost){
        this.cost = cost;
    }

    //set and get vending machine id
    public int getVendID(){
        return vendID;
    }

    public void setVendID(int vendID){
        this.vendID = vendID;
    }

    //get quantity
    public int getQuantity(){
        return quantity;
    }

    //add quantity when given how many to add
    public void addQuantity(int quantity){
        this.quantity += quantity;
    }

    //buy snack when given how many to buy
    public void buySnack(int quantity){
        this.quantity -= quantity;
    }

    //get total cost given a quantity
    public double totalOnQuan(int quantity){
        double total = quantity * cost;
        return total;
    }

}