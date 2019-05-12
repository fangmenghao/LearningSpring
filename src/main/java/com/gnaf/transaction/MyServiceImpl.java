package com.gnaf.transaction;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author Derek
 * @date 2019/5/12 8:59
 */
public class MyServiceImpl implements MyService {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
