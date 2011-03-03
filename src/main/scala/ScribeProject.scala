package ch.mollusca.scribe.project

import java.io.File

class	ScribeProject(val folder: File) {
	
	lazy val name = folder.getName
	
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