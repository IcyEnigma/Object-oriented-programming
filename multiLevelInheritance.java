class employee{
    int empId;
    String empName;
    float empSal = 10000;
    public employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public void display(){
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+empSal+"\n");
    }
}
class developer extends employee{
    developer(int empId, String empName) {
        super(empId, empName);
        super.empSal = empSal + empSal*0.5f;
    }
}

class seniorDeveloper extends developer{
    seniorDeveloper(int empId, String empName) {
        super(empId, empName);
        super.empSal = empSal + empSal*0.8f;
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        seniorDeveloper sd = new seniorDeveloper(101, "Raj");
        developer d = new developer(102, "Max");
        employee e = new employee(103, "John");
        sd.display();
        d.display();
        e.display();
    }
}