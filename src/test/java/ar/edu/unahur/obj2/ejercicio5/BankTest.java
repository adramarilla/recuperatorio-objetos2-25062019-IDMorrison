package ar.edu.unahur.obj2.ejercicio5;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

public class BankTest {

    private Bank bank;
    private Client client1;
    private Client client2;
    private Client client3;
    private Account account1;
    private Account account2;
    private Account account3;
    private Account account4;
    private Account account5;
    private Account account6;

    @BeforeMethod
    public void setUp() {
        account1 = new Account(1, 10);
        account2 = new Account(2, 20);
        account3 = new Account(3, 30);
        account4 = new Account(4, 40);
        account5 = new Account(5, 50);
        account6 = new Account(6, 60);

        client1 = new Client("c1", "Juan", "Pérez",
                "1111", Arrays.asList(account1, account2));
        client2 = new Client("c2", "Jorge", "López",
                "2222", Arrays.asList(account3, account4, account5));
        client3 = new Client("c3", "Pedro", "Pablo",
                "3333", Arrays.asList(account6));

        bank = new Bank(Arrays.asList(client1, client2, client3));
    }

    @Test
    public void testFindClientByDocumentNumber() {
        Client result = bank.findClientByDocumentNumber("3333");
        // TODO descomentar el assert cuando funcione el método
        //assertEquals(result, client3);
    }

    @Test
    public void testFindRichestClients() {
        Client result = bank.findRichestClient();
        // TODO descomentar el assert cuando funcione el método
        //assertEquals(result, client2);
    }

    @Test
    public void testCalculateTreasure() {
        double treasure = bank.calculateTreasure();
        //assertEquals(treasure, 210);
    }
}