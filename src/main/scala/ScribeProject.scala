package ch.mollusca.scribe.project

import java.io.File
import java.io.FileInputStream

import io.Source
import io.BufferedSource

import tfd.scala.yaml._

class	ScribeProject(val folder: File) {
	
	lazy val name = folder.getName
	lazy val projectFile = loadProjectFile
	
	def loadProjectFile : Source = {
	  new BufferedSource(new FileInputStream(new File(folder, "project.yaml")))
	}
	
	def chunks = List("small_chunk")
	
	def close = projectFile.close
}

object ScribeProject {
	
	def apply(folder: File): ScribeProject = {
		if(folder.exists){
			return new ScribeProject(folder)
		} else {
			throw new IllegalArgumentException("Project folder does not exist!")
		}
	}
	
}
