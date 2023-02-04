package com.nahwasa.springsecuritybasicsettingforspringboot3.service;

import com.nahwasa.springsecuritybasicsettingforspringboot3.domain.Member;
import com.nahwasa.springsecuritybasicsettingforspringboot3.dto.MemberJoinDto;
import com.nahwasa.springsecuritybasicsettingforspringboot3.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {
    private final PasswordEncoder passwordEncoder;
    private final MemberRepository repository;

    @Autowired
    public MemberService(PasswordEncoder passwordEncoder, MemberRepository repository) {
        this.passwordEncoder = passwordEncoder;
        this.repository = repository;
    }

    public String join(Member member) {
        validateDuplicateMember(member);
        repository.save(member);
        return member.getUserid();
    }

    public String join(MemberJoinDto memberJoinDto) {
        memberJoinDto.setPw(passwordEncoder.encode(memberJoinDto.getPw()));
        return join(Member.of(memberJoinDto));
    }

    private void validateDuplicateMember(Member member) {
        repository.findByUserid(member.getUserid())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    public Optional<Member> findOne(String userId) {
        return repository.findByUserid(userId);
    }
}
