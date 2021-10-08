package com.mypage.host;

import com.mypage.host.controller.MainController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.servlet.ModelAndView;

@SpringBootTest
class HostApplicationTests {

    @Autowired
    MainController controller;

    ModelAndView m = new ModelAndView();

    @Test
    void sendTest()
    {
        controller.send("IntelliJ 테스터","JUnit 테스트","테스트용 메일 전송입니다!", m);
    }

}