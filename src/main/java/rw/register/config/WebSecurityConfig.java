package rw.register.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//	
	 @Override
     protected void configure(HttpSecurity security) throws Exception
     {
//      security.httpBasic().disable(); // Did work only for GET     
      security.csrf().disable().authorizeRequests().anyRequest().permitAll(); // Works for GET, POST, PUT, DELETE
     }
	@Bean
	public BCryptPasswordEncoder BCryptPasswordEncoder()
	{
	    return new BCryptPasswordEncoder();
	}
	
}
