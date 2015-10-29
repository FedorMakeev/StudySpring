package org.fm.study.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by rbxmos523 on 10/22/2015 4:12 PM.
 */

@Component
@Lazy
public class SpELBean {

    @Autowired
    @Value("${app.locale}")
    private String LOCATION;

    @Autowired
    @Value("#{EnvDescription.toString()}")
    private String envDescription;

    @Autowired
    Environment env;

    {
        System.out.println(SpELBean.class.getCanonicalName() + " created");
    }

    public void printInfo(){
        System.out.println(String.format("Current location is %s", LOCATION));
        System.out.println("Description " + envDescription);
        System.out.println(env.getProperty("app.name"));
        for (String p : env.getActiveProfiles()){
            System.out.println(p);
        }
    }
}
