package JavaCollection12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Maincomp {
    public static void main(String[] args) {
        Studentcomp student = new Studentcomp("Kien", 30, "HT");
        Studentcomp student1 = new Studentcomp("Nam", 26, "HN");
        Studentcomp student2 = new Studentcomp("Anh", 38, "HT" );
        Studentcomp student3 = new Studentcomp("Tung", 38, "HT" );

        List<Studentcomp> lists = new ArrayList<>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        Collections.sort(lists);
        for(Studentcomp st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Studentcomp st : lists){
            System.out.println(st.toString());
        }
    }
}
