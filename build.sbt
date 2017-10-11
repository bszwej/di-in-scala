name := "di-in-scala"

version := "1.0"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(

  "com.softwaremill.macwire" %% "macros" % "2.3.0",
  "net.codingwell" %% "scala-guice" % "4.1.0",
  "org.typelevel" %% "cats-core" % "0.9.0",

  "org.scalatest" %% "scalatest" % "3.0.4" % Test,
  "org.scalamock" %% "scalamock-scalatest-support" % "3.6.0" % Test
)
