package com.youcode.ui.guide;

import javax.swing.*;

public abstract class FrameComponent  extends Component {

    protected JFrame frame = new JFrame();
    public abstract void layout();

    public abstract void compose();

    public void init() {
        config();
        style();
        layout();
        compose();
        frame.setVisible(true);
    }

    public void close() {
        frame.setVisible(false);
    }


}
