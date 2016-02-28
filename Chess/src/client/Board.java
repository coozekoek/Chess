package client;

import java.util.AbstractMap.SimpleEntry;
import java.util.Map;

public abstract class Board {

	private Map<Point, Piece> fields;

	public Board() {
		// TODO - implement Board.Board
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param point
	 */
	public Piece getField(Point point) {
		// TODO - implement Board.getField
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param point
	 * @param piece
	 */
	public void setField(Point point, Piece piece) {
		// TODO - implement Board.setField
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param move
	 */
	public abstract boolean isValidMove(SimpleEntry<Point, Piece> move);

	public abstract boolean isCheck();

	public abstract boolean isCheckMate();

	public void resetBoard() {
		// TODO - implement Board.resetBoard
		throw new UnsupportedOperationException();
	}

	public void getBoard() {
		// TODO - implement Board.getBoard
		throw new UnsupportedOperationException();
	}

}