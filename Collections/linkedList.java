import java.util.*;


class Student{
    String name;
    int rollno;
    
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    
    public String toString(){
        return name + " " + rollno;
    }
}

public class linkedList
{  
    public static void main(String args[])
    {  
        LinkedList<Student> ll = new LinkedList<Student>();
        ll.add(new Student("Ravi", 1));
        ll.add(new Student("Vijay", 2));
        ll.add(new Student("Ajay", 3));

        System.out.println("The created linked list is: ");
        for(Student s : ll)
            System.out.println(s);
            
    }  
}