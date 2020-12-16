import java.util.*;

public class SortedSetList {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<String>();

        list1.add("Peter");
        list1.add("Adrian");
        list1.add("Michi");
        list1.add("Peter");
        list1.add("Bernt");

        for (String string : list1) {
            System.out.println(string);
        }

        Collections.sort(list1);

        System.out.println("\nSortiert");
        for (String string : list1) {
            System.out.println(string);
        }

        List<Kontakt> list2 = new ArrayList<Kontakt>();
        list2.add(new Kontakt("Peter", "6465454"));
        list2.add(new Kontakt("Chris", "64655454454"));
        list2.add(new Kontakt("Adrian", "6498746565454"));

        System.out.println("\n\n\nListe unsortiert: ");

        for (Kontakt kontakt : list2) {
            System.out.println(kontakt.getName() + " Tel-Nr: " + kontakt.getTelefonNummer());
        }

        //Collections.sort(list2);

    }
}
