/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.fm.study.components;

import org.fm.study.interfaces.President;
import org.springframework.stereotype.Component;

/**
 *
 * @author rbxmos523
 */
@Component
public class Putin implements President {

    @Override
    public String getName() {
        return "Putin Vladimir Vladimirovich";
    }

    @Override
    public String getElectionDate() {
        return "2012";
    }
    
}
