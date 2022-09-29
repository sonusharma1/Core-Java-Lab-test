//creating class for assign memory to Bank class 
public class TestBank {
    
    // main method
    public static void main(String[] args) {
        
        //create array of Bank object
        Bank[] customer = new Bank[7];

        //storing customer details in Bank object's array -> constructor injection
        customer[0] = new Bank(4598, "Sonu", 5001);
        customer[1] = new Bank(4578, "Ravi", 4551.2);
        customer[2] = new Bank(9782, "Sharma", 450);
        customer[3] = new Bank(6521, "Palis", 650);
        customer[4] = new Bank(7823, "Rahulya", 984.65);

        //storing customer details in Bank object's array -> setter method
        customer[5] = new Bank();
        customer[5].setAcNo(4512);
        customer[5].setName("Pradum");
        customer[5].setBalance(923.21);

        customer[6] = new Bank();
        customer[6].setAcNo(9874);
        customer[6].setName("Pandey");
        customer[6].setBalance(98402.21);       

        //displaying all customer details
        System.out.println("\n----------------\nAll customer Details\n--------------\n");
        for (int i = 0; i < customer.length; i++) {
            customer[i].display();
        }

        //display customers whose marks grater than 90%
        System.out.println("\n\n-------------------------------------------------\ncustomers whose Account Balance is less than 1000rs\n-----------------------------------------------\n");
        for (int i = 0; i < customer.length; i++) {
            if (customer[i].getBalance() < 1000) {
                customer[i].display();
            }
        }
        System.out.println();
    }
}
