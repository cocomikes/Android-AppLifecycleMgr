package com.hm.iou.lifecycle.plugin

import com.android.build.gradle.AppExtension
import com.android.build.gradle.AppPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project

class AppLifecyclePlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        if(project.plugins.hasPlugin(AppPlugin)){
            println "------LifeCycle plugin entrance-------"
            def android = project.extensions.getByType(AppExtension)
            android.registerTransform(new AppLifecycleTransform(project))
        }
    }

}