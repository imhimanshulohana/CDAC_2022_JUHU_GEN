import java.util.*;
class Complex{
    int real, imaginary;

    Complex()
    {
    }

    Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex addComp(Complex C1, Complex C2)             // for adding two complex number
    {
        Complex temp = new Complex();

        temp.real = C1.real + C2.real;                  // adding real part of complex numbers
        temp.imaginary = C1.imaginary + C2.imaginary;   // adding Imaginary part of complex numbers

        return temp;                                    // returning the sum
    }

    Complex mulComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();

        temp.real = (C1.real * C2.real) - (C1.imaginary * C2.imaginary);
        temp.imaginary = (C1.real * C2.imaginary) + (C1.imaginary * C2.real);
        return temp;
    }


    Complex divComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();

        temp.real = (C1.real * C2.real) + (C1.imaginary * C2.imaginary) * ((C1.imaginary * C2.real) - (C1.real * C2.imaginary));
        temp.imaginary = (C2.real * C2.real) + (C2.imaginary * C2.imaginary);

        return temp;
    }

    Complex subtractComp(Complex C1, Complex C2)
    {
        // creating temporary variable
        Complex temp = new Complex();

        // subtracting real part of complex numbers
        temp.real = C1.real - C2.real;

        // subtracting Imaginary part of complex numbers
        temp.imaginary = C1.imaginary - C2.imaginary;

        // returning the difference
        return temp;
    }

    void printComplexNumber()
    {
        System.out.println("Complex number: " + real + " + " + imaginary + "i");
    }
}

public class Complexx{
    public static void main(String[] args)
    {

        Complex C1 = new Complex(3, 2);     // First Complex number
        C1.printComplexNumber();            // printing first complex number

        Complex C2 = new Complex(9, 5);
        C2.printComplexNumber();

        // for Storing the sum
        Complex C3 = new Complex();
        C3 = C3.addComp(C1, C2);

        // printing the sum
        System.out.print("Sum of ");
        C3.printComplexNumber();


        C3 = C3.mulComp(C1, C2);
        // printing the mul
        System.out.print("mul of ");
        C3.printComplexNumber();

        C3 = C3.divComp(C1, C2);
        // printing the mul
        System.out.print("div of ");
        C3.printComplexNumber();



        // calling subtractComp() method
        C3 = C3.subtractComp(C1, C2);
        System.out.print("Difference of ");
        C3.printComplexNumber();
    }
}
