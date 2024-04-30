architectury {
    neoForge()
}

loom {
    runs {
        create("data") {
            data()
            programArgs("--all", "--mod", "ad_astra")
            programArgs("--output", project(":common").file("src/main/generated/resources").absolutePath)
            programArgs("--existing", project(":common").file("src/main/resources").absolutePath)
        }
    }
}

val common: Configuration by configurations.creating {
    configurations.compileClasspath.get().extendsFrom(this)
    configurations.runtimeClasspath.get().extendsFrom(this)
    configurations["developmentNeoForge"].extendsFrom(this)
}

dependencies {
    common(project(":common", configuration = "namedElements")) { isTransitive = false }
    shadowCommon(project(path = ":common", configuration = "transformProductionNeoForge")) { isTransitive = false }

    val minecraftVersion: String by project
    val mixinExtrasVersion: String by project
    val neoforgeVersion: String by project
    val jeiVersion: String by project

    neoForge(group = "net.neoforged", name = "neoforge", version = neoforgeVersion)

    modLocalRuntime(group = "mezz.jei", name = "jei-$minecraftVersion-neoforge", version = jeiVersion) { isTransitive = false }

//    modLocalRuntime(group = "maven.modrinth", name = "jade", version = "13.2.2")

//
    forgeRuntimeLibrary("com.teamresourceful:yabn:1.0.3")
    forgeRuntimeLibrary("com.teamresourceful:bytecodecs:1.0.2")

    "annotationProcessor"(group = "io.github.llamalad7", name = "mixinextras-neoforge", version = mixinExtrasVersion).apply {
        implementation(this)
        "include"(this)
    }
}