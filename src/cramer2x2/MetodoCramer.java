package cramer2x2;


import cramer2x2.Fraccion;

import java.util.Random;

public class MetodoCramer {
    // inicia objeto fraccion
    Fraccion f1 = new Fraccion();
    private final int filas = 4;
    private final int columnas = 5;
    // crea una matriz de objetos de tipo fraccion para hacer operaciones con ella
    private Fraccion matriz[][] = new Fraccion[filas][columnas];

    public MetodoCramer() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = new Fraccion();
            }
        }
    }

    public String GenerarNumerosAleatorios(int min,int max){
         Random rand = new Random();
          int numeroAleatorio = rand.nextInt(max - min + 1) + min;
          return String.valueOf(numeroAleatorio);
    }

    // para llenar la matriz de 4x5 que uso en los dos casos tambien se puede incluir fracciones con este metodo
    public void RellenarMatriz(int fila, int columna, String valor) {
        int pocisionDelSeparador = valor.indexOf("/");
        if (pocisionDelSeparador != -1) {
            String Denominador = valor.substring(pocisionDelSeparador + 1);
            String numerador = valor.split("/")[0];
            matriz[fila][columna].setNumerador(Integer.parseInt(numerador));
            matriz[fila][columna].setDenominador(Integer.parseInt(Denominador));
        } else {
            matriz[fila][columna].setNumerador(Integer.parseInt(valor));
            matriz[fila][columna].setDenominador(1);
        }
    }

  /*
     metodo que calcula la determinante de la primer matriz aqui
     no use ningun for o bucle debido a que eran operaciones bastante sencillas
     de igual forma se nota que uso una matriz de objetos fraccion debido a que al
     hacerlo con decimales el resultado no queda igual de limpio a mi parecer
    y transformar decimales grandes a fraccion es mas dificil los objetos
     fraccion son una clase a parte en la cual vienen con varios metodos de
     operaciones
     basicas de fracciones
    */
    public Fraccion deltaS2x2() {
        return matriz[0][0].multiplicacion(matriz[1][1]).resta(matriz[1][0].multiplicacion(matriz[0][1]));
    }

   /*
     estos dos metodos son publicos y no privados y no estan siendo usados por lo
     demas por una cosa importante, lo programe en la interfaz XD y solo los uso
    ahí*/
    public boolean SePuedeResolver2x2() {
        double s = 0;
        if (formaString(deltaS2x2()).indexOf("/") == -1) {
            s = Double.parseDouble(formaString(deltaS2x2()));
        }else{
            s = deltaS2x2().getNumerador()/deltaS2x2().getDenominador(); 
        }
        return s != 0;
    }

    public boolean SePuedeResolver3x3() {
        double s = 0;
        if (formaString(deltaS3x3()).indexOf("/") == -1) {
            s = Double.parseDouble(formaString(deltaS3x3()));
        }else{
            s = deltaS3x3().getNumerador()/deltaS3x3().getDenominador(); 
        }
        return s != 0;
    }
    

    public boolean sePuedeResolver4x4() {
        double s = 0;
        if (formaString(determinantePrincipal4x4()).indexOf("/") == -1) {
            s = Double.parseDouble(formaString(determinantePrincipal4x4()));
        }else{
            s = determinantePrincipal4x4().getNumerador()/determinantePrincipal4x4().getDenominador(); 
        }
        return s != 0;
    }
    

    /*
     estos dos metodos son ya la resolucion y usan otros varios para verse mejor
     evidentemente, en esta caso lo unico que hace es calcular la matriz de X y Y
     y dividirla por la matriz original usando los metodos de fracciones
     evidentemente y por ultimo usa el metodo formaString() el cual primero que
     nada convierte un
     objeto fraccion a string pero antes de eso simplifica la fraccion o la vuelve
     entero dependiendo del caso*/
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

    /*
     este metodo genera la determinante3x3 a traves de una formula
    */
    private Fraccion determinante3x3(Fraccion matriz[][]) {
        f1 = matriz[0][0].multiplicacion(matriz[1][1], matriz[2][2])
                .suma(matriz[0][1].multiplicacion(matriz[1][2], matriz[2][0]))
                .suma(matriz[0][2].multiplicacion(matriz[1][0], matriz[2][1]))
                .resta(matriz[0][2].multiplicacion(matriz[1][1], matriz[2][0]))
                .resta(matriz[0][1].multiplicacion(matriz[1][0], matriz[2][2]))
                .resta(matriz[0][0].multiplicacion(matriz[1][2], matriz[2][1]));
        return f1;
    }

    /*
     ahora este metodo genera la matriz origal a traves de llenar una matriz de
     3x3 por los datos de matriz que llenas en la interfaz que es 3x4*/
    private Fraccion[][] matrizDelta() {
        Fraccion matrizDelta[][] = new Fraccion[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizDelta[i][j] = matriz[i][j];
            }
        }
        return matrizDelta;
    }

     /*
    este metodo genera deltaS pero es el resultado de sacar la determinante de la
     matriz original
    */
    public Fraccion deltaS3x3() {
        return determinante3x3(matrizDelta());
    }

    /*
    este metodo realiza el cambio de una colunma de la matriz 3x3 por los terminos independientes
    el int columnaCambio es el indice de la columna que vamos a cambiar por los teminos independientes
    */
    private Fraccion [][]cambiarColumna3x3(int columnaCambio){
        Fraccion [][] matrizdeltaX = matrizDelta();
        for (int i = 0; i < 3; i++) {
            matrizdeltaX[i][columnaCambio] = matriz[i][3];
        }
        return matrizdeltaX;
    }
 

     /*
    este metodo se trata del que le da forma a las fracciones y me permite poder
     mostrarlas de forma adecuada
     utliza varios metodos dentro de si mismo uno de ellos es el de simplificar
     fracciones y un if para que cuando el residuo de la division de numerador y
     el denominador
     sea 0 estos se dividan entre si, con eso lo transformaria a enteros.
    */
    public String formaString(Fraccion forma) {
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

    // metodos para visualizar y calcular las respuestas de cramer 3x3
    public String[] resultados3x3(){
        String [] resultados = new String[3];
        for(int i =0;i<3;i++){
            resultados[i] = formaString(determinante3x3(cambiarColumna3x3(i)).dividir(deltaS3x3())); 
        }
        return resultados;
    }

    // obtiene la matriz 4x4 original
    private Fraccion[][] matriz4x4() {
        Fraccion matriz1[][] = new Fraccion[4][4];
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                matriz1[i][j] = matriz[i][j];
            }
        }
        return matriz1;
    }

    // calcula el determinante 4x4
    private Fraccion determinante4x4(Fraccion[][] f1) {
        Fraccion[][] matriz1 = new Fraccion[3][3];
        Fraccion[][] matriz2 = new Fraccion[3][3];
        Fraccion[][] matriz3 = new Fraccion[3][3];
        Fraccion[][] matriz4 = new Fraccion[3][3];
        // cambia los valores de la matriz1 por los deseados
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                matriz1[i - 1][j - 1] = f1[i][j];
            }
        }
        // cambia los valores de la matriz2 por los deseados
        for (int i = 1; i < 4; i++) {
            for (int j = 2; j < 4; j++) {
                matriz2[i - 1][j - 1] = f1[i][j];
            }
        }
        for (int i = 1; i < 4; i++) {
            matriz2[i - 1][0] = f1[i][0];
        }
        // cambia los valores de la matriz3 por los deseados
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                matriz3[i - 1][j] = f1[i][j];
            }
        }
        for (int i = 1; i < 4; i++) {
            matriz3[i - 1][2] = f1[i][3];
        }
        // cambia los valores de la matriz4 por los deseados
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matriz4[i - 1][j] = f1[i][j];
            }
        }
        // formula del determinante 4x4
        return f1[0][0].multiplicacion(determinante3x3(matriz1))
                .resta(f1[0][1].multiplicacion(determinante3x3(matriz2)))
                .suma(f1[0][2].multiplicacion(determinante3x3(matriz3)))
                .resta(f1[0][3].multiplicacion(determinante3x3(matriz4)));
    }

    // metodo para obtener el primer determinante
    public Fraccion determinantePrincipal4x4() {
        Fraccion[][] matriz1 = matriz4x4();
        return determinante4x4(matriz1);
    }
    public String determinante4x4 (){
        return formaString(determinantePrincipal4x4());
    }
    public String determinante3x3(){
        return formaString(deltaS3x3());
    }
    public String determinante2x2(){
        return formaString(deltaS2x2());
    }
    /*
    este metodo hace lo mismo que el cambiarColumna3x3 pero para una matriz 4x4
    */
    private Fraccion [][] cambiarColumna4x4(int columnaCambiada){
        Fraccion[][] matriz1 = matriz4x4();
        for (int i = 0; i < 4; i++) {
            matriz1[i][columnaCambiada] = matriz[i][4];
        }
        return matriz1;
    }

    // metodo para obtener x,y,z,w o x1,x2,x3,x4
   
    public String[] resultados4x4(){
        String [] resultados = new String[4];
        for(int i =0;i<4;i++){
            resultados[i] =formaString(determinante4x4(cambiarColumna4x4(i)).dividir(determinantePrincipal4x4())); 
        }
        return resultados;
    }

     /*
    metodo que usa otro metodo que calcula el maximo comun divisor y luego divide
     tanto al numerador como al denominador por el.
    */
    private Fraccion Simplificar(Fraccion f1) {
        Fraccion f2 = new Fraccion();
        int mcd = maximoComunDivisor(f1);
        f2.setNumerador(f1.getNumerador() / mcd);
        f2.setDenominador(f1.getDenominador() / mcd);
        return f2;
    }

    /*
     * metodos encargados de obtener el maximo comun divisor no estan en la clase de
     * de fraccion porque estos funcionan con objetos y no con entero
     */
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

