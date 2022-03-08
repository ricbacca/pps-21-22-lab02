package u02exercises

object Ex7 extends App {
  enum Shape:
    case Rectangle(base: Double , height: Double)
    case Circle(radius: Double)
    case Square(side: Double)

  def area(s: Shape): Double = s match
    case Shape.Rectangle(b, h) => (b*h)/2
    case Shape.Circle(r) => (Math.PI*(r*r))
    case Shape.Square(s) => s*s

  def perimeter(shape: Shape): Double = shape match
    case Shape.Rectangle(b, h) => (b+h)*2
    case Shape.Circle(r) => (2*(Math.PI*r))
    case Shape.Square(s) => s*4
}
