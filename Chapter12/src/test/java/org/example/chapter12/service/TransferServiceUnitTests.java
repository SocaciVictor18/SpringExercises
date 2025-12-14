package org.example.chapter12.service;


import org.example.chapter12.model.Account;
import org.example.chapter12.repository.AccountRepo;
import org.example.chapter12.repository.AccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class TransferServiceUnitTests {

    @Mock
    private AccountRepo accountRepository;

    @InjectMocks
    private TransferService transferService;

    @Test
    public void moneyTransferHappyFlow() {
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account destination = new Account();
        destination.setId(2);
        destination.setAmount(new BigDecimal(1000));

        given(accountRepository.findById(sender.getId()))
                .willReturn(Optional.of(sender));

        given(accountRepository.findById(destination.getId()))
                .willReturn(Optional.of(destination));

        transferService.transferMoney(1, 2, new BigDecimal(100));

        verify(accountRepository)
                .changeAmount(1, new BigDecimal(900));

        verify(accountRepository)
                .changeAmount(2, new BigDecimal(1100));
    }

//    @Test
//    @DisplayName("Test the amount is transferred " +
//            "from one account to another if no exception occurs.")
//    public void moneyTransferHappyFlow() {
//        AccountRepo accountRepository =
//                mock(AccountRepo.class);
//        TransferService transferService =
//                new TransferService(accountRepository);
//
//        Account sender = new Account();
//        sender.setId(1);
//        sender.setAmount(new BigDecimal(1000));
//
//        Account destination = new Account();
//        destination.setId(2);
//        destination.setAmount(new BigDecimal(1000));
//
//        given(accountRepository.findById(sender.getId()))
//      .willReturn(Optional.of(sender));
//
//        given(accountRepository.findById(destination.getId()))
//      .willReturn(Optional.of(destination));
//
//        transferService.transferMoney(
//                sender.getId(),
//                destination.getId(),
//                new BigDecimal(100)
//        );
//
//        verify(accountRepository)
//      .changeAmount(1, new BigDecimal(900));
//
//        verify(accountRepository)
//      .changeAmount(2, new BigDecimal(1100));
//    }
}


