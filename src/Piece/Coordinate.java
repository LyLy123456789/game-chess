
package Piece;

import java.io.Serializable;

public class Coordinate implements Serializable{
    private int iRow;
    private int iCol;

    public Coordinate(int _iRow, int _iCol) {
        this.iRow = _iRow;
        this.iCol = _iCol;
    }
    
    public int getRow(){
        return this.iRow;
    }
    
    public void setRow(int _iRow){
        this.iRow = _iRow;
    }
    
    public int getCol(){
        return this.iCol;
    }
    public void setCol(int _Col){
        this.iCol = _Col;
    }
    

    
    
}
