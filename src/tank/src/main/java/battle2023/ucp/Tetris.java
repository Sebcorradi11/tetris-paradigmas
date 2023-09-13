package battle2023.ucp;


public class Tetris {
    private Board board; // Declaración de la variable board
    private String gameState;

    public Tetris() {
        board = new Board();
        gameState = "CAN CONTINUE";
        
    }



    public void start(){
        board.agregarPiezas();
        board.insertarPiezaAleatoria();
        board.moverPiezaAbajo();
    }
    public String getGameState() {
        return gameState;
    }
    public void setGameOver() {
        gameState = "GAME OVER";
    }

    public void state(){
        if(board.juegoTerminado() == true){
            System.out.println("GAME OVER");
        }else if(board.juegoTerminaCompletada5Lineas() == true){
            System.out.println("YOU WIN");
        }else if(board.juegoTerminado() ==  false){
            System.out.println("CAN CONTINUE");
        }
    }

    public void tick(){
        Clock clock = new Clock();
        board.moverPiezaAbajo();
        clock.tick();
        }

    public void rotateRight(){
        board.puedeRotarDerecha();

    }

    public void rotateLeft(){
        board.puedeRotarIzquierda();

    }

    public void printTetris() {
        board.printBoard();
}
}