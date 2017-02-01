/**
 * 
 */
package fr.test.tutorial.ws.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author julien.aubert (AUBAY)
 * @date 31 janv. 2017
 * @version 1.0
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "fr.test.tutorial.ws.web" })
public class WebMvcConfig extends WebMvcConfigurerAdapter {

}