package org.netmelody.cieye.core.domain;

public class CiServerType {
    
    private final String name;
    
    public CiServerType(String name) {
        this.name = name;
    }
    
    public String name() {
        return this.name;
    }
}