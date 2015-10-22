
public abstract class Shape
	{

		protected double area;
		protected double perimeter;
		
		public abstract double findArea();
		public abstract double findPerimeter();
		
		@Override
		
		public String toString()
			{
				return "Shape [area=" + area + ", perimeter=" + perimeter + "]";
			}
		
		
		
	}
