package com.nahwasa.springsecuritybasicsettingforspringboot3.domain;

import com.nahwasa.springsecuritybasicsettingforspringboot3.dto.MemberJoinDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userid;
    private String pw;
    private String roles;

    public Member(Long id, String userid, String pw, String roleUser) {
        this.id = id;
        this.userid = userid;
        this.pw = pw;
        this.roles = roleUser;
    }

    public Member() {

    }

    public static Member of(MemberJoinDto memberJoinDto) {
        return new Member(null, memberJoinDto.getUserid(), memberJoinDto.getPw(), "USER");
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
