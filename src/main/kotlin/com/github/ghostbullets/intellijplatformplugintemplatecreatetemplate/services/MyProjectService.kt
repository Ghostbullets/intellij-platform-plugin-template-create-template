package com.github.ghostbullets.intellijplatformplugintemplatecreatetemplate.services

import com.intellij.openapi.project.Project
import com.github.ghostbullets.intellijplatformplugintemplatecreatetemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
