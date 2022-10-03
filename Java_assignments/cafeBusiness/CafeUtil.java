import java.util.ArrayList;
public class CafeUtil {

    //Streak
    public int getStreakGoal() {
        int sum = 0;
        for(int week = 1; week<=10; week++){
            sum += week;
        }
        return sum;
    }

    //Order Total
    public double getOrderTotal(double[] lineItems) {
        double sum = 0;
        for(double price: lineItems){
            sum += price;
        }
        return sum;
    }

    //Display Menu
    public void displayMenu(ArrayList<String> displayMenu) {
        for (int id = 0; id < displayMenu.size(); id++)
            System.out.printf("%s %s \n", id, displayMenu.get(id));
    }

    //Add Customers
    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("Please enter your name");
        String userName = System.console().readLine();
        System.out.printf("Hello %s!", userName);
        System.out.printf(" There are currently %s ahead of you.", customerList.size());
        customerList.add(userName);
        System.out.println(customerList);
    }

    // Bonuses
    public void printPriceChart(String product, double price, int maxQuantity) {
        
    }
}
