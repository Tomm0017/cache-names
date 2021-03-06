package org.runestar.cache.names

import java.nio.file.Path
import java.nio.file.Paths

fun main() {
    fun dump(output: Path, archive: Int) {
        writeLines(output, NAMES.filter { it.archive == archive && it.name != null }.map { "${it.group}\t${it.name}" })
    }

    dump(Paths.get("graphic-names.tsv"), 8)
    dump(Paths.get("script-names.tsv"), 12)
}

