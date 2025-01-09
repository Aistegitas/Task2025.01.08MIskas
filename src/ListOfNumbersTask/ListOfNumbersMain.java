package ListOfNumbersTask;

public class ListOfNumbersMain {
    public static void main(String[] args) {
        ListOfNumbers listObject1 = new ListOfNumbers();
        listObject1.addNumber(15.1d);
        listObject1.addNumber(20d);
        listObject1.addNumber(3.7d);

        ListOfNumbers listObject2 = new ListOfNumbers();
        listObject2.addNumber(0d);
        listObject2.addNumber(2d);

        ListOfNumbers listObject3 = new ListOfNumbers();
        listObject3.addNumber(500d);

        ListOfNumbers result1 = findWithMaxAverage(listObject1, listObject2, listObject3);
        ListOfNumbers result2 = findWithMaxAverage(listObject1, listObject2);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static ListOfNumbers findWithMaxAverage(ListOfNumbers... lists) {
        if (lists.length == 0) {
            return null;
        }

        ListOfNumbers maxAverageList = lists[0];
        double maxAverage = maxAverageList.getAverage();

        for (ListOfNumbers list : lists) {
            double currentAverage = list.getAverage();
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
                maxAverageList = list;
            }
        }
        return maxAverageList;


    }
}

