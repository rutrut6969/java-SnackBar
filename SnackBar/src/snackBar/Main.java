package snackBar;

public class Main{
    private static void workWithData(){

        // Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // Vending Machines
        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");
        VendingMachine Office = new VendingMachine("Office");

        // Snacks

        // In Vending Machine Food
         int foodID = Food.getID();

        //36 Chips at $1.75
        Snack Chips = new Snack("Chips", 36, 1.75, foodID);

        //36 Chocolate Bar at $1.00
        Snack chocoBar = new Snack("Chocolate Bar", 36, 1.00, foodID);

        //30 Pretzel at $2.00
        Snack pretzel = new Snack("Pretzel", 30, 2.00, foodID);

        // In Vending Machine Drink
         int drinkID = Drink.getID();

        //24 Soda at $2.50
        Snack soda = new Snack("Soda", 24, 2.50, drinkID);

        //20 Water at $2.75
        Snack water = new Snack("Water", 20, 2.75, drinkID);

        // Customer 1 (Jane) buys 3 of snack 4 (Soda).
         double total = soda.totalOnQuan(3);
        soda.buySnack(3);
        jane.buy(total);

        //Print Customer 1 (Jane) Cash on hand.
        System.out.println("Jane's Cash on Hand is: " + jane.getCash());

        //Print quantity of snack 4 (Soda).
        System.out.println("Soda's Quantity Remaining is: " + soda.getQuantity());

        //Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
        total = pretzel.totalOnQuan(1);
        pretzel.buySnack(1);
        jane.buy(total);

        //Print Customer 1 (Jane) Cash on hand.
        System.out.println("Jane's Cash on Hand is: " + jane.getCash());

        //Print quantity of snack 3 (Pretzel).
        System.out.println("Pretzel's Quantity remaining is: " + pretzel.getQuantity());

        //Customer 2 (Bob) buys 2 of snack 4 (Soda).
        total = soda.totalOnQuan(2);
        soda.buySnack(2);
        bob.buy(total);

        //Print Customer 2 (Bob) Cash on Hand.
        System.out.println("Bob's Cash on Hand is: " + bob.getCash());

        //Print quantity of snack 4 (Soda).
        System.out.println("Soda's Quantity Remaining is: " + soda.getQuantity());

        //Customer 1 (Jane) finds $10.
        jane.addCash(10);

        //Print Customer 1 (Jane) Cash on Hand.
        System.out.println("Jane's Cash on Hand is: " + jane.getCash());

        //Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
        total = chocoBar.totalOnQuan(1);
        chocoBar.buySnack(1);
        jane.buy(total);

        //Print Customer 1 (Jane) Cash on Hand.
        System.out.println("Jane's Cash on Hand is: " + jane.getCash());

        //Print quantity of snack 2 (Chocolate Bar).
        System.out.println("Chocolate Bars Quantity Remaining is: " + chocoBar.getQuantity());

        //Add 12 more items to snack 3 (Pretzel).
        pretzel.addQuantity(12);

        //Print quantity of snack 3 (Pretzel).
        System.out.println("Pretzel's Quantity remaining is: " + pretzel.getQuantity());

        //Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
        total = pretzel.totalOnQuan(3);
        pretzel.buySnack(3);
        bob.buy(total);

        //Print Customer 2 (Bob) Cash on hand.
        System.out.println("Bob's Cash on Hand is: " + bob.getCash());

        //Print quantity of snack 3 (Pretzel).
        System.out.println("Pretzel's Quantity remaining is: " + pretzel.getQuantity());

    }

    public static void main(String[] args){
        workWithData();
    }

}