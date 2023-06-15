package ru.pavlov.spring_rest_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.pavlov.spring_rest_api.model.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
