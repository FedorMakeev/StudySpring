package org.fm.study;

/**
 * Created by rbxmos523 on 10/9/2015 2:31 PM.
 */

import org.fm.study.components.*;
import org.fm.study.conditions.MagicExistsCondition;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("org.fm.study.components")
@PropertySource("file:src/main/java/org/fm/study/app.properties")
public class ApplicationConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean(name = "EnvDescription")
    @Profile("dev")
    public EnvironmentDescription devEnvDescription() {
        return new EnvironmentDescription("This is development environment");
    }

    @Bean(name = "EnvDescription")
    @Profile("prod")
    public EnvironmentDescription prodEnvDescription() {
        return new EnvironmentDescription("This is a production environment");
    }

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }

}