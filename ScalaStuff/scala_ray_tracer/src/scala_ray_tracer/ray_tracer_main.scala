package scala_ray_tracer

import java.awt.{ Graphics2D, Color }
import java.awt.image.BufferedImage
import scala.swing._

object ray_tracer_main {

  val length = 800
  val width = 600

  val shapes = List[Sphere](new Sphere(1, 1, 1, 1), new Sphere(2, 2, 2, 2), new Sphere(1, 1, 2, 3), new Sphere(1, 2, 3, 4), new Sphere(1, 2, 3, 4))

  val v = new Ray(new Vect(1, 1, 1), new Vect(2, 2, 2))

  def fill(r: Ray, index: Int): Double = {
      if (r(shapes(index)) > 0) {
        r(shapes(index))
       
        
      } else {
        fill(r, index+1)
      }
    }
  
  println("Enter forward direction")
  val zDir = readDouble()

  val grid = Array.tabulate(length, width)((i, j) => {
   fill(new Ray(new Vect(0,0,0),new Vect(i,j,zDir)),0)
  })
  
  val scene = new BufferedImage(length, width, BufferedImage.TYPE_INT_ARGB)
  for (i <- 0 until length; j <- 0 until width) {
   scene.setRGB(i,j,-10000)
  }

  val panel = new Panel {
    override def paint(g:Graphics2D) {
      g.setPaint(Color.white)
      g.fillRect(0,0,size.width,size.height)
      g.drawImage(scene,0,0,null)
    }
    
    val img = scene.createGraphics()
    
  }
  
  val frame = new MainFrame {
    title = "Ray Tracer"
      contents = panel
    size = new Dimension(800, 600)
  }

  def main(args: Array[String]) {
    frame.visible = true
  }
}