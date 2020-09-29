package basics

import scala.annotation.tailrec

// Homework. Implement functions that calculate https://en.wikipedia.org/wiki/Lowest_common_denominator and
// https://en.wikipedia.org/wiki/Greatest_common_divisor for integers.
object Basics extends App{

  def lcm(a: Int, b: Int): Int = {
    if (a == 0 || b == 0) 0
    else Math.abs(a * b) / gcd(a, b)
  }

  def gcd(a: Int, b: Int): Int = {
    if (a == 0 && b == 0) 0
    else if (a == 0) Math.abs(b)
    else if (b == 0) Math.abs(a)
    else if ((a & 1) == 0 && (b & 1) == 0) gcd(a >> 1, b >> 1) << 1
    else if ((a & 1) == 0) gcd(a >> 1, b)
    else if ((b & 1) == 0) gcd(a, b >> 1)
    else gcd(Math.abs(a-b), Math.min(a, b))
  }

  def gcd2(a: Int, b: Int): Int = {
    @tailrec
    def rec(a: Int, b: Int, mult: Int = 1): Int = {
      if (a == 0 && b == 0) 0
      else if (a == 0) Math.abs(b) * mult
      else if (b == 0) Math.abs(a) * mult
      else if ((a & 1) == 0 && (b & 1) == 0) rec(a >> 1, b >> 1, mult << 1)
      else if ((a & 1) == 0) rec(a >> 1, b, mult)
      else if ((b & 1) == 0) rec(a, b >> 1, mult)
      else rec(Math.abs(a-b), Math.min(a, b), mult)
    }
    rec(a, b)
  }
}
