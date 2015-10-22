
public class EquilateralTriangle extends Triangle
	{

		private double sideLength;
		
		public EquilateralTriangle(double b, double h, double sl)
		{
			
			base = b;
			height = h;
			sideLength = sl;
		}
		
		
		public double findPerimeter()
		{
			
			return sideLength*3;
			
		}
		
		
	}
