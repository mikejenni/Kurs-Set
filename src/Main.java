import java.util.*;


class Person{

    private int id;
    private String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return  "ID: " + this.id + " Name: " + this.name;
    }

}

public class Main {
    public static void main(String[] args) {

        // Wichtiger Unterschied zu List
        // In einem Set kann kein Element doppelt vorkommen da jedes Element einzigartig git

                // Klassen die ein Set realisieren
                // 1. TreeSet
                // 2. HashSet
                // 3. LinkedHashSet

        // Datenstruktur erzeugen
        List<String> list1 = new ArrayList<String>();

//        Set<String> set1 = new TreeSet<String>();
        Set<Person> set2 = new HashSet<Person>();
///*        Set<String> set3 = new LinkedHashSet<String>();
//
//        // Datenausgabe
//        // ArrayList
//        list1.add("Peter");
//        list1.add("Adrian");
//        list1.add("Michi");
//        list1.add("Peter");
//        list1.add("Bernt");
//
//        // TreeSet
//        set1.add("Peter");
//        set1.add("Adrian");
//        set1.add("Michi");
//        set1.add("Peter");
//        set1.add("Bernt");*/

        Person p1 = new Person(1, "Chris");
        Person p2 = new Person(2, "Peter");
        Person p3 = new Person(3, "Hans");
        Person p4 = new Person(4, "Petra");

        // HashSet
        set2.add(p1);
        set2.add(p2);
        set2.add(p3);
        set2.add(p4);
        //set2.add("Bernt");

        for (Person person : set2) {
            System.out.println(person);
        }

        }

//        //LinkedHashSet
//        set3.add("Peter");
//        set3.add("Adrian");
//        set3.add("Michi");
//        set3.add("Peter");
//        set3.add("Bernt");
//
//
//        // Datenausgabe
//        System.out.println("Ausgabe ArrayList: ");
//        Main.getElement(list1);
//        System.out.println("\nAusgabe TreeSet: ");
//        Main.getElement(set1);
//        System.out.println("\nAusgabe HashSet: ");
//        //Main.getElement(set2);
//        //System.out.println("\nAusgabe LinkedHashSet: ");
//        Main.getElement(set3);
//
//
//    }
//    public static void getElement(Collection<String> collection){
//        for (String string : collection){
//            System.out.println(string);
//        }
//
//    }
}
