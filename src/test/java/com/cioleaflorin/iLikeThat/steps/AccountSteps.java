package com.cioleaflorin.iLikeThat.steps;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import com.cioleaflorin.iLikeThat.domain.Account;
import com.cioleaflorin.iLikeThat.service.AccountService;
import com.cioleaflorin.iLikeThat.transfer.SaveAccountRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountSteps {
    @Autowired
    private AccountService accountService;

    public Account createAccount() {
        SaveAccountRequest request = new SaveAccountRequest();
        request.setNickname("cFlorin " + System.currentTimeMillis());
        request.setDescription("I'm new here! " + System.currentTimeMillis());

        Account createdAccount = accountService.createAccount(request);
        assertThat(createdAccount,notNullValue());
        assertThat(createdAccount.getId(), greaterThan(0L));
        assertThat(createdAccount.getNickname(), is(request.getNickname()));
        assertThat(createdAccount.getDescription(), is(request.getDescription()));

        return createdAccount;
    }
}
