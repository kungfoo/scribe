import sbt._

class ScribeProject(info: ProjectInfo) extends DefaultProject(info) {
	val scalatest = "org.scalatest" % "scalatest" % "1.2"
}
