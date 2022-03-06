package com.xaxage.jpaintro;

import com.xaxage.jpaintro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class JpaIntroApplicationTests {

    @Autowired
    BookRepository bookRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testBookRepository() {
        long count = bookRepository.count();

        assertThat(count).isGreaterThan(0);
    }
}
