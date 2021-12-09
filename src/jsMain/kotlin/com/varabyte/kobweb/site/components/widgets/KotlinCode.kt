package com.varabyte.kobweb.site.components.widgets

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.fontFamily
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.asAttributeBuilder
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Code
import org.jetbrains.compose.web.dom.Pre
import org.jetbrains.compose.web.dom.Text

/**
 * Creates a code block that is colored by highlight.js
 */
// Note: To enable this widget to work, we needed to add highlight.js support to this project. See the kobweb
// block in our build.gradle.kts file to see how this was done.
@Composable
fun KotlinCode(code: String, modifier: Modifier = Modifier) {
    Pre(attrs = modifier.asAttributeBuilder()) {
        Code(attrs = {
            classes("language-kotlin").also {
                style {
                    fontFamily("Menlo, monospace")
                }
            }
        }) {
            Text(code)
        }
    }
}