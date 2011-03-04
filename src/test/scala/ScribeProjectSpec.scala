package ch.mollusca.scribe.project

import org.scalatest._
import org.scalatest.matchers._

import ch.mollusca.scribe.test._

class ScribeProjectSpec extends FlatSpec with ShouldMatchers with LoadsTestResources {
  def withProject(name: String)(function: ScribeProject => Unit) = {
    val project = ScribeProject(createFolder(name))
    try{
      function(project)
    } finally {
      project.close
    }
  }

  "A ScribeProject" should "be able to find its project file" in {
    withProject("simplest_project") { project => 
      val projectFile = project.projectFile
      projectFile.length should be > (0)
    }
	}
	
	it should "be able to tell its name" in {
	  withProject("simplest_project") { project =>
	    project.name should equal ("simplest_project")
	  }
  }
  
  it should "be able to tell the paths of its chunks" in {
    withProject("simplest_project") { project =>
      val chunks = project.chunks
      chunks should be (List("small_chunk"))
    }
  }
}


