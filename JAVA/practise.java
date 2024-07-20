
// import java.util.Scanner;
// import javax.swing.JOptionPane;
// import java.util.Random;
// import java.util.ArrayList;
import java.util.*;

public class practise {
    public static void main(String[] args) {

        // System.out.print("\t\"I Love Pizza\"\n");
        // System.out.println("Hello World");
        // /* this is comment */
        // System.out.println("hi");
        // System.out.println("Subscribe to channel");

        // declaration + assignment = initialization
        // int x = 123;
        // double y = 3.14;
        // char z = '@';
        // String name = "satyam";
        // // boolean bo = false;
        // System.out.println("My number is " + x);
        // System.out.println(name);

        // String x = "water";
        // String y= "jam";
        // String temp = x;
        // x=y;
        // y= temp;
        // System.out.println(x + " and " + y);

        // Scanner scan = new Scanner(System.in);
        // System.out.println("what is your name?");
        // String name =scan.nextLine();
        // System.out.println("How old are you? ");
        // int age = scan.nextInt();
        // System.out.println("Hello " + name);
        // System.out.println("You are " + age + " years ld") ;

        // double friend = 10;
        // friend = friend / 3;
        // System.out.println(friend);

        // String name = JOptionPane.showInputDialog("Enter your name");
        // JOptionPane.showMessageDialog(null, "Hello "+ name);
        // int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age!"));
        // JOptionPane.showMessageDialog(null, "Your age is " + age);
        // double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your
        // Height!"));
        // JOptionPane.showMessageDialog(null, "Your Height is " + height);

        // double x = 3.14;
        // double y = -10;
        // double z = Math.max(x, y);
        // double m = Math.abs(y);
        // System.out.println(z + " " + m);
        // double a = Double.parseDouble(
        // JOptionPane.showInputDialog("Enter the value of a : length of the height of
        // the triangle"));
        // Scanner scan = new Scanner(System.in);

        // System.out.println("\nEnter the value of 'a' length of the height of the
        // triangle");
        // double a = Double.parseDouble(scan.nextLine());
        // System.out.println(a);

        // System.out.println("Enter the value of 'b' length of the base of the
        // triangle");
        // double b = Double.parseDouble(scan.nextLine());

        // // double b = Double
        // // .parseDouble(JOptionPane.showInputDialog("Enter the value of 'b' length of
        // // the base of the triangle"));
        // System.out.println(b);

        // double c = Math.sqrt(a * a + b * b);

        // System.out.println( "The value of the hypotenuse is : "+c);

        // // Its important to close the Scanner
        // scan.close();

        // Random random = new Random();
        // int x = random.nextInt(-6, 6);
        // System.out.println(x);
        // int y = (int) (Math.random()*101);
        // System.out.println(y);

        // Scanner scan = new Scanner(System.in);

        // int age = Integer.parseInt(scan.nextLine());

        // if (age >= 18 && age < 75 ) {
        // System.out.println("You are an adult!");
        // }
        // else if (age <18 && age > 12) {
        // System.out.println("You are not a teenager!");
        // }
        // else if(age >= 75){
        // System.out.println("You are an absolute boomer!");
        // }
        // else{
        // System.out.println("Invalid age");
        // }

        // scan.close();

        // String day = "Sunday";
        // switch (day) {
        // case "Monday":
        // System.out.println("It is Monday");
        // break;
        // case "Tuesday":
        // System.out.println("It is Tuesday");
        // break;
        // case "Wednesday":
        // System.out.println("It is Wednesday");
        // break;
        // case "Thursday":
        // System.out.println("It is Thursday");
        // break;
        // case "Friday":
        // System.out.println("It is Friday");
        // break;
        // case "Saturday":
        // System.out.println("It is Saturday");
        // break;
        // case "Sunday":
        // System.out.println("It is Sunday");
        // break;

        // default:
        // System.out.println("Looking forward to the weekend");
        // break;
        // }

        // Scanner scan = new Scanner(System.in);
        // String name = "";

        // while (name.isBlank()) {
        // System.out.println("Enter your name :");
        // name = scan.nextLine();

        // }
        // System.out.println("Hello "+ name);
        // scan.close();

        // nested loops
        // Scanner scan = new Scanner(System.in);
        // int rows;
        // int column;
        // String symbol = "";

        // System.out.println("Enter number of rows : ");
        // rows = scan.nextInt();
        // System.out.println("Enter the number of column : ");
        // column = scan.nextInt();
        // System.out.println("Enter the symbol that you want to print : ");
        // symbol = scan.next();

        // for (int i = 1; i <= rows; i++) {
        // System.out.println();
        // for (int j = 1; j <= column; j++) {
        // System.out.print(symbol);
        // }
        // }

        // scan.close();

        // arrays
        // String[] car = { "Bugati", "Honda", "mercedes", "Ford", "TATA",
        // "Wolveswegan", "Tesla" };
        // car[0]= "Mahindra";
        // System.out.println(car[0]);

        // String cars = { "Lamborgini", "Corvette", "Supra",}
        // String[][] cars = new String[3][3];

        // cars[0][0] ="Lambo";
        // cars[0][1] ="Corvette";
        // cars[0][2] ="Supra";
        // cars[1][0] ="Bugati";
        // cars[1][1] ="Honda";
        // cars[1][2] ="Mercedes";
        // cars[2][0] ="Ford";
        // cars[2][1] ="TATA";
        // cars[2][2] ="Tesla";

        // System.out.println(cars[0][1]);

        // String[][] cars = {
        // { "Lambo", "Corvette", "Supra" },
        // { "Bugati", "Honda", "Mercedes", },
        // { "Ford", "TATA", "Tesla" }
        // };

        // for (int i = 0; i < cars.length; i++) {
        // System.out.println();
        // for (int j = 0; j < cars[i].length; j++)
        // System.out.print(cars[i][j] + " ");
        // }
        // System.out.println();

        // System.out.println(cars[2][2]);

        // String name = "Satyam";
        // // String result = name.compareToIgnoreCase);
        // Double a = 3.14;
        // // a.compareTo(3.34);
        // System.out.println(a.compareTo(3.34));

        // ArrayList<String> food = new ArrayList<String>();

        // food.add("Pizza");
        // food.add("Burger");
        // food.add("Hamburger");
        // food.add("Hotdog");

        // for (int i = 0; i < food.size(); i++) {
        // System.out.println(food.get(i));
        // }

        // String[] animals = {"cats ", "dog", "rat", "bird"};
        // ArrayList<String> animals = new ArrayList<String>();

        // for(String i : animals){
        // System.out.println(i);
        // }
        // myMethod();

        // double z= addNum(9857.8, 870);

        // System.out.println(z);

        // int fac = fact(5);
        // System.out.println(fac);

        ArrayList<ArrayList<String>> List = new ArrayList<>();

        ArrayList<String> carCompany = new ArrayList<>();
        carCompany.add("Lambo");
        carCompany.add("Mercedes");
        carCompany.add("Ferrari");

        ArrayList<String> model = new ArrayList<>();
        model.add("Phantom");
        model.add("Ghost");
        model.add("Urus");

        ArrayList<String> food = new ArrayList<>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");

        List.add(carCompany);
        List.add(model);
        List.add(food);

        // System.out.println(List);
        // System.out.println(List.get(0).get(1));//Mercedes

        // for-each loop

        // for (ArrayList<String> i : List) {
        // System.out.println(i);
        // for (String j : List.get(i)) {

        // }

        // }

        // for(int i = 0; i<List.size(); i++)
        // {
        // for(int j = 0; j<List.size(); j++){
        // System.out.println(List.get(i).get(j));
        // }
        // }
        // it works

        // System.out.println(List.size());

        // String[] animals = {"cat", "dog", "rat", "bird"};

        // ArrayList<String> animals = new ArrayList<String>();
        // animals.add("cat");
        // animals.add("dog");
        // animals.add("rat");
        // animals.add("bird");

        // for (String i : animals) {
        // System.out.println(i);
        // }

        // System.out.printf("This is a format string %d", 94);
        // // printf() = an optional method to control, format, and display text to the
        // console window two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]|

        // boolean myBoolean = true;
        // char myChar = '@';
        // String myString = "Satyam";
        // double myDouble = 3.14;
        // int myInt = 30;

        // {conversion - character}
        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // [width]
        // minimum number of characters to be written as output
        // System.out.printf("Hello %10s", myString);
        // [precision]
        // sets number of digits of precision when outputting floating-point values
        // System.out.printf("You have this much money %.1f", myDouble);
        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus (+) or minus (-) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        // double pi = 3.14159; //4.0
        // final double pi = 3.14159; //3.14159

        // pi = 4;

        // System.out.println(pi);

        // OOP
        // car myCar1 = new car();
        // car myCar2 = new car();
        // System.out.println(myCar1.model);
        // System.out.println(myCar1.make);

        // myCar1.drive();
        // myCar1.brake();

        // constructor is a special method that is called when an object is instantiated
        // (created)

        // Human human = new Human("Albert", 100, 5.11);
        // Human human2 = new Human("Newton", 150, 6.0);

        // human.eat();
        // human2.drink();

        // variable scope
        // local = declared inside a method visible only to that mathod

        // global = declared ouside a method, but within a class visible to all parts of
        // a class

        // DiceRoller diceRoller= new DiceRoller();

        // overloaded constructors - multiple constructors within a class with the same
        // name,
        // but have different parameters
        // name + parameters = signature

        // Pizza pizza = new Pizza("thicc crust", "tomato","mozzerella", "pepporoni");

        // System.out.println("Here are the ingredients of your pizza: ");
        // System.out.println(pizza.bread);
        // System.out.println(pizza.sauce);
        // System.out.println(pizza.cheese);
        // System.out.println(pizza.topping);
        // System.out.println();

        // toString() - special method that all objects inherit,
        // that returns a string that "textually represents" an object.
        // can be used both implicitly and explicitly
        // car car = new car();

        // System.out.println(car.satyam());

        // Food[] refrigerator = new Food[3];

        // Food food1 = new Food("pizza");
        // Food food2 = new Food("hamburger");
        // Food food3 = new Food("hotdog");

        // Food[] refrigerator = {food1,food2, food3};

        // // refrigerator[0] = food1;
        // // refrigerator[01] = food2;
        // // refrigerator[02] = food3;

        // System.out.println(refrigerator[0].name);
        // System.out.println(refrigerator[01].name);
        // System.out.println(refrigerator[02].name);

        // hash maps
        // HashMap< Integer , String> rollno = new HashMap<>();
        // rollno.put(1, "Satyam");
        // rollno.put(2, "Aditya");
        // rollno.put(3, "Siddhesh");
        // rollno.put(4, "Krushna");

        // // System.out.println(rollno.get(3));

        // for(int i = 1; i<=rollno.size() ; i++)
        // {
        // System.out.println(rollno.get(i));
        // }

        Scanner scan = new Scanner(System.in);
        // int i = 0;
        // do{
        // System.out.println("Enter a number which is less than zero : ");
        // i = scan.nextInt();
        // } while(i >= 0);

        // System.out.println("THE END");

        // while (true) {
        // if (i == 3) {
        // i++;

        // }
        // System.out.println(i);
        // i++;
        // if (i > 5) {
        // break;
        // }
        // }

        // repeat(5);

        // Mini Project - Guess the number

        // int ran = (int) (Math.random() * 100);

        // System.out.println("Guess the number between 1 to 100 : ");
        // System.out.println("Enter 0 or negative number to quit");
        // int g;
        // do {
        // g = scan.nextInt();
        // if (ran < g) {
        // System.out.println("It's less than " + g);

        // } else if (ran > g && g > 0) {
        // System.out.println("It's bigger than " + g);
        // } else if (g < 0) {
        // System.out.println("You Quit the game ");
        // break;
        // } else
        // System.out.println("The number was " + ran);
        // } while (ran != g);

        // do{
        // g= scan.nextInt();
        // if (g == ran)
        // {
        // System.out.println("You Guessed the number" );
        // break;
        // }
        // else if (g < ran){
        // System.out.println("It's bigger than " + g);
        // }
        // else {System.out.println("It's smaller than " + g);}
        // }while(g > 0 );

        // System.out.println("The number was " + ran);

        // making pattern

        int row = 5;
        int col = 5;
        // for(int i = 0 ; i < row; i++ )
        // {
        // for(int j = 0 ; j< col ; j++)
        // {
        // System.out.print("*");

        // }
        // System.out.println();
        // }

        // for(int i = 1; i <= row; i++)
        // {
        // for(int j = 1 ; j<= col; j++ )
        // {
        // if (i == 1 || j == 1 || i == row || j == col) {
        // System.out.print("*");

        // }
        // else System.out.print(" ");
        // }
        // System.out.println();
        // }

        // for (int i = 1; i <= row; i++) {
        // for (int j = 1; j <= row-i; j++) {
        // System.out.print(" ");

        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // for(int i = 1; i <= row; i++)
        // {
        // for(int j = 1; j <= row-i+1; j++)
        // {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // for(int i = 1; i <= row; i++)
        // {
        // for(int j = 1; j <= i; j++)
        // {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // floyd's Triangle
        // int no = 1;
        // for(int i = 1; i <= 10; i++)
        // {
        // for(int j = 1; j<= i; j++)
        // {
        // System.out.print(no + " ");
        // no++;
        // }
        // System.out.println();
        // }
        // System.out.println(no-1);

        // int no = 1;
        // for(int i = 1; i <= 9; i++)
        // {
        // for(int j = 1; j<= i; j++)
        // {
        // int remainder = (j+i+1) % 2;
        // System.out.print(remainder + " ");

        // }
        // System.out.println();
        // }

        // for(int i =1; i<= row; i++)
        // {
        // for(int j =1; j<= i; j++)
        // {
        // System.out.println();
        // // }
        // // }
        // Pen pen1 = new Pen();
        // pen1.color = "black";
        // pen1.type = "ink_pen";
        // pen1.write();
        // // Pen pen2 = new Pen("satyam", 03);
        // pen1.Pen("satyam", 43);
        
        // String b = Integer.toString(12321);
        
        // System.out.println(b.charAt(b.length()-1));

        // Car car= new Car();
        // car.go();
        // System.out.println(car.pedals);
















    }

    
    

    

    static void repeat(int i) {

        for (int j = 1; j <= i; j++) {
            System.out.println("Repeat Me " + j);
        }

    }

    static int fact(int i) {
        if (i > 0) {
            return i + fact(i - 1);
        } else {
            return 0;
        }
    }

    static void myMethod() {
        System.out.println("This is my own method");
    }

    static int addNum(int x, int y) {
        return x + y;
    }

    static double addNum(double x, double y) {
        return x + y;
    }








    
}
class Vehicle{
    double speed;

    void go(){
        System.out.println("this vehicle is moving forward");
    }

    void stop(){
        System.out.println("this vehicle is in the rest position");
    }
}

class Car extends Vehicle {
    double speed = 242;

    int wheels = 4;
    int doors = 2;
    int pedals = 0;
    
}
class Bicycle extends Vehicle {
    double speed = 22;

    int wheels = 2;
    int doors = 0;
    int pedals = 2;
}














class Pen {

    String color;
    String type;
    public void write() {
        System.out.println(this.type +" " + this.color);
    }
    public void Pen( String name , int date){
         System.out.println((int)(name.length() + date));
    }
    public Pen(){
        System.out.println("hello this is constructor");
    }
}
