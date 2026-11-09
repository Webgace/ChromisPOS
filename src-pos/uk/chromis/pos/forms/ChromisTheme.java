package uk.chromis.pos.forms;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public final class ChromisTheme {

    // Core palette
    public static final Color BG_DARK       = new Color(15, 23, 42);
    public static final Color BG_PANEL      = new Color(30, 41, 59);
    public static final Color BG_CARD       = new Color(51, 65, 85);
    public static final Color ACCENT_TEAL   = new Color(20, 184, 166);
    public static final Color ACCENT_AMBER  = new Color(245, 158, 11);
    public static final Color DANGER        = new Color(239, 68, 68);
    public static final Color TEXT_PRIMARY  = new Color(241, 245, 249);
    public static final Color TEXT_MUTED    = new Color(148, 163, 184);
    public static final Color CONTENT_BG    = new Color(248, 250, 252);
    public static final Color BORDER_COLOR  = new Color(71, 85, 105);

    // Legacy aliases used by existing applyModernStyling() calls
    public static final Color COLOR_HEADER_BG    = BG_DARK;
    public static final Color COLOR_HEADER_FG    = TEXT_PRIMARY;
    public static final Color COLOR_SIDEBAR_BG   = BG_PANEL;
    public static final Color COLOR_PRIMARY      = ACCENT_TEAL;
    public static final Color COLOR_ACCENT       = ACCENT_AMBER;
    public static final Color COLOR_CONTENT_BG   = CONTENT_BG;
    public static final Color COLOR_STATUSBAR_BG = BG_DARK;
    public static final Color COLOR_STATUSBAR_FG = TEXT_MUTED;

    // Typography
    public static final Font FONT_DEFAULT = new Font("Dialog", Font.PLAIN, 13);
    public static final Font FONT_HEADER  = new Font("Dialog", Font.BOLD, 15);
    public static final Font FONT_BUTTON  = new Font("Dialog", Font.BOLD, 13);
    public static final Font FONT_SMALL   = new Font("Dialog", Font.PLAIN, 11);

    private ChromisTheme() {}

    public static void applyTheme() {
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");

        UIManager.put("defaultFont",           FONT_DEFAULT);
        UIManager.put("Label.font",            FONT_DEFAULT);
        UIManager.put("Button.font",           FONT_BUTTON);
        UIManager.put("Table.font",            FONT_DEFAULT);
        UIManager.put("TextField.font",        FONT_DEFAULT);
        UIManager.put("ComboBox.font",         FONT_DEFAULT);
        UIManager.put("TabbedPane.font",       FONT_DEFAULT);
        UIManager.put("List.font",             FONT_DEFAULT);
        UIManager.put("Tree.font",             FONT_DEFAULT);

        // Panel / window backgrounds
        UIManager.put("Panel.background",           CONTENT_BG);
        UIManager.put("OptionPane.background",      BG_PANEL);
        UIManager.put("OptionPane.messageForeground", TEXT_PRIMARY);

        // Table
        UIManager.put("Table.background",           Color.WHITE);
        UIManager.put("Table.foreground",           new Color(30, 41, 59));
        UIManager.put("Table.gridColor",            new Color(226, 232, 240));
        UIManager.put("Table.selectionBackground",  ACCENT_TEAL);
        UIManager.put("Table.selectionForeground",  Color.WHITE);
        UIManager.put("TableHeader.background",     BG_PANEL);
        UIManager.put("TableHeader.foreground",     TEXT_PRIMARY);
        UIManager.put("TableHeader.font",           FONT_BUTTON);

        // Scroll
        UIManager.put("ScrollBar.width",            8);
        UIManager.put("ScrollBar.thumb",            BG_CARD);
        UIManager.put("ScrollBar.track",            BG_PANEL);

        // Buttons — global defaults (individual buttons override in applyModernStyling)
        UIManager.put("Button.background",          ACCENT_TEAL);
        UIManager.put("Button.foreground",          Color.WHITE);
        UIManager.put("Button.focus",               ACCENT_TEAL);
        UIManager.put("Button.border",              BorderFactory.createEmptyBorder(6, 14, 6, 14));

        // Text fields
        UIManager.put("TextField.background",       Color.WHITE);
        UIManager.put("TextField.foreground",       new Color(15, 23, 42));
        UIManager.put("TextField.caretForeground",  ACCENT_TEAL);
        UIManager.put("TextField.border",
            BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(BORDER_COLOR, 1),
                BorderFactory.createEmptyBorder(4, 8, 4, 8)));

        // Split pane divider
        UIManager.put("SplitPane.background",       BG_PANEL);
        UIManager.put("SplitPaneDivider.draggingColor", ACCENT_TEAL);

        // Tooltips
        UIManager.put("ToolTip.background",         BG_CARD);
        UIManager.put("ToolTip.foreground",         TEXT_PRIMARY);
        UIManager.put("ToolTip.border",
            BorderFactory.createLineBorder(BORDER_COLOR, 1));

        // Combo box
        UIManager.put("ComboBox.background",        Color.WHITE);
        UIManager.put("ComboBox.foreground",        new Color(15, 23, 42));
        UIManager.put("ComboBox.selectionBackground", ACCENT_TEAL);
        UIManager.put("ComboBox.selectionForeground", Color.WHITE);
    }

    /** Rounded pill border helper */
    public static Border pillBorder(Color color, int radius) {
        return new javax.swing.border.AbstractBorder() {
            @Override
            public void paintBorder(Component c, Graphics g, int x, int y, int w, int h) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(color);
                g2.drawRoundRect(x, y, w - 1, h - 1, radius, radius);
                g2.dispose();
            }
            @Override public Insets getBorderInsets(Component c) { return new Insets(4, 10, 4, 10); }
            @Override public Insets getBorderInsets(Component c, Insets i) {
                i.set(4, 10, 4, 10); return i;
            }
        };
    }

    /** Style a login user button as a dark card */
    public static void styleUserButton(JButton btn) {
        btn.setBackground(BG_CARD);
        btn.setForeground(TEXT_PRIMARY);
        btn.setFont(FONT_BUTTON);
        btn.setOpaque(true);
        btn.setBorderPainted(true);
        btn.setBorder(pillBorder(ACCENT_TEAL, 12));
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
}
