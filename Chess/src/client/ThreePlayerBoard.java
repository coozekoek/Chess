package client;

import java.util.AbstractMap.SimpleEntry;

public class ThreePlayerBoard extends Board {

	@Override
	public boolean isValidMove(SimpleEntry<Point, Piece> move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCheckMate() {
		// TODO Auto-generated method stub
		return false;
	}
}