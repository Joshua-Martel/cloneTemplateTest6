
import sbt._

object Dependencies {

  def compiledDependencies(deps: ModuleID*): Seq[ModuleID] = deps.map(_ % Compile)

  def testDependencies(deps: ModuleID*): Seq[ModuleID] = deps.map(_ % Test)

  object Libraries {
    val logback-classic = "ch.qos.logback" % "logback-classic" % "1.2.3",
    val pureconfig = "com.github.pureconfig" %% "pureconfig" % "0.17.1",
    val akka-slf4j = "com.typesafe.akka" %% "akka-slf4j" % "1.2.3",
    val jwt-circe = "com.github.jwt-scala" %% "jwt-circe" % "9.0.1",
  }

  object Test {
    val akka-testkit = "com.typesafe.akka" %% "akka-testkit" % "2.5.22",
    val scalatest = "org.scalatest" %% "scalatest" % "3.0.7",
  }
}
