package com.jojoldu.book.springboot.web.dto;
/*
Junit의 기본 assertThat이 아닌 asertj의 assertThat을 사용했다
assertj역시 Junit에서 자동으로 라이브러리 등록을 해분다
Junit과 비교하여 assertj의 장점이 있는데
1. CoreMatchers와 달리 추가적으로 라이브러리가 필요하지 않는다
2. 자동완성이 좀 더 확실하게 지원돤다
 */
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬북_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        /*
        assertj라는  테스트 검증 라이브러리의 검증 메소드이다
        검증하고 싶은 대상을 메소드 인자로 받는다
        메소드 체이닝이 지원된다
         */
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
