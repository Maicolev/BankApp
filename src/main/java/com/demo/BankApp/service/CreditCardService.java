package com.demo.BankApp.service;

import com.demo.BankApp.model.CreditCardModel;
import com.demo.BankApp.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class CreditCardService implements CreditCardRepository
{
    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    public List<CreditCardModel> findAll() {
        return null;
    }

    @Override
    public List<CreditCardModel> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CreditCardModel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CreditCardModel> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(CreditCardModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CreditCardModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CreditCardModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CreditCardModel> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CreditCardModel> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends CreditCardModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CreditCardModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CreditCardModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CreditCardModel getOne(Long aLong) {
        return null;
    }

    @Override
    public CreditCardModel getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends CreditCardModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CreditCardModel> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CreditCardModel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CreditCardModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CreditCardModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CreditCardModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CreditCardModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}