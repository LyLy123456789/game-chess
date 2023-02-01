
package gamechess;

import Piece.Coordinate;
import java.util.List;


public class ChessAndCoordinare {
    
    private List<Coordinate> listCoordinate;
    private Coordinate myChess;

    public List<Coordinate> getListCoordinate() {
        return listCoordinate;
    }

    public Coordinate getMyChess() {
        return myChess;
    }

    public ChessAndCoordinare(List<Coordinate> listCoordinate, Coordinate myChess) {
        this.listCoordinate = listCoordinate;
        this.myChess = myChess;
    }

    public void setListCoordinate(List<Coordinate> listCoordinate) {
        this.listCoordinate = listCoordinate;
    }

    public void setMyChess(Coordinate myChess) {
        this.myChess = myChess;
    }
    
    
    
}
