package w1.basic;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        // your code here
        this.name = name;
        this.age = age;
    }

    public String getName() {
        // your code here
        return name;
    }

    public int getAge() {
        // your code here
        return age;
    }

    public boolean isAdult(){
        // your code here
        return age >= 18;
    }

}
