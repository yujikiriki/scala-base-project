package co.s4n

import com.typesafe.scalalogging.LazyLogging

object Main extends App with LazyLogging {

  logger.info(m())
  logger.error(testingError())

  def m(): String = "Hello world"

  def testingError(): String = {
    "No body told me"
  }
}


