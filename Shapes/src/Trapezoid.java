
public class Trapezoid extends Quadrilateral
	{
		private double base1;
		private double base2;
		private double side1;
		private double side2;
		private double height;
		
		public Trapezoid(double b1, double b2, double s1, double s2,double h)
		{
			base1 = b1;
			base2 = b2;
			side1 = s1;
			side2 =s2;
			height = h;
			
		}
		
		public double findArea()
		{
			
			return ((base1+base2)/2) * height;
			
		}
		
		public double findPerimeter()
		{
			
			return base1 + base2+ side1+side2;
			
		}
		
		
		
		
		
		
	}
