package first;

import java.util.Iterator;

public class LectureIterator implements Iterator {
    Lecture lecture;
    int index = 0;

    public LectureIterator(Lecture lecture) {
        this.lecture = lecture;
    }

    @Override
    public boolean hasNext() {
        if (this.index < lecture.size()) {
            return true;
        }

        return false;
    }
    
    @Override
    public Object next() {
        return this.lecture.student[this.index++];
    }
    
}
