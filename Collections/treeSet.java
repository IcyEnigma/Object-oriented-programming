import java.util.*;

class person{
    String name;
    person(String name){
        this.name = name;
    }
}

public class treeSet{
    public static void main(String[] args){
        TreeSet<person> t = new TreeSet<person>(new Comparator<person>(){
            public int compare(person p1, person p2){
                return p1.name.compareTo(p2.name);
            }
        });
        ArrayList<String> a = new ArrayList<String>();
        
        t.add(new person("A"));
        t.add(new person("B"));
        t.add(new person("C"));
        t.add(new person("D"));
        t.add(new person("E"));
        t.add(new person("F"));
        t.add(new person("G"));

        Iterator<person> it = t.iterator();
        while(it.hasNext()){
            a.add(it.next().name);
        }
        int last = a.size();
        System.out.println("Elements in the treeset: " + a);
        System.out.println("Node: " + a.get(last-1));
        System.out.println("Parent: " + a.get((last/2)-1));
        System.out.println("Grandparent: " + a.get((last/4)-1));
    }
}