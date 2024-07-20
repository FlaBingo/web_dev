// i made it myself, it taked about 4 fucking hours;
import java.util.*;

public class Closer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double close = new Closer().random();
        System.out.println();
        System.out.println("Which number is closest to this : " + close + "\nWrite the serial number below");

        HashMap<Integer, Double> list = new HashMap<>();
        ArrayList<Double> store = new ArrayList<>();
        int i = 1;
        double random;

        for (; i <= 10; i++) {
            random = new Closer().random();
            list.put(i, random);
            System.out.println(i + ") " + list.get(i));

            store.add(Math.abs(close - list.get(i)));
        }

        // list.put(1, new Closer().random());
        // list.put(2, new Closer().random());
        // list.put(3, new Closer().random());
        // list.put(4, new Closer().random());
        // list.put(5, new Closer().random());
        // list.put(6, new Closer().random());
        // list.put(7, new Closer().random());
        // list.put(8, new Closer().random());
        // list.put(9, new Closer().random());
        // list.put(10, new Closer().random());
        
        System.out.println();
        int answer = scan.nextInt();
        System.out.println("Your answer is : " + list.get(answer));
        // System.out.println(store);
        // int[] a = {3 ,35 ,1,6, 15,5,17};
        double min = store.get(0);
        int j = 1;
        for (; j < store.size(); j++) {
            if (store.get(j) < min) {
                min = store.get(j);
            }
        }
        int b = store.indexOf(min) + 1;
        // System.out.println(b);
        System.out.println();
        if (answer == b) {
            System.out.println("That's Correct");
        }
        else System.out.println("Nearest to " + close + " is \n" + b + ") " + list.get(b));
        System.out.println();

        scan.close();
    }

    public double random() {
        return (Math.random() * 100);
    }
}
