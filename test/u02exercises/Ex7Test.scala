package u02exercises

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.{BeforeAll, Test}
import Ex7.Shape.*
import Ex7.*

class Ex7Test {

  @Test def testCalculateRectangleArea(): Unit = {
    val s = Rectangle(10, 5)
    assertEquals(25, area(s))
  }

  @Test def testCalculateSquareArea(): Unit = {
    val side = 5;
    val s = Square(side)
    assertEquals(side*side, area(s))
  }

  @Test def testCalculateCircleArea(): Unit = {
    val radius = 10;
    val s = Circle(radius)
    assertEquals((radius*radius)*Math.PI, area(s))
  }

  @Test def testCalculateRectanglePerimeter(): Unit = {
    val s = Rectangle(10, 5)
    assertEquals(30, perimeter(s))
  }

  @Test def testCalculateSquarePerimeter(): Unit = {
    val side = 5;
    val s = Square(side)
    assertEquals(side*4, perimeter(s))
  }

  @Test def testCalculateCirclePerimeter(): Unit = {
    val radius = 10;
    val s = Circle(radius)
    assertEquals(radius*Math.PI*2, perimeter(s))
  }
}
