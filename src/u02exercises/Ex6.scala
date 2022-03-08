package u02exercises

object Ex6 extends App {

  def fib(n: Int): Int = n match
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1)+fib(n-2)
  
}
