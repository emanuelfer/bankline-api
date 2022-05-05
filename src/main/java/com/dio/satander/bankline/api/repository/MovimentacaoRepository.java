package com.dio.satander.bankline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.satander.bankline.api.modal.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
