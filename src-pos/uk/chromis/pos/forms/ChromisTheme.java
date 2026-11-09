package uk.chromis.pos.forms;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public final class ChromisTheme {

    // Core dark palette
    public static final Color BG_DARK       = new Color(15, 23, 42);
    public static final Color BG_PANEL      = new Color(26, 32, 44);
    public static final Color BG_CARD       = new Color(45, 55, 72);
    public static final Color ACCENT_TEAL   = new Color(49, 196, 141);
    public static final Color ACCENT_AMBER  = new Color(237, 137, 54);
    public static final Color DANGER        = new Color(229, 62, 62);
    public static final Color TEXT_PRIMARY  = new Color(237, 242, 247);
    public static final Color TEXT_MUTED    = new Color(160, 174, 192);
    public static final Color CONTENT_BG    = new Color(247, 250, 252);
    public static final Color BORDER_COLOR  = new Color(74, 85, 104);

    // Legacy aliases used by existing applyModernStyling() calls
    public static final Color COLOR_HEADER_BG    = BG_DARK;
    public static final Color COLOR_HEADER_FG    = TEXT_PRIMARY;
    public static final Color COLOR_SIDEBAR_BG   = BG_PANEL;
    public static final Color COLOR_PRIMARY      = ACCENT_TEAL;
    public static final Color COLOR_ACCENT       = ACCENT_AMBER;
    public static final Color COLOR_CONTENT_BG   = CONTENT_BG;
    public static final Color COLOR_STATUSBAR_BG = BG_DARK;
    public static final Color COLOR_STATUSBAR_FG = TEXT_MUTED;

    // Typography — using SansSerif for a cleaner modern look
    public static final Font FONT_DEFAULT = new Font("SansSerif", Font.PLAIN, 13);
    public static final Font FONT_HEADER  = new Font("SansSerif", Font.BOLD, 16);
    public static final Font FONT_BUTTON  = new Font("SansSerif", Font.BOLD, 12);
    public static final Font FONT_SMALL   = new Font("SansSerif", Font.PLAIN, 11);
    public static final Font FONT_TITLE   = new Font("SansSerif", Font.BOLD, 22);

    private ChromisTheme() {}

    /** Call BEFORE UIManager.setLookAndFeel() so Nimbus picks up the palette. */
    public static void applyNimbusDefaults() {
        UIManager.put("nimbusBase",                 BG_PANEL);
        UIManager.put("nimbusBlueGrey",             BG_PANEL);
        UIManager.put("control",                    BG_PANEL);
        UIManager.put("text",                       TEXT_PRIMARY);
        UIManager.put("nimbusLightBackground",      BG_CARD);
        UIManager.put("nimbusFocus",                ACCENT_TEAL);
        UIManager.put("nimbusSelectedText",         Color.WHITE);
        UIManager.put("nimbusSelectionBackground",  ACCENT_TEAL);
        UIManager.put("nimbusBorder",               BORDER_COLOR);
        UIManager.put("info",                       BG_CARD);
        UIManager.put("infoText",                   TEXT_PRIMARY);
        UIManager.put("nimbusDisabledText",         TEXT_MUTED);
        UIManager.put("controlText",                TEXT_PRIMARY);
        UIManager.put("nimbusOrange",               ACCENT_AMBER);
        UIManager.put("nimbusRed",                  DANGER);
        UIManager.put("nimbusGreen",                ACCENT_TEAL);
        UIManager.put("desktop",                    BG_DARK);
    }

    /** Call AFTER UIManager.setLookAndFeel() to override remaining defaults. */
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
        UIManager.put("Panel.background",      BG_PANEL);
        UIManager.put("OptionPane.background", BG_PANEL);
        UIManager.put("OptionPane.messageForeground", TEXT_PRIMARY);

        // Tables
        UIManager.put("Table.background",           BG_CARD);
        UIManager.put("Table.foreground",           TEXT_PRIMARY);
        UIManager.put("Table.gridColor",            BORDER_COLOR);
        UIManager.put("Table.selectionBackground",  ACCENT_TEAL);
        UIManager.put("Table.selectionForeground",  Color.WHITE);
        UIManager.put("TableHeader.background",     BG_DARK);
        UIManager.put("TableHeader.foreground",     TEXT_PRIMARY);
        UIManager.put("TableHeader.font",           FONT_BUTTON);

        // Scroll
        UIManager.put("ScrollBar.width",            8);
        UIManager.put("ScrollBar.thumb",            BG_CARD);
        UIManager.put("ScrollBar.track",            BG_PANEL);
        UIManager.put("ScrollPane.background",      BG_PANEL);

        // Buttons
        UIManager.put("Button.background",          ACCENT_TEAL);
        UIManager.put("Button.foreground",          Color.WHITE);
        UIManager.put("Button.focus",               ACCENT_TEAL);
        UIManager.put("Button.border",              BorderFactory.createEmptyBorder(6, 16, 6, 16));

        // Text fields
        UIManager.put("TextField.background",       BG_CARD);
        UIManager.put("TextField.foreground",       TEXT_PRIMARY);
        UIManager.put("TextField.caretForeground",  ACCENT_TEAL);

        // Tooltips
        UIManager.put("ToolTip.background",         BG_CARD);
        UIManager.put("ToolTip.foreground",         TEXT_PRIMARY);
        UIManager.put("ToolTip.border",             BorderFactory.createLineBorder(BORDER_COLOR, 1));

        // Combo
        UIManager.put("ComboBox.background",        BG_CARD);
        UIManager.put("ComboBox.foreground",        TEXT_PRIMARY);
        UIManager.put("ComboBox.selectionBackground", ACCENT_TEAL);
        UIManager.put("ComboBox.selectionForeground", Color.WHITE);

        // Tabs
        UIManager.put("TabbedPane.selected",        BG_CARD);
        UIManager.put("TabbedPane.background",      BG_PANEL);
        UIManager.put("TabbedPane.foreground",      TEXT_PRIMARY);

        // Menus
        UIManager.put("Menu.background",            BG_PANEL);
        UIManager.put("Menu.foreground",            TEXT_PRIMARY);
        UIManager.put("MenuItem.background",        BG_PANEL);
        UIManager.put("MenuItem.foreground",        TEXT_PRIMARY);
        UIManager.put("MenuItem.selectionBackground", ACCENT_TEAL);
        UIManager.put("MenuItem.selectionForeground", Color.WHITE);
        UIManager.put("MenuBar.background",         BG_DARK);
        UIManager.put("MenuBar.foreground",         TEXT_PRIMARY);
        UIManager.put("PopupMenu.background",       BG_PANEL);
        UIManager.put("PopupMenu.border",           BorderFactory.createLineBorder(BORDER_COLOR, 1));

        // Tree / list
        UIManager.put("Tree.background",            BG_PANEL);
        UIManager.put("Tree.foreground",            TEXT_PRIMARY);
        UIManager.put("Tree.selectionBackground",   ACCENT_TEAL);
        UIManager.put("Tree.selectionForeground",   Color.WHITE);
        UIManager.put("List.background",            BG_PANEL);
        UIManager.put("List.foreground",            TEXT_PRIMARY);
        UIManager.put("List.selectionBackground",   ACCENT_TEAL);
        UIManager.put("List.selectionForeground",   Color.WHITE);

        // Dialogs / windows
        UIManager.put("Dialog.background",          BG_PANEL);
        UIManager.put("Window.background",          BG_DARK);
        UIManager.put("activeCaption",              BG_DARK);
        UIManager.put("activeCaptionText",          TEXT_PRIMARY);
        UIManager.put("inactiveCaption",            BG_PANEL);
    }

    /** Rounded pill border. */
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

    /** Style a login user button as a teal card. */
    public static void styleUserButton(JButton btn) {
        btn.setBackground(BG_CARD);
        btn.setForeground(TEXT_PRIMARY);
        btn.setFont(FONT_BUTTON);
        btn.setOpaque(true);
        btn.setBorderPainted(true);
        btn.setBorder(BorderFactory.createCompoundBorder(
            pillBorder(ACCENT_TEAL, 14),
            BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        // Hover effect
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mouseEntered(java.awt.event.MouseEvent e) {
                btn.setBackground(ACCENT_TEAL);
                btn.setForeground(Color.WHITE);
            }
            @Override public void mouseExited(java.awt.event.MouseEvent e) {
                btn.setBackground(BG_CARD);
                btn.setForeground(TEXT_PRIMARY);
            }
        });
    }
}
