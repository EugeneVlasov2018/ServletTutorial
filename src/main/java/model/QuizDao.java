package model;

import exceptions.DaoSystemException;
import view.Quiz;

import java.util.List;

public interface QuizDao {
    public static Quiz selectById(int i) throws DaoSystemException, Exception{

    };

    public List<Quiz> selectAll()throws DaoSystemException;
}
