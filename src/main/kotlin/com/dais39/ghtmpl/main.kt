package com.dais39.ghtmpl

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.default
import com.github.ajalt.clikt.parameters.options.option

class Ghtmpl : CliktCommand() {

    private val type: String by option(
        "-t", "--type",
        help = """ 
            Change template type.
            bug -> bug report template.
            feature -> feature request template.
            """.trimIndent()
    ).default("bug")

    override fun run() {

        when (type) {
            "bug" -> echo(
                """
                    **Describe the bug**
                    A clear and concise description of what the bug is.
                    
                    **To Reproduce**
                    Steps to reproduce the behavior:
                    1. Go to '...'
                    2. Click on '....'
                    3. Scroll down to '....'
                    4. See error
                    
                    **Expected behavior**
                    A clear and concise description of what you expected to happen.
                    
                    **Screenshots**
                    If applicable, add screenshots to help explain your problem.
                    
                    **Desktop (please complete the following information):**
                    - OS: [e.g. iOS]
                    - Browser [e.g. chrome, safari]
                    - Version [e.g. 22]
                    
                    **Smartphone (please complete the following information):**
                    - Device: [e.g. iPhone6]
                    - OS: [e.g. iOS8.1]
                    - Browser [e.g. stock browser, safari]
                    - Version [e.g. 22]
                    
                    **Additional context**
                    Add any other context about the problem here.
                """.trimIndent()
            )

            "feature" -> echo(
                """
                    **Is your feature request related to a problem? Please describe.**
                    A clear and concise description of what the problem is. Ex. I'm always frustrated when [...]
                    
                    **Describe the solution you'd like**
                    A clear and concise description of what you want to happen.
                    
                    **Describe alternatives you've considered**
                    A clear and concise description of any alternative solutions or features you've considered.
                    
                    **Additional context**
                    Add any other context or screenshots about the feature request here.
                """.trimIndent()
            )
        }
        echo("template")
    }
}

fun main(args: Array<String>) = Ghtmpl().main(args)
