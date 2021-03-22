// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.12" exclude("org.slf4j", "slf4j-simple"))

// Defines scafaddSbtPluginfolding (found under .g8 folder)
// http://www.foundweekends.org/giter8/scaffolding.html
// sbt "g8Scaffold form"
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.11.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "3.0.1")
