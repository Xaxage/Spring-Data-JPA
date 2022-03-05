package com.xaxage.jpaintro.repositories;

import com.xaxage.jpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
