package mksya.org.web;

import mksya.org.services.BankAccountService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankAccountRestAPI {

    private BankAccountService bankAccountService;

    public BankAccountRestAPI(BankAccountService bankAccountService) {
        this.bankAccountService = bankAccountService;
    }

}
