package battle2023.ucp;

public class PieceStick extends PieceBase {

public PieceStick(){
    piezaInicial();
}

public void piezaInicial(){
    matriz[0][0]= 1;
    matriz[0][1]= 1;
    matriz[0][2]= 1;
    matriz[0][3]= 1;
}

@Override
public void rotateRight() {
    if (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[0][3] == 1){//rotar derecha Stick
        limpiarMatriz();    
        matriz[0][2]= 1;
        matriz[1][2]= 1;
        matriz[2][2]= 1;
        matriz[3][2]= 1;
        }else if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1 && matriz[3][2] == 1){//rotar derecha Stick rotado
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
        //Rotaciones cuando se mueven las columnas 
        }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[3][1] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
        }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[3][0] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
    }
}

@Override
public void rotateLeft(){
    if (matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1 && matriz[0][3] == 1){
        limpiarMatriz();    
        matriz[0][1]= 1;
        matriz[1][1]= 1;
        matriz[2][1]= 1;
        matriz[3][1]= 1;
        }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1 && matriz[3][1] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
        //Rotaciones cuando se mueven las columnas 
        }else if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1 && matriz[3][2] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
        }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1 && matriz[3][0] == 1){
        limpiarMatriz();
        matriz[0][0]= 1;
        matriz[0][1]= 1;
        matriz[0][2]= 1;
        matriz[0][3]= 1;
    }
}
@Override
public int getAncho() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAncho'");
}

@Override
public int getAlto() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAlto'");
}

@Override
public int getCelda() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCelda'");
}
}





