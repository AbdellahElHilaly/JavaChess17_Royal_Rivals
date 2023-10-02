package com.youcode.app.ui.component.Buttons;

import com.youcode.app.ui.guide.AppComponent;
import com.youcode.app.shared.config.PanelConfig;
import com.youcode.app.shared.enums.CellColor;

import javax.swing.*;

public class PieceButton extends JButton implements AppComponent {

    private final CellColor cellColor;
    public PieceButton(CellColor cellColor) {
        super();
        this.cellColor = cellColor;
        init();
    }

    @Override
    public void setStyle() {
        setBorder(null);
        setBackground(PanelConfig.Cell.getBackground(cellColor));
    }

    @Override
    public void build() {
        setBorderPainted(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setOpaque(false);

    }

    @Override
    public void addComponents() {

    }


    public  void destroyAndUpdateIcon(Icon icon){
        super.setIcon(icon);

    }

    public void destroyIcon(){
        super.setIcon(null);
    }

    public void updateComponentUI() {
        SwingUtilities.updateComponentTreeUI(this);
    }
}
