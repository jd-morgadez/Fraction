
public class Fraction {

    //Global variables
    int numerator;
    int denominator;

    public Fraction() {
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int x) {
        numerator = x;
        denominator = 1;
    }

    public Fraction(int x, int y) {
        numerator = x;
        denominator = y;

        //Checking for zero
        if(denominator == 0) {
            throw new IllegalArgumentException("Can't equal zero.");
        }
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double evaluate() {
        return (double) numerator / denominator;
    }

    public boolean isImproper() {
        if(numerator > denominator) {
            return true;
        } else {
            return false;
        }
    }

    public Fraction multiplyBy(Fraction x) {
        Fraction f = new Fraction(this.numerator*x.numerator, this.denominator*x.denominator);
        return f;
    }

    public void invert() {
        if(numerator == 0) {
            throw new IllegalStateException("Can't equal zero.");
        } else {
            System.out.print(denominator + "/" + numerator);
        }
    }
}
