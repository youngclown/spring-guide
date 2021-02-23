package com.spring.guide.global.common.response;


import lombok.Getter;

@Getter
public class Existence {

    private final boolean existence;

    public Existence(boolean existence) {
        this.existence = existence;
    }
}
