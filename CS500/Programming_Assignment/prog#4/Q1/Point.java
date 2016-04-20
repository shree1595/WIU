public class Point {
   // Private variables
   private int x;    // x coordinate
   private int y;    // y coordinate
   
   // Constructor
   public Point (int x, int y) 
   {
	   this.x = x;
	   this.y = y;
   }
   
   // Public methods
   public String toString() {
      return "Point: (" + x + "," + y + ")";
   }
   
   public int getX() { return x; }
   public int getY() { return y; }
   public void setX(int x) { this.x = x;}
   public void setY(int y) { this.y = y;}
   
   
   public double distance(int x, int y)
   {
	   return Math.sqrt((this.x -x) * (this.x -x) + (this.y -y) * (this.y -y));
   }
   
   public double distance(Point another)
   {
	   return Math.sqrt((this.x -another.getX()) * (this.x - another.getX()) + (this.y -another.getY()) * (this.y -another.getY()));
   }
 
}
