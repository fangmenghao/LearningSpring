package com.gnaf.jdbc;

import org.springframework.jdbc.core.RowCallbackHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Derek
 * @date 2019/5/2 9:48
 */
public class ListRowCallbackHandler<T> implements RowCallbackHandler {

    private List<T> results = new ArrayList<T>();

    public void processRow(ResultSet rs) throws SQLException {

        // T是具体Bean类

    }

    public List<T> getResults() {
        return results;
    }

}
