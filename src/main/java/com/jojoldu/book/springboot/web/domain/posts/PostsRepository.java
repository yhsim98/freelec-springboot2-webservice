package com.jojoldu.book.springboot.web.domain.posts;

// Posts 클래스로 Database를 접근하게 해줄 JpaRepository

/*
 * MyBatis 등에서 Dao 라고 부르는 DB Layer 접근자
 * JPA에서는 Repository라고 부르며 인터페이스로 생성한다
 * JpaRepository<Entitiy 클래스, PK 타입>를 상속시키면 기본적인 CRUD 메소드가 자동으로 생성된다
 *
 * Entity 클래스와 기본 Entity Repository는 함꼐 위치해야 한다
 * Entity 클래스는 기본 Repository 없이는 제대로 역할을 할 수 없다
 * 따라서 같은 패키지에서 함께 관리해야 한다
 * 도메인별로 프로젝트를 분리할 경우를 대비해 도메인 패키지에서 함께 관리한다
 */

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository 생성
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
