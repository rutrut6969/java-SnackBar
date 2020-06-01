package snackBar;

public class VendingMaching {
    // maxId - keep track of last used vending machine id
    private int maxId = 0;

    //id - automatically generated field
    private int id;

    //name
    private String name;

    public VendingMaching(String[] name){
        // Auto Incrementing the ID
        maxId += maxId;

        // Setting up the ID
        id = maxId;

        // Name
        this.name = name;
    }

    // Get ID;
    public int getID() {
        return id;
    }

    // Get and Set Name;
    public String name(){
        return name;
    }

    public void name(name){
        this.name = name;
    }


}