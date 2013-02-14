import sbt._
import sbt.Keys._

object ProjectEulerBuild extends Build {

  lazy val projectEuler = Project(
    id = "project-euler",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Project Euler",
      organization := "com.github.lygaret",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0"
      // add other settings here
    )
  )
}
