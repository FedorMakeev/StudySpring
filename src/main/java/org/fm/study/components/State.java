/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fm.study.components;

import org.fm.study.interfaces.ChairMan;
import org.fm.study.interfaces.President;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author rbxmos523
 */
@Component
public class State {

    @Autowired
    President president;

    @Autowired
    ChairMan chairMan;

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("President %s elected in %s year. Was born in %s\n", president.getName(), president.getElectionDate(), president.getBirtPlace()));
        sb.append(String.format("ChairMan %s is the member of \"%s\" party. Was born in %s.", chairMan.getName(), chairMan.getParty(), chairMan.getBirtPlace()));
        return sb.toString();
    }

}
