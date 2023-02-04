package com.nahwasa.springsecuritybasicsettingforspringboot3.repository;

import com.nahwasa.springsecuritybasicsettingforspringboot3.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
