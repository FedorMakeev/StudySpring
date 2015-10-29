package org.fm.study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by rbxmos523 on 10/20/2015.
 */
@Configuration
@Profile("dev")
public class DevelopmentProfileConfig {

    @Bean
    public String environmentDescription(){
        return "This is development environment";
    }
}
