public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;                                                  //Here the constructor was missing the initilization of 'imaginary' variable
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {                        //Here i have used 'this' keyword to refer to the private class variable
        double newReal = this.real + other.real;                           // I have also remove the Division by zero error, there was noo need for a
        double newImaginary = this.imaginary + other.imaginary;            // division operation
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
                                                                            //EXPLANATION:
    public static void main(String[] args) {                                //  Here i have fixed:
        ComplexNumber num1 = new ComplexNumber(3, 2);                       //      1- Constructor for the ComplexNumber class, it was not setting 
        ComplexNumber num2 = new ComplexNumber(1, -4);                      //         value of 'imaginary variable'.
        ComplexNumber sum = num1.add(num2);                                 //      2- Class method add had a Divide By Zero error, so i removed the
        System.out.println("Sum of complex numbers: " + sum);               //         division operator along wth zero.
    }
}
