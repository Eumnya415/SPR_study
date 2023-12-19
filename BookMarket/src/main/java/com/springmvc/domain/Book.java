// 작성일 : 2023-12-18

package com.springmvc.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor // @NoArgsConstructor는 매개변수가 없는 기본 생성자를 자동으로 생성
public class Book {
    private String bookId;       // 도서 ID
    private String name;         // 도서명
    private int unitPrice;       // 가격
    private String author;       // 저자
    private String description;  // 설명
    private String publisher;     // 출판사
    private String category;      // 분류
    private long unitsInStock;     // 재고 수
    private String releaseDate;    // 출판일 (월/년)
    private String condition;      // 신규 도서 또는 중고 도서 또는 전자책
    // 클래스의 멤버 변수를 선언
    // 각 변수는 도서의 다양한 속성을 나타내며, 이들은 모두 private로 선언되어 클래스 외부에서 직접 접근할 수 없다.

    public Book(String bookId, String name, int unitPrice) {
        this.bookId = bookId;
        this.name = name;
        this.unitPrice = unitPrice;
        // 매개변수가 있는 생성자를 선언
        // 이 생성자를 통해 Book 객체를 생성할 때 bookId, name, unitPrice 필드를 초기화할 수 있다.
        // Book 클래스는 웹 애플리케이션에서 도서 정보를 관리하는 데 사용된다.
    }
}
