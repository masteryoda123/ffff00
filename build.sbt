name := """ffff00"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean, SbtWeb)


scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.mockito" % "mockito-all" % "1.9.5",
  "org.postgresql" % "postgresql" % "9.3-1100-jdbc4",
  "org.avaje.ebeanorm" % "avaje-ebeanorm" % "4.6.2",
  "com.google.code.gson" % "gson" % "2.3.1",
  "com.typesafe.play" %% "play-mailer" % "5.0.0-M1"
)


fork in run := false
