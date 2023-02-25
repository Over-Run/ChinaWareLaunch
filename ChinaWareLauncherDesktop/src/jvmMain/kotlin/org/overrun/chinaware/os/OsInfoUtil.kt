package org.overrun.chinaware.os

var os: String = System.getProperty("os.name").lowercase()
var instance_ = OsInfoUtil()

class OsInfoUtil {
    fun getOs(): OsType {
        if (os.indexOf("linux") >= 0) {
            return OsType.Linux
        } else if (os.indexOf("mac") >= 0 && os.indexOf("os") > 0 && os.indexOf("x") < 0) {
            return OsType.Mac_OS
        } else if (os.indexOf("mac") >= 0 && os.indexOf("os") > 0 && os.indexOf("x") > 0) {
            return OsType.Mac_OS_X
        } else if (os.indexOf("windows") >= 0) {
            return OsType.Windows
        } else {
            return OsType.Other
        }
    }
}