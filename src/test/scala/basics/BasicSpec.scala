package basics

import basics.Basics._
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class BasicSpec extends AnyFlatSpec {

  "lcm" should "be correct" in {
    lcm(2, 3) shouldEqual 6
    lcm(12, 18) shouldEqual 36
    lcm(3, 9) shouldEqual 9
    lcm(3, 3) shouldEqual 3
  }

  "gcd" should "be correct" in {
    gcd(2, 3) shouldEqual 1
    gcd2(12, 36) shouldEqual 12
    gcd(3, 9) shouldEqual 3
    gcd(3, 3) shouldEqual 3
  }

  "gcd2" should "be correct" in {
    gcd2(2, 3) shouldEqual 1
    gcd2(12, 36) shouldEqual 12
    gcd2(3, 9) shouldEqual 3
    gcd2(3, 3) shouldEqual 3
  }
}