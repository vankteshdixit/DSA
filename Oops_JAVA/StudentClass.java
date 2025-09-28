package Oops_JAVA;

//classes is a blueprints
//whereas objects are the real life entity
//object is an instance of a class
//classes are pass by reference
public class StudentClass {
//    creating a new data type
    public static void main(String[] args) {
        Student x = new Student(); // creation declaration
        x.name = "Cars";
        x.rno=4;
        x.percent=98.3;

        Student s = new Student();
        s.name = "He";
        s.rno=33;
        s.percent=79;
//        here 'x' and 's' is a object
    }
}
