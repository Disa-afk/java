package service;

import domain.Client;
import repository.ClientRepository;

public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public void addClient(Client client) {
        repository.add(client);
    }
}
