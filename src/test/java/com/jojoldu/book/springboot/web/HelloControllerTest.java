/*
테스트 클래스
 */

package com.jojoldu.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import  static  org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/*
테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킨다
여기서는 SpringRunner라는 스프링 실행자를 사용한다
즉, 스프링 부트 테스트와 Junit 사이에 연결자 역할을 한다

여러 스프링 어노테이션중 Web에 집중할 수 있는 어노테이션이다
선언할 경우 @Controller, @ControllerAdvice 등을 사용할 수 있다
단, @Service, @Component, @Repository 등은 사용할 수 없다
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {
    /*
    * 스프링이 관리하는 빈을 주입받는다
    *
    * 웹 API 를 테스트할 때 사용한다
    * 스프링 MVC 테스트의 시작점이다
    * 이 클래스를 통해 HTTP, GET, POST 등에 대한 API 검정 테스트를 할 수 있다
    * */
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello = "hello";

        /*
        MockMvc 를 통해 /hello 주소로 HTTP GET 요청을 합니다
        체이닝이 지원되어 아래와 같이 여러 검증 기능을 이어서 선안할 수 있습니다

        mvc.perform 의 결과를 검증합ㄴ디ㅏ
        HTTP Header 의 Status 를 검증하빈다
        우리가 흔히 알고 있는 200, 404, 500 등의 상태를 검증합니다
        여기선 ok 즉, 200인지 아닌지를 검증합니다

        mvc.perform 의 결과를 검증합니다 응답 본문의 내용을 검증합니다
         */
        mvc.perform(get("/hello")).andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}
