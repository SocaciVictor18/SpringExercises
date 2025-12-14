package org.example.chapter12.service;


import org.example.chapter12.model.Account;
import org.example.chapter12.repository.AccountRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class TransferServiceUnitTests {

    @Autowired
    private AccountRepo accountRepository;

    @Autowired
    private TransferService transferService;

    @Test
    void transferServiceTransferAmountTest() {
        Account sender = accountRepository.findById(1L).orElseThrow();
        Account receiver = accountRepository.findById(2L).orElseThrow();

        BigDecimal senderInitialAmount = sender.getAmount();
        BigDecimal receiverInitialAmount = receiver.getAmount();
        BigDecimal transferAmount = new BigDecimal("100");

        transferService.transferMoney(1, 2, transferAmount);

        Account updatedSender = accountRepository.findById(1L).orElseThrow();
        Account updatedReceiver = accountRepository.findById(2L).orElseThrow();

        assertEquals(0, senderInitialAmount.subtract(transferAmount).compareTo(updatedSender.getAmount()));
        assertEquals(0, receiverInitialAmount.add(transferAmount).compareTo(updatedReceiver.getAmount()));
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


