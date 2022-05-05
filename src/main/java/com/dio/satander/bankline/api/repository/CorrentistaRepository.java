package com.dio.satander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.satander.bankline.api.modal.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {
}
