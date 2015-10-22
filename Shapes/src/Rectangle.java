
public class Rectangle extends Quadrilateral
	{

		private double length;
		private double width;
		
		public Rectangle(double l, double w)
		{
			length = l;
			width = w;
		}
		
		public double findArea()
		{
			
			return  length*width;
			
		}
		
		public double findPerimeter()
		{
			
			return (2*length)+(2*width);
			
		}

		
	}
