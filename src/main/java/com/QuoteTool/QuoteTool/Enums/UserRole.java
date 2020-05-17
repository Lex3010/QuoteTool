package com.QuoteTool.QuoteTool.Enums;

public enum UserRole {

    USER ("USER"),
    ADMIN ("ADMIN"),
    SUPER_ADMIN ("SUPER_ADMIN");

    private final String name;

    private UserRole(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {
        // (otherName == null) check is not needed because name.equals(null) returns false
        return name.equals(otherName);
    }

    public String toString() {
        return this.name;
    }

}
