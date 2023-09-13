package battle2023.ucp;

public class PieceDog extends PieceBase {
        public PieceDog(){
            piezaInicialRight();
        }
        
        public PieceDog (int a){
            piezaInicialLeft();
        }
    
            public void piezaInicialRight(){
            matriz[1][0]= 1;
            matriz[1][1]= 1;
            matriz[0][1]= 1;
            matriz[0][2]= 1;
            }
    
            public void piezaInicialLeft(){
            limpiarMatriz();
            matriz[0][0]= 1;
            matriz[0][1]= 1;
            matriz[1][1]= 1;
            matriz[1][2]= 1;
            }    
            
            @Override
            public void rotateRight(){
                if (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1){//rotar derecha perro derecho
                limpiarMatriz();    
                matriz[0][1]= 1;
                matriz[1][1]= 1;
                matriz[1][2]= 1;
                matriz[2][2]= 1;
                }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){//rotar derecha perro derecho rotado
                limpiarMatriz();
                matriz[1][0]= 1;
                matriz[1][1]= 1;
                matriz[0][1]= 1;
                matriz[0][2]= 1;
                }else if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){//rotar derecha perro izquierdo
                limpiarMatriz();
                matriz[0][2]= 1;
                matriz[1][2]= 1;
                matriz[1][1]= 1;
                matriz[2][1]= 1;
                }else if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar derecha perro izquierdo rotado 
                limpiarMatriz();
                matriz[0][0]= 1;
                matriz[0][1]= 1;
                matriz[1][1]= 1;
                matriz[1][2]= 1;
            }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar derecha perro izquierdo rotado izquierda
                limpiarMatriz();
                matriz[1][0]= 1;
                matriz[1][1]= 1;
                matriz[0][1]= 1;
                matriz[0][2]= 1;
        }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1){//rotar derecha perro izquierdo rotado izquierda
                limpiarMatriz();
                matriz[0][0]= 1;
                matriz[0][1]= 1;
                matriz[1][1]= 1;
                matriz[1][2]= 1;
        }
    }
        @Override
        public void rotateLeft(){
            if (matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[0][1] == 1 && matriz[0][2] == 1){//rotar izquierdo perro derecho
                limpiarMatriz();    
                matriz[0][0]= 1;
                matriz[1][0]= 1;
                matriz[1][1]= 1;
                matriz[2][1]= 1;
                }else if(matriz[0][0] == 1 && matriz[1][0] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar izquierda perro derecho rotado
                limpiarMatriz();
                matriz[1][0]= 1;
                matriz[1][1]= 1;
                matriz[0][1]= 1;
                matriz[0][2]= 1;
                }else if(matriz[0][0] == 1 && matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1){//rotar izquierda perro izquierdo 
                limpiarMatriz();
                matriz[0][1]= 1;
                matriz[1][1]= 1;
                matriz[1][0]= 1;
                matriz[2][0]= 1;
                }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][0] == 1 && matriz[2][0] == 1){//rotar izquierda perro izquierdo rotado.
                limpiarMatriz();
                matriz[0][0]= 1;
                matriz[0][1]= 1;
                matriz[1][1]= 1;
                matriz[1][2]= 1;
            }else if(matriz[0][1] == 1 && matriz[1][1] == 1 && matriz[1][2] == 1 && matriz[2][2] == 1){//rotar izquierda perro derecho rotado derecha
                limpiarMatriz();
                matriz[1][0]= 1;
                matriz[1][1]= 1;
                matriz[0][1]= 1;
                matriz[0][2]= 1;
            }else if(matriz[0][2] == 1 && matriz[1][2] == 1 && matriz[1][1] == 1 && matriz[2][1] == 1){//rotar izquierda perro derecho rotado derecha
                limpiarMatriz();
                matriz[0][0]= 1;
                matriz[0][1]= 1;
                matriz[1][1]= 1;
                matriz[1][2]= 1;
    }
    }
@Override
public int getAncho() {
    return matriz.length;
}
@Override
public int getAlto(){
    return matriz[0].length;
}
@Override
public int puntero (int x, int y ) {
    return matriz[x][y];   
}

@Override
public int getCelda() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCelda'");
}

}

