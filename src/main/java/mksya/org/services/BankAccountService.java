package mksya.org.services;

import mksya.org.dto.CustomerDTO;
import mksya.org.entities.BankAccount;
import mksya.org.entities.CurrentAccount;
import mksya.org.entities.Customer;
import mksya.org.entities.SavingAccount;
import mksya.org.exceptions.BalanceNotSufficientException;
import mksya.org.exceptions.BankAccountNotFoundException;
import mksya.org.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {

    CustomerDTO saveCustomer(CustomerDTO customerDTO);

    CurrentAccount saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingAccount saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<CustomerDTO> listCustomers();

    CustomerDTO getCustomer(Long customerId);

    List<BankAccount> bankAccountList();
    BankAccount getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;


}
