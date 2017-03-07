package co.s4n

import com.typesafe.scalalogging.LazyLogging

object Main extends App with LazyLogging {

  logger.info(m())
  logger.error(testingEnsime())

  def m(): String = "Hello world"

  def testingEnsime(): String = {
    "No body told me"
  }
}
