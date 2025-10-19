package dessin;

class Point {
	 private double  x ;
	 private double  y ;
	  
	 public double  getX() 		   { return x; }
	 public void    setX(double d) { this.x = d;}
	 public double  getY()		   { return y; }
	 public void    setY(double d) { this.y = d; } 
	
	 public Point(){
		 this.x = (double) Math.random()*300 ;
		 this.y = (double) Math.random()*300 ; 
	 }
	 
	 public double distance(){
		 	return  Math.sqrt(( Math.pow(this.getX(), 2) + Math.pow(this.getX(), 2))); 
	 }
	 
	 public double distance(Point p){
		 if(!(p instanceof Point)){
			 return (double) 0; 
		 }
		 
		 return Math.sqrt( 
				 Math.pow(p.getX()-this.getX(),2) + 
				 Math.pow(p.getY()-this.getY(),2)
				 );
	 }
	
	 
	@Override
	public String toString() {
		return "Point (" + this.x + "," + this.y + ")";
	}
	 
	 
	  
	  
}
