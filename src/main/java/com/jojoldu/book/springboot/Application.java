package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
메인 클래스
스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정
@SpringBootApplication이 있는 위치부터 설정을 읽어가기 떄문에 이 클래스는 항상 프로젝트
최상단에 위치해야만 한다

SpringApplication.run을 통해 내장 WAS를 실행한다
내장 WAS란 별도로 외부에 WAS를 두지 않고 애플리케이션을 실행할 때 내부에서 WAS를 실행하는
것을 이야기한다, 이렇게 하면 항상 서버에 톰캣을 설치할 필요가 없게 된다

스프링부트에서는 내장 WAS를 사용하는 것을 권장하고 있다
언제 어디서나 같은 환경에서 스프링 부트를 배포할 수 있기 때문인데
외장 WAS를 사용한다면 모든 서버의 WAS의 종류 버전 설정을 일치시켜야 한다
만약 새로운 서버가 추가되면 모든 서버가 같은 WAS환경을 구축해야만 한다
내장 WAS를 사용한다면 이런 문제를 피할 수 있다
 */
//@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
