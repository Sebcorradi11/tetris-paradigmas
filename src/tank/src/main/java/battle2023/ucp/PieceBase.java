package battle2023.ucp;

public abstract class PieceBase implements IRotator{
    
    private int x;
    private int y;
    public int matriz[][]  = new int[4][4];

    String name = "";
    public abstract int getAncho();
    public abstract int getAlto();
    public abstract int getCelda();
    


    public PieceBase(){
         matriz = new int [4][4];
    }
    public int puntero(int p1,int p2){
        return matriz[p1][p2];
    }
    public int[][] getMatriz() {
        // Proporciona aquí la implementación del método getMatriz
        // Debe devolver una matriz de acuerdo con la firma del método en PieceBase
        return new int[][] {
            {1, 1},
            {1, 1}
        };
    }
    public void limpiarMatriz(){
          matriz = new int [4][4];
        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
            matriz[i][j] = 0;
            }
        }
    }
    public int getCelda(int i, int j) {
        return 0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int setY(int newY){
        return this.y = newY;
    }
    public void setX(int i) {
    }
    public boolean esPosibleRotarDerecha(int tempFila, int tempColumna, int[][] tempBoard) {
        return false;
    }
    public boolean esPosibleRotarIzquierda(int tempFila, int tempColumna, int[][] tempBoard) {
        return true;
    }
    public void rotateRight(){

    }
    public void rotateLeft(){
        
    }

}