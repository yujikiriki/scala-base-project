package co.s4n

import org.scalatest.FunSuite

class MainTest extends FunSuite {

  test("Hello world!") {
    info("Hello world")
    assert("Hello world" === Main.m())
  }
}
