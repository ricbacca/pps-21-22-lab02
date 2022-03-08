package u02exercises

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Ex5Test {

  @Test def testCompose(): Unit = {
    val f: Int => Int = x => x/2
    val g: Int => Int = x => x*x

    assertEquals(2, Ex5.compose(f, g)(2))
  }
}
