package com.baeldung.scala3.multiversalequality
import com.baeldung.scala3.multiversalequality.CanEqualDeriveClause.*
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CanEqualDeriveClauseUnitTest extends AnyWordSpec with Matchers{
  "CanEqualDeriveClause equality check for different types deriving CanEqual TypeClass" should {
    "compile successfully" in {
      import scala.language.strictEquality
      "circle1 == circle2" should compile
      circle1 shouldEqual circle2
    }
  }
}