package boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	private int getRow() {
		return row;
	}
	
	private void setRow(int row) {
		this.row = row;
	}
	
	private int getColumn() {
		return column;
	}
	
	private void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString () {
		return row + ", "+column;
	}
	

}
