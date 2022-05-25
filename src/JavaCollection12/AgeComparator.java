package JavaCollection12;

import java.util.Comparator;

//Tạo lớp AgeComparator thực thi giao diện Comparator

public class AgeComparator implements Comparator<Studentcomp> {
    @Override
    public int compare(Studentcomp o1, Studentcomp o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge() == o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}