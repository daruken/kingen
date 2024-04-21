package org.dpluskia.kingen

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class KingenApplication

fun main(args: Array<String>) {
	runApplication<KingenApplication>(*args)
}
