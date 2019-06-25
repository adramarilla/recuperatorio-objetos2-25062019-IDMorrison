package ar.edu.unahur.obj2.ejercicio5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {

    private List<Client> clients;

    public Bank(List<Client> clients) {
        this.clients = clients;
    }

    // 5.1
    public Client findClientByDocumentNumber(String documentNumber) {
        return clients.stream().filter(client -> client.getDocumentNumber().equals(documentNumber))
                .findAny().get();
    }

    // 5.2
    public Client findRichestClient() {
        Comparator<Client> comparator = Comparator.comparing( Client::calcularMontoTotal );

        return clients.stream().max(comparator).get();
    }

    // 5.3
    public double calculateTreasure() {
        return clients.stream().map(Client::calcularMontoTotal)
                .reduce(((aDouble, aDouble2) -> aDouble + aDouble2)).orElse(0.0);
    }
}
