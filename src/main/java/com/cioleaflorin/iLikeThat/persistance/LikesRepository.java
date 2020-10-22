package com.cioleaflorin.iLikeThat.persistance;

import com.cioleaflorin.iLikeThat.domain.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikesRepository extends JpaRepository<Likes, Long> {

}
