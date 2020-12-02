package com.codeup.blog.repos;

import com.codeup.blog.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdRepository extends JpaRepository<Ad, Long> {
    // Query methods
    Ad findByDescription(String desc); // mysql> select * from ads where description = ?;
    List<Ad> findAllByTitleIsLike(String term);
}