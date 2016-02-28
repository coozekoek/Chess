package client;

import java.util.List;

public class Game {

	private List<Player> players;
	private Player currentPlayer;

	/**
	 * 
	 * @param boardArg
	 * @param playersArg
	 */
	public Game(Board boardArg, List<Player> playersArg) {
		// TODO - implement Game.Game
		throw new UnsupportedOperationException();
	}

	public void resetGame() {
		// TODO - implement Game.resetGame
		throw new UnsupportedOperationException();
	}

	public List<Player> getPlayers() {
		return this.players;
	}

	public Player getCurrentPlayer() {
		return this.currentPlayer;
	}

	/**
	 * 
	 * @param playerArg
	 */
	public void setCurrentPlayer(Player playerArg) {
		this.currentPlayer = playerArg;
	}

	public boolean hasWinner() {
		// TODO - implement Game.hasWinner
		throw new UnsupportedOperationException();
	}

}