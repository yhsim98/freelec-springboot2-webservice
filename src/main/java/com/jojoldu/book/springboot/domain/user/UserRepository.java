package com.jojoldu.book.springboot.domain.user;
// User Entity 클래스를 데이터베이스와 상호작용할 수 있게 해주는 인터페이스

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByEmail(String email);
    // 소셜 로그인으로 반환되는 값 중 email을 통해 이미 생성된 사용자인지 처음 가입하는 사용자인지 판단하기 위한 메소드
}
