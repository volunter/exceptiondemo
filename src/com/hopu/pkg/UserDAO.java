package com.hopu.pkg;

import java.sql.SQLException;

public class UserDAO {
    public void registUser(String usrName) throws UserDAOException {
        try {
            throw new SQLException();
        } catch (SQLException e) {
            throw new UserDAOException("数据操作失败", e);
        } catch (Exception e) {
            throw new UserDAOException("系统异常", e);
        }
    }
}

