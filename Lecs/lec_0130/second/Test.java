package second;

class A {
    public void doSomething() {
        System.out.println("A");
    }

    public void doFromA() {
        System.out.println("do From A");
    }
}

class B extends A {
    public void doSomething() {
        System.out.println("B");
    }
}

class C extends B {
    public void doSomething() {
        System.out.println("C");
    }
}

class D extends C {
    public void doSomething() {
        System.out.println("D");
    }
}

public class Test {
    public static void main(String[] args) {
        D d = new D();
        C c = d;
        B b = c;
        A a = b;

        d.doSomething();
        c.doSomething();
        b.doSomething();
        a.doSomething();
        a.doFromA();
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
