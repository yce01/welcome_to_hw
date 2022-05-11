package com.company.model.type;

public enum Grade {
    O, E, A, P, D, T;

    public static Grade fromString(String g){
        return switch (g) {
            case "O" -> O;
            case "E" -> E;
            case "A" -> A;
            case "P" -> P;
            case "D" -> D;
            case "T" -> T;
            default -> null;
        };
    }
}
