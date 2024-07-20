public class Human {

    String name;
    int age;
    double height;

    Human(String name, int age, double height) {

        this.name = name;
        this.age = age;
        this.height = height;
    }


    void eat(){
        System.out.println("And " +this.name + " is eating now");
    }

    void drink(){
        System.out.println( this.name + " is drinking now.");
    }

}
