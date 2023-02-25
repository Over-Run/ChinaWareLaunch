package org.overrun.chinaware.os

enum class OsType(name: String) {
    Linux("Linux"),
    Mac_OS("Mac OS"),
    Mac_OS_X("Mac OS X"),
    Windows("Windows"),
    Other("OtherSystem");

    override fun toString(): String {
        return name
    }
}