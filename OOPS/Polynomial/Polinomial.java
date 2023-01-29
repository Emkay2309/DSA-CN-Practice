package JAVA.OOPS.Polynomial;

import JAVA.OOPS.DynamicArray.DynamicArray;

public class Polinomial {
    DynamicArray coefficients;

    public Polinomial(){
        coefficients = new DynamicArray();
    }

    public void setCoefficients(int deg, int coeff){
        if(deg >= coefficients.size()){
            for(int i = coefficients.size();i<deg;i++){
                coefficients.add(0);
            }
        }
        coefficients.set(deg,coeff);
    }

    public int getCoefficients(int deg){
        return coefficients.get(deg);
    }

    public int degree(){
        return coefficients.size()-1;
    }

    public void add (Polinomial p2){
        for(int i =0;i<=p2.degree();i++){
            this.setCoefficients(i,this.getCoefficients(i)+p2.getCoefficients(i));
        }
    }

    public void multiply(Polinomial p2){
        for (int i = 0; i <this.degree(); i++) {
            for (int j = 0; j <p2.degree() ; j++) {
                int termdeg = i+j;
                int termCoeff = this.getCoefficients(i)* p2.getCoefficients(j);
                int oldCoeff = this.getCoefficients(termdeg);
                this.setCoefficients(termdeg,termCoeff+oldCoeff);
            }
        }
    }

    public void print(){
        for(int i =0;i<coefficients.size();i++){

            if(coefficients.get(i)!=0){
                System.out.print(this.getCoefficients(i)+"x"+i+"+");
            }

        }
    }
}
