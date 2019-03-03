package manager;

import java.util.concurrent.Callable;

public class TransactionManagerMock implements TransactionManager {

    public <T> T doInTransaction(Callable<T> unitOfWork) throws Exception {
     return unitOfWork.call();
    }
}
