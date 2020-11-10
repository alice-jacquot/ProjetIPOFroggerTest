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


	@Override
	public Case getPosition() {
		//TODO
		return null;
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
