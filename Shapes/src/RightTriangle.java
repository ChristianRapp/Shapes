
public class RightTriangle extends Triangle
	{
		
		public RightTriangle(double b, double h)
		{
			base =b;
			height = h;
			
		}
		
		public double findHypotenuse(double base, double height)
		{
			
			return Math.sqrt(Math.pow(base, 2) +Math.pow(height, 2) );
			
		}
		
		
		public double findPerimeter()
		{
			
			return findHypotenuse(base, height) + base + height;
			
		}
		
		
	}
