
package AI;
import Piece.Coordinate;
import Piece.EmptyCell;
import Piece.Piece;
import gamechess.*;
import java.util.ArrayList;
import java.util.List;

public class AI { 
    public PieceGo findPieceGo(Piece[][] board, int turn){
        PieceGo piecego = null;
        List<ChessAndCoordinare> listchessAndCoordinare = new ArrayList<ChessAndCoordinare>();
        // có thể di chuyển lần lượt
        for(int iRow = 0; iRow < 8; iRow++){
            for(int iCol = 0; iCol < 8; iCol++){
                if(board[iRow][iCol].getColor() == turn){
                    listchessAndCoordinare.add(new ChessAndCoordinare(
                            board[iRow][iCol].getPossibleMove(board),
                            new Coordinate(iRow, iCol)));       
                }
            }
        }
        
        // tìm không hợp lệ
        if(listchessAndCoordinare.size() != 0){
            for(int i = 0; i < listchessAndCoordinare.size(); i++){
                int iRowStart = listchessAndCoordinare.get(i).getMyChess().getRow();
                int iColStart = listchessAndCoordinare.get(i).getMyChess().getCol();
                for(int j = 0; j < listchessAndCoordinare.get(i).getListCoordinate()
                        .size(); j++){
                    
                    int iRowTarget = listchessAndCoordinare.get(i).getListCoordinate().
                            get(j).getRow();
                    int iColTarget = listchessAndCoordinare.get(i).getListCoordinate().
                            get(j).getCol();

                    //--------------------------------------------------------------
                    /*
                        CHECK MATE
                        + cố gắn dichuyển cờ
                        + CHECK MATE RETURN TRUE OR FALSE
                            -> TRUE: REMOVE LISTCOORDINATE
                            -> FALSE: không hợp lệ
                    */ 
                    Piece temp;
                    temp = board[iRowTarget][iColTarget];
                    
                    board[iRowTarget][iColTarget] = board[iRowStart][iColStart];
                    board[iRowTarget][iColTarget].setCoordinate(new 
                         Coordinate(iRowTarget, iColTarget));
                    board[iRowStart][iColStart] = new EmptyCell(-1,
                            new Coordinate(iRowStart, iColStart));

                    if(BoardChess.checkMate()){
                        listchessAndCoordinare.get(i).getListCoordinate().remove(j);
                        j--;
                    }

                    // trả lại bàn cũ
                    board[iRowStart][iColStart] = board[iRowTarget][iColTarget];
                    board[iRowStart][iColStart].setCoordinate(new 
                         Coordinate(iRowStart, iColStart));
                    board[iRowTarget][iColTarget] = temp;
                    board[iRowTarget][iColTarget].setCoordinate(new
                         Coordinate(iRowTarget, iColTarget));


                    //-------------------------------------------------------------- 
                }
            }
        }
        int point = -1;
        // chế độ mảnh đi
        if(listchessAndCoordinare.size() > 0){
            for(int i = 0; i < listchessAndCoordinare.size(); i++){
                for(int j = 0 ; j < listchessAndCoordinare.get(i).
                        getListCoordinate().size(); j++){
                    
                    int iRow = listchessAndCoordinare.get(i).getListCoordinate()
                            .get(j).getRow();
                    int iCol = listchessAndCoordinare.get(i).getListCoordinate()
                            .get(j).getCol();
                    
                    //thuật toán
                    if(board[iRow][iCol].getPoint() > point){
                        point = board[iRow][iCol].getPoint();
                        piecego = new PieceGo(listchessAndCoordinare.get(i) //liet ke cua vua va toa do
                                .getMyChess(), new Coordinate(iRow, iCol));
                    }                 
                }
            }
        }
        return piecego; 
    }   
}


