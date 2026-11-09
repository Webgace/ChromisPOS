package uk.chromis.pos.forms;

import java.awt.Color;
import java.awt.Font;
import java.awt.RenderingHints;
import javax.swing.UIManager;

public final class ChromisTheme {

    public static final Color COLOR_HEADER_BG    = new Color(23, 43, 77);
    public static final Color COLOR_HEADER_FG    = Color.WHITE;
    public static final Color COLOR_SIDEBAR_BG   = new Color(30, 55, 100);
    public static final Color COLOR_PRIMARY      = new Color(25, 118, 210);
    public static final Color COLOR_ACCENT       = new Color(0, 188, 212);
    public static final Color COLOR_CONTENT_BG   = new Color(245, 247, 250);
    public static final Color COLOR_STATUSBAR_BG = new Color(40, 40, 45);
    public static final Color COLOR_STATUSBAR_FG = new Color(180, 180, 180);

    public static final Font FONT_DEFAULT = new Font("Dialog", Font.PLAIN, 13);
    public static final Font FONT_HEADER  = new Font("Dialog", Font.BOLD, 15);
    public static final Font FONT_BUTTON  = new Font("Dialog", Font.BOLD, 12);

    private ChromisTheme() {}

    public static void applyTheme() {
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");

        UIManager.put("RenderingHints.KEY_TEXT_ANTIALIASING", RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);

        UIManager.put("defaultFont", FONT_DEFAULT);
        UIManager.put("Label.font",  FONT_DEFAULT);
        UIManager.put("Button.font", FONT_BUTTON);
        UIManager.put("Table.font",  FONT_DEFAULT);
        UIManager.put("TextField.font", FONT_DEFAULT);
        UIManager.put("ComboBox.font",  FONT_DEFAULT);

        UIManager.put("Panel.background",    COLOR_CONTENT_BG);
        UIManager.put("Table.background",    Color.WHITE);
        UIManager.put("Table.gridColor",     new Color(220, 224, 230));
        UIManager.put("Table.selectionBackground", COLOR_PRIMARY);
        UIManager.put("Table.selectionForeground", Color.WHITE);

        UIManager.put("Button.background",   COLOR_PRIMARY);
        UIManager.put("Button.foreground",   Color.WHITE);
        UIManager.put("Button.focus",        COLOR_ACCENT);

        UIManager.put("ScrollBar.width", 10);
    }
}
