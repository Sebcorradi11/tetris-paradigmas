package battle2023.ucp;

public class PieceL extends PieceBase {

        public PieceL(){
            piezaInicialRight();
        }
    
        public PieceL(int a){
            piezaInicialLeft();
        }
    
    public void piezaInicialRight(){
        matriz[0][0]= 1;
        matriz[1][0]= 1;
        matriz[2][0]= 1;
        matriz[2][1]= 1;
    }
    
    public void piezaInicialLeft(){
        matriz[0][1]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        matriz[2][0]= 1;
    }
    
    public void rotateRight(){
        if (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[2][1] == 1){//rotar derecha L derecha
        limpiarMatriz();
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        matriz[2][0]= 1;
        }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][0] == 1){//rotar derecha 2 veces L derecha
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        }else if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar derecha 3 veces L derecha
        limpiarMatriz();
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        matriz[0][2]= 1;
        }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[0][2] == 1){//rotar derecha 4 veces L derecha
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[1][0]= 1;
        matriz[2][0]= 1;
        matriz[2][1]= 1;
        }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[2][0] == 1){ //rotar derecha L izquierda //
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){//rotar derecha 2 veces L izquierda
        limpiarMatriz();
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        }else if(matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar derecha 3 veces L izquierda
        limpiarMatriz();
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        matriz[2][2]= 1;
        }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){//rotar derecha 4 veces L izquierda
        limpiarMatriz();
        matriz[0][1]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        matriz[2][0]= 1;
        }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[0][1] == 1 && matriz[2][0] == 1){
        limpiarMatriz();
        matriz[1][0]= 1;
        matriz[1][1]= 1;
        matriz[1][2]= 1;
        matriz[2][2]= 1;
    }
    }
    
    public void rotateLeft(){
        if (matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[2][1] == 1){//rotar izquieda L derecha
            limpiarMatriz();
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
            matriz[0][2]= 1;
            }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[0][2] == 1){//rotar izquierda 2 veces L derecha
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[0][1]= 1;
            matriz[1][1]= 1;
            matriz[2][1]= 1;
            }else if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar izquierda 3 veces L derecha
            limpiarMatriz();
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
            matriz[2][0]= 1;
            }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][0] == 1){//rotar derecha 4 veces L derecha
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[1][0]= 1;
            matriz[2][0]= 1;
            matriz[2][1]= 1;
            }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[2][0] == 1){ //rotar izquierda L izquierda
            limpiarMatriz();
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
            matriz[2][2]= 1;
            }else if(matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){
            limpiarMatriz();
            matriz[0][1]= 1;
            matriz[0][2]= 1;
            matriz[1][1]= 1;
            matriz[2][1]= 1;
            }else if(matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
            }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){
            limpiarMatriz();
            matriz[0][1]= 1;
            matriz[1][1]= 1;
            matriz[2][1]= 1;
            matriz[2][0]= 1;
            }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[0][1] == 1 && matriz[2][0] == 1){
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
    }
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


