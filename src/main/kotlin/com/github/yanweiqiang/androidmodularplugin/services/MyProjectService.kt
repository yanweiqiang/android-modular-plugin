package com.github.yanweiqiang.androidmodularplugin.services

import com.github.yanweiqiang.androidmodularplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
