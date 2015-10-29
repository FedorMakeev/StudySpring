package test;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.fm.study.ApplicationConfig;
import org.fm.study.components.EnvironmentDescription;
import org.fm.study.components.State;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author rbxmos523
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
@ActiveProfiles("prod")
public class RunTest {

    @Autowired
    State state;

    @Autowired
    EnvironmentDescription description;

    @Test
    public void doTest() {
        System.out.println("TESTING");
        System.out.println(state.getInfo());
        System.out.println(description);
    }
}
