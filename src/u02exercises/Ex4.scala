package u02exercises

object Ex4 extends App {

  def nonCurriedFunType(x: Int, y: Int, z: Int): Boolean = (x <= y) && (y <= z)

  def curriedFunType(x: Int)(y: Int)(z: Int): Boolean = (x <= y) && (y<=z)

  val curriedAsFunction: Int => Int => Int => Boolean = x => y => z => (x <= y) && (y <= z)

  val nonCurriedAsFunction: (Int, Int, Int) => Boolean = (x,y,z) => (x <= y) && (y <= z)

}
