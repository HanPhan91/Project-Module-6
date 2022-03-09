package com.cg.model.Enums;

public enum RolesEnum {
    admin(1), driver(2), customer(3);
    private int value;

    RolesEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static RolesEnum parseRolesEnum(int value) {
        RolesEnum[] values = values();
        for (RolesEnum rl : values) {
            if (rl.value == value)
                return rl;
        }
        throw new IllegalArgumentException("value position invalid");
    }
}

