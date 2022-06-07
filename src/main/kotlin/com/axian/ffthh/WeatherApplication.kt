package com.axian.ffthh

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan
@EnableJpaRepositories
class WeatherApplication {
}

fun main(args: Array<String>) {
    SpringApplication.run(WeatherApplication::class.java, *args)
}