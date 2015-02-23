package dcll.tp2;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Created by florent on 13/02/15.
 */
public class MyStack extends ArrayList<Item> implements SimpleStack {

    public MyStack() {
        super();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int getSize() {
        return size();
    }

    @Override
    public void push(Item item) {
        add(item);
    }

    public void pushItems(List<Item> items) {
        for(Item i: items) {
            push(i);
        }
    }
    @Override
    public Item peek() throws EmptyStackException {
        if(getSize() == 0) {
            throw new EmptyStackException();
        }

        return this.get(getSize()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if(getSize() == 0) {
            throw new EmptyStackException();
        }

        Item ret = peek();
        remove(getSize()-1);
        return ret;
    }
}
