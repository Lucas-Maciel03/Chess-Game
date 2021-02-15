package Chess;

import BoardGame.Board;
import BoardGame.Position;
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
	
	private void InitialSetup() {
		board.placePiece(new Rook(board, Color.WHITE),new Position(2, 3));
		board.placePiece(new King(board, Color.BLACK),new Position(5, 1));
	}
}
