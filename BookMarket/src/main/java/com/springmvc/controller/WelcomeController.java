//작성일 : 2023-12-18

package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@Controller를 선언하여 자바 클래스 WelcomeController가 컨트롤러임을 나타냄

public class WelcomeController {
    @RequestMapping(value="/home", method= RequestMethod.GET)
    // @RequestMapping은 클라이언트의 요청 URL이 /home이면 WelcomeController 컨트롤러의 welcome() 메서드에 매핑

    public String welcome(Model model) {
        // welcome() 메서드 : 클라이언트의 요청 URL 처리를 직접 담당하는 요청 처리 메서드
        // 'Model' 파라미터는 뷰에 전달될 속성들을 저장하는 데 사용

        model.addAttribute("greeting", "Welcome to BookMarket");
        model.addAttribute("strapline", "Welcome to Shopping Mall!");
        // addAttribute() 메서드 : Model 타입 객체의 멤버 메서드로 이를 이용하여 뷰에 전달할 정보를 담는다.
        // "Welcome to BookMarket", "Welcome to Shopping Mall!"이 각각 greeting, strapline 속성 이름에 저장되어 JSP 웹페이지로 전달

        return "welcome";
        // 클라이언트 요청 URL에 대해 처리된 결과를 사용자에게 보여주는 뷰
        // 웹 브라우저에 출력되는 웹 페이지는 welcome.jsp 파일이 된다.
    }
}
