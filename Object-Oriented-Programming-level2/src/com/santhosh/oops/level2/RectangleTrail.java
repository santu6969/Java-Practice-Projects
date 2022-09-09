package com.santhosh.oops.level2;

public class RectangleTrail {

	// State
	private int length;
	private int width;

	// Creation
	public RectangleTrail(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// Operations
	public boolean isRectangle() {
		return (length != width);
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * (length + width);
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

//Print State Of The Rectangle
	public String toString() {
		return String.format("Length is %d, Width is %d, is Rectangle - %b, Area is %d, Permeter is %d", length, width,
				isRectangle(), area(), perimeter());
	}
}
