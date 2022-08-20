package com.axioma.axiomatrainee.model.security;

public enum Permission {
    USER("user:read"),
    ADMIN("admin:write");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
