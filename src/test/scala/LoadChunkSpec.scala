package ch.mollusca.scribe.test

import org.scalatest._
import org.scalatest.matchers._

class LoadChunkSpec extends FlatSpec with ShouldMatchers with LoadsTestResources {
	"Resource files" should "be possible to load during tests" in {
		val source = createSource("chunk.mdown")
		println(source.getLines.mkString("\n"))
	}
	
	it should "contain the content of the file" in {
		val oneLiner = createSource("oneliner.mdown")
    oneLiner.mkString should equal("I contain one line of text.")
	}
	
	"Folders" should "be possible to load during tests" in {
		val folder = createFolder("sample_folder")
		folder.exists should equal(true)
		val files = folder.list
		files.length should equal(1)
	}
}
