/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fm.study.interfaces;

/**
 *
 * @author rbxmos523
 */
public interface Person {

    String getName();

    default String getBirtPlace() {
        return "Leningrad";
    }
}
