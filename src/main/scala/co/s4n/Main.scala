package co.s4n

import com.typesafe.scalalogging.LazyLogging

object Main extends App with LazyLogging {

  logger.info(m())

  def m(): String = "Hello world"
}

