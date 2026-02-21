class Rectangle1
{
  public double length;
  public double width;
 
  Rectangle1(double l, double w)
  {
    this.length = l;
    this.width = w;
  }

  public double area()
  {
    return this.length * this.width;
  }

}

class Cuboid extends Rectangle1
{
  public double height;
  Cuboid(double l, double w, double h)
  {
    super(l, w);
    this.height = h;
  }

  public double volume()
  {
    return this.length * this.width * this.height;
  }
}
public class CuboidFromRectangleUsingInheritance
{
  public static void main(String args[])
{
 Cuboid cub = new Cuboid(2,4, 6);
  System.out.println("Area of Rectangle: " + cub.area());
  System.out.println("Volume of Cuboid: " + cub.volume());
}
}