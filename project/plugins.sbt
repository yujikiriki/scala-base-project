resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.typesafeRepo("releases")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.5")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.6")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.8.1")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.1.0-M13")
