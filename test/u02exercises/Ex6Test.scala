package u02exercises

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test

class Ex6Test {

  @Test def testNthFibonacci(): Unit = {
    val n = 4
    assertEquals(3, Ex6.fib(n))
  }
}
