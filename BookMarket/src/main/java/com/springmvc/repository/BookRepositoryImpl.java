// 작성일 : 2023-12-18

package com.springmvc.repository;

import com.springmvc.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
// @Repository 애너테이션은 이 클래스가 데이터 접근 코드를 담당하는 레포지토리 역할을 하는 스프링 빈임을 나타냄
// 이 클래스는 BookRepository 인터페이스를 구현한다.

public class BookRepositoryImpl implements BookRepository {

    private List<Book> listOfBooks = new ArrayList<Book>();
    // 도서 정보를 저장할 List를 선언하고, ArrayList 인스턴스로 초기화

    public BookRepositoryImpl() {
        // 기본 생성자를 선언
        // 이 생성자에서는 세 개의 Book 객체를 생성하고, 이들을 listOfBooks 리스트에 추가한다.
        // 이렇게 생성된 Book 객체들은 이 클래스의 메서드를 통해 조회할 수 있다.

        Book book1 = new Book("ISBN1234", "C# 교과서", 30000);
        book1.setAuthor("박용준");
        book1.setDescription(
                "C# 교과서』는 생애 첫 프로그래밍 언어로 C#을 시작하는 독자를 대상으로 한다. 특히 응용 프로그래머를 위한 C# 입문서로, C#을 사용하여 게임(유니티), 웹, 모바일, IoT 등을 개발할 때 필요한 C# 기초 문법을 익히고 기본기를 탄탄하게 다지는 것이 목적이다.");
        book1.setPublisher("길벗");
        book1.setCategory("IT전문서");
        book1.setUnitsInStock(1000);
        book1.setReleaseDate("2020/05/29");

        Book book2 = new Book("ISBN1235", "Node.js 교과서", 36000);
        book2.setAuthor("조현영");
        book2.setDescription(
                "이 책은 프런트부터 서버, 데이터베이스, 배포까지 아우르는 광범위한 내용을 다룬다. 군더더기 없는 직관적인 설명으로 기본 개념을 확실히 이해하고, 노드의 기능과 생태계를 사용해보면서 실제로 동작하는 서버를 만들어보자. 예제와 코드는 최신 문법을 사용했고 실무에 참고하거나 당장 적용할 수 있다.");
        book2.setPublisher("길벗");
        book2.setCategory("IT전문서");
        book2.setUnitsInStock(1000);
        book2.setReleaseDate("2020/07/25");

        Book book3 = new Book("ISBN1236", "어도비 XD CC 2020", 25000);
        book3.setAuthor("김두한");
        book3.setDescription(
                "어도비 XD 프로그램을 통해 UI/UX 디자인을 배우고자 하는 예비 디자이너의 눈높이에 맞게 기본적인 도구를 활용한 아이콘 디자인과 웹&앱 페이지 디자인, UI 디자인, 앱 디자인에 애니메이션과 인터랙션을 적용한 프로토타이핑을 학습합니다.");
        book3.setPublisher("길벗");
        book3.setCategory("IT활용서");
        book3.setUnitsInStock(1000);
        book3.setReleaseDate("2019/05/29");

        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);

    }

    @Override
   public List<Book> getAllBookList() {
        // BookRepository 인터페이스의 getAllBookList() 메서드를 구현
        // 이 메서드는 listOfBooks 리스트를 반환하여, 저장된 모든 도서 정보를 가져올 수 있게 한다.

        return listOfBooks;
    }
}
