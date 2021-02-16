package Chess;

import BoardGame.Board;
import Chess.pieces.King;
import Chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	//na hora que for criada uma partida se cria um tabuleiro 8x8 e chama o initialSetup
	public ChessMatch() {
		board = new Board(8,8);
		InitialSetup();
	}
	
	public ChessPiece[][] getPieces() {//ChessPiece é diferente de piece
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j);
			}
		}
		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void InitialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
	}
}
