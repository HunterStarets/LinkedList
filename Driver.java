import java.util.LinkedList;

public class Driver
{
    public static void main(String [] args)
    {
        
        //peek(). This will retrieve, but not remove, the value of the first element of the list.
        //push(E n). This will add an integer onto the end of the list.
        //pop(). This will remove the first element of the list, and return the removed element.
        //insert(int index, E n). This will add an integer to the list at a specified index.
        //contains(E n). This will return true if an integer value is in the list.
        //remove(int index). This will remove the element at the specified index from the list, and return that value.
        //get(int index). This will return the element at the specified index from the list.
        //toString(). This will return a String that displays the list in a readable format.
        //toArray(). This will return an array containing the values of the elements.

        //---------PART A--------------//
        HunterLinkedList<Integer> list = new HunterLinkedList<>();

        list.push(1);
        list.push(2);
        list.push(4);
        list.insert(0, 3);

        //3 at position 0
        //1 at position 1
        //2 at position 2
        //4 at position 4
        System.out.println("Should print 3: " + list.peek().equals(3));
        System.out.println("Should print 3 " + list.pop().equals(3));
        System.out.println("Should print true: " + list.contains(1));
        System.out.println("Should print 1 " + list.get(0).equals(1));
        System.out.println("Should print 1 " + list.remove(0).equals(1));
        System.out.println("Should print [2, 4] " + list.toString().equals("[2, 4]"));
        
        /*HunterLinkedList<String> stringList = new HunterLinkedList<>();
        
        stringList.push("Hunter");
        System.out.println(stringList.contains("Hunter"));
        System.out.println(stringList.get(0));
        stringList.insert(0, "Lake");
        System.out.println(stringList.get(0));
        System.out.println(stringList.get(1));
        System.out.println(stringList);
        stringList.insert(1, "James");
        System.out.println(stringList);
        System.out.println(stringList.remove(1));
        System.out.println(stringList.remove(0));
        System.out.println(stringList.remove(0));
        
        System.out.println(stringList.get(1));
        System.out.println(stringList);
        */
        //-------------PART B ---------------//
        HunterLinkedList<Integer> firstList = new HunterLinkedList<Integer>();
        HunterLinkedList<Integer> secondList = new HunterLinkedList<Integer>();

        firstList.push(1);
        firstList.push(2);
        firstList.push(3);
        firstList.push(4);
        firstList.push(5);
        secondList.push(6);
        secondList.push(7);
        secondList.push(8);
        secondList.push(9);
        

        System.out.println("Summing the first LinkedList equals 15: " + (sumLinkedList(firstList) == (1 + 2 + 3 + 4 + 5)));
        System.out.println("Combining the first and second LinkedLists: " + concatenatLinkedList(firstList, secondList));
    }

    public static int sumLinkedList(HunterLinkedList<Integer> list)
    {
        int sum = 0;
        for(int i = 0; i < list.getLength(); i++)
        {
            sum += list.get(i);
        }
        return sum;
    }

    public static HunterLinkedList<Integer> concatenatLinkedList(HunterLinkedList<Integer> firstList, HunterLinkedList<Integer> secondList)
    {
        HunterLinkedList<Integer> combinedList = new HunterLinkedList<Integer>();
        for(int i = 0; i < firstList.getLength(); i++)
        {
            combinedList.push(firstList.get(i));
        }
        for(int i = 0; i < secondList.getLength(); i++)
        {
            combinedList.push(secondList.get(i));
        }

        return combinedList;
    }
}