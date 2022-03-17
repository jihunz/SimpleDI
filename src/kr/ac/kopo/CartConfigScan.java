package kr.ac.kopo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kr.ac.kopo")
public class CartConfigScan {
	
	@Bean("color_default")
	public String color() {
		return "white";
	}
	
	@Bean("wheel_default")
	public String wheel() {
		return "8각형";
	}
	
	@Bean("type_default")
	public String type() {
		return "소나타";
	}
	
}
