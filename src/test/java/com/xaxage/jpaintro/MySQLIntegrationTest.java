package com.xaxage.jpaintro;

import com.xaxage.jpaintro.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ActiveProfiles("local")
@DataJpaTest//This brings only minimal to test Spring data JPA stuff
@ComponentScan(basePackages = {"package com.xaxage.jpaintro.bootstrap"})//TO bring bootstrapping data
//Without this even though active profile is set, DataJpaTest will override and set H2 database instead
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MySQLIntegrationTest {

    @Autowired
    BookRepository bookRepository;

    @Test
    void testMySQL() {

        long countBefore = bookRepository.count();
        assertThat(countBefore).isEqualTo(2);
    }
}
