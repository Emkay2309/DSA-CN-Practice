package JAVA.OOPS.ComplexNumber;

import JAVA.OOPS.Fraction.Fraction;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void print (){

        if(this.imaginary > 0){
            System.out.println(real+" + i"+imaginary);
        }else{
            System.out.println(real+""+imaginary+"i");
        }

    }

    public void add (ComplexNumber n2){
        this.real = this.real+n2.real;
        this.imaginary = this.imaginary+ n2.imaginary;
    }

    public void multiply (ComplexNumber n2){
        int real = this.real*n2.real - this.imaginary*n2.imaginary;
        int imaginary = this.imaginary*n2.real+ this.real*n2.imaginary;
        this.real=real;
        this.imaginary=imaginary;
    }

    public static ComplexNumber add(ComplexNumber n1 , ComplexNumber n2){
        int real = n1.real+n2.real;
        int imaginary = n1.imaginary+n2.imaginary;
        return new ComplexNumber(real,imaginary);
    }

    public ComplexNumber conjugate(){
        int real = this.real;
        int imaginary = -1 * this.imaginary;
        return new ComplexNumber(real,imaginary);
    }




}
