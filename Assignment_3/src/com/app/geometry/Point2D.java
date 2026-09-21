package com.app.geometry;

public class Point2D {
	private double x;
	private double y;

	public Point2D() {
		
	}

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String getDetails() {
		return "Point(" + x + ", " + y + ")";
	}

	public boolean isEqual(Point2D p) {
		if(this.x == p.x && this.y == p.y)
			return true;
		else
			return false;
	}

	public double calculateDistance(Point2D p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		return distance;
	}
}
