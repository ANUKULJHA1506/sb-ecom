package com.ecommerce.project.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    String resourceName;
    String field;
    String fieldName;
    Long fieldId;

    public ResourceNotFoundException() {
    }

    public ResourceNotFoundException(String resourceName, String field, String fieldName) {
        super(String.format("Resource %s not found with %s: %s", resourceName,field,fieldName));
        this.field = field;
        this.fieldName = fieldName;
        this.resourceName = resourceName;
    }

    public ResourceNotFoundException(String resourceName, String field, Long fieldId ) {

        super(String.format("Resource %s not found with %s: %s", resourceName,field,fieldId));

        this.resourceName = resourceName;
        this.fieldId = fieldId;
        this.field = field;
    }
}
