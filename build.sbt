
import Dependencies.{compiledDependencies,testDependencies}
import Dependencies.Libraries._
import Dependencies.Test._

name := "cloneTemplateTest6"
version := "1.0"

scalaVersion := "2.13"

libraryDependencies ++= compiledDependencies(
  logback-classic,
  pureconfig

) ++ testDependencies(

)
