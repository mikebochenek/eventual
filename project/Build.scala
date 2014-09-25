import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName = "eventual"
  val appVersion = "1.0-SNAPSHOT"

  val main = play.Project(appName, appVersion).settings( // Add your own project settings here      
  )
}