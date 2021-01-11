package com.jojoldu.book.springboot.web.dto;
/*
2020.01.05 - lombok 추가
lombok이란 자바 라이브러리로써 자바 개발할 때 사용하는 코드 Getter, Setter, 기본생성자, toString 등을
어노테이션으로 자동 생성해 준다
 */
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/*
선언된 모든 필드의 get 메소드를 생성해 준다

선언된 모든 final 필드가 포함된 생성자를 생성해 준다
final이 없는 필드는 생성자에 포함되지 않습니다
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
