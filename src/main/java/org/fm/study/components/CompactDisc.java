package org.fm.study.components;

import org.springframework.stereotype.Component;

/**
 * Created by rbxmos523 on 10/26/2015 12:18 PM.
 */
@Component
public class CompactDisc {

    public void playTrack(int i){
        System.out.println(String.format("Now playing track #%d", i));
    }
}
