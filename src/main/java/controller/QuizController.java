package controller;

import dao.QuizDao;
import dao.QuizDaoMock;
import manager.TransactionManager;
import manager.TransactionManagerMock;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("servlettut/")
public class QuizController extends HttpServlet {
    public static final String PARAM_ID = "id";
    public static final String ATTRIBUTE_QUIZ = "quiz";
    public static final String PAGE_OK = "quiz.jsp";
    public static final String PAGE_ERROR = "quizAll.do";

    private QuizDao quizDao = new QuizDaoMock();
    private TransactionManager transactionManager = new TransactionManagerMock();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idString = req.getParameter(PARAM_ID);
    }
}
