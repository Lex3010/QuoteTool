package com.QuoteTool.QuoteTool.Repositories;

import com.QuoteTool.QuoteTool.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
