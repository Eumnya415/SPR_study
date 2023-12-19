// 작성일 : 2023-12-18

package com.springmvc.service;

import com.springmvc.domain.Book;
import com.springmvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// @Service 어노테이션은 이 클래스가 서비스를 제공하는 스프링 빈임을 나타냄
// BookService 인터페이스를 구현

public class BookServiceImpl implements BookService {

    @Autowired
    // BookRepository를 사용하기 위해 @Autowired 어노테이션을 사용하여 의존성 주입
    // 이를 통해 스프링이 BookRepository의 구현체를 이 클래스에 제공하게 된다.

    private BookRepository bookRepository;

    @Override
    public List<Book> getAllBookList() {
        return bookRepository.getAllBookList();
    }
}
