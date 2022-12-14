
import Dependencies._

name := "cloneTemplateTest6"
version := "1.0"

scalaVersion := "2.13"

libraryDependencies ++= compiledDependencies(
  logback-classic,
  pureconfig,
) ++ testDependencies(

)
