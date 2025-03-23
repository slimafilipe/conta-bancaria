package dev.filipe.service;

import dev.filipe.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
