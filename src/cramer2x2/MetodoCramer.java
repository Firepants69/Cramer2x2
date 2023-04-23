package cramer2x2;


import cramer2x2.Fraccion;



public class MetodoCramer {
    Fraccion f1 = new Fraccion();
    private final int filas = 3;
    private final int columnas = 4;
    private Fraccion matriz[][] = new Fraccion[filas][columnas];

    public MetodoCramer() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = new Fraccion();
            }
        }
    }

    public void llenarmatriz00(int posicion00) {
        matriz[0][0].setNumerador(posicion00);
        matriz[0][0].setDenominador(1);
    }

    public void llenarmatriz01(int posicion01) {
        matriz[0][1].setNumerador(posicion01);
        matriz[0][1].setDenominador(1);
    }

    public void llenarmatriz10(int posicion10) {
        matriz[1][0].setNumerador(posicion10);
        matriz[1][0].setDenominador(1);
    }

    public void llenarmatriz03(int posicion03) {
        matriz[0][3].setNumerador(posicion03);
        matriz[0][3].setDenominador(1);
    }

    public void llenarmatriz13(int posicion13) {
        matriz[1][3].setNumerador(posicion13);
        matriz[1][3].setDenominador(1);
    }

    public void llenarmatriz20(int posicion20) {
        matriz[2][0].setNumerador(posicion20);
        matriz[2][0].setDenominador(1);
    }

    public void llenarmatriz21(int posicion21) {
        matriz[2][1].setNumerador(posicion21);
        matriz[2][1].setDenominador(1);
    }

    public void llenarmatriz22(int posicion22) {
        matriz[2][2].setNumerador(posicion22);
        matriz[2][2].setDenominador(1);
    }

    public void llenarmatriz23(int posicion23) {
        matriz[2][3].setNumerador(posicion23);
        matriz[2][3].setDenominador(1);
    }

    public void llenarmatriz11(int posicion11) {
        matriz[1][1].setNumerador(posicion11);
        matriz[1][1].setDenominador(1);
    }

    public void llenarmatriz02(int pocision02) {
        matriz[0][2].setNumerador(pocision02);
        matriz[0][2].setDenominador(1);
    }

    public void llenarmatriz12(int pocision12) {
        matriz[1][2].setNumerador(pocision12);
        matriz[1][2].setDenominador(1);
    }

    private Fraccion deltaS2x2() {
        return (matriz[0][0].multiplicacion(matriz[1][1]).resta(matriz[0][1]).multiplicacion(matriz[1][0]));
    }

    public boolean SePuedeResolver2x2() {
        int s = Integer.valueOf(formaString(deltaS2x2()));
        return s != 0;
    }

    public boolean SePuedeResolver3x3() {
        int s = Integer.valueOf(formaString(deltaS3x3()));
        return s != 0;
    }

    public String X2x2() {
        Fraccion f1 = new Fraccion();
        f1 = matriz[0][2].multiplicacion(matriz[1][1]).resta(matriz[1][2].multiplicacion(matriz[0][1]));
        Fraccion f2 = new Fraccion();
        f2 = f1.dividir(deltaS2x2());
        return formaString(f2);
    }

    public String Y2x2() {
        Fraccion f1 = new Fraccion();
        f1 = matriz[0][0].multiplicacion(matriz[1][2]).resta(matriz[1][0].multiplicacion(matriz[0][2]));
        Fraccion f2 = new Fraccion();
        f2 = f1.dividir(deltaS2x2());
        return formaString(f2);
    }

    private Fraccion determinante3x3(Fraccion matriz[][]) {
        f1 = matriz[0][0].multiplicacion(matriz[1][1], matriz[2][2])
                .suma(matriz[0][1].multiplicacion(matriz[1][2], matriz[2][0]))
                .suma(matriz[0][2].multiplicacion(matriz[1][0], matriz[2][1]))
                .resta(matriz[0][2].multiplicacion(matriz[1][1], matriz[2][0]))
                .resta(matriz[0][1].multiplicacion(matriz[1][0], matriz[2][2]))
                .resta(matriz[0][0].multiplicacion(matriz[1][2], matriz[2][1]));
        return f1;
    }

    private Fraccion[][] matrizDelta() {
        Fraccion matrizDelta[][] = new Fraccion[3][3];
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz[i].length; j++) {
                if (j < 3) {
                    matrizDelta[i][j] = this.matriz[i][j];
                }
            }
        }
        return matrizDelta;
    }

    private Fraccion deltaS3x3() {
        return determinante3x3(matrizDelta());
    }

    private Fraccion X3x31() {
        Fraccion matrizDeltax[][] = matrizDelta();
        for (int i = 0; i < 3; i++) {
            matrizDeltax[i][0] = matriz[i][3];
        }
        return determinante3x3(matrizDeltax).dividir(deltaS3x3());

    }

    // este metodo genera Y dividiendo el determinante de Y entre el determinante de
    // delta S
    private Fraccion Y3x31() {
        Fraccion matrizDeltaY[][] = matrizDelta();
        for (int i = 0; i < matriz.length; i++) {
            matrizDeltaY[i][1] = matriz[i][3];
        }
        return determinante3x3(matrizDeltaY).dividir(deltaS3x3());
    }

    private Fraccion Z3x31() {
        Fraccion matrizDeltaZ[][] = matrizDelta();
        for (int i = 0; i < 3; i++) {
            matrizDeltaZ[i][2] = matriz[i][3];
        }
        return determinante3x3(matrizDeltaZ).dividir(deltaS3x3());
    }

    private String formaString(Fraccion forma) {
        if (forma.getNumerador() % forma.getDenominador() == 0) {
            int resultado = forma.getNumerador() / forma.getDenominador();
            String resultadoS = String.valueOf(resultado);
            return resultadoS;
        } else {
            String numerador = String.valueOf(Simplificar(forma).getNumerador());
            String denominador = String.valueOf(Simplificar(forma).getDenominador());
            return numerador + "/" + denominador;
        }
    }

    public String X3x3() {
        return formaString(X3x31());
    }

    public String Y3x3() {
        return formaString(Y3x31());
    }

    public String Z3x3() {
        return formaString(Z3x31());
    }

    private Fraccion Simplificar(Fraccion f1) {
        Fraccion f2 = new Fraccion();
        int mcd = maximoComunDivisor(f1);
        f2.setNumerador(f1.getNumerador() / mcd);
        f2.setDenominador(f1.getDenominador() / mcd);
        return f2;
    }

    private int maximoComunDivisor(Fraccion f1) {

        if (f1.getDenominador() == 0) {
            return f1.getNumerador();
        } else {
            return gcd(f1.getDenominador(), f1.getNumerador() % f1.getDenominador());
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}