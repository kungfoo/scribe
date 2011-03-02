package ch.mollusca.scribe.test

import java.io.File
import java.io.FileInputStream

import io.BufferedSource

trait LoadsTestResources {
	val testResourcesPath = "src/test/resources/"
	def resource(path: String) = new File(testResourcesPath + path)
	def createSource(path: String) = new BufferedSource(new FileInputStream(resource(path)))
}