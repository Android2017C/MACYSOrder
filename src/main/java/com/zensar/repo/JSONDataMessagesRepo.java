package com.zensar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.entity.ConsumeJSONEntity;

public interface JSONDataMessagesRepo extends JpaRepository<ConsumeJSONEntity, Integer> {

}
