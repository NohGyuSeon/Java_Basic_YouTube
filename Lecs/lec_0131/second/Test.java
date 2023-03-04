package second;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Lecture<Student> lecture = new Lecture<Student>();
        // Lecture<SpaceRanger> lecture2 = new Lecture<SpaceRanger>();

        lecture.add(new Student(1, "NGS"));
        lecture.add(new Student(2, "Paloma"));
        lecture.add(new Student(3, "James"));

        // lecture2.add(new SpaceRanger(1, "NGS", "NHN"));
        // lecture2.add(new SpaceRanger(2, "Paloma", "NHN"));
        // lecture2.add(new SpaceRanger(3, "James", "NHN"));

        // while (lecture.iterator().hasNext()) {
        //     System.out.println(lecture.iterator().next());
        // }

        Iterator iter = lecture.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("==============================");

       for (Student student : lecture) {
            System.out.println(student.toString());        
       }

         
    }    
}
