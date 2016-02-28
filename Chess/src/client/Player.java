package client;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;

public abstract class Player {

	private Game game;
	private List<Piece> pieces;
	private String name;

	public Game getGame() {
		return this.game;
	}

	/**
	 * 
	 * @param game
	 */
	public void setGame(Game game) {
		this.game = game;
	}

	public List<Piece> getPieces() {
		return this.pieces;
	}

	/**
	 * 
	 * @param pieces
	 */
	public void setPieces(List<Piece> pieces) {
		this.pieces = pieces;
	}

	public String getName() {
		return this.name;
	}

	public abstract SimpleEntry<Piece, Point> determineMove();

	/**
	 * 
	 * @param name
	 */
	public Player(String name) {
		// TODO - implement Player.Player
		throw new UnsupportedOperationException();
	}

}