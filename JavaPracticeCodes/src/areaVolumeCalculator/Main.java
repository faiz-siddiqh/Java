package areaVolumeCalculator;

import java.util.Scanner;

/**
 * 
 * @author Faiz-Siddiqh
 * 
 *         Calculating the Area and Volume of given Polygon using Abstraction
 *         and Inheritance by using instanceOf keyword
 *
 */

public class Main {
	static Shape[] shape = new Shape[5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < shape.length; i++) {
			String input = sc.next();
			if (input.equalsIgnoreCase("Triangle")) {
				Triangle t = new Triangle();
				shape[i] = t;
				t.setBase(sc.nextDouble());
				t.setHeight(sc.nextDouble());
			} else if (input.equalsIgnoreCase("Sphere")) {
				Sphere s = new Sphere();
				shape[i] = s;
				s.setRadius(sc.nextDouble());

			} else if (input.equalsIgnoreCase("Rectangle")) {
				Rectangle r = new Rectangle();
				shape[i] = r;
				r.setLength(sc.nextDouble());
				r.setWidth(sc.nextDouble());
			} else if (input.equalsIgnoreCase("Cube")) {
				Cube c = new Cube();
				shape[i] = c;
				c.setHeight(sc.nextDouble());
				c.setLength(sc.nextDouble());
				c.setWidth(sc.nextDouble());
			}

		}
		for (int i = 0; i < shape.length; i++) {
			System.out.println("Area " + shape[i].area());
			if (shape[i] instanceof Spatial || shape[i] instanceof Spatial) {
				System.out.println("Volume " + shape[i].volume());
			}
		}

	}
}
