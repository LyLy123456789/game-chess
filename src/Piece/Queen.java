
package Piece;

import Piece.Piece;
import java.util.ArrayList;
import java.util.List;


public class Queen extends Piece{

    public Queen(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        if(color == Piece.Black){
            this.name = "Black_Queen";
        }
        else{
            this.name = "White_Queen";
        }
        this.Point = Piece.QUEEN_POINT;
    }



    @Override
    public List<Coordinate> getPossibleMove(Piece[][] board) {
        List<Coordinate> listCoordinate = new ArrayList<Coordinate>();
        // LIKE giam muc
        // Browse across the lower left
        if(this.coordinate.getCol() > 0 && this.coordinate.getRow() > 0){
            int row = this.coordinate.getRow();
            int col = this.coordinate.getCol();
             while(row > 0 && col > 0){
                 row--;
                 col--;
                 if(super.checkEmptyCell(board, row, col)){
                     Coordinate may = new Coordinate(row, col);     
                      listCoordinate.add(may);
                   }
                 else{
                     if(board[row][col].color != this.color){
                         Coordinate may = new Coordinate(row, col);     
                          listCoordinate.add(may);
                          break;
                     }
                     else break;
                 }
             }
        }
        //Browse qua ngay tren
        if(this.coordinate.getRow() < 7 && this.coordinate.getCol() < 7){
            int row = this.coordinate.getRow();
            int col = this.coordinate.getCol();
             while(row < 7 && col < 7){
                 row++;
                 col++;
                 if(super.checkEmptyCell(board, row, col)){
                     Coordinate may = new Coordinate(row, col);     
                      listCoordinate.add(may);
                   }
                 else{
                     if(board[row][col].color != this.color){
                         Coordinate may = new Coordinate(row, col);     
                          listCoordinate.add(may);
                          break;
                     }
                     else break;
                 }
             }
        }
        
        //  duyệt chéo ngay bên dưới
        if(this.coordinate.getRow() > 0 && this.coordinate.getCol() < 7){
            int row = this.coordinate.getRow();
            int col = this.coordinate.getCol();
             while(row > 0 && col < 7){
                 row--;
                 col++;
                 if(super.checkEmptyCell(board, row, col)){
                     Coordinate may = new Coordinate(row, col);     
                      listCoordinate.add(may);
                   }
                 else{
                     if(board[row][col].color != this.color){
                         Coordinate may = new Coordinate(row, col);     
                          listCoordinate.add(may);
                          break;
                     }
                     else break;
                 }
             }
        }
        
        // duyệt qua trái trên
        if(this.coordinate.getRow() < 7 && this.coordinate.getCol() > 0){
            int row = this.coordinate.getRow();
            int col = this.coordinate.getCol();
             while(row < 7 && col > 0){
                 row++;
                 col--;
                 if(super.checkEmptyCell(board, row, col)){
                     Coordinate may = new Coordinate(row, col);     
                      listCoordinate.add(may);
                   }
                 else{
                     if(board[row][col].color != this.color){
                         Coordinate may = new Coordinate(row, col);     
                          listCoordinate.add(may);
                          break;
                     }
                     else break;
                 }
             }
        }
        //----------------------------------------------------------------------
        // LIKE ROOK
        if(this.coordinate.getCol() != 0){
             for(int iCol = this.coordinate.getCol() - 1; iCol >= 0; iCol--){
                 if(super.checkEmptyCell(board, this.coordinate.getRow(),iCol)){
                     Coordinate may = new Coordinate(this.coordinate.getRow(),
                             iCol);     
                      listCoordinate.add(may);
                   }
                 else{
                     if(board[this.coordinate.getRow()][iCol].color != this.color){
                         Coordinate may = new Coordinate(this.coordinate.getRow(),
                                 iCol);     
                          listCoordinate.add(may);
                          break;
                     }
                     else break;
                 }
             }
        }
        // Browse Right
        if(this.coordinate.getCol() != 7){
             for(int iCol = this.coordinate.getCol() + 1; iCol <= 7; iCol++){
                 if(super.checkEmptyCell(board, this.coordinate.getRow(),iCol)){
                     Coordinate may = new Coordinate(this.coordinate.getRow(),
                             iCol);     
                      listCoordinate.add(may);
                   }
                 else{
                     if(board[this.coordinate.getRow()][iCol].color != this.color){
                         Coordinate may = new Coordinate(this.coordinate.getRow(),
                                 iCol);     
                          listCoordinate.add(may);
                          break;
                     }
                     else break;
                 }
             }
        }
       // Browse Bot
       if(this.coordinate.getRow() != 0){
             for(int iRow = this.coordinate.getRow() - 1; iRow >=0; iRow--){
                 if(super.checkEmptyCell(board, iRow,this.coordinate.getCol())){
                      Coordinate may = new Coordinate(iRow,
                              this.coordinate.getCol());     
                       listCoordinate.add(may);
                    }
                  else{
                     if(board[iRow][this.coordinate.getCol()].color != this.color){
                      Coordinate may = new Coordinate(iRow,
                              this.coordinate.getCol());     
                       listCoordinate.add(may);
                       break;
                     }
                     else
                         break;
                  }
             }
       }
       // Browse Top
       if(this.coordinate.getRow() != 7){
             for(int iRow = this.coordinate.getRow() + 1; iRow <= 7; iRow++){
                 if(super.checkEmptyCell(board, iRow,this.coordinate.getCol())){
                      Coordinate may = new Coordinate(iRow,
                              this.coordinate.getCol());     
                       listCoordinate.add(may);
                    }
                  else{
                     if(board[iRow][this.coordinate.getCol()].color != this.color){
                         Coordinate may = new Coordinate(iRow,
                                 this.coordinate.getCol());     
                          listCoordinate.add(may);
                          break;
                     }
                     else break;
                  }
             }
       }
        //----------------------------------------------------------------------
        return listCoordinate;
    }
    
}
