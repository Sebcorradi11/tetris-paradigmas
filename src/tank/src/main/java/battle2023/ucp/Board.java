package battle2023.ucp;
import java.util.Arrays;
import java.util.Random;


public class Board extends Tetris1{

    public int[][] tablero;
    private Random random;
    public int piezaAleatoriaColumn;
    public PieceBase piezaAleatoria;
    public int pieceFila;




    public Board() {
        tablero = new int[10][20];
        random = new Random();
        pieceFila = 0; // Agrega esta línea para inicializar pieceFila
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                tablero[i][j] = 0;
            }
        }
        insertarPiezaAleatoria();
        agregarPiezas();
    }

    public Board(int[][] tablero) {
        this.tablero = tablero;
        // Resto de la inicialización del tablero y otros miembros
    }
    public int getAncho(){
        return tablero.length;
    } 
    public int getAlto(){
        return tablero[0].length;
    }
    public int[][] getBoard(){
        return this.tablero;
    }
    

    public int getCelda(int x, int y){
        return tablero[x][y];
    }
    public int posiciones(int fila, int columna) {
        return tablero[columna][fila];
    }

            public void agregarPiezas() {
                // Genera una nueva pieza aleatoria
                insertarPiezaAleatoria();
            
                for (int fila = 0; fila < 4; fila++) {
                    for (int col = 0; col < 4; col++) {
                        if (piezaAleatoria.matriz[fila][col] == 1) {
                            int boardRow = pieceFila + fila;
                            int boardCol = piezaAleatoriaColumn + col;
            
                            if (boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10) {
                                tablero[boardRow][boardCol] = 1;
                            }
                        }
                    }
                }
            }
        

    public void insertarPiezaAleatoria() {
        int anchoTablero = getAncho();
        int x = random.nextInt(anchoTablero);
    
        int numeroAleatorio = random.nextInt(5);
    
        // Asignar la pieza aleatoria seleccionada al miembro piezaAleatoria
        switch (numeroAleatorio) {

            case 0:
                piezaAleatoria = new PieceDog();
                break;
            case 1:
                piezaAleatoria = new PieceL();
                break;
            case 2:
                piezaAleatoria = new PieceSquare();
                break;
            case 3:
                piezaAleatoria = new PieceStick();
                break;
            case 4:
                piezaAleatoria = new PieceT();
                break;
        }
    
        // Asignar la columna aleatoria
        piezaAleatoriaColumn = x;
    }
public void limpiarPieza(){
    for(int fila = 0; fila  < 4; fila++){
        for(int col = 0; col < 4; col++){
            if(piezaAleatoria.matriz[fila][col] == 1){
                int boardRow = pieceFila + fila;
                int boardCol =  piezaAleatoriaColumn + col;

                if(boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10){
                    tablero[boardRow][boardCol] = 0;
                }
            }
        }
    }
}

public boolean puedeMoverPiezaAbajo (PieceBase pieza) {
    if (pieza == null) {
        return false;
    }
    return true;
}
public void insertarPiezaEnLaParteSuperior(PieceBase pieza) {
    int anchoTablero = getAncho();

    int x = (anchoTablero - pieza.getAncho()) / 2;
    int y = 0;

    for(int i=0; i < pieza.getAncho(); i++){
        for(int j=0; j < pieza.getAlto(); j++)
            if (pieza.getCelda(i, j) == 1 ){
                tablero[x + i][y + j] = 1;
            }
    }
}
    public int[][] getTablero() {
        return tablero;
    }

    public void moverPiezaAbajo() {
        limpiarPieza();
        pieceFila++; // Mueve la pieza una fila hacia abajo

        // Verifica si la nueva posición de la pieza es válida
        if (esMovimientoValido()) {
            agregarPiezas();
        } else {
            // Si el movimiento no es válido, restaura la posición anterior
            pieceFila--;
            agregarPiezas();
            bloquearPiezaEnLugar();
        }
    }
       
    public void bloquearPiezaEnLugar() {
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {
                if (piezaAleatoria.matriz[fila][col] == 1) {
                    int boardRow = pieceFila + fila;
                    int boardCol = piezaAleatoriaColumn + col;
    
                    if (boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10) {
                        tablero[boardRow][boardCol] = 1;
                    }
                }
            }
        }
    }
    public boolean esMovimientoValido() {
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {
                if (piezaAleatoria.getCelda(fila, col) == 1) {
                    int boardRow = pieceFila + fila;
                    int boardCol = piezaAleatoriaColumn + col;
    
                    if (boardRow >= 20 || boardCol < 0 || boardCol >= 10 || (boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10))
                        return false;
                }
            }
        }
        return true;
    }
    public boolean puedeRotarDerecha() {
        int[][] tempBoard = new int[20][10];
    
        // Copia el tablero actual a una matriz temporal
        for (int i = 0; i < 20; i++) {
            tempBoard[i] = Arrays.copyOf(tablero[i], 10);
        }
    
        // Realiza una copia de la posición actual de la pieza
        int tempFila = pieceFila;
        int tempColumna = piezaAleatoriaColumn;
    
        // Realiza la rotación hacia la derecha en la matriz temporal
        piezaAleatoria.rotateRight();
    
        // Verifica si la rotación es válida
        boolean esValida = esMovimientoValido(tempFila, tempColumna, piezaAleatoria, tempBoard);
    
        // Restaura la posición de la pieza
        piezaAleatoria.rotateLeft();
    
        return esValida;
    }
    public boolean puedeRotarIzquierda() {
        int[][] tempBoard = new int[20][10];
    
        // Copia el tablero actual a una matriz temporal
        for (int i = 0; i < 20; i++) {
            tempBoard[i] = Arrays.copyOf(tablero[i], 10);
        }
    
        // Realiza una copia de la posición actual de la pieza
        int tempFila = pieceFila;
        int tempColumna = piezaAleatoriaColumn;
    
        // Realiza la rotación hacia la izquierda en la matriz temporal
        piezaAleatoria.rotateLeft();
    
        // Verifica si la rotación es válida
        boolean esValida = esMovimientoValido(tempFila, tempColumna, piezaAleatoria, tempBoard);
    
        // Restaura la posición de la pieza
        piezaAleatoria.rotateRight();
    
        return esValida;
    }
    
    private boolean esMovimientoValido(int fila, int columna, PieceBase pieza, int[][] board) {
         // Obtén las dimensiones de la pieza
    int piezaAncho = pieza.getAncho();
    int piezaAlto = pieza.getAlto();

    // Verifica si la nueva posición de la pieza está dentro de los límites del tablero
    if (fila < 0 || fila + piezaAlto > board.length || columna < 0 || columna + piezaAncho > board[0].length) {
        return false; // La pieza se sale del tablero
    }

    // Verifica si la pieza colisiona con otras piezas en el tablero
    for (int i = 0; i < piezaAlto; i++) {
        for (int j = 0; j < piezaAncho; j++) {
            if (pieza.getCelda(i, j) == 1) {
                int boardRow = fila + i;
                int boardCol = columna + j;

                // Verifica si la celda del tablero está ocupada por otra pieza
                if (board[boardRow][boardCol] == 1) {
                    return false; // Colisión con otra pieza
                }
            }
        }
    }

    return true; // La pieza puede moverse a la nueva posición
}

public boolean esPosibleRotarIzquierda(int fila, int columna, int[][] board) {
    // Crea una matriz temporal para representar la pieza rotada
    int[][] rotatedPiece = new int[4][4];

    // Copia la pieza actual a la matriz temporal
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            rotatedPiece[i][j] = tablero[i][j];
        }
    }

    // Realiza una rotación hacia la izquieda en la matriz temporal
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            rotatedPiece[i][j] = tablero[j][3 - i];
        }
    }

    // Verifica si la rotación es válida
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            if (rotatedPiece[i][j] == 1) {
                int boardRow = fila + i;
                int boardCol = columna + j;

                // Verifica si la pieza se sale del tablero o colisiona con otra pieza
                if (boardRow < 0 && boardRow >= 20 &&  boardCol < 0 && boardCol >= 10 && board[boardRow][boardCol] == 1) {
                    return false;
                }
            }
        }
    }

    return true;
}
private boolean filaCompleta(int fila) {
    for (int col = 0; col < 10; col++) {
        if (tablero[col][fila] != 1) {
            return false;
        }
    }
    return true;
}
private void eliminarFila(int fila) {
    for (int i = fila; i > 0; i--) {
        for (int j = 0; j < 10; j++) {
            tablero[j][i] = tablero[j][i - 1];
        }
    }
    // Limpia la fila superior
    for (int j = 0; j < 10; j++) {
        tablero[j][0] = 0;
    }
}
    public void bloqueaPiezayVerificaSiHayFilaLlena() {
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {
                if (piezaAleatoria.matriz[fila][col] == 1) {
                    int boardRow = pieceFila + fila;
                    int boardCol = piezaAleatoriaColumn + col;
    
                    if (boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10) {
                        tablero[boardRow][boardCol] = 1;
                    }
                }
            }
        }
        
        // Llama al método para verificar y eliminar filas completas
        for (int fila = 0; fila < 20; fila++) {
            if (filaCompleta(fila)) {
                eliminarFila(fila);
            }
        }

}

public boolean juegoTerminado() {
    // Verifica las primeras filas del tablero para determinar si no se pueden ingresar más piezas
    for (int fila = 0; fila < 1; fila++) {
        for (int col = 0; col < tablero[fila].length; col++) {
            if (tablero[fila][col] == 1) {
                return true; // La primera fila no está llena, el juego sigue
            }
        }
    }
    return false; // No hay filas ocupadas en las primeras filas, el juego continúa
}
public boolean juegoTerminaCompletada5Lineas() {
    int lineasCompletas = 0;

    // Verifica si cada fila del tablero está completamente llena
    for (int fila = 0; fila < 20; fila++) {
        boolean filaCompleta = true;
        for (int col = 0; col < 10; col++) {
            if (tablero[col][fila] == 0) {
                filaCompleta = false;
                break; // Si una celda de la fila no está llena, la fila no está completa
            }
        }
        if (filaCompleta) {
            lineasCompletas++;
        }
    }

    // Verifica si se han completado al menos 5 líneas
    return lineasCompletas >= 5;
}



public void printBoard() {
    for (int fila = 0; fila < getAlto(); fila++) {
        for (int columna = 0; columna < getAncho(); columna++) {
            if (tablero[columna][fila] == 0) {
                // Si la celda está vacía, imprime un espacio en blanco
                System.out.print(" ");
            } else {
                // Si la celda está ocupada, imprime un carácter para representarla, como "X"
                System.out.print("X");
            }
        }
        // Salto de línea al final de cada fila para imprimir correctamente el tablero
        System.out.println();
    }
}
}
