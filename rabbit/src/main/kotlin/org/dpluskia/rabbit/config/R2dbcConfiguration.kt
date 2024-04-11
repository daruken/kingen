package org.dpluskia.rabbit.config

import com.github.jasync.r2dbc.mysql.JasyncConnectionFactory
import com.github.jasync.sql.db.SSLConfiguration
import com.github.jasync.sql.db.mysql.pool.MySQLConnectionFactory
import io.r2dbc.spi.ConnectionFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing
import java.nio.charset.StandardCharsets


@Configuration
@EnableR2dbcAuditing
class R2dbcConfiguration : AbstractR2dbcConfiguration() {
    @Value("\${spring.r2dbc.url}")
    private lateinit var url: String

    @Value("\${spring.r2dbc.username}")
    private lateinit var username: String

    @Value("\${spring.r2dbc.password}")
    private lateinit var password: String

    @Value("\${spring.r2dbc.database}")
    private lateinit var database: String

    @Value("\${spring.r2dbc.port}")
    private lateinit var port: String

    override fun getCustomConverters(): MutableList<Any> {
        return mutableListOf()
    }

    override fun connectionFactory(): ConnectionFactory {
        val sslConfiguration = SSLConfiguration()
        val configuration = com.github.jasync.sql.db.Configuration(
            username = username,
            host = url,
            port = port.toInt(),
            password = password,
            database = database,
            ssl = sslConfiguration,
            charset = StandardCharsets.UTF_8,
        )

        return JasyncConnectionFactory(MySQLConnectionFactory(configuration))
    }
}
