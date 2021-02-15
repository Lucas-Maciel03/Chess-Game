package BoardGame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece(int row, int columns) {
		return pieces[row][columns];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		/*vai na matriz pieces(q foi declarada e instanciada no tabuleiro 
		pega linha e coluna e atribui uma peça que foi passada de argumento*/
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position; //para informar que a posicao nao é nula
	}
}
