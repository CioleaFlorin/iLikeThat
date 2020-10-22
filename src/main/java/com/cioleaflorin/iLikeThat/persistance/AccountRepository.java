package com.cioleaflorin.iLikeThat.persistance;

import com.cioleaflorin.iLikeThat.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
