package u02exercises

object Ex3 extends App{

  //point A
  def parityWithMethod(x: Int): String = x match
    case x if ((x % 2) + 2) == 0 => "even"
    case _ => "odd"

  val parityWithLambda: Int => String = { case n if (n % 2) == 0 => "event" case _ => "odd" }

  //point B
  def neg(f: String => Boolean): String => Boolean = !f(_)

  //Point C
  def negGenerics[A](f: A => Boolean): A => Boolean = !f(_)
  

}
