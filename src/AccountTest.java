import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account myAccount = new Account(name:"Sandeep");

        System.out.printf("Initial name is:%s%n%n", myAccount.getName());

        System.out.println("please enter an account:");
        String accName = input.nextLine();
        myAccount.setName(accName);
        System.out.println();

        System.out.printf("Name of myAccount is:%s%n", myAccount.getName());
    }
}
