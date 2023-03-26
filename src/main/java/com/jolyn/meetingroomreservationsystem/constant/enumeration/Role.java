package com.jolyn.meetingroomreservationsystem.constant.enumeration;

import static com.jolyn.meetingroomreservationsystem.constant.AuthorityConstant.ADMIN_AUTHORITIES;
import static com.jolyn.meetingroomreservationsystem.constant.AuthorityConstant.USER_AUTHORITIES;

public enum Role {
    ROLE_USER(USER_AUTHORITIES),
    ROLE_ADMIN(ADMIN_AUTHORITIES);

    private String[] authorities;

    Role(String... authorities) {
        this.authorities = authorities;
    }

    public String[] getAuthorities() {
        return authorities;
    }
}
