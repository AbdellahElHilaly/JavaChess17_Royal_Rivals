package com.youcode.app.shared.Const;

import com.youcode.app.shared.config.UiConfig;

import javax.swing.*;
import java.awt.*;

public class AppColors {


    public static final Color CELL_DARK = UiConfig.PALLET.tertiary();
    public static final Color CELL_LIGHT = UiConfig.PALLET.quaternary();

    public static final Color FOOTER = UiConfig.PALLET.primary();
    public static final Color BOARD_INFO_BACKGROUND = UiConfig.PALLET.secondary();
    public static final Color BORDER = UiConfig.PALLET.tertiary();
    public static final Color BACKGROUND = UiConfig.PALLET.background();


    public static final Color TEXT_DARK = UiConfig.PALLET.dark();
    public static final Color TEXT_LIGHT = UiConfig.PALLET.light();

    public static final Color ERROR = UiConfig.PALLET.error();
    public static final Color SUCCESS = UiConfig.PALLET.success();
    public static final Color WARNING = UiConfig.PALLET.warning();


    public static final Color CHECK_MATE = UiConfig.PALLET.warning();
    public static final Color CHECK = UiConfig.PALLET.error();
    public static final Color CLICKED = UiConfig.PALLET.white();
}
