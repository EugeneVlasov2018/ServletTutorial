package model;

import exceptions.DaoSystemException;
import view.Quiz;

import java.util.*;

public class QuizDaoMock implements QuizDao {
    private Map<Integer, Quiz> memory= new HashMap<Integer, Quiz>();

    public QuizDaoMock() {
        this.memory.put(1,new Quiz(1,"question 1","10%3==3?"));
        this.memory.put(2,new Quiz(2,"question 2","1/1==0?"));
        this.memory.put(3,new Quiz(3,"question 3","Float NanN==Float NaN?"));

    }

    public Quiz selectById(int i) throws DaoSystemException {
        return memory.get(i);
    }

    public List<Quiz> selectAll() throws DaoSystemException {
        return new ArrayList<Quiz>(memory.values());
    }
}
