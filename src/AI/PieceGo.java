
package AI;

import Piece.Coordinate;


public class PieceGo {
    private Coordinate start;

    public Coordinate getStart() {
        return start;
    }

    public void setStart(Coordinate start) {
        this.start = start;
    }

    public Coordinate getTarget() {
        return target;
    }

    public void setTarget(Coordinate target) {
        this.target = target;
    }
    private Coordinate target;

    public PieceGo(Coordinate start, Coordinate target) {
        this.start = start;
        this.target = target;
    }
    
    
}
