package service;

import java.util.List;
import model.FruitTransaction;
import service.strategy.OperationStrategy;

public interface ShopService {
    void process(List<FruitTransaction> transactions);
}
