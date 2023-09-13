package battle2023.ucp;

public class PieceSquare extends PieceBase {


        public PieceSquare(){
            piezaInicial();
        }
        
        public void piezaInicial(){
            matriz[0][0]= 1;
            matriz[0][1]= 1;
            matriz[1][0]= 1;
            matriz[1][1]= 1;
        }
        
        public void rotateLeft(){
        
        }
        
        public void rotateRight(){
        
        }
        

@Override
public int getAncho() {
    return matriz.length;
}


@Override
public int getAlto() {
    // TODO Auto-generated method stub
    return 0;
}


@Override
public int getCelda() {
    // TODO Auto-generated method stub
    return 0;
}
}