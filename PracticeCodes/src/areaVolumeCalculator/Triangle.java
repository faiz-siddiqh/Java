package areaVolumeCalculator;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	
public  double area() {
	double area=(base*height)/2;
	return area;
	}

    public  double volume() {
    	return -1;	
    }

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
