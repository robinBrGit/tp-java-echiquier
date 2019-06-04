package dev;

public abstract class Piece {

	protected String couleur;
	protected Position position;

	public Piece() {
		// TODO Auto-generated constructor stub
	}

	abstract char getSymbole();

	abstract char getValeur();

	abstract void deplacement(Position position);
}
