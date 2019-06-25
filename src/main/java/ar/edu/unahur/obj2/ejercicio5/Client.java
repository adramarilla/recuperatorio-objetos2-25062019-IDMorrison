package ar.edu.unahur.obj2.ejercicio5;

import java.util.List;
import java.util.Objects;

public class Client {

    private String id;
    private String name;
    private String lastName;
    private String documentNumber;
    private List<Account> accounts;

    public Client(String id, String name, String lastName, String documentNumber, List<Account> accounts) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.documentNumber = documentNumber;
        this.accounts = accounts;
    }

    public double calcularMontoTotal(){
        return accounts.stream().map(account -> account.getAmount()).reduce(
                ((aDouble, aDouble2) -> aDouble + aDouble2)).orElse(0.0);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
