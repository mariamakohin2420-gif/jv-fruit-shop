package service;

import java.util.List;
import java.util.stream.Collectors;
import model.FruitTransaction;

public interface DataConverter {
    List<FruitTransaction> convertToTransaction(List<String> lines);
}
