public class HunterLinkedList<T>
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

    private Node<T> head;
    private int length;

    //instatiates a new list with no header node and a length of 0
    public HunterLinkedList()
    {
        head = null;
        length = 0;
    }
    
    //peek(). This will retrieve, but not remove, the value of the first element of the list.
    public T peek()
    {
        //if there is no header node, it will return null
        //if a header node exists it will return the data in it
        if(head != null)
        {
            return head.getData();
        }
        return null;
    }

    //push(E n). This will add an integer onto the end of the list.
    public void push(T data)
    {
        //creates new node with the data thats been given in the parameter
        Node<T> temp = new Node<>(data);

        //checks to see if a header node exists
        if(head != null)
        {
            //if a header node doesnt exists, then it will increment through the list until it finds where it ends.
            Node<T> current = head;
            while(current.getLinkNext() != null)
            {
                current = current.getLinkNext();
            }
            //sets the next link of the last node in the list to the new node thats been created
            current.setLinkNext(temp);
        }
        else
        {
            //if a header doesnt exists itll set it to the new node created
            head = temp;
        }

        incrementLength();
    }
    
    
    //pop(). This will remove the first element of the list, and return the removed element.
    public T pop()
    {
        //checks to see if the header node is empty
        if(head != null)
        {
            //creates a data object, and sets it to the data of the node thats about to be removed
            // so that it can be returned later
            T data = head.getData();

            //sees if the header node is linked to another node
            if(head.getLinkNext() != null)
            {
                //if it is then it will change the head node to the node that was in position 2
                head = head.getLinkNext();
                decrementLength();
            }
            else
            {
                //if there is no node linked to the head, it will set the head to null
                head = null;
            }
            return data;
        }
        else
        {   
            //if the header node is empty, it will return null
            return null;
        }
    }

    //insert(int index, E n). This will add an integer to the list at a specified index.
    public void insert(int index, T data) throws IndexOutOfBoundsException
    {
        Node<T> temp = new Node<>(data);
        Node<T> current = head;
        if(index < 0 || length <= index) //makes sure the index is in bounds
        {
            throw new IndexOutOfBoundsException();
        }
        else if(index == 0)
        {
            head = temp;
            head.setLinkNext(current);
        }
        else
        {
            for(int i = 1; i < index; i++)
            {
                current = current.getLinkNext();
            }
            temp.setLinkNext(current.getLinkNext());
            current.setLinkNext(temp);
        }    
        incrementLength();
    }
    //contains(E n). This will return true if an integer value is in the list.
    public boolean contains(T data)
    {
        if(head != null)
        {
            Node<T> current = head;
            for(int i = 0; i < length; i++)
            {
                if(current.getData().equals(data))
                {
                    return true;
                }
                current = current.getLinkNext();
            }
        }
        return false;
    }

    //remove(int index). This will remove the element at the specified index from the list, and return that value.
    public T remove(int index)
    {
        
        Node<T> current = head;
        T data;

        if(index < 0 || length <= index) //makes sure the index is in bounds
        {
            throw new IndexOutOfBoundsException();
        }
        else if(index == 0) // if the index is 0 then it will just change the head to what its next link was
        {
            data = head.getData();
            head = head.getLinkNext();
        }
        else //if the index is greater than 1, it will find the link before it, then change its link the node at the index + 1
        {
            for(int i = 1; i < index; i++)
            {
                current = current.getLinkNext();
            }
            data = current.getLinkNext().getData();
            current.setLinkNext(current.getLinkNext().getLinkNext());
        }
        decrementLength();
        return data;
    }

    //get(int index). This will return the element at the specified index from the list.
    public T get(int index) throws IndexOutOfBoundsException
    {
        //checks to see if the index is out of bounds
        if(index < 0 || length <= index )
        {
            throw new IndexOutOfBoundsException();
        }
        else
        {
            //if the index is in bounds it runs through the list until if finds the item at the index
            Node<T> current = head;
            for(int i = 0; i < index; i++)
            {
                current = current.getLinkNext();
            }
            //returns the data at that index
            return current.getData();
        } 
    }

    //toString(). This will return a String that displays the list in a readable format.
    public String toString()
    {
        String output = "[";
        if(head != null)
        {
            Node<T> current = head;
            while(current.getLinkNext() != null)
            {
                output += current.getData() + ", ";
                current = current.getLinkNext();
            }
            output += current.getData();
        }
        output += "]";
        return output;
    }

    //toArray(). This will return an array containing the values of the elements.
    public Object[] toArray()
    {
        Object[] arr = new Object[length];
        if(head != null)
        {
            Node<T> current = head;
            for(int i = 0; i < length; i++)
            {
                arr[i] = current.getData();
                current = current.getLinkNext();
            }
        }
        return arr;
    }

    public int getLength()
    {
        return length;
    }
    
    private void incrementLength()
    {
        length++;
    }

    private void decrementLength()
    {
        length--;
    }
}