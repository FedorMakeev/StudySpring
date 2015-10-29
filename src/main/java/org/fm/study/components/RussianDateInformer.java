package org.fm.study.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by rbxmos523 on 10/22/2015.
 */
@Component
@Qualifier("Russian")
public class RussianDateInformer extends AbstractDateInformer {
    private final SimpleDateFormat SDF = new SimpleDateFormat("dd.MM.yyyy");

    {
        System.out.println(RussianDateInformer.class.getName() + " created");
    }

    @Override
    public String getDateTime() {
        synchronized (SDF){
            return SDF.format(System.currentTimeMillis());
        }
    }
}
