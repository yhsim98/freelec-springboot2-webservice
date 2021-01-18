package com.jojoldu.book.springboot.domain.user;
// 권한을 나타내주는 열거형

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");
    // 스프링 시큐리티에서는 권한 코드에 항상 ROLE_이 앞에 있어야 한다

    private final String key;
    private final String title;
}
