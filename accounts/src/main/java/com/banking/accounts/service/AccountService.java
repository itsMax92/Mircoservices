package com.banking.accounts.service;

import com.banking.accounts.dto.CustomerDto;

public interface AccountService {

    /**
     * @param customerDto - CustomerDTO Object
     */
    void createAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber
     * @return Customer DTO
     */
    CustomerDto fetchAccountDetails(String mobileNumber);

    /**
     *
     * @param customerDto
     * @return boolean value
     */
    boolean updateAccountDetails(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber
     * @return boolean value if account has been deleted or not
     */
    boolean deleteAccount(String mobileNumber);
}
