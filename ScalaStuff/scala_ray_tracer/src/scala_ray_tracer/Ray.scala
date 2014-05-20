package scala_ray_tracer

class Ray(p0: Vect, d: Vect) {

  //var t = 9999999
  
  
 
  
  
  def apply(s: Sphere):Double = {

    val A = (d dot d)
    val B = (p0 - s.c) * 2 dot d
    val C = ((p0 - s.c) dot (p0 - s.c)) - (s.r * s.r)
    val disc = B * B - 4 * A * C
    if (disc < 0) {
      -99999
    } else {
      
      var t = (-B) - math.sqrt(disc) / (2 * A)
      return t

    }

  }
}