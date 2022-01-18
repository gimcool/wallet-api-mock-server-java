package com.gimcool.sofa.mock.repository;

import com.gimcool.sofa.mock.entity.ApiToken;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiTokenRepository extends CrudRepository<ApiToken, Long> {
}
