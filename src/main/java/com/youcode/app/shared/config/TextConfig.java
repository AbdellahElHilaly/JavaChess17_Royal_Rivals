package com.youcode.app.shared.config;

import com.youcode.app.shared.Const.AppColors;
import com.youcode.app.shared.Const.AppFonts;
import com.youcode.app.shared.Const.AppSizes;

import java.awt.*;
import java.util.Date;

public class TextConfig {

    public static class PlayerName {
        public static final Font FONT = AppFonts.PRIMARY;
        public static final Color COLOR = AppColors.TEXT_DARK;
        public static final Integer SIZE = AppSizes.FONT_SECONDARY;

        public static final Dimension DIMENSION = new Dimension(AppSizes.MAX_WIDTH/3 - 10, 0);
    }

    public static class  GameInfo{
        public static final Font FONT = AppFonts.PRIMARY;
        public static final Color COLOR = AppColors.TEXT_LIGHT;
        public static final Integer SIZE = AppSizes.FONT_PRIMARY;

        public static final Color BACKGROUND = AppColors.BOARD_INFO_BACKGROUND;
        public static final Color BORDER_COLOR = AppColors.BORDER;
        public static final Color COLOR_WARN = AppColors.WARNING;
        public static final Color COLOR_ERROR = AppColors.ERROR;
        public static final Color COLOR_SUCCESS = AppColors.SUCCESS;
    }

    public static  class  Timer{
        public static final Font FONT = AppFonts.ELCTRONIC;
        public static final Color COLOR = AppColors.TEXT_DARK;
        public static final Integer SIZE = AppSizes.FONT_PRIMARY;
        public static final Color FOREGROUND = AppColors.TEXT_DARK;
        public static final Dimension DIMENSION = new Dimension(500, 0);
        public static final String DATE_FORMAT = "HH:mm:ss:SS";

        public static String format(Date currentTimer) {
            return String.format("%02d:%02d:%02d:%02d",
                    currentTimer.getHours(),
                    currentTimer.getMinutes(),
                    currentTimer.getSeconds(),
                    currentTimer.getTime() % 1000 / 10);
        }
    }

}


