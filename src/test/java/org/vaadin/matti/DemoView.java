package org.vaadin.matti;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        final PaperSlider paperSlider = new PaperSlider();
        
        paperSlider.setMax(5);
        paperSlider.setValue(3);
        add(paperSlider);
    }
}
