package dev.iratherfear.springintro.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dev.iratherfear.springintro.Gaming.GameRunner;
import dev.iratherfear.springintro.Gaming.GamingConsole;
import dev.iratherfear.springintro.Gaming.PacMan;
import dev.iratherfear.springintro.Gaming.Supra;

@Configuration
public class GamingConfiguration {
    
    @Bean
    public PacMan pacman() {
        return new PacMan();
    }

    @Bean
    public Supra supra() {
        return new Supra();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole supra) {
        return new GameRunner(supra);
    }
}
