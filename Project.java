package javas;
import java.util.Scanner;
import java.util.Arrays;

public class Project {

    static Scanner sc = new Scanner(System.in);
    static String username;

    static void login() {
        System.out.println("|||Welcome to Electricity Billing|||");
        
        System.out.println("---------------------------------------");
        
        System.out.println("Login into your Account");
        
        System.out.println("\n");
        
        System.out.print("Username : ");
        
        username = sc.nextLine();
        
        System.out.print("Password : ");
        
        String password = sc.nextLine();
        
        System.out.println("LoggedIn Successfully!!!");
        
        System.out.println("======================================");
        
        System.out.println("");
    }

    static void mainMenu() {
        System.out.println();
        
        System.out.println("\tWelcome to the Interface");
        
        System.out.println("                ");
        
        System.out.println("     1.Customer Information");
        
        System.out.println("     2.Meter Reading Details");
        
        System.out.println("     3.Bill Details");
        
        System.out.println("     4.Tariff Details");
        
        System.out.println();
        
        System.out.print("Enter your Choice :");
        
        int choice = sc.nextInt();
        sc.nextLine();  
        switch(choice) {
            case 1 :
                
                custInfo();
                System.out.println();
                mainMenu();
                break;
            case 2 :
                
                readingDetails();
                mainMenu();
                break;
            case 3 :
                
                bill();
                mainMenu();
                break;
            case 4 :
                
                tariffDetails();
                mainMenu();
                break;
            default :
                System.out.println("enter valid operation");
                mainMenu();
        }
    }

    static void custInfo() {
        if(username.equalsIgnoreCase("siva")) {
            String[] arr = {"Siva","3/68 Periyar Street,Salem","42841","Residential"};
            System.out.println("Name:"+arr[0]);
            
            System.out.println("Address:"+arr[1]);
            
            System.out.println("Custom ID:"+arr[2]);
            
            System.out.println("Connection Type:"+arr[3]);
        }
        else if(username.equalsIgnoreCase("nitheesh")) {
            String[] arr = {"Nitheesh","8/34 Gandhi street","chennai","6432","Residential"};
            System.out.println("Name:"+arr[0]);
            
            System.out.println("Address:"+arr[1]);
            
            System.out.println("Custom ID:"+arr[2]);
            
            System.out.println("Connection Type:"+arr[3]);
        }
        else if(username.equalsIgnoreCase("santhosh")) {
            String[] arr = {"Santhosh","5/94 Nehru street","Covai","45466","Residential"};
            System.out.println("Name:"+arr[0]);
            
            System.out.println("Address:"+arr[1]);
            
            System.out.println("Custom ID:"+arr[2]);
            
            System.out.println("Connection Type:"+arr[3]);
        }
        else if(username.equalsIgnoreCase("prem")) {
            String[] arr = {"Prem","8/34 Gandhi street","chennai","6432","Residential"};
            System.out.println("Name:"+arr[0]);
            
            System.out.println("Address:"+arr[1]);
            
            System.out.println("Custom ID:"+arr[2]);
            
            System.out.println("Connection Type:"+arr[3]);
        }
        else {
            System.out.println("\tUser not available");
            
            System.out.println("=================================");
        }
    }

    static void readingDetails() {
        if(username.equalsIgnoreCase("siva")) {
            String[] arr = {"41","12/03/2014","Smart Meter",
                    "Residential Building","Active","Monthly"};
            System.out.println("");
            
            System.out.println("Meter number : "+arr[0]);
            
            System.out.println("Installation Date :"+arr[1]);
            
            System.out.println("Meter Type : "+arr[2]);
            
            System.out.println("Meter Location :"+arr[3]);
            
            System.out.println("Meter Status :"+arr[4]);
            
            System.out.println("Reading Frequency: "+arr[5]);
        }
        else if(username.equalsIgnoreCase("prem")) {
            String[] arr = {"381","14/05/2017","Smart Meter",
                    "Residential Building","Active","Monthly"};
            System.out.println("");
            
            System.out.println("Meter number : "+arr[0]);
            
            System.out.println("Installation Date :"+arr[1]);
            
            System.out.println("Meter Type : "+arr[2]);
            
            System.out.println("Meter Location :"+arr[3]);
            
            System.out.println("Meter Status :"+arr[4]);
            
            System.out.println("Reading Frequency: "+arr[5]);
            
        }
        else if(username.equalsIgnoreCase("nitheesh")) {
            String[] arr = {"472","24/08/2016","Smart Meter",
                    "Residential Building","Active","Monthly"};
            System.out.println("");   
            
            System.out.println("Meter number : "+arr[0]);
            
            System.out.println("Installation Date :"+arr[1]);
            
            System.out.println("Meter Type : "+arr[2]);
            
            System.out.println("Meter Location :"+arr[3]);
            
            System.out.println("Meter Status :"+arr[4]);
            
            System.out.println("Reading Frequency: "+arr[5]);
            
        }
        else if(username.equalsIgnoreCase("santhosh")) {
            String[] arr = {"42","07/05/2020","Analog Meter",
                    "Residential Building","Active","Monthly"};
            System.out.println("Meter number : "+arr[0]);
            
            System.out.println("Installation Date :"+arr[1]);
            
            System.out.println("Meter Type : "+arr[2]);
            
            System.out.println("Meter Location :"+arr[3]);
            
            System.out.println("Meter Status :"+arr[4]);
            
            System.out.println("Reading Frequency: "+arr[5]);
        }
        else {
            System.out.println("\tUser is not Available");
            
            System.out.println("===========================");
        }
    }

    static void bill() {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your Meter Number : ");
        int id = obj.nextInt();
        System.out.println(id);
        System.out.print("Enter Units Consumed :");
        int unitsConsumed = obj.nextInt();
        double totalBill = 0.0;

        if (unitsConsumed <= 100) {
            System.out.println("No charge for the first 100 units");
        } 
        else if (unitsConsumed > 100 && unitsConsumed <= 200) {
            totalBill = (unitsConsumed - 100) * 1.5;
            System.out.println("Total Bill: Rs. " + totalBill);
        }
        else if (unitsConsumed > 200 && unitsConsumed <= 500) {
            totalBill = 100 * 1.5 + (unitsConsumed - 200) * 2;
            System.out.println("Total Bill: Rs. " + totalBill);
        } 
        else if (unitsConsumed > 500 && unitsConsumed <= 1000) {
            totalBill = 100 * 1.5 + 300 * 2 + (unitsConsumed - 500) * 2.5;
            System.out.println("Total Bill: Rs. " + totalBill);
        } 
        else {
            System.out.println("Contact support for consumption above 1000 units");
        }

        obj.close();
        System.out.println();
    }

    static void tariffDetails() {
        System.out.println("=================================");
        System.out.println("||       Tariff Details        ||");
        System.out.println("=================================");
        System.out.println("1. Up to 100 units: Free of charge");
        System.out.println("2. 101 to 200 units: Rs. 1.5 per unit");
        System.out.println("3. 201 to 500 units: Rs. 2 per unit");
        System.out.println("4. 501 to 1000 units: Rs. 2.5 per unit");
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        login();
        mainMenu();
        sc.close();
    }
}
