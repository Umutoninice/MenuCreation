import sample.Student;

import java.util.Scanner;

public class Main{

    public static  void main(String[] args) {


        System.out.println("**************MTN MOMO MENU*******************");

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            mainMenu();
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 0: {
                    mtnPackMenu();

                  System.out.println("Enter your choice : ");
                    choice = sc.nextInt();
mainMenu();
                    choice = sc.nextInt();
                    break;
                }
                case 1: {

                     sendMoneyMenu();
                    System.out.print("Enter your choice : ");
                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:

                            momoUser();
                            choice=sc.nextInt();
mainMenu();
choice=sc.nextInt();
                            break;
                        case 2:
                            sendToEkash();
                         choice=sc.nextInt();
                   mainMenu();
                    choice=sc.nextInt();
                            break;
                        case 3:

                            internationalRemittanceMenu();
                            System.out.print("Enter your choice : ");
                            choice = sc.nextInt();
                    }
                    break;
                }
                case 2: {

                    buyMenu();

                    break;
                }

                default:
                    System.out.println("Invalid choice. Try again");

            }


        } while (choice != 99);

    }
public static void mainMenu(){
    System.out.println("0. MTN Packs");
    System.out.println("1. Send Money");
    System.out.println("2. Buy");
    System.out.println("3. Pay Bill");
    System.out.println("4. Bank services");
    System.out.println("5. Loans and savings ");
    System.out.println("6. My momo account");
    System.out.println("7. Pending Approvals");
    System.out.println("8. Momo pay");
    System.out.println("99. Exit");
}
    public static void sendMoneyMenu(){
        System.out.println("1.Momo Users");
        System.out.println("2.Send to Ekash");
        System.out.println("3. International Remittance");
        System.out.println("4.Cancel Voucher");
        System.out.println("5. Display voucher ");
        System.out.println("6.List Active voucher ");
        System.out.println("7. exit");
    }
    public static void internationalRemittanceMenu(){
        System.out.println("1. To mobile number");
        System.out.println("2. other wallets");
        System.out.println("3. to banks");
        System.out.println("4. Pay international merchant");
        System.out.println("5. exit");
    }
    public static void buyMenu(){
        System.out.println("1. Buying Airtime , VoicePack and Databundles");
        System.out.println("2. Electricity");
        System.out.println("3. International subscription");
        System.out.println("4. Solar");
        System.out.println("5. Pay transport fare");
        System.out.println("6. Exit");
    }
    public static void mtnPackMenu(){
        System.out.println("1. Buying Airtime , VoicePack and Data bundles");
        System.out.println("99. Go back");

    }
    public static void momoUser(){
        System.out.println("enter the recipient number");
        System.out.println("99. Go back");

    }
    public static void sendToEkash(){
        System.out.println("enter the amount to send");
        System.out.println("99. Go back");

    }
}
