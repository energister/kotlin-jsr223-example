import org.jetbrains.kotlin.cli.common.environment.setIdeaIoUseFallback
import javax.script.ScriptEngineManager

fun main(args: Array<String>) {

    /* To avoid message
    WARN: Failed to initialize native filesystem for Windows
    java.lang.RuntimeException: Could not find installation home path. Please make sure bin/idea.properties is present in the installation directory.
    */
    setIdeaIoUseFallback()

    val script = "3 + 5"

    val engine = ScriptEngineManager().getEngineByExtension("kts")!!
    val result = engine.eval(script)

    println("The result of the '$script' is '$result'")
}