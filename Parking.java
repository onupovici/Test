import java.util.Scanner;
public class Parking {
    static Scanner value = new Scanner(System.in);
    static int cars, vans, total;
    public static void main(String args[]){
        while(total<21){

                if(cars<12){
                    System.out.println("number of new cars arrived");
                    int c = value.nextInt();
                    cars+=c;
                }

                System.out.println("number of cars leaving the parking");
                    int cl = value.nextInt();
                    cars-=cl;
                    if(cars>12) cars=12;

                if(vans<8){
                    System.out.println("number of new vans arrived");
                    int v = value.nextInt();
                    vans+=v;
                }

                System.out.println("number of vans leaving the parking");
                    int vl = value.nextInt();
                    vans-=vl;
                    if(vans>8) vans=8;

                total=cars+vans;

                System.out.println("");
                System.out.println(12-cars + " cars free spots left");
                System.out.println(8-vans + " vans free spots left");
                if(total==20) System.out.println("parking is full");
                System.out.println("");

        }
    }

}
