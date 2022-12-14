
import sbt._

object Dependencies {

  def compiledDependencies(deps: ModuleID*): Seq[ModuleID] = deps.map(_ % Compile)

  def testDependencies(deps: ModuleID*): Seq[ModuleID] = deps.map(_ % Test)

  object Libraries {
    val logback-classic = "ch.qos.logback" % "logback-classic" % "1.2.3",
    val pureconfig = "com.github.pureconfig" %% "pureconfig" % "0.17.1",
  }

  object Test {

  }
}
