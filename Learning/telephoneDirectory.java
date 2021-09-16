
class Directory
{
    String[] names = new String[100];
    String[] numbers = new String[100];
    int nameIndex = 0;
    int numberIndex = 0;
    void addContact(String name, String number){
        names[nameIndex] = name;
        numbers[numberIndex] = number;
        nameIndex++;
        numberIndex++;
    }
    void displayContacts(){
        for(int i = 0; i < nameIndex; i++){
            System.out.println(names[i] + " - " + numbers[i]);
        }
        System.out.println("\n");
    }
    void searchContact(String name){
        for(int i = 0; i < nameIndex; i++){
            if(names[i].equals(name)){
                System.out.println(names[i] + " - " + numbers[i]);
            }
        }
        System.out.println("\n");
    }
    void deleteContact(String name){
        for(int i = 0; i < nameIndex; i++){
            if(names[i].equals(name)){
                names[i] = null;
                numbers[i] = null;
            }
        }
    }
}

    


public class telephoneDirectory {
    public static void main(String args[]){
        Directory directory = new Directory();
        directory.addContact("John", "1234567890");
        directory.addContact("Mary", "0987654321");
        directory.addContact("Bob", "0987654321");
        directory.addContact("Alice", "1234567890");
        directory.addContact("Tom", "0987654321");
        
        directory.displayContacts();
        directory.searchContact("John");
        directory.deleteContact("John");
        directory.displayContacts();
    }
}
    

