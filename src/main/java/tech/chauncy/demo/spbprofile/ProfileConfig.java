package tech.chauncy.demo.spbprofile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

	@Bean
	@Profile("dev")
	public Item devItem(){
		Item it = new Item();
		it.setName("dev env");
		it.setTotal(0);
		return it;
	}
	
	@Bean
	@Profile("prod")
	public Item prodItem(){
		Item it = new Item();
		it.setName("prod env");
		it.setTotal(1111);
		return it;
	}
	
}
