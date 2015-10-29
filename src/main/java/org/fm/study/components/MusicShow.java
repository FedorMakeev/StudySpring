package org.fm.study.components;

import org.fm.study.interfaces.Performance;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by rbxmos523 on 10/26/2015 10:31 AM.
 */

@Component
public class MusicShow implements Performance {

    @Override
    public void perform() {
        System.out.println("La-la la-la-la-la-la-la-la-la");
    }
}
