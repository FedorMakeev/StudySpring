package org.fm.study.components;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import java.text.SimpleDateFormat;

/**
 * Created by rbxmos523 on 10/22/2015.
 */
@Component
@Qualifier("USA")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class USADateInformer extends AbstractDateInformer {
    private final SimpleDateFormat SDF = new SimpleDateFormat("MM dd yyyy");

    {
        System.out.println(USADateInformer.class.getName() + " created");
    }

    @Override
    public String getDateTime() {
        synchronized (SDF){
            return SDF.format(System.currentTimeMillis());
        }
    }
}
