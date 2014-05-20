package scala_ray_tracer

object ShapeList {

  
  val forward = 4
  val width = 800
  val height = 600
  val tVals = List()

  for (i <- 0 to height) {
    for (j <- 0 to width) {
    	val v = new Ray(new Vect(0,0,0),new Vect(width,height,4))
    	v(tVals(j))
    }
  }

}