package ru.myrkwill.SpringDemoBot.repository;

import org.springframework.data.repository.CrudRepository;
import ru.myrkwill.SpringDemoBot.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
