package repository.impl;

import domain.Client;
import repository.ClientRepository;

import java.util.*;

public class InMemoryClientRepository implements ClientRepository {

    private final Map<Integer, Client> storage = new HashMap<>();

    public void add(Client client) {
        storage.put(client.getId(), client);
    }

    public Client findById(int id) {
        return storage.get(id);
    }

    public List<Client> findAll() {
        return new ArrayList<>(storage.values());
    }
}
