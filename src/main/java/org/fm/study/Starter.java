package org.fm.study;

import org.fm.study.components.*;
import org.fm.study.interfaces.Performance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by rbxmos523 on 10/9/2015.
 */
public class Starter {

    static {
        System.setProperty("spring.profiles.default","dev");
        System.setProperty("spring.profiles.active","prod");
    }

    public static void main (String[] args){
        System.out.println("Application started");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        State state = context.getBean(State.class);
        System.out.println(state.getInfo());
        EnvironmentDescription desc = context.getBean(EnvironmentDescription.class);
        System.out.println(desc);
        SystemDateInformer sdi = context.getBean(SystemDateInformer.class);
        sdi.printDateInfo();
        SpELBean spELBean = context.getBean(SpELBean.class);
        spELBean.printInfo();
        System.out.println(Math.random());
        System.out.println(Math.PI);
        System.out.println(Math.E);

        Performance p = context.getBean(Performance.class);
        p.perform();

        CompactDisc cd = context.getBean(CompactDisc.class);
        cd.playTrack(10);

        System.out.println("Application finished");
    }
}
