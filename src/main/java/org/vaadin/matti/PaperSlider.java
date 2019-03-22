package org.vaadin.matti;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import org.github.legioth.field.Field;

@Tag("paper-slider")
@HtmlImport("bower_components/paper-slider/paper-slider.html")
public class PaperSlider extends Component implements Field<PaperSlider, Integer> {

    public PaperSlider() {
        Field.initSingleProperty(this, 0, "value");
    }

    void setMax(int max) {
        getElement().setProperty("max", max);
    }
}
