package org.jlleitschuh.gradle.ktlint.sample.kotlin.common

/**
 * Each platform must implement a Sample class matching this signature.
 */
expect class Sample() {
    fun doPlatformThing(): CharSequence
}