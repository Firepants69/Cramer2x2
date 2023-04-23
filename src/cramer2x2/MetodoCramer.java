package cramer2x2;


import cramer2x2.Fraccion;



public class MetodoCramer {
    //inicia objeto fraccion 
    Fraccion f1 = new Fraccion();
    private final int filas = 3;
    private final int columnas = 4;
    //crea una matriz de objetos de tipo fraccion para hacer operaciones con ella
    private Fraccion matriz[][] = new Fraccion[filas][columnas];

    public MetodoCramer() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = new Fraccion();
            }
        }
    }
      //para llenar la matriz de 3x4 que uso en los dos casos
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
    //yo le puse delta S pero se trata de la determinante de lq primer matriz aqui no use ningun for o bucle debido a que eran operaciones bastante sencillas
    // de igual forma se nota que uso una matriz de objetos fraccion debido a que al hacerlo con decimales el resultado no queda igual de limpio a mi parecer
    // y transformar decimales grandes a fraccion es mas dificil los objetos fraccion son una clase a parte en la cual vienen con varios metodos de operaciones
    // basicas de fracciones
    private Fraccion deltaS2x2() {
        return (matriz[0][0].multiplicacion(matriz[1][1]).resta(matriz[0][1]).multiplicacion(matriz[1][0]));
    }
    // estos dos metodos son publicos y no privados y no estan siendo usados por lo demas por una cosa importante, lo programe en la interfaz XD y solo los uso ahí
    public boolean SePuedeResolver2x2() {
        int s = Integer.valueOf(formaString(deltaS2x2()));
        return s != 0;
    }

    public boolean SePuedeResolver3x3() {
        int s = Integer.valueOf(formaString(deltaS3x3()));
        return s != 0;
    }
    //estos dos metodos son ya la resolucion y usan otros varios para verse mejor evidentemente, en esta caso lo unico que hace es calcular la matriz de X y Y 
    // y dividirla por la matriz original usando los metodos de fracciones evidentemente y por ultimo usa el metodo formaString() el cual primero que nada convierte un 
    //objeto fraccion a string pero antes de eso simplifica la fraccion o la vuelve entero dependiendo del caso
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
    //este metodo esta bien aburrido pero es lo mas obvio y lo mas optimo para tomar en cuenta en este caso genera el determinante pero en forma de fraccion
    private Fraccion determinante3x3(Fraccion matriz[][]) {
        f1 = matriz[0][0].multiplicacion(matriz[1][1], matriz[2][2])
                .suma(matriz[0][1].multiplicacion(matriz[1][2], matriz[2][0]))
                .suma(matriz[0][2].multiplicacion(matriz[1][0], matriz[2][1]))
                .resta(matriz[0][2].multiplicacion(matriz[1][1], matriz[2][0]))
                .resta(matriz[0][1].multiplicacion(matriz[1][0], matriz[2][2]))
                .resta(matriz[0][0].multiplicacion(matriz[1][2], matriz[2][1]));
        return f1;
    }
    //ahora este metodo genera la matriz origal a traves de llenar una matriz de 3x3 por los datos de matriz que llenas en la interfaz que es 3x4
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
    //este metodo genera deltaS pero es el resultado de sacar la determinante de la matriz original
    private Fraccion deltaS3x3() {
        return determinante3x3(matrizDelta());
    }
    //este otro metodo calcula X a partir de usar la matriz delta creada con un metodo anteriormente, intercambiado los valores de la fila 3 de la matriz de 3x4
    // por la fila 0 de esta nueva matriz llamada matrizDeltaX luego le saca la determinante con el mismo metodo que creamos antes y lo divide por la determinante de la
    //matriz original
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
    //este meotdo hace lo mismo que los otros 3 pero con Z
    private Fraccion Z3x31() {
        Fraccion matrizDeltaZ[][] = matrizDelta();
        for (int i = 0; i < 3; i++) {
            matrizDeltaZ[i][2] = matriz[i][3];
        }
        return determinante3x3(matrizDeltaZ).dividir(deltaS3x3());
    }
    //este metodo se trata del que le da forma a las fracciones y me permite poder mostrarlas de forma adecuada
    //utliza varios metodos dentro de si mismo uno de ellos es el de simplificar fracciones y un if para que cuando el residuo de la division de numerador y el denominador
    //sea 0 estos se dividan entre si, con eso lo transformaria a enteros.
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
    //metodos para visualizar las respuestas de cramer 3x3
    public String X3x3() {
        return formaString(X3x31());
    }

    public String Y3x3() {
        return formaString(Y3x31());
    }

    public String Z3x3() {
        return formaString(Z3x31());
    }
    //metodo que usa otro metodo que calcula el maximo comun divisor y luego divide tanto al numerador como al denominador por el.
    private Fraccion Simplificar(Fraccion f1) {
        Fraccion f2 = new Fraccion();
        int mcd = maximoComunDivisor(f1);
        f2.setNumerador(f1.getNumerador() / mcd);
        f2.setDenominador(f1.getDenominador() / mcd);
        return f2;
    }
    //metodos encargados de obtener el maximo comun divisor no estan en la clase de fracciones porque se me olvido y ya los puse aqui a lo ultimo
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