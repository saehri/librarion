package com.librarion.repository;

import com.librarion.models.Books;
import com.librarion.models.Members;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Members, Long> {
    Optional<Members> findByFirstName(String firstName);
}
