/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fm.study.components;

import org.fm.study.interfaces.ChairMan;
import org.springframework.stereotype.Component;

/**
 *
 * @author rbxmos523
 */
@Component
public class Medvedev implements ChairMan {

    @Override
    public String getParty() {
        return "United Russia";
    }

    @Override
    public String getName() {
        return "Medvedev Dmitry Anatolievich";
    }
    
}
