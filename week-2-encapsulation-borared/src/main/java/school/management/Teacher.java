package school.management;

public class Teacher {
    private String name;
    private int age;
    private String teacherId;
    private double salary;

    public Teacher(String name, int age, String teacherId, double salary){
        setName(name);
        setAge(age);
        setTeacherId(teacherId);
        setSalary(salary);
    }

    public Teacher setName(String name){
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Invalid name.");
        }else{
            this.name = name;
            return this;
        }
    }

    public Teacher setAge(int age){
        if(age >= 25){
            this.age = age;
            return this;
        }else throw new IllegalArgumentException("Invalid age.");
    }

    public Teacher setTeacherId(String teacherId){
        if(teacherId == null || teacherId.isEmpty()){
            throw new IllegalArgumentException("Invalid Teacher ID.");
        }else{
            this.teacherId = teacherId;
            return this;
        }
    }

    public Teacher setSalary(double salary){
        if(salary > 0){
            this.salary = salary;
            return this;
        }else throw new IllegalArgumentException("Invalid Salary");
    }


    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getTeacherId(){
        return teacherId;
    }

    public double getSalary(){
        return salary;
    }

    public double getAnnualSalary(){
        return salary * 12;
    }
}
