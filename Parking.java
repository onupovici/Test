import java.util.Scanner;

public class Parking {
    static Scanner value = new Scanner(System.in);
    static int cars, vans, total;

    public static void main(String args[]) {
        while (total < 21) {

            if (cars < 12) {
                System.out.println("number of new cars arrived");
                int c = value.nextInt();
                cars += c;
            }


            for (int cl = 0; cl <= 100; ) {
                System.out.println("number of cars leaving the parking");
                cl = value.nextInt();
                if (cl <= cars) {
                    cars -= cl;
                    break;
                } else {
                    System.out.println("number bigger than existing cars");
                    continue;
                }
            }

            if (cars > 12) cars = 12;

            if (vans < 8) {
                System.out.println("number of new vans arrived");
                int v = value.nextInt();
                vans += v;
            }


            for (int vl = 0; vl <= 100; ) {
                System.out.println("number of vans leaving the parking");
                vl = value.nextInt();
                if (vl <= vans) {
                    vans -= vl;
                    break;
                } else {
                    System.out.println("number bigger than existing vans");
                    continue;
                }
            }

            if (vans > 8) vans = 8;

            total = cars + vans;

            System.out.println("");
            System.out.println(12 - cars + " cars free spots left");
            System.out.println(8 - vans + " vans free spots left");
            if (total == 20) System.out.println("parking is full");
            System.out.println("");

        }
    }

}
