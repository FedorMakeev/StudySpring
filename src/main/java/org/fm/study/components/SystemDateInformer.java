package org.fm.study.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by rbxmos523 on 10/22/2015.
 */
@Component
public class SystemDateInformer {

    @Autowired
    @Qualifier("USA")
    private AbstractDateInformer dateInformer;

    public void printDateInfo(){
        System.out.println(dateInformer.getDateTime());
    }

}
