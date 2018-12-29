package com.rectangle;

/*Consider a Rectangle Shape.
 Identify its properties and behaviours and implement the same.
 Write a Test Cases to check if the behaviours(methods) are implemented properly.
 If their are 2 Rectangle objects of different sizes than we should be able to check if they are having same area or not.*/

public class RectangleArea {
	private int length;
	private int breadth;

	public RectangleArea(int length, int breadth) {

		this.length = (length > 0) ? length : 0;
		this.breadth = (breadth > 0) ? breadth : 0;
	}

	public int areaOfRectangle() {

		return length * breadth;
	}

	public int perimeterOfRectangle() {

		return 2 * (length + breadth);
	}

}
