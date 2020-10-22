package com.cioleaflorin.iLikeThat.persistance;

import com.cioleaflorin.iLikeThat.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, LikesRepository> {

}
