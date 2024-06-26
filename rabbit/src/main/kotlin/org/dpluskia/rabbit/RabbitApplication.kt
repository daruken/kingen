package org.dpluskia.rabbit

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@EnableDiscoveryClient
@SpringBootApplication
@EnableR2dbcRepositories
class RabbitApplication

fun main(args: Array<String>) {
    runApplication<RabbitApplication>(*args)
}
