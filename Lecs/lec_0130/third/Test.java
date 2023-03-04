package third;

public class Test {
     
}

class Date {
    int year, month;
    String day;
    
    public Date() {
        
    } 
    
    public Date(int year, int month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
}

class ExtendedDate extends Date {
    String dateName;

    public ExtendedDate(int year, int month, String day, String dateName) {
        super(year, month, day);
        this.dateName = dateName;
    }

}
