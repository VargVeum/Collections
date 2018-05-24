package qa.workshops;

import java.util.HashMap;
import java.util.Map;

public class WorkWithHashMapCollection {

    public void hashMap(){
        HashMap<String, Integer>order = new HashMap<>();
                //order.put("Chicken", 2);
                order.put("Salad", 2);
                order.put("Soup", 1);
                order.put("Hamburger", 1);

                showOrder(order);

                if(order.containsKey("Chicken")){
                    order.replace("Chicken", order.get("Chicken")+1);
        }
        else order.put("Chicken", 1);
                showOrder(order);

        // Проверяем наличие товара в заказе
        int expectedQuantity = 3;
        if(!(order.containsKey("Toffu") && order.get("Toffu")==expectedQuantity)){
            System.out.println("Такого товара нет");
        }
    }






    // Метод вывода заказа на экран
    private void showOrder(HashMap<String, Integer> order) {
        // перебор элементов
        for(Map.Entry<String, Integer> item : order.entrySet()){
            System.out.printf("Key: %-20s  Value: %d \n", item.getKey(), item.getValue());
        }
        System.out.println();
    }


}
