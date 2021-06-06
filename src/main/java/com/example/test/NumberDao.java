package com.example.test;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Defined method in Interface.
 *
 * @author  Surabhi Shukla
 * @version 2.1.5
 * @since   2020-02-28
 */

@Repository
@Transactional
public interface NumberDao {

    public void countNumber();
}
