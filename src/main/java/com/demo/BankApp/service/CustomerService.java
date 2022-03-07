package com.demo.BankApp.service;

import com.demo.BankApp.model.CustomerModel;
import com.demo.BankApp.repository.CustomerRepository;
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
public class CustomerService implements CustomerRepository
{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerModel> findAll() {
        return null;
    }

    @Override
    public List<CustomerModel> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CustomerModel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<CustomerModel> findAllById(Iterable<Long> longs) {
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
    public void delete(CustomerModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CustomerModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends CustomerModel> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CustomerModel> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CustomerModel> findById(Long aLong) {
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
    public <S extends CustomerModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CustomerModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CustomerModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CustomerModel getOne(Long aLong) {
        return null;
    }

    @Override
    public CustomerModel getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends CustomerModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CustomerModel> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CustomerModel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CustomerModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CustomerModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CustomerModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CustomerModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
