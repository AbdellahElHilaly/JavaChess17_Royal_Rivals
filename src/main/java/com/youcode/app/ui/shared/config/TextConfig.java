package com.youcode.app.ui.shared.config;

import com.youcode.app.ui.shared.Const.AppColors;
import com.youcode.app.ui.shared.Const.AppFonts;
import com.youcode.app.ui.shared.Const.AppSizes;

import java.awt.*;

public class TextConfig {

    public static class PlayerName {
        public static final Font FONT = AppFonts.PRIMARY;
        public static final Color COLOR = AppColors.TEXT_LIGHT;
        public static final Integer SIZE = AppSizes.FONT_SECONDARY;
    }

    public static class  GameInfo{
        public static final Font FONT = AppFonts.PRIMARY;
        public static final Color COLOR = AppColors.TEXT_DARK;
        public static final Integer SIZE = AppSizes.FONT_PRIMARY;
    }

    public static  class  Timer{
        public static final Font FONT = AppFonts.ELCTRONIC;
        public static final Color COLOR = AppColors.TEXT_DARK;
        public static final Integer SIZE = AppSizes.FONT_PRIMARY;
    }


}


