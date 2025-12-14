package org.example.chapter12.service;


import org.example.chapter12.exception.AccountNotFoundException;
import org.example.chapter12.model.Account;
import org.example.chapter12.repository.AccountRepo;
import org.example.chapter12.repository.AccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

//@ExtendWith(MockitoExtension.class)
@SpringBootTest
public class TransferServiceUnitTests {


    @MockitoBean
    private AccountRepo accountRepository;

    @Autowired
    private TransferService transferService;

    @Test
    void transferServiceTransferAmountTest() {
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account receiver = new Account();
        receiver.setId(2);
        receiver.setAmount(new BigDecimal(1000));

        when(accountRepository.findById(1L))
      .thenReturn(Optional.of(sender));
        when(accountRepository.findById(2L))
      .thenReturn(Optional.of(receiver));

        transferService
                .transferMoney(1, 2, new BigDecimal(100));

        verify(accountRepository)
      .changeAmount(1, new BigDecimal(900));
        verify(accountRepository)
      .changeAmount(2, new BigDecimal(1100));
    }

//    @Mock
//    private AccountRepo accountRepository;
//
//    @InjectMocks
//    private TransferService transferService;
//
//    @Test
//    public void moneyTransferHappyFlow() {
//        Account sender = new Account();
//        sender.setId(1);
//        sender.setAmount(new BigDecimal(1000));
//
//        Account destination = new Account();
//        destination.setId(2);
//        destination.setAmount(new BigDecimal(1000));
//
//        given(accountRepository.findById(sender.getId()))
//                .willReturn(Optional.of(sender));
//
//        given(accountRepository.findById(destination.getId()))
//                .willReturn(Optional.of(destination));
//
//        transferService.transferMoney(1, 2, new BigDecimal(100));
//
//        verify(accountRepository)
//                .changeAmount(1, new BigDecimal(900));
//
//        verify(accountRepository)
//                .changeAmount(2, new BigDecimal(1100));
//    }
//
//    @Test
//    public void moneyTransferDestinationAccountNotFoundFlow() {
//        Account sender = new Account();
//        sender.setId(1);
//        sender.setAmount(new BigDecimal(1000));
//
//        given(accountRepository.findById(1L))
//                .willReturn(Optional.of(sender));
//
//        given(accountRepository.findById(2L))
//                .willReturn(Optional.empty());
//
//        assertThrows(
//                AccountNotFoundException.class,
//        () -> transferService.transferMoney(1, 2, new BigDecimal(100))
//    );
//
//        verify(accountRepository, never())
//        .changeAmount(anyLong(), any());
//    }

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


