/**
 * 
 */
package fr.test.tutorial.ws.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author julien.aubert (AUBAY)
 * @date 31 janv. 2017
 * @version 1.0
 */
@Configuration
@ImportResource("classpath:config.xml")
@ComponentScan(value = { "fr.test.tutorial.ws.repository" })
public class ContextConfig {

	@Autowired
	private DataSource dataSource;

	// @Bean
	// public DataSource dataSource() {
	//
	//
	// EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
	// builder.addScript("db/schema.sql");
	// builder.addScript("db/data.sql");
	// return builder.build();
	// }

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

}