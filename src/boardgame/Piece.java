package boardgame;

public class Piece {
<<<<<<< HEAD

	protected Position position;
	private Board board;

	public Piece(Board board) {		
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
=======
	
	protected Position position;
	protected Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

>>>>>>> 0c711cadf9c34323e44170ce4497570db0a943a6
}
