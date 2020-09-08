package ru.example.cassandra.metric.parser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MetricParserApplication

fun main(args: Array<String>) {
	runApplication<MetricParserApplication>(*args)
}
