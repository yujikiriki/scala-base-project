package co.s4n

import org.scalatest.FunSuite

class MainTest extends FunSuite {

  test("Hello world!") {
    info("Hello world")
    assert("Hello world" === Main.m())
  }

  test("No se manejar Either[T]") {
    val derecha: Either[String, String] = Right("Yujito")
    val izquierda: Either[String, String] = Left("Yujito")

    val o: Option[String] = Option("Hola")

    /*
    val a: Right[String] = izquierda.flatMap {
      x => x
    }

    val d: (Either[String, String], Either[String, String]) = for { 
      i <- izquierda
      d <- derecha 
    } yield (i, d)
    
    assert(d === Left("Yujito"))

    */
  }
}

