organization := "co.s4n"

name := "scala-base-project"

scalaVersion := "2.12.8"

resolvers ++= Seq(
  "releases" at "http://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging"  %%  "scala-logging"             % "3.7.2" withSources() withJavadoc(),
  "com.iheart"                  %%  "ficus"                     % "1.4.0", 
  "ch.qos.logback"              %   "logback-classic"           % "1.2.3",
  "org.scalatest"               %%  "scalatest"                 % "3.0.4" % "test"
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
