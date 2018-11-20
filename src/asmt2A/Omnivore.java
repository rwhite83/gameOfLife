package asmt2A;

import java.awt.Point;

/** extends lifeForm and implements relevant methods */

public class Omnivore extends LifeForm implements CarnivoreEdible {

	/**
	 * standard constructor for Omnivore
	 * 
	 * @param world is the world referred to
	 * @param point refers to its position on the grid
	 */
	Omnivore(World world, Point position) {
		super(world, position, Colour.BLUE);
		lastFeed = 0;
		minMateNeighbours = 1;
		minNullNeighbours = 3;
		minFoodNeighbours = 1;
	}
	
	public boolean isEdible(Point point) {
		return (World.cell[point.x][point.y].life instanceof OmnivoreEdible);
	}

	protected boolean isMyType(Point point) {
		return (World.cell[point.x][point.y].life instanceof Omnivore);
	}
	@Override
	protected void giveBirth(Point newSpawnPoint) {
		World.cell[newSpawnPoint.x][newSpawnPoint.y].life = new Omnivore(world, newSpawnPoint);
		
	}
}

