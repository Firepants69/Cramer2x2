package cramer2x2;


public class Fraccion {

    private int numerador;
    private int denominador;

public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        if (denominador < 0) {
            numerador *= -1;
            denominador *= -1;
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion suma(Fraccion otra1, Fraccion otra2) {
        Fraccion suma1 = this.suma(otra1);
        Fraccion suma2 = suma1.suma(otra2);
        return suma2;
    }

    public Fraccion suma(Fraccion otra) {
        int mcm = mcm(this.denominador, otra.denominador);
        int num1 = this.numerador * (mcm / this.denominador);
        int num2 = otra.numerador * (mcm / otra.denominador);
        int resultado = num1 + num2;
        return new Fraccion(resultado, mcm);
    }

    public Fraccion multiplicacion(Fraccion otra1, Fraccion otra2) {
        Fraccion producto1 = this.multiplicacion(otra1);
        Fraccion producto2 = producto1.multiplicacion(otra2);
        return producto2;
    }

    public Fraccion multiplicacion(Fraccion otra) {
        int num = this.numerador * otra.numerador;
        int den = this.denominador * otra.denominador;
        return new Fraccion(num, den);
    }

    private int mcm(int a, int b) {
        return (a * b) / mcd(a, b);
    }

    private int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public static Fraccion crearFraccion(int numerador, int denominador) {
        return new Fraccion(numerador, denominador);
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        if (denominador < 0) {
            this.numerador *= -1;
            denominador *= -1;
        }
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        if (denominador == 1) {
            return String.valueOf(numerador);
        } else {
            return numerador + "/" + denominador;
        }
    }

    public Fraccion resta(Fraccion otra) {
        int mcm = mcm(this.denominador, otra.denominador);
        int num1 = this.numerador * (mcm / this.denominador);
        int num2 = otra.numerador * (mcm / otra.denominador);
        int resultado = num1 - num2;
        return new Fraccion(resultado, mcm);
    }

    public Fraccion resta(Fraccion otra1, Fraccion otra2) {
        Fraccion resta1 = this.resta(otra1);
        Fraccion resta2 = resta1.resta(otra2);
        return resta2;
    }

    public Fraccion dividir(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador;
        int nuevoDenominador = this.denominador * otra.numerador;
        return new Fraccion(nuevoNumerador, nuevoDenominador);
    }

}