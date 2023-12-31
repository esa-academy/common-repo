/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package service.configurer.plugin

import org.gradle.api.Project
import org.gradle.api.Plugin

/**
 * A simple 'hello world' plugin.
 */
class ServiceConfigurerPluginPlugin: Plugin<Project> {
    override fun apply(project: Project) {
        // Register a task
        project.tasks.register("service-configurer-plugin") { task ->
            task.doLast {
                println("Hello from plugin 'service.configurer.plugin.greeting'")
            }
        }
    }
}
