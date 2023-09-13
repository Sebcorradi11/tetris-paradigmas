import static org.junit.Assert.*;

import org.junit.Test;

import battle2023.ucp.Board;
import battle2023.ucp.Piece;
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
    PieceDog pieceDog = new PieceDog();
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
    PieceDog pieceDog = new PieceDog(0);
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
    public void TestPieceSqueare() {
        PieceSquare pieceSq = new PieceSquare();{
        assertEquals(1,pieceSq.puntero(1, 1));
        assertEquals(1,pieceSq.puntero(1, 0));
        assertEquals(1,pieceSq.puntero(0, 0));
        assertEquals(1,pieceSq.puntero(0, 1));
        for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==1 && j==1 || i==1 && j==0 || i==0 && j==0 ||i==0 && j==1){
                continue;
            }
            assertEquals(pieceSq.puntero (i,j), 0);
        }
    }
    }
    }

    @Test
    public void PieceStick_Test(){
        PieceStick stick= new PieceStick();{
        assertEquals(1,stick.puntero(0, 0));
        assertEquals(1,stick.puntero(1, 0));
        assertEquals(1,stick.puntero(2, 0));
        assertEquals(1,stick.puntero(3, 0));
        for(int i = 0 ; i < 4 ;i ++){
        for(int j = 0 ; j < 4 ; j++){
            if(i==0 && j==0 || i==1 && j==0 || i==2 && j==0 ||i==3 && j==0){
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
    public void rotarDerechaDogTest_right(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.iRotatorDerecha();
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
    public void rotarIzquierdaDogTest_right(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.iRotatorDerecha();
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
    public void rotarDerechaDogTest_left(){
        PieceDog pieceDog = new PieceDog();
        pieceDog.iRotatorDerecha_Left();
        assertEquals(1, pieceDog.puntero(0,0));
        assertEquals(1, pieceDog.puntero(0,1));
        assertEquals(1, pieceDog.puntero(1,1));
        assertEquals(1, pieceDog.puntero(1,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0 || i == 0 && j == 1 || i == 1 && j == 1 || i == 1 && j == 2){
                    continue;
                }
            assertEquals(pieceDog.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotarIzquierdaDogTest_Left(){
        PieceDog pieceDog = new PieceDog();
        pieceDog.iRotatorIzquierda_Left();
        assertEquals(1, pieceDog.puntero(0,0));
        assertEquals(1, pieceDog.puntero(0,1));
        assertEquals(1, pieceDog.puntero(1,1));
        assertEquals(1, pieceDog.puntero(1,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0 || i == 0 && j == 1 || i == 1 && j == 1 || i == 1 && j == 2){
                    continue;
                }
            assertEquals(pieceDog.puntero(i,j), 0);
            }
        }
    }

@Test
    public void iRotator2VecesTest(){
        PieceDog pieceDog = new PieceDog(0);
        pieceDog.iRotator2Veces();
        assertEquals(1, pieceDog.puntero(1,0));
        assertEquals(1, pieceDog.puntero(0,1));
        assertEquals(1, pieceDog.puntero(1,1));
        assertEquals(1, pieceDog.puntero(0,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 1 && j == 0 || i == 0 && j == 1 || i == 1 && j == 1 || i == 0 && j == 2){
                    continue;
                }
            assertEquals(pieceDog.puntero(i,j), 0);
            }
        }
    }
@Test
    public void iRotator2Veces_Left(){
        PieceDog pieceDog = new PieceDog();
        pieceDog.iRotator2Veces_Left();
        assertEquals(1, pieceDog.puntero(0,0));
        assertEquals(1, pieceDog.puntero(0,1));
        assertEquals(1, pieceDog.puntero(1,1));
        assertEquals(1, pieceDog.puntero(1,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0 || i == 0 && j == 1 || i == 1 && j == 1 || i == 1 && j == 2){
                    continue;
                }
            assertEquals(pieceDog.puntero(i,j), 0);
            }
    }
}
@Test
    public void rotadorLderecha_Test(){
        PieceL pieceL = new PieceL(){};
        pieceL.iRotatorDerecha();
        assertEquals(1, pieceL.puntero(0,1));
        assertEquals(1, pieceL.puntero(0,0));
        assertEquals(1, pieceL.puntero(0,1));
        assertEquals(1, pieceL.puntero(0,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 1 || i == 0 && j == 0 || i == 0 && j == 1 || i == 0 && j == 2){
                    continue;
                }
            assertEquals(pieceL.puntero(i,j), 0);
            }
    }
}
@Test
    public void rotadorLizquierda_Test(){
        PieceL pieceL = new PieceL(){};
        pieceL.iRotatorIzquierda();
        assertEquals(1, pieceL.puntero(0,2));
        assertEquals(1, pieceL.puntero(1,2));
        assertEquals(1, pieceL.puntero(1,1));
        assertEquals(1, pieceL.puntero(0,1));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 2 || i == 1 && j == 2 || i == 1 && j == 1 || i == 0 && j == 1){
                    continue;
                }
            assertEquals(pieceL.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotadorLDerecha_TestRight(){
        PieceL pieceL = new PieceL(0){};
        pieceL.iRotatorDerecha_Left();
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
    public void rotadorLIzquierda_TestRight(){
        PieceL pieceL = new PieceL(0){};
        pieceL.iRotatorIzquierda_Left();
        assertEquals(1, pieceL.puntero(0,0));
        assertEquals(1, pieceL.puntero(0,1));
        assertEquals(1, pieceL.puntero(0,2));
        assertEquals(1, pieceL.puntero(1,2));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0 || i == 0 && j == 1 || i == 0 && j == 2 || i == 1 && j ==2){
                    continue;
                }
            assertEquals(pieceL.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotadorL2timeTest(){
        PieceL pieceL = new PieceL(){};
        pieceL.iRotator2Veces();
        assertEquals(1, pieceL.puntero(0,0));
        assertEquals(1, pieceL.puntero(0,1));
        assertEquals(1, pieceL.puntero(1,1));
        assertEquals(1, pieceL.puntero(2,1));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0 || i == 0 && j == 1 || i == 1 && j == 1 || i == 2 && j == 1){
                    continue;
                }
            assertEquals(pieceL.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotadorL2timeTest_right(){
        PieceL pieceL = new PieceL(0){};
        pieceL.iRotator2Veces_Left();
        assertEquals(1, pieceL.puntero(0,1));
        assertEquals(1, pieceL.puntero(0,0));
        assertEquals(1, pieceL.puntero(1,0));
        assertEquals(1, pieceL.puntero(2,0));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 1 || i == 0 && j == 0 || i == 1 && j == 0 || i == 2 && j == 0){
                    continue;
                }
            assertEquals(pieceL.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotarDerechaStickTest(){
        PieceStick pieceStick = new PieceStick();
        pieceStick.iRotatorDerecha();
        assertEquals(1, pieceStick.puntero(0,0));
        assertEquals(1, pieceStick.puntero(0,1));
        assertEquals(1, pieceStick.puntero(0,2));
        assertEquals(1, pieceStick.puntero(0,3));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0 || i == 0 && j == 1 || i == 0 && j == 2 || i == 0 && j == 3){
                    continue;
                }
            assertEquals(pieceStick.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotarIzquierdaStickTest(){
        PieceStick pieceStick = new PieceStick();
        pieceStick.iRotatorIzquierda();
        assertEquals(1, pieceStick.puntero(3,0));
        assertEquals(1, pieceStick.puntero(3,1));
        assertEquals(1, pieceStick.puntero(3,2));
        assertEquals(1, pieceStick.puntero(3,3));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 3 && j == 0 || i == 3 && j == 1 || i == 3 && j == 2 || i == 3 && j == 3){
                    continue;
                }
            assertEquals(pieceStick.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotadorStick2veces(){
        PieceStick pieceStick = new PieceStick(){};
        pieceStick.iRotator2Veces();
        assertEquals(1, pieceStick.puntero(0,3));
        assertEquals(1, pieceStick.puntero(1,3));
        assertEquals(1, pieceStick.puntero(2,3));
        assertEquals(1, pieceStick.puntero(3,3));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 3 || i == 1 && j == 3 || i == 2 && j == 3 || i == 3 && j == 3){
                    continue;
                }
            assertEquals(pieceStick.puntero(i,j), 0);
            }
        }
    }

@Test
    public void rotarDerechaTTest(){
        PieceT pieceT = new PieceT();
        pieceT.iRotatorDerecha();
        assertEquals(1, pieceT.puntero(0,0));
        assertEquals(1, pieceT.puntero(1,0));
        assertEquals(1, pieceT.puntero(2,0));
        assertEquals(1, pieceT.puntero(1,1));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 0 && j == 0 || i == 1 && j == 0 || i == 2 && j == 0 || i == 1 && j == 1){
                    continue;
                }
            assertEquals(pieceT.puntero(i,j), 0);
            }
        }
    }
@Test
    public void rotarIzquierdaTTest(){
        PieceT pieceT= new PieceT();
        pieceT.iRotatorIzquierda();
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
    public void rotadorT2veces(){
        PieceT pieceT = new PieceT();
        pieceT.iRotator2Veces();
        assertEquals(1, pieceT.puntero(1,0));
        assertEquals(1, pieceT.puntero(1,1));
        assertEquals(1, pieceT.puntero(1,2));
        assertEquals(1, pieceT.puntero(0,1));
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 1 && j == 0 || i == 1 && j == 1 || i == 1 && j == 2 || i == 0 && j == 1){
                    continue;
                }
            assertEquals(pieceT.puntero(i,j), 0);
            }
        }
    }

/**
 * 
 */
@Test
public void TestCreacionBoard() {
    Board board = new Board();
    assertNotNull(board);

    assertEquals(10,board.getAncho());
    assertEquals(20,board.getAlto());
    for (int i = 0; i < board.getAncho(); i++) {
        for (int j = 0; j < board.getAlto(); j++) {
            assertEquals(0, board.getCelda(i, j));
        }
    }
}
@Test
public void testInsertarPiezaAleatoria() {
    Board board = new Board();
    int anchoTablero = board.getAncho();
    
    board.insertarPiezaAleatoria();

    for(int i=0; i < anchoTablero; i++){
            if(board.getCelda(i, 0)== 1) {
                assertEquals(1,board.getCelda(i, 0));

            } else {
                assertEquals(0,board.getCelda(i, 0));
            }
        }
    }

@Test
public void testReloj(){
    Board board = new Board();

    Piece pieza = new PieceL();

    board.insertarPiezaEnLaParteSuperior(pieza);

    int xInicial = pieza.getX();
    int yInicial = pieza.getY();

    board.moverPiezaAbajo(pieza);

    assertEquals(xInicial, pieza.getX());
    assertEquals(yInicial + 1, pieza.getY());    
}
@Test
public void testPiezaNoPuedeMoverseAbajo(){
    Board board = new Board ();

    Piece pieza = new PieceL();

    pieza.setY(board.getAlto() - pieza.getAlto());

    boolean puedeMoverse = board.puedeMoverPiezaAbajo(pieza);

    assertFalse(puedeMoverse);
}
}



