package ru.example.cassandra.metric.parser.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.csv.CsvSchema
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import ru.example.cassandra.metric.parser.dto.MainModelDto
import ru.example.cassandra.metric.parser.repository.MainModelRepository


@RestController
class MainControllerImpl(private val repository: MainModelRepository, private val mapper: ObjectMapper) {

    @PostMapping("/file")
    fun greeting(@RequestBody body: String) {
        val parsePayloadToObject = parsePayloadToObject(body)
        repository.save(parsePayloadToObject)
        val allResults = repository.findAll()
    }

    private fun parsePayloadToObject(body: String): MainModelDto {
        val mapper = CsvMapper()
        val schema: CsvSchema = mapper
                .schemaFor(MainModelDto::class.java)
                .withColumnSeparator(';')

        return mapper.reader(MainModelDto::class.java).with(schema).readValue(body, MainModelDto::class.java)
    }
}