package u02exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

object Ex5 extends App {

  def compose[A, B, C](f: B => C, g: A => B): A => C = i => f(g(i))

}
