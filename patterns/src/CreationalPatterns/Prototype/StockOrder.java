package CreationalPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class StockOrder extends Order {

    private String symbol;
    private List<String> names;

    public StockOrder(int quantity, String symbol, List<String> names) {
        super(quantity);
        this.symbol = symbol;
        this.names = names;
    }

    public String getSymbol() {
        return symbol;
    }


    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "StockOrder{" +
                "quantity='" + super.getQuantity() + '\'' +
                "symbol='" + symbol + '\'' +
                "names='" + names + '\'' +
                '}';
    }

    public StockOrder clone(){
        return new StockOrder(this.getQuantity(), this.getSymbol(), new ArrayList<>(this.getNames()));
    }
}
