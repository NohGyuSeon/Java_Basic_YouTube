package first;

public class Test {
    public static void main(String[] args) {
        Lecture lecture = new Lecture(3);
        lecture.student[0] = new Student(1, "NGS");
        lecture.student[1] = new Student(2, "Paloma");
        lecture.student[2] = new Student(3, "James");

        for (int i = 0; i < lecture.size(); i++) {
            System.out.println(lecture.student[i]);;
        }

        System.out.println("===============================");

        for (Object s : lecture) {
            System.out.println(s);
        }
        
        System.out.println("===============================");
        
        LectureIterator lectureIterator = new LectureIterator(lecture);

        for (int i = 0; i < lecture.size(); i++) {
            if(lectureIterator.hasNext()) {
                System.out.println(lectureIterator.next());
            }
        }
        
    }    
}
