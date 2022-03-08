package u02exercises

import u02exercises.Ex8.{Option, s1, s2, s3}
import u02exercises.Ex8.Option.{None, Some, filter, flatMap, map, map2, orElse}
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Ex8Test {

  val s1: Option[Int] = Some(1)
  val s2: Option[Int] = Some(2)
  val s3: Option[Int] = None()

  @Test def testOrElseFunction(): Unit = {
    assertEquals(1, orElse(s1, 0))
    assertEquals(0, orElse(s3, 0))
  }

  @Test def testFlatMapFunction(): Unit = {
    assertEquals(Some(2), flatMap(s1)(i => Some(i + 1)))
    assertEquals(Some(3), flatMap(s1)(i => flatMap(s2)(j => Some(i + j))))
    assertEquals(None(), flatMap(s1)(i => flatMap(s3)(j => Some(i + j))))
  }

  @Test def testFilterFunction(): Unit = {
    assertEquals(None(), filter(s1)(_ > 2))
    assertEquals(Some(2), filter(s2)(_ == 2))
  }

  @Test def testMapFunction(): Unit = {
    assertEquals(Some(true), map(s1)(_ == 1))
    assertEquals(Some(false), map(s2)(_ > 2))
    assertEquals(None(), map(s3)(_ > 2))
  }
  
  @Test def testMap2Function(): Unit = {
    assertEquals(Some(3), map2(s1, s2)((i, j) => Some(i+j)))
    assertEquals(None(), map2(s1, s3)((i,j) => Some(i*j)))
  }

}
