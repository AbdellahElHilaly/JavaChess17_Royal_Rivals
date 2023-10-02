package com.youcode.app.shared.config;

import com.youcode.app.shared.Const.AppColors;
import com.youcode.app.shared.Const.AppFonts;
import com.youcode.app.shared.Const.AppSizes;

import java.awt.*;

public class TextConfig {

    public static class PlayerName {
        public static final Font FONT = AppFonts.PRIMARY;
        public static final Color COLOR = AppColors.TEXT_LIGHT;
        public static final Integer SIZE = AppSizes.FONT_SECONDARY;

        public static final Dimension DIMENSION = new Dimension(AppSizes.MAX_WIDTH/3 - 10, 0);
    }

    public static class  GameInfo{
        public static final Font FONT = AppFonts.PRIMARY;
        public static final Color COLOR = AppColors.TEXT_DARK;
        public static final Integer SIZE = AppSizes.FONT_PRIMARY;

        public static final Color BACKGROUND = AppColors.PRIMARY_DARK;
        public static final Color BORDER_COLOR = AppColors.DARK;
    }

    public static  class  Timer{
        public static final Font FONT = AppFonts.ELCTRONIC;
        public static final Color COLOR = AppColors.TEXT_DARK;
        public static final Integer SIZE = AppSizes.FONT_PRIMARY;
        public static final Color FOREGROUND = AppColors.TEXT_DARK;
        public static final Dimension DIMENSION = new Dimension(200, 0);
    }

}


