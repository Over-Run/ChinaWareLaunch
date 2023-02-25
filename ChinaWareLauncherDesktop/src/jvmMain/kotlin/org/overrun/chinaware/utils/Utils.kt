package org.overrun.chinaware.utils

import java.io.File

class Utils: ArrayList<String>() {
    fun pathJava() {
        val split = System.getenv("PATH").split(";")
        for (s in split) {
            if (s.contains("jdk") || s.contains("jre") || s.contains("java")) {
                this.add(s)
            }
        }
    }
    fun findFile(file: File, name: String) {
        val listFiles = file.listFiles()
        try {
            for (f in listFiles!!) {
                if (f.isDirectory) {
                    findFile(f, name)
                } else {
                    if (f.absolutePath.contains(name)) {
                        this.add(f.absolutePath)
                    }
                }
            }
        } catch (_: Exception) { }

    }
}