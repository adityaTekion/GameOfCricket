package com.gameOfCricket.exception;

public class ResourceNotFoundException extends RuntimeException{
    private String resource;
    private String resourceName;
    private int resourceValue;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String resource, String resourceName, int resourceValue) {
        super(resource + " with " + resourceName +" "+ resourceValue + " Not Found! ");
        this.resource = resource;
        this.resourceName = resourceName;
        this.resourceValue = resourceValue;
    }
}
