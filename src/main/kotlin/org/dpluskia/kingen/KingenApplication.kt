package org.dpluskia.kingen

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KingenApplication

fun main(args: Array<String>) {
	runApplication<KingenApplication>(*args)
}
