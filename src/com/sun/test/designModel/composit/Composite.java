package com.sun.test.designModel.composit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunleic on 2017/7/20.
 */
public class Composite extends Component {

    private List<Component> componentList = new ArrayList<>();

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        this.componentList.remove(component);
    }

    public List<Component> getComponentList() {
        return componentList;
    }
}
