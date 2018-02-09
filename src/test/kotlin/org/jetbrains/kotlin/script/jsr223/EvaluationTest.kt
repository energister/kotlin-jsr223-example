package org.jetbrains.kotlin.script.jsr223

import org.jetbrains.kotlin.cli.common.environment.setIdeaIoUseFallback
import org.junit.Assert
import org.junit.Test
import javax.script.ScriptEngineManager

class EvaluationTest {

    init {
        setIdeaIoUseFallback()
    }

    @Test
    fun simpleEvaluation() {
        val engine = ScriptEngineManager().getEngineByExtension("kts")!!
        val res1 = engine.eval("val x = 3")
        Assert.assertNull(res1)
        val res2 = engine.eval("x + 2")
        Assert.assertEquals(5, res2)
    }
}
