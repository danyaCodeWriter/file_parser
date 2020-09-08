package ru.example.cassandra.metric.parser.repository

import org.springframework.data.cassandra.repository.CassandraRepository
import ru.example.cassandra.metric.parser.dto.MainModelDto

interface MainModelRepository : CassandraRepository<MainModelDto, Long> {

}