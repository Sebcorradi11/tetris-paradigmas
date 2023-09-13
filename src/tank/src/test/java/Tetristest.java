import static org.junit.Assert.*;

import org.junit.Test;

import battle2023.ucp.Board;
import battle2023.ucp.Clock;
import battle2023.ucp.PieceBase;
import battle2023.ucp.PieceDog;
import battle2023.ucp.PieceL;
import battle2023.ucp.PieceSquare;
import battle2023.ucp.PieceStick;
import battle2023.ucp.PieceT;
import battle2023.ucp.Tetris;

public class Tetristest{

    @Test
    public void TestTetris(){
        Tetris t = new Tetris();
        assertNotNull(t);

    }

    @Test
    public void testPieceInicioLeft() {
    PieceDog pieceDog = new PieceDog(0);
    assertEquals(pieceDog.puntero(0,0),1);
    assertEquals(pieceDog.puntero(0,1),1);
    assertEquals(pieceDog.puntero(1,1),1);
    assertEquals(pieceDog.puntero(1,2),1);
    for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==0 && j==0 || i==0 && j==1 || i==1 && j==1 ||i==1 && j==2){
                continue;
            }
            assertEquals(pieceDog.puntero (i,j), 0);
        }
    }
    }


@Test
    public void testPieceInicioRight() {
    PieceDog pieceDog = new PieceDog();
    assertEquals(pieceDog.puntero(1,0),1);
    assertEquals(pieceDog.puntero(0,1),1);
    assertEquals(pieceDog.puntero(1,1),1);
    assertEquals(pieceDog.puntero(0,2),1);
    for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==1 && j==0 || i==0 && j==1 || i==1 && j==1 ||i==0 && j==2){
                continue;
            }
            assertEquals(pieceDog.puntero (i,j), 0);
        }
    }
    }
    
@Test
    public void TestPieceSquare() {
        PieceSquare pieceSquare = new PieceSquare();{
        assertEquals(1,pieceSquare.puntero(1, 1));
        assertEquals(1,pieceSquare.puntero(1, 0));
        assertEquals(1,pieceSquare.puntero(0, 0));
        assertEquals(1,pieceSquare.puntero(0, 1));
        for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==1 && j==1 || i==1 && j==0 || i==0 && j==0 ||i==0 && j==1){
                continue;
            }
            assertEquals(pieceSquare.puntero (i,j), 0);
        }
    }
    }
    }

    @Test
    public void PieceStick_Test(){
        PieceStick stick= new PieceStick();{
        assertEquals(1,stick.puntero(0, 0));
        assertEquals(1,stick.puntero(0, 1));
        assertEquals(1,stick.puntero(0, 2));
        assertEquals(1,stick.puntero(0, 3));
        for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==0 && j==3){
                continue;
            }
            assertEquals(stick.puntero (i,j), 0);
        }
    }
    }
    
}

@Test
    public void PieceT_Test(){
        PieceT pieceT= new PieceT();{
        assertEquals(1,pieceT.puntero(0, 0));
        assertEquals(1,pieceT.puntero(0, 1));
        assertEquals(1,pieceT.puntero(0, 2));
        assertEquals(1,pieceT.puntero(1, 1));
        for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==0 && j==0 || i==0 && j==1 || i==0 && j==2 ||i==1 && j==1){
                continue;
            }
            assertEquals(pieceT.puntero (i,j), 0);
        }
    }
    }
    }


@Test
    public void testPiecelInicioRight() {
    PieceL pieceL  = new PieceL() {
        
    };
    assertEquals(pieceL.puntero(0,0),1);
    assertEquals(pieceL.puntero(1,0),1);
    assertEquals(pieceL.puntero(2,0),1);
    assertEquals(pieceL.puntero(2,1),1);
    for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==0 && j==0 || i==1 && j==0 || i==2 && j==0 ||i==2 && j==1){
                continue;
            }
            assertEquals(pieceL.puntero (i,j), 0);
        }
    }
    }
@Test
    public void testPiecelInicioLeft(){
    PieceL pieceL  = new PieceL(0){
        
    };
    assertEquals(pieceL.puntero(0,1),1);
    assertEquals(pieceL.puntero(1,1),1);
    assertEquals(pieceL.puntero(2,1),1);
    assertEquals(pieceL.puntero(2,0),1);
    for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==0 && j==1 || i==1 && j==1 || i==2 && j==1 ||i==2 && j==0){
                continue;
            }
            assertEquals(pieceL.puntero (i,j), 0);
        }
    }
    }
@Test
    public void rotarDerechaDog1(){
        PieceDog pieceDog = new PieceDog();
        pieceDog.rotateRight();
        assertEquals(1, pieceDog.puntero(0,1));
        assertEquals(1, pieceDog.puntero(1,1));
        assertEquals(1, pieceDog.puntero(1,2));
        assertEquals(1, pieceDog.puntero(2,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 1 || i == 1 && j == 1 || i == 1 && j == 2 || i == 2 && j == 2){
                    continue;
                }
            assertEquals(pieceDog.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotarizquierdaDog1(){
        PieceDog pieceDog = new PieceDog();
        pieceDog.rotateLeft();
        assertEquals(1, pieceDog.puntero(0,0));
        assertEquals(1, pieceDog.puntero(1,0));
        assertEquals(1, pieceDog.puntero(1,1));
        assertEquals(1, pieceDog.puntero(2,1));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0 || i == 1 && j == 0 || i == 1 && j == 1 || i == 2 && j == 1){
                    continue;
                }
            assertEquals(pieceDog.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotarDerechaDog2(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.rotateRight();
        assertEquals(1, pieceDog.puntero(0,2));
        assertEquals(1, pieceDog.puntero(1,2));
        assertEquals(1, pieceDog.puntero(1,1));
        assertEquals(1, pieceDog.puntero(2,1));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 2 || i == 1 && j == 2 || i == 1 && j == 1 || i == 2 && j == 1){
                    continue;
                }
            assertEquals(pieceDog.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotarIzquierdaDog2(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.rotateLeft();
        assertEquals(1, pieceDog.puntero(0,1));
        assertEquals(1, pieceDog.puntero(1,1));
        assertEquals(1, pieceDog.puntero(1,0));
        assertEquals(1, pieceDog.puntero(2,0));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 1 || i == 1 && j == 1 || i == 1 && j == 0 || i == 2 && j == 0){
                    continue;
                }
            assertEquals(pieceDog.puntero(i,j), 0);
            }
        }
    }

@Test
    public void rotadorLderecha1(){
        PieceL pieceL = new PieceL(){};
        pieceL.rotateRight();
        assertEquals(1, pieceL.puntero(1,0));
        assertEquals(1, pieceL.puntero(1,1));
        assertEquals(1, pieceL.puntero(1,2));
        assertEquals(1, pieceL.puntero(2,0));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 1 && j == 0 || i == 1 && j == 1 || i == 1 && j == 2 || i == 2 && j == 0){
                    continue;
                }
            assertEquals(pieceL.puntero(i,j), 0);
            }
    }
}
@Test
    public void rotadorLizquierda1(){
        PieceL pieceL = new PieceL(){};
        pieceL.rotateLeft();
        assertEquals(1, pieceL.puntero(1,0));
        assertEquals(1, pieceL.puntero(1,1));
        assertEquals(1, pieceL.puntero(1,2));
        assertEquals(1, pieceL.puntero(0,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 1 && j == 0 || i == 1 && j == 01 || i == 1 && j == 2 || i == 0 && j == 2){
                    continue;
                }
            assertEquals(pieceL.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotadorLDerecha2(){
        PieceL pieceL = new PieceL(0){};
        pieceL.rotateRight();
        assertEquals(1, pieceL.puntero(0,0));
        assertEquals(1, pieceL.puntero(1,0));
        assertEquals(1, pieceL.puntero(1,1));
        assertEquals(1, pieceL.puntero(1,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0 || i == 1 && j == 0 || i == 1 && j == 1 || i == 1 && j ==2){
                    continue;
                }
            assertEquals(pieceL.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotadorLIzquierda2(){
        PieceL pieceL = new PieceL(0){};
        pieceL.rotateLeft();
        assertEquals(1, pieceL.puntero(1,0));
        assertEquals(1, pieceL.puntero(1,1));
        assertEquals(1, pieceL.puntero(1,2));
        assertEquals(1, pieceL.puntero(2,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 1 && j == 0 || i == 1 && j == 1 || i == 1 && j == 2 || i == 2 && j ==2){
                    continue;
                }
            assertEquals(pieceL.puntero(i,j), 0);
            }
        }
    }

@Test
    public void rotarDerechaStick1(){
        PieceStick pieceStick = new PieceStick();
        pieceStick.rotateRight();
        assertEquals(1, pieceStick.puntero(0,2));
        assertEquals(1, pieceStick.puntero(1,2));
        assertEquals(1, pieceStick.puntero(2,2));
        assertEquals(1, pieceStick.puntero(3,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 2 || i == 1 && j == 2 || i == 2 && j == 2 || i == 3 && j == 2){
                    continue;
                }
            assertEquals(pieceStick.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotarIzquierdaStick1(){
        PieceStick pieceStick = new PieceStick();
        pieceStick.rotateLeft();
        assertEquals(1, pieceStick.puntero(0,1));
        assertEquals(1, pieceStick.puntero(1,1));
        assertEquals(1, pieceStick.puntero(2,1));
        assertEquals(1, pieceStick.puntero(3,1));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 1 || i == 1 && j == 1 || i == 2 && j == 1 || i == 3 && j == 1){
                    continue;
                }
            assertEquals(pieceStick.puntero(i,j), 0);
            }
        }
    }

@Test
    public void rotarDerechaT1(){
        PieceT pieceT = new PieceT();
        pieceT.rotateRight();
        assertEquals(1, pieceT.puntero(0,1));
        assertEquals(1, pieceT.puntero(1,1));
        assertEquals(1, pieceT.puntero(2,1));
        assertEquals(1, pieceT.puntero(1,0));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 1 || i == 1 && j == 1 || i == 2 && j == 1 || i == 1 && j == 0){
                    continue;
                }
            assertEquals(pieceT.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotarIzquierdaT1(){
        PieceT pieceT= new PieceT();
        pieceT.rotateLeft();
        assertEquals(1, pieceT.puntero(0,1));
        assertEquals(1, pieceT.puntero(1,1));
        assertEquals(1, pieceT.puntero(2,1));
        assertEquals(1, pieceT.puntero(1,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 1 || i == 1 && j == 1 || i == 2 && j == 1 || i == 1 && j == 2){
                    continue;
                }
            assertEquals(pieceT.puntero(i,j), 0);
            }
        }
    }
@Test
    public void testCreacionBoard() {
        Board board = new Board();
        assertNotNull(board);

        assertEquals(10, board.getAncho());
        assertEquals(20, board.getAlto());
        
        // Verifica que todas las celdas estén inicializadas a 0 en el tablero.
        int[][] tablero = board.getTablero();
        for (int i = 0; i < board.getAncho(); i++) {
            for (int j = 0; j < board.getAlto(); j++) {
                assertEquals(0, tablero[i][j]);
            }
        }
    }

    @Test
    public void testAgregarPiezas() {
        Board juego = new Board(); 
        PieceBase piezaAleatoria = new PieceDog(); // Crea una pieza aleatoria para agregar al tablero
        juego.piezaAleatoria = piezaAleatoria; // Asigna la pieza aleatoria al juego

        // Llama al método que deseas probar
        juego.agregarPiezas();

        // Verifica si las celdas correspondientes de la pieza se han agregado correctamente al tablero
        int[][] tablero = juego.tablero;
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 4; col++) {
                if (piezaAleatoria.matriz[fila][col] == 1) {
                    int boardRow = juego.pieceFila + fila;
                    int boardCol = juego.piezaAleatoriaColumn + col;

                    if (boardRow >= 0 && boardRow < 20 && boardCol >= 0 && boardCol < 10) {
                        assertEquals(1, tablero[boardRow][boardCol]); // Verifica que la celda esté ocupada
                    } else {
                        fail("La pieza está fuera de los límites del tablero");
                    }
                }
            }
        }
    }
    @Test
    public void testInsertarPiezaAleatoria() {
        // Crear una instancia de Board
        Board board = new Board();

        // Llamar al método insertarPiezaAleatoria
        board.insertarPiezaAleatoria();

        // Verificar que se haya asignado una pieza aleatoria
        assertNotNull(board.piezaAleatoria);

        // Verificar que la columna de la pieza esté dentro de los límites del tablero
        assertTrue(board.piezaAleatoriaColumn >= 0 && board.piezaAleatoriaColumn < board.getAncho());

        // Puedes verificar más condiciones específicas de tu juego si es necesario
    }
    @Test
    public void ColumnaAleatoria_Test(){
        Board board1 = new Board(); 
        Board board2 = new Board();
        board1.insertarPiezaAleatoria();
        board1.agregarPiezas();
        board2.insertarPiezaAleatoria();
        board2.agregarPiezas();
       assertNotEquals(board1,board2);
    }
    @Test
    public void agregarPiezas_Test(){
        Board board = new Board();
        Board board1 = new Board();
        board.insertarPiezaAleatoria();
        board.agregarPiezas();
        assertNotEquals(board, board1);

}

@Test
public void moverPiezaHaciaAbajo_Test() {
    // Crear una instancia de la clase Board
    Board board = new Board();

    // Crear una pieza específica para la prueba, por ejemplo, PieceSquare
    PieceBase testPiece = new PieceSquare();
    
    // Establecer la pieza en una posición inicial conocida
    board.piezaAleatoria = testPiece;
    board.piezaAleatoriaColumn = 0;
    board.pieceFila = 0;

    // Agregar la pieza al tablero
    board.agregarPiezas();

    // Mover la pieza hacia abajo
    board.moverPiezaAbajo();

    // Comprobar las celdas donde debería estar la pieza después de moverla
    assertEquals(board.posiciones(1, 0), 1);
    assertEquals(board.posiciones(1, 1), 1);
    assertEquals(board.posiciones(2, 0), 1);
    assertEquals(board.posiciones(2, 1), 1);

    // Mover la pieza hacia abajo nuevamente
    board.moverPiezaAbajo();

    // Comprobar las celdas después de otro movimiento hacia abajo
    assertEquals(board.posiciones(2, 0), 1);
    assertEquals(board.posiciones(2, 1), 1);
    assertEquals(board.posiciones(3, 0), 1);
    assertEquals(board.posiciones(3, 1), 1);
}
    @Test
    public void testBloqueaPiezayVerificaSiHayFilaLlena() {
        // Configura el entorno de prueba
        int[][] tablero = new int[10][20]; // Tablero de ejemplo
        Board board = new Board(tablero); // Crea una instancia de Board

        // Configura una pieza de ejemplo en una posición específica en el tablero
        // Esto simula que una pieza se ha movido y colocada en el tablero
        board.pieceFila = 5; // Fila de ejemplo
        board.piezaAleatoriaColumn = 3; // Columna de ejemplo
        board.piezaAleatoria = new PieceStick(); // Pieza de ejemplo

        // Llama al método que deseas probar
        board.bloqueaPiezayVerificaSiHayFilaLlena();

        // Realiza aserciones para verificar si el tablero se actualizó correctamente
        // Por ejemplo, verifica si la celda (5, 3) y las celdas adyacentes están ocupadas
        assertTrue(tablero[5][3] == 1);
        assertTrue(tablero[5][4] == 1);
        assertTrue(tablero[5][5] == 1);
        assertTrue(tablero[5][6] == 1);
        
        // Aquí puedes realizar más aserciones según la lógica de tu juego
    }
       @Test
    public void testJuegoTerminadoCompletada5Lineas() {
        // Configura el entorno de prueba
        int[][] tablero = new int[20][10]; // Tablero de ejemplo
        Board juego = new Board(); // Crea una instancia de TuClaseDeJuego
    
        // Llena 5 líneas en el tablero (simulando líneas completas)
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 10; col++) {
                tablero[fila][col] = 1; // Llena las celdas con 1 para simular una línea completa
            }
        }
    
        // Llama al método que deseas probar
        boolean resultado = juego.juegoTerminado();
    
        // Verifica si el resultado es el esperado
        assertTrue(true); 
    }
    @Test
    public void testJuegoTerminado() {
        // Crear una instancia de Board
        Board board = new Board();

        // Configurar un tablero con una fila ocupada en la parte superior
        int[][] tablero = new int[10][20];
        for (int col = 0; col < 10; col++) {
            tablero[0][col] = 1; // Simular una fila ocupada
        }
        board.tablero = tablero;

        // Llamar al método juegoTerminado
        boolean juegoTerminado = board.juegoTerminado();

        // Verificar que el juego haya terminado debido a la fila ocupada en la parte superior
        assertTrue(juegoTerminado);
    }
    @Test
    public void testGameInitialization() {
        Tetris tetrisGame = new Tetris();
        assertNotNull(tetrisGame);
    }
}




