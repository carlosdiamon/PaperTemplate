rootProject.name = "PaperTemplate"

val subprojectNames = listOf("common", "plugin")
subprojectNames.forEach { includePrefixed(it) }

fun includePrefixed(name: String) {
	val kebabName = name.replace(":", "-")
	val path = name.replace(":", "/")
	val baseName = "${rootProject.name}-$kebabName"

	include(baseName)
	project(":$baseName").projectDir = file(path)
}