name := """play-scala-slick-example"""

version := "2.6.x"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"
grollHistoryRef := "2.6.x"

libraryDependencies += guice
libraryDependencies += "com.typesafe.play" %% "play-slick" %  "3.0.2"
libraryDependencies += "com.typesafe.play" %% "play-slick-evolutions" % "3.0.2"

libraryDependencies += "com.h2database" % "h2" % "1.4.196"

libraryDependencies += "be.venneborg" %% "slick-refined" % "0.1.0"
libraryDependencies += "be.venneborg" %% "play26-refined" % "0.1.0"

libraryDependencies += specs2 % Test
  

