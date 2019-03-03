package com.hopu.pkg;

public class Test {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        try {
            userDAO.registUser(null);
        } catch (UserDAOException e) {
            System.out.println(e.getMessage());
           //可以打印出异常的详细信息
            e.printStackTrace();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
