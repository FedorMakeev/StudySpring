package org.fm.study.components;

/**
 * Created by rbxmos523 on 10/21/2015.
 */
public class EnvironmentDescription {
    private final String DESC;

    public EnvironmentDescription(String DESC) {
        this.DESC = DESC;
    }

    @Override
    public String toString() {
        return DESC;
    }
}
