package controller;

import model.QuizDao;
import model.QuizDaoMock;
import manager.TransactionManager;
import manager.TransactionManagerMock;
import view.Quiz;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.Callable;


public class QuizController extends HttpServlet {
    public static final String PARAM_ID = "id";
    public static final String ATTRIBUTE_QUIZ = "quiz";
    public static final String PAGE_OK = "quiz.jsp";
    public static final String PAGE_ERROR = "quizAll.do";

    private QuizDao quizDao = new QuizDaoMock();
    private TransactionManager transactionManager = new TransactionManagerMock();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //получаем значение 
        String idStr = req.getParameter(PARAM_ID);


        if(idStr!= null && !idStr.equals("")){
            try{
                final Integer id= Integer.valueOf(idStr);
                Quiz quiz = selectById(id);

                if(quiz != null){
                    req.getRequestDispatcher(PAGE_OK).forward(req,resp);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private Quiz selectById (final Integer id) throws Exception {
        return transactionManager.doInTransaction(new Callable<Quiz>() {
            public Quiz call() throws Exception {
                return QuizDao.selectById(id);
            }
        });
    }
}
