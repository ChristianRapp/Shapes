import java.util.*;
public class ShapeRunner
	{

		public static void main(String[] args)
			{
				
				RightTriangle rt = new RightTriangle(4,6);
				System.out.println("Area of right triangle ="+rt.findArea());
				System.out.println("Perimeter of right triangle ="+rt.findPerimeter());
				System.out.println("Hypotenuse of right triangle ="+rt.findHypotenuse());
				System.out.println();
				
				EquilateralTriangle et = new EquilateralTriangle(3,2);
				System.out.println("Area of equilateral triangle ="+et.findArea());
				System.out.println("Perimeter of equilateral triangle ="+et.findPerimeter());
				System.out.println();
				
				Trapezoid nt = new Trapezoid(5,4,1,2,3);
				System.out.println("Area of trapezoid ="+nt.findArea());
				System.out.println("Perimeter of trapezoid ="+nt.findPerimeter());
				System.out.println();
				
				Rectangle nr = new Rectangle(3,4);
				System.out.println("Area of rectangle ="+nr.findArea());
				System.out.println("Perimeter of rectangle ="+nr.findPerimeter());
				System.out.println();
				
				ArrayList<Shape> shapes = new ArrayList<Shape>();
				shapes.add(rt);
				shapes.add(et);
				shapes.add(nt);
				shapes.add(nr);
				
				
				for(Shape fred:shapes)
					System.out.println(fred.toString());
			}

	}
