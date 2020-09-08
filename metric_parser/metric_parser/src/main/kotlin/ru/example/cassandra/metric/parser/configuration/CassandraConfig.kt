package ru.example.cassandra.metric.parser.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration
import org.springframework.data.cassandra.config.SchemaAction
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification
import org.springframework.data.cassandra.core.cql.keyspace.KeyspaceOption
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories


@Configuration
@EnableCassandraRepositories
class CassandraConfig : AbstractCassandraConfiguration() {
private val keySpaceName:String = "\"default\""
    override fun getKeyspaceName(): String {
       return keySpaceName
    }

    override fun getKeyspaceCreations(): List<CreateKeyspaceSpecification> {
        return listOf(CreateKeyspaceSpecification.createKeyspace("\"default\"")
                .ifNotExists()
                .with(KeyspaceOption.DURABLE_WRITES, true)
                .withSimpleReplication())
    }

    override fun getLocalDataCenter(): String? {
        return "datacenter1"
    }

    override fun getSchemaAction(): SchemaAction {
        return SchemaAction.CREATE_IF_NOT_EXISTS
    }

    override fun getStartupScripts(): List<String> {
        return listOf("CREATE TABLE IF NOT EXISTS $keySpaceName.test(id UUID PRIMARY KEY, greeting text, occurrence timestamp) WITH default_time_to_live = 600;")
    }
}