package scala_ray_tracer

class Vect(val x: Double, val y: Double, val z: Double) {

  
  def dot(v: Vect): Double = x * v.x + y * v.y + z * v.z

  def cross(v: Vect): Vect = new Vect(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x)

  def +(v: Vect): Vect = new Vect(x + v.x, y + v.y, z + v.z)

  def -(v: Vect): Vect = new Vect(x - v.x, y - v.y, z - v.z)

  def *(c: Double): Vect = new Vect(x * c, y * c, z * c)

  def /(c: Double): Vect = new Vect(x / c, y / c, z / c)
  

  
}

