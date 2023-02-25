package org.overrun.chinaware.utils

import org.overrun.chinaware.os.OsType
import org.overrun.chinaware.os.instance_
import java.io.File

class Utils: ArrayList<String>() {
    fun pathJava() {
        for ((_, u) in System.getenv()) {
            if (u.contains(";")) {
                val split = u.split(";")
                for (s in split) {
                    if (s.contains("jdk") || s.contains("jre") || s.contains("java")) {
                        if (instance_.getOs() == OsType.Windows) {
                            this.add("${s}${File.separator}java.exe")
                        } else {
                            this.add("${s}${File.separator}java")
                        }
                    }
                }
            }
        }
//        val split = System.getenv("PATH").split(";")
//        for (s in split) {
//            if (s.contains("jdk") || s.contains("jre") || s.contains("java")) {
//                this.add(s)
//            }
//        }
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