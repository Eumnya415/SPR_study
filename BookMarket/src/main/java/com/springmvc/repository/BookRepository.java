// 작성일 : 2023-12-18

package com.springmvc.repository;

import com.springmvc.domain.Book;

import java.util.List;

public interface BookRepository {
    // 인터페이스는 메서드의 시그니처만을 정의
    // 이 메서드들의 구현은 이 인터페이스를 구현하는 클래스에서 제공해야 함.
    List<Book> getAllBookList();
}
