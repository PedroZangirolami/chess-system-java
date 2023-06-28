package chess;

import boardgame.Position;

public class ChessPosition {

    private char column;
    private char row;

    public ChessPosition(char column, char row) {
        if (column < 'a' || column > 'h' || row < 1 || row < 8){
            throw new ChessException("Error intantiating chessPosition.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public char getRow() {
        return row;
    }

}
