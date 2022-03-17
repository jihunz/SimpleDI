package kr.ac.kopo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class CartConfig {
	
	@Bean
	public Cart cart() {
		return new Cart();
	}
	
	@Bean
	public Color color() {
		return new Color("검정색");
	}
	
	@Bean
	public Wheel wheel() {
		return new Wheel("원형");
	}
	
	@Bean
	public Type type() {
		return new Type("봉고");
	}
}
