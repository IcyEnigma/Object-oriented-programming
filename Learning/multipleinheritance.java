class Author{
    String firstName;
    String lastName;
    public Author(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }
    public void setFirstName(String fn){
        firstName = fn;
    }
    public void setLastName(String ln){
        lastName = ln;
    }
    public String getFirstName(){
        return(firstName);
    }
    public String getLastName(){
        return(lastName);
    }
    public void tostring(){
        System.out.println(firstName + " " + lastName);
    }
}
class Book{
    String title;
    String author;
    int price;
    public Book(String t, String a, int p){
        title = t;
        author = a;
        price = p;
    }
    public void setTitle(String t){
        title = t;
    }
    public void setAuthor(String a){
        author = a;
    }
    public void setPrice(int p){
        price = p;
    }
    public String getTitle(){
        return(title);
    }
    public String getAuthor(){
        return(author);
    }
    public int getPrice(){
        return(price);
    }
    public void tostring(){
        System.out.println("Title : " + title);
        System.out.println("Author : "+ author);
        System.out.println("Price : " + price);
    }
}

public class multipleinheritance {
    public static void main(String[] args) {
        Book b = new Book("The Complete Reference Java", "Sample name", 500);
        b.tostring();
    }
}
