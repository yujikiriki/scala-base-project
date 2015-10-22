import spray.revolver.RevolverPlugin._

seq(Revolver.settings: _*)

scalariformSettings

organization := "co.s4n"

name := "scala-base-project"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  "releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "com.chuusai"                 %%  "shapeless"                 % "2.2.5"     withSources() withJavadoc(),
  "org.scalaz"                  %%  "scalaz-core"               % "7.1.4"     withSources() withJavadoc(),
  "com.typesafe.scala-logging"  %%  "scala-logging"             % "3.1.0"     withSources() withJavadoc(),
  "net.ceedubs"                 %%  "ficus"                     % "1.1.2"     withSources() withJavadoc(),
  "ch.qos.logback"              %   "logback-classic"           % "1.1.3",
  "org.scalatest"               %   "scalatest_2.11"            % "2.2.4"     % "test"
)

coverageEnabled := false

scalacOptions ++= Seq(
  "-deprecation",           
  "-encoding", "UTF-8",
  "-feature",                
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xfatal-warnings",       
  "-Xlint",
  "-Yno-adapted-args",       
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",   
  "-Ywarn-value-discard",
  "-Xfuture",
  "-Xcheckinit"
)

publishMavenStyle := true

pomIncludeRepository := { _ => false }

publishArtifact in Test := false

publishTo := {
  val nexus = "http://somewhere/nexus/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("Nexus Snapshots" at nexus + "content/repositories/snapshots/")    
  else
    Some("Nexus Releases" at nexus + "content/repositories/releases")
}

credentials += Credentials("Sonatype Nexus Repository Manager", "somewhere", "user", "password")
