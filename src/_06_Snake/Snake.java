package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		// 1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		// 2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		// 1. use a switch statement to check on the currentDirection
		// of the snake and calculate its next x and y position.
		int newX = head.getLocation().getX();
		int newY = head.getLocation().getY();
		switch (currentDirection) {

		case UP:
			newY = head.getLocation().getY() - 5;

			break;
		case DOWN:
			newY = head.getLocation().getY() + 5;
			break;
		case LEFT:
			newX = head.getLocation().getX() - 5;
			break;
		case RIGHT:
			newX = head.getLocation().getX() + 5;
			break;
		}
		for (int i = snake.size(); i > 0; i--) {
			Location newloc = snake.get(i - 1).getLocation();
			newloc = snake.get(i).getLocation();
		}
		// 2. Iterate through the SnakeSegments in reverse order
		// 2a. Update each snake segment to the location of the segment
		// in front of it.
		Location o = new Location(newX, newY);
		o = head.getLocation();
		canMove = true;
		// 3. set the location of the head to the new location calculated in step 1

		// 4. set canMove to true

	}

	public void setDirection(Direction d) {
		// 1. set the current direction equal to the passed in Direction only if canMove
		// is true.
		if (canMove == true) {
			currentDirection = d;
			canMove = false;
		}
		// set canMove equal to false.
		// make sure the snake cannot completely reverse directions.

	}

	public void reset(Location loc) {
		// 1. clear the snake

		// 2. set the location of the head

		// 3. add the head to the snake

	}

	public boolean isOutOfBounds() {
		// 1. complete the method so it returns true if the head of the snake is outsize
		// of the window
		// and false otherwise

		return false;
	}

	public boolean isHeadCollidingWithBody() {
		// 1. complete the method so it returns true if the head is located
		// in the same location as any other body segment

		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		// 1. complete the method so it returns true if the passed in
		// location is located on the snake

		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
