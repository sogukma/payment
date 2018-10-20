package com.pretzel.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pretzel.domain.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

}
