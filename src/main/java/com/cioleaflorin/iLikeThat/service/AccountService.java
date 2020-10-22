package com.cioleaflorin.iLikeThat.service;

import com.cioleaflorin.iLikeThat.domain.Account;
import com.cioleaflorin.iLikeThat.exception.ResourceNotFoundException;
import com.cioleaflorin.iLikeThat.persistance.AccountRepository;
import com.cioleaflorin.iLikeThat.transfer.SaveAccountRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    public static final Logger LOGGER = LoggerFactory.getLogger(AccountService.class);

    //IoC inversion of control
    private final AccountRepository accountRepository;

    //Dependency injection
    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public Account createAccount(SaveAccountRequest request) {
        LOGGER.info("Creating account {}", request);
        Account account=new Account();
        account.setNickname(request.getNickname());
        account.setDescription(request.getDescription());

        return accountRepository.save(account);
    }


    public Account getAccount(long id) {
        LOGGER.info("Retrieving account {}", id);
        //using Optional
        return accountRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Account " + id + " does not exist.")
        );
    }


    public Account updateAccount (long id, SaveAccountRequest request) {
        LOGGER.info("Updating account {}:  {}", id, request);

        Account account = getAccount(id);
        BeanUtils.copyProperties(request, account);
        return accountRepository.save(account);
    }


    public void deleteAccount(long id) {
        LOGGER.info("Deleting account {}", id);
        accountRepository.deleteById(id);
    }
}
