package fifth;

public class Rational implements Comparable {
    private int x;
    private int y;

    public Rational() throws Exception {
        this(0, 1);
    }

    public Rational(Rational r) {
        this.x = r.x;
        this.y = r.y;
    }
    
    public Rational(int x, int y) throws Exception {
        if (y == 0) {
            throw new Exception("분모는 0이 될 수 없습니다!");
        }

        if (y < 0) {
            x *= -1;
            y *= -1;
        }
        
        this.x = x;
        this.y = y;

        if (x != 0) {
            int common = gcd(Math.abs(x), y);
            this.x = this.x / common;
            this.y = this.y / common;
        } 
    }

    public Rational(int num) throws Exception {
        this(num, 1);
    }

    public void setNumerator(int x) {
        this.x = x;
    }
    
    public void setDenomiator(int y) {
        this.y = y;
    } 

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getNumerator() {
        return this.x;
    }
    
    public int getDenominator() {
        return this.y;
    }

    public float get(Rational op) {
        float result = (float)op.x / op.y;

        return result;
    }

    public boolean equals(Rational op) {
        if (op.x != 0) {
            int common = gcd(Math.abs(op.x), op.y);
            op.x = op.x / common;
            op.y = op.y / common;
        }

        return (this.x == op.getNumerator() && this.y == op.getDenominator());
    }

    public Rational reciprocal() throws Exception {
        return new Rational(this.y, this.x);
    }

    private int gcd(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        
        return num1;
    }

    Rational add(Rational op) throws Exception {
        int y = this.y * op.getDenominator();
        int x1 = this.x * op.getDenominator();
        int x2 = op.getNumerator() * this.y;
        return new Rational(x1+x2, y);
    }

    Rational substract(Rational op) throws Exception {
        int y = this.y * op.getDenominator();
        int x1 = this.x * op.getDenominator();
        int x2 = op.getNumerator() * this.y;
        return new Rational(x1-x2, y);
    }

    Rational multiply(Rational op) throws Exception {
        int x = this.x * op.getNumerator();
        int y = this.y * op.getDenominator();
        return new Rational(x, y);
    }

    Rational divide(Rational op) throws Exception {
        return multiply(op.reciprocal());
    }
    
    Rational exponent(int pow) throws Exception {
        int x = (int) Math.pow(this.x, pow);
        int y = (int) Math.pow(this.y, pow);
        return new Rational(x, y);
    }
    
    Rational negate() throws Exception {
        return new Rational(-this.x, this.y);
    }

    @Override
    public int compareTo(Object o) {
        float a = get(this);
        float b = get((Rational)o);
        float result = a-b;
        
        if (result > 0) {
            return 1;
        } else if (result == 0) {
            return 0;
        } else {
            return -1;
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        if (x == 0) {
            return "0";
        } else if (y == 1) {
            result = x + "";
        } else {
            result = x + "/" + y;
        }
        
        return result;
    }

}
