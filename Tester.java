package Inventory;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilih salah satu.\n1. CD\n2. DVD");
        int pilihan = in.nextInt();

        if (pilihan == 1) {

            System.out.println("Name : ");
            String name = in.nextLine();
            System.out.println("Artist :");
            String artist = in.nextLine();
            System.out.println("Label :");
            String label = in.nextLine();
            System.out.println("Number :");
            int number = in.nextInt();
            System.out.println("Song Number :");
            int numSong = in.nextInt();
            System.out.println("Quantity :");
            int quantity = in.nextInt();
            System.out.println("Price :");
            double price = in.nextDouble();

            CD cd1 = new CD(number, name, quantity, price, artist, numSong, label);
            cd1.print();
        } else if (pilihan == 2) {
            System.out.println("Name :");
            String name = in.nextLine();
            System.out.println("Rating :");
            String rating = in.nextLine();
            System.out.println("Studio :");
            String studio = in.nextLine();
            System.out.println("Number :");
            int number = in.nextInt();
            System.out.println("Quantity :");
            int quantity = in.nextInt();
            System.out.println("Length :");
            int length = in.nextInt();
            System.out.println("Price :");
            double price = in.nextDouble();

            DVD dvd1 = new DVD(number, name, quantity, price, length, rating, studio);
            dvd1.print();
        } else {
            System.out.println("Input salah");
        }

    }
}
