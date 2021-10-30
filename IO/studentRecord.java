import java.io.*;

public class studentRecord {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void addData() throws IOException {
        FileWriter fw = new FileWriter("studentRecord.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        String name, department, rollNo;
        int age, semester, gpa;
        boolean add = true;
        while (add) {
            System.out.println("Enter name: ");
            name = br.readLine();
            System.out.println("Enter age: ");
            age = Integer.parseInt(br.readLine());
            System.out.println("Enter department: ");
            department = br.readLine();
            System.out.println("Enter roll number: ");
            rollNo = br.readLine();
            System.out.println("Enter semester: ");
            semester = Integer.parseInt(br.readLine());
            System.out.println("Enter gpa without decimals: ");
            gpa = Integer.parseInt(br.readLine());
            pw.println(name);
            pw.println(age);
            pw.println(department);
            pw.println(rollNo);
            pw.println(semester);
            pw.println(gpa);
            System.out.println("Do you want to add more data? (y/n)");
            String ans = br.readLine();
            if (ans.equals("y")) {
                add = true;
            } else {
                add = false;
            }
        }
        pw.close();
        menu();
    }

    public void readData() throws IOException {
        try {
            FileReader fr = new FileReader("studentRecord.txt");
            BufferedReader br = new BufferedReader(fr);
            String name, department, rollNo, age, semester, gpa;
            while (true) {
                name = br.readLine();
                if (name == null) {
                    break;
                }
                age = br.readLine();
                department = br.readLine();
                rollNo = br.readLine();
                semester = br.readLine();
                gpa = br.readLine();
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Department: " + department);
                System.out.println("Roll number: " + rollNo);
                System.out.println("Semester: " + semester);
                System.out.println("GPA: " + gpa + "\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        menu();
    }

    public void clear() throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("studentRecord.txt")));
        pw.close();
        System.out.println("Cleared Database");
        menu();
    }

    public void menu() throws IOException {
        System.out.println("\n1. Add data");
        System.out.println("2. Read data");
        System.out.println("3. Clear data");
        System.out.println("4. Exit");

        int choice = Integer.parseInt(br.readLine());
        switch(choice)
        {
        case 1:
        addData();
        break;
        case 2:
        readData();
        break;
        case 3:
        clear();
        break;
        case 4:
        System.exit(1);
        break;
        default:
        System.out.println("\nInvalid Choice !");
        break;
        }
    }
    public static void main(String[] args) throws IOException {
        studentRecord sr = new studentRecord();
        sr.menu();
        
    }
}