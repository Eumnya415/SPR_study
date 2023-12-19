// 작성일 : 2023-12-18

package com.springmvc.controller;

import com.springmvc.domain.Book;
import com.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView; // 추가
import java.util.List;

@Controller
@RequestMapping("/books") // 추가
// @Controller 애너테이션은 이 클래스가 사용자의 요청을 처리하는 컨트롤러 역할을 하는 스프링 빈임을 나타낸다.

public class BookController {
    @Autowired
    private BookService bookService;
    // BookService를 사용하기 위해 @Autowired 애너테이션 사용하여 의존성주입
    // 스프링이 BookService의 구현체를 이 클래스에 제공하게 된다.

    // 웹 애플리케이션을 개발할 때 유연성과 확장성을 높이려면 BookController 컨트롤러에서 저장소 객체인 BookRepository로 직접 접근하지 말고
    // 서비스 객체인 BookService로 저장소 객체에 접근해야 한다.

    @GetMapping // 수정
    // 사용자의 웹 요청 URL이 /books인 경우 requestBookList() 메서드가 처리하도록 매핑시킨다.
    // 이는 @RequestMapping과 같다.

    public String requestBookList(Model model) {
        List<Book> list = bookService.getAllBookList();
        model.addAttribute("bookList", list);
        return "books";
    }


    @GetMapping("/all") // 수정
    public ModelAndView requestAllBooks() {
        ModelAndView modelAndView = new ModelAndView();
        // ModelAndView 클래스의 modelAndView 인스턴스 생성

        List<Book> list = bookService.getAllBookList();
        modelAndView.addObject("bookList", list);
        // 도서 목록을 가져와 저장된 list 값을 모델 속성 bookList에 저장

        modelAndView.setViewName("books");
        // 뷰 이름을 books로 설정하여 books.jsp 파일 출력

        return modelAndView;
        // ModelAndView 클래스의 modelAndView 인스턴스를 반환
    }
}

