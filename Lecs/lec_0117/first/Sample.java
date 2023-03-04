package Lecs.lec_0117.first;

public class Sample {
    int i;

    public void doSomething() {
        // value 값 타입, stack 영역에 데이터 저장
        // int j;
        // j = 5;
        // int k = j;
        // j = 10;

        // reference 참조 타입, heap 영역에 데이터 저장
        int[] j = {2, 3};
        int[] k = j;
        j[0] = 10;
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.doSomething();
    }

}
