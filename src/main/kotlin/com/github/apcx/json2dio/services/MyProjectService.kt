package com.github.apcx.json2dio.services

import com.github.apcx.json2dio.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
