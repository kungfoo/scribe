package ch.mollusca.scribe.project

import org.scalatest._
import org.scalatest.matchers._

import ch.mollusca.scribe.test._

class ScribeProjectSpec extends FlatSpec with ShouldMatchers with LoadsTestResources {
	"A ScribeProject" should "be able to find its project file" in {
		val folder = createFolder("simplest_project")
		val project = ScribeProject(folder)
		project.name should equal("simplest_project")
	}
	
}


