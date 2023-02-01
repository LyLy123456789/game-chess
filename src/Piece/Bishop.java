
package Piece;

import Piece.Coordinate;
import Piece.Piece;
import java.util.ArrayList;
import java.util.List;


public class Bishop extends Piece {

    public Bishop(int _color, Coordinate _coordinate) {
        super(_color, _coordinate);
        if(this.color == Piece.Black){
            this.name = "Black_Bishop";
        }
        else{
            this.name = "White_Bishop";
        }
        this.Point = Piece.BISHOP_POINT;
    }
    


    
    @Override
    public List<Coordinate> getPossibleMove(Piece[][] board){      
        List<Coordinate> listCoordinate = new ArrayList<Coordinate>();
        
        // duyệt qua phía dưới bên trái
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
        //duyệt qua ngay trên
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
        return listCoordinate;
    }
}
