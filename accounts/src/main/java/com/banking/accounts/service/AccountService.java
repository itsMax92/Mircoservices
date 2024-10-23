package com.banking.accounts.service;

import com.banking.accounts.dto.AccountsDto;
import com.banking.accounts.dto.CustomerDto;

public interface AccountService {

    /**
     *
     * @param customerDto - CustomerDTO Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return Customer DTO
     */
    CustomerDto fetchAccountDetails(String mobileNumber);
}
