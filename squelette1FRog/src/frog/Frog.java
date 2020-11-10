package frog;

import gameCommons.Game;
import gameCommons.IFrog;
import util.Case;
import util.Direction;

public class Frog implements IFrog {
	
	private Game game;
	//gérer : ajouter des attributs ?
	// Oui ! on veut ses coordonnées : gérer par une case (guidé par "getCase")
	//et une direction (dans quel sens pointe la grenouille)
	private Case myPosition;


	public Frog(Game game){
		this.game = game;
		this.myPosition = new Case(0,0); // pas 0, 0 mais milieu, 0
	}


	@Override
	public Case getPosition() {
		return this.myPosition;
	}

	@Override
	public Direction getDirection() {
		//TODO
		return null;
	}

	@Override
	public void move(Direction key) {
		//TODO

	}
}
