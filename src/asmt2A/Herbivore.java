package asmt2A;

import java.awt.Point;

/** extends lifeForm and implements relevant methods */

public class Herbivore extends LifeForm implements CarnivoreEdible, OmnivoreEdible {

	/**
	 * standard constructor for Herbivore
	 * 
	 * @param world is the world referred to
	 * @param point refers to its position on the grid
	 */
	Herbivore(World world, Point position) {
		super(world, position, Colour.YELLOW);
		lastFeed = 0;
		minMateNeighbours = 1;
		minNullNeighbours = 3;
		minFoodNeighbours = 2;
	}

	public boolean isEdible(Point point) {
		return (World.cell[point.x][point.y].life instanceof HerbivoreEdible);
	}

	protected boolean isMyType(Point point) {
		return (World.cell[point.x][point.y].life instanceof Herbivore);
	}

	protected void giveBirth(Point newSpawnPoint) {
		World.cell[newSpawnPoint.x][newSpawnPoint.y].life = new Herbivore(world, newSpawnPoint);
	}
}
