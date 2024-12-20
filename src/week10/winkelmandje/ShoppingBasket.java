package week10.winkelmandje;

import java.util.LinkedList;
import java.util.List;

public class ShoppingBasket {
    private List<OrderLine> orderLines;

    public ShoppingBasket() {
        orderLines = new LinkedList<>();
    }

    public void addItem(Item item){
        for(OrderLine orderLine : orderLines){
            if(orderLine.getItem().equals(item)){
                orderLine.setAmount(orderLine.getAmount() + 1);
                return;
            }
        }
        orderLines.add(new OrderLine(item, 1));
    }
    public void removeItem(Item item){
        for(OrderLine orderLine : orderLines){
            if(orderLine.getItem().equals(item)){
                orderLines.remove(orderLine);
                return;
            }
        }
    }
    public double getPrice(){
        double totalPrice = 0;
        for(OrderLine orderLine : orderLines){
            totalPrice += orderLine.getAmount() * orderLine.getItem().getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-7s %-40s %6s %8s\n", "nummer", "beschrijving", "aantal", "totaal"));
        for(OrderLine orderLine : orderLines){
            sb.append(orderLine.toString()).append("\n");
        }

        return sb.toString();
    }
}
