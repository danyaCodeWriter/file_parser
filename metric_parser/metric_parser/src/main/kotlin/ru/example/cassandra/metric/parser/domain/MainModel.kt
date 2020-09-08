package ru.example.cassandra.metric.parser.domain

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table

@Table
data class MainModel(@PrimaryKey val id: Long, val payload: String) {

}