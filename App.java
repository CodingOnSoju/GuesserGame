package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    	System.out.println("!-------------!");
    	
    	Player player1 = context.getBean("playerBeanDefination", Player.class);
    	System.out.println(player1.guessNum());
    	Player player2 = context.getBean("playerBeanDefination", Player.class);
    	System.out.println(player2.guessNum());
    	Player player3 = context.getBean("playerBeanDefination", Player.class);
    	System.out.println(player3.guessNum());
    	
    	Umpire umpire = context.getBean("umpireBeanDefination", Umpire.class);
    	umpire.collectNumberFromGuesser();
		umpire.collectNumberFromPlayers();
		umpire.compare();
    	
  
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
