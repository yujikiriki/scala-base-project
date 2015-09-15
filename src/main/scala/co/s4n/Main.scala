package co.s4n

import com.typesafe.scalalogging.LazyLogging

object Main extends App with LazyLogging {

  def hello(a: String): Unit = {
    logger.info("Hello world")
  }
}
