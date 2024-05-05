package Oops.Questions.Q_2;

public class ComplexNumbers {
    int real, imag;

    ComplexNumbers(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public void plus(ComplexNumbers c2) {
        this.real += c2.real;
        this.imag += c2.imag;
    }

    public void multiply(ComplexNumbers c2) {
        int a;
        a = this.real;
        this.real = (this.real * c2.real) - (this.imag * c2.imag);
        this.imag = (a * c2.imag) + (this.imag * c2.real);
    }

    public void print() {
        if (this.imag < 0) {
            System.out.println(this.real + " + -i" + -(this.imag));
        } else {
            System.out.println(this.real + " + i" + this.imag);
        }
    }
}
