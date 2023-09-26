package com.youcode.app.ui.shared.utils.config;

import com.youcode.app.ui.shared.utils.Const.AppColors;
import com.youcode.app.ui.shared.utils.Const.AppSizes;
import com.youcode.app.ui.shared.utils.enums.CellColor;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelConfig {


    public static class Footer {
        public static final Integer WIDTH = AppSizes.MAX_WIDTH;
        public static final Integer HEIGHT = AppSizes.BANNER_HEIGHT;
        public static final Color BACKGROUND = AppColors.PRIMARY_LIGHT;
    }


    public static class Header {
        public static final Integer WIDTH = AppSizes.MAX_WIDTH;
        public static final Integer HEIGHT = AppSizes.BANNER_HEIGHT;
        public static final Color BACKGROUND = AppColors.PRIMARY_LIGHT;
    }

    public static class Board {
        public static final Integer BORDER_THICKNESS = 2;
        public static final Integer WIDTH = AppSizes.MAX_HEIGHT - Header.HEIGHT + 2 * BORDER_THICKNESS;
        public static final Integer HEIGHT = AppSizes.MAX_HEIGHT - Header.HEIGHT - Footer.HEIGHT;
        public static final Color BACKGROUND = AppColors.SECONDARY_LIGHT;

        public static final Color BORDER_COLOR = AppColors.DARK;
    }

    public static class Cell {
        public static final Integer WIDTH = 100;
        public static final Integer HEIGHT = 100;
        public static final Color BACKGROUND_LIGHT = AppColors.TERTIARY;
        public static final Color BACKGROUND_DARK = AppColors.PRIMARY_DARK;
        public static final Border CLICKED_PIECE_BORDER = BorderFactory.createLineBorder(AppColors.TEXT_DARK, 4);
        public static final Border CLICKED_EMPTY_BORDER = BorderFactory.createLineBorder(AppColors.QUATERNARY, 4);

        public static Color getBackground(CellColor status) {
            return status == CellColor.LIGHT ? BACKGROUND_LIGHT : BACKGROUND_DARK;
        }





    }

    public static class BoardContainer {
        public static final Color BACKGROUND = AppColors.BACKGROUND;
        public static final int HEIGHT = AppSizes.MAX_HEIGHT - Header.HEIGHT - Footer.HEIGHT;
        public static final int WIDTH = AppSizes.MAX_WIDTH;
    }

    public static class Piece {
        public static final int WIDTH = 50;
        public static final int HEIGHT = 50;


    }
}