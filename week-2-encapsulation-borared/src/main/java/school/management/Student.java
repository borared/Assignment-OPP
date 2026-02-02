package school.management;


public class Student {
    private String name;
    private int age;
    private String id;
    private double gpa;

    public Student(String name, int age, String id, double gpa){
        setName(name);
        setAge(age);
        setID(id);
        setGpa(gpa);
    }

    public Student setName(String name) {
    if (name == null || name.isEmpty() || name.length() >= 50) {
        throw new IllegalArgumentException("Invalid name.");
    }
    this.name = name;
    return this;
    }

    public Student setAge(int age){
        if(age >= 18){
            this.age = age;
            return this;
        }else throw new IllegalArgumentException("Invalid age.");
    }

    public Student setID(String id){
        if(id == null || id.isEmpty()){
            throw new IllegalArgumentException("ID invalid");
        }
        this.id = id;
        return this;
    }

    public Student setGpa(double gpa){
        if( gpa >= 0.0 && gpa <= 4.0){
           this.gpa = gpa;
           return this;  
        } else throw new IllegalArgumentException("GPA invalid.");
    }

    public boolean isHonorStudent() {
        return gpa >= 3.5;
    }
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getStudentId(){
        return id;
    }
    public double getGpa(){
        return gpa;
    }

}
