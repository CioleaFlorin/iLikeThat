package com.cioleaflorin.iLikeThat;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import com.cioleaflorin.iLikeThat.domain.Account;
import com.cioleaflorin.iLikeThat.service.AccountService;
import com.cioleaflorin.iLikeThat.steps.AccountSteps;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class AccountIntegrationTests {

    @Autowired
    private AccountSteps accountSteps;
    @Autowired
    private AccountService accountService;

    @Test
    public void testGetAccount_whenExistingAccount_thenReturnAccount() {
        Account createdAccount = accountSteps.createAccount();
        Account account = accountService.getAccount(createdAccount.getId());
        //now account and created account are the same

        assertThat(account.getId(), is(createdAccount.getId()));
        assertThat(account.getNickname(), is(createdAccount.getNickname()));
        assertThat(account.getDescription(), is(createdAccount.getDescription()));
    }

}
