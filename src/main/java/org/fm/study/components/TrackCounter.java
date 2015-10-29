package org.fm.study.components;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by rbxmos523 on 10/26/2015 12:21 PM.
 */
@Aspect
@Component
public class TrackCounter {

    @Pointcut("execution (* org.fm.study.components.CompactDisc.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        System.out.println(String.format("Intercepted track #%d", trackNumber));
    }

}
