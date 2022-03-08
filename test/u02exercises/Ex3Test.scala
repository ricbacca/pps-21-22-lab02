package u02exercises

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Ex3Test {

  @Test def testNegFunctions(): Unit = {
    val empty: String => Boolean = _ == ""
    val notEmpty = Ex3.neg(empty)
    
    assertFalse(empty("foo"))
    assertTrue(notEmpty("foo"))
    assertTrue(notEmpty("foo") && !notEmpty(""))
  }
  
  @Test def testNegGenericFunctions(): Unit = {
    val empty: String => Boolean = _ == ""
    val notEmptyGenerics = Ex3.negGenerics(empty)
    
    assertFalse(empty("foo"))
    assertTrue(notEmptyGenerics("foo"))
    assertTrue(notEmptyGenerics("foo") && !notEmptyGenerics(""))
  }
}
