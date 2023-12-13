plugins {
    id("carlosdiamon.paper-conventions")
		alias(libs.plugins.shadow)
		alias(libs.plugins.pluginyml)
}

// https://github.com/Minecrell/plugin-yml
paper {
	name = "Template"
	description = "A template for Paper plugins"
	version = project.version.toString()
	website = "https://example.com"
	main = "io.github.carlosdiamon.paper.Core"
	apiVersion = "1.20.2"
	author = "Carlosdiamon"

}

/* If you use paperweight
tasks {
    shadowJar {
        archiveBaseName.set(rootProject.name)
        archiveClassifier.set("")
    }

    assemble {
        dependsOn(reobfJar)
    }
}
*/

dependencies {

}