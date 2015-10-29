package org.fm.study.components;

/**
 * Created by rbxmos523 on 10/26/2015 4:18 PM.
 */

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EncoreableIntroducer {
    @DeclareParents(value = "org.fm.study.components.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}