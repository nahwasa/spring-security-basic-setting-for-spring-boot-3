package com.nahwasa.springsecuritybasicsettingforspringboot3.domain;

import jakarta.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userid;

    private String pw;

    private String roles;

    private Member(Long id, String userid, String pw, String roleUser) {
        this.id = id;
        this.userid = userid;
        this.pw = pw;
        this.roles = roleUser;
    }

    protected Member() {}

    public static Member createUser(String userId, String pw) {
        return new Member(null, userId, pw, "USER");
    }

    public Long getId() {
        return id;
    }

    public String getUserid() {
        return userid;
    }

    public String getPw() {
        return pw;
    }

    public String getRoles() {
        return roles;
    }
}
