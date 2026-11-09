package uk.chromis.pos.forms;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 * TIIBS, Lda — Technology Consultants
 * Brand palette for Zunga Electrónica POS
 */
public final class ChromisTheme {

    // TIIBS brand — deep navy + electric blue + gold
    public static final Color BG_DARK       = new Color(5, 10, 20);      // near-black navy
    public static final Color BG_PANEL      = new Color(13, 27, 50);     // dark navy
    public static final Color BG_CARD       = new Color(22, 48, 82);     // medium navy
    public static final Color ACCENT_BLUE   = new Color(37, 99, 235);    // electric blue
    public static final Color ACCENT_GOLD   = new Color(217, 160, 16);   // TIIBS gold
    public static final Color ACCENT_TEAL   = ACCENT_BLUE;               // alias for existing calls
    public static final Color ACCENT_AMBER  = ACCENT_GOLD;
    public static final Color DANGER        = new Color(220, 38, 38);    // red
    public static final Color SUCCESS       = new Color(22, 163, 74);    // green
    public static final Color TEXT_PRIMARY  = new Color(236, 244, 255);  // cool white
    public static final Color TEXT_MUTED    = new Color(140, 165, 200);  // steel blue-grey
    public static final Color CONTENT_BG    = new Color(245, 248, 255);  // very light blue-white
    public static final Color BORDER_COLOR  = new Color(37, 70, 110);    // dark blue border

    // Legacy aliases
    public static final Color COLOR_HEADER_BG    = BG_DARK;
    public static final Color COLOR_HEADER_FG    = TEXT_PRIMARY;
    public static final Color COLOR_SIDEBAR_BG   = BG_PANEL;
    public static final Color COLOR_PRIMARY      = ACCENT_BLUE;
    public static final Color COLOR_ACCENT       = ACCENT_GOLD;
    public static final Color COLOR_CONTENT_BG   = CONTENT_BG;
    public static final Color COLOR_STATUSBAR_BG = BG_DARK;
    public static final Color COLOR_STATUSBAR_FG = TEXT_MUTED;

    // Typography
    public static final Font FONT_DEFAULT = new Font("SansSerif", Font.PLAIN, 13);
    public static final Font FONT_HEADER  = new Font("SansSerif", Font.BOLD, 15);
    public static final Font FONT_BUTTON  = new Font("SansSerif", Font.BOLD, 12);
    public static final Font FONT_SMALL   = new Font("SansSerif", Font.PLAIN, 11);
    public static final Font FONT_TITLE   = new Font("SansSerif", Font.BOLD, 20);
    public static final Font FONT_BRAND   = new Font("SansSerif", Font.BOLD, 11);

    private ChromisTheme() {}

    /** Call BEFORE UIManager.setLookAndFeel() so Nimbus picks up the brand palette. */
    public static void applyNimbusDefaults() {
        UIManager.put("nimbusBase",                 ACCENT_BLUE);
        UIManager.put("nimbusBlueGrey",             BG_PANEL);
        UIManager.put("control",                    BG_PANEL);
        UIManager.put("text",                       TEXT_PRIMARY);
        UIManager.put("nimbusLightBackground",      BG_CARD);
        UIManager.put("nimbusFocus",                ACCENT_GOLD);
        UIManager.put("nimbusSelectedText",         Color.WHITE);
        UIManager.put("nimbusSelectionBackground",  ACCENT_BLUE);
        UIManager.put("nimbusBorder",               BORDER_COLOR);
        UIManager.put("info",                       BG_CARD);
        UIManager.put("infoText",                   TEXT_PRIMARY);
        UIManager.put("nimbusDisabledText",         TEXT_MUTED);
        UIManager.put("controlText",                TEXT_PRIMARY);
        UIManager.put("nimbusOrange",               ACCENT_GOLD);
        UIManager.put("nimbusRed",                  DANGER);
        UIManager.put("nimbusGreen",                SUCCESS);
        UIManager.put("desktop",                    BG_DARK);
    }

    /** Call AFTER UIManager.setLookAndFeel() to apply full brand overrides. */
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
        UIManager.put("Table.selectionBackground",  ACCENT_BLUE);
        UIManager.put("Table.selectionForeground",  Color.WHITE);
        UIManager.put("TableHeader.background",     BG_DARK);
        UIManager.put("TableHeader.foreground",     ACCENT_GOLD);
        UIManager.put("TableHeader.font",           FONT_BUTTON);

        // Scroll
        UIManager.put("ScrollBar.width",            8);
        UIManager.put("ScrollBar.thumb",            ACCENT_BLUE);
        UIManager.put("ScrollBar.track",            BG_PANEL);
        UIManager.put("ScrollPane.background",      BG_PANEL);

        // Buttons — gold accent
        UIManager.put("Button.background",          ACCENT_BLUE);
        UIManager.put("Button.foreground",          Color.WHITE);
        UIManager.put("Button.focus",               ACCENT_GOLD);
        UIManager.put("Button.border",              BorderFactory.createEmptyBorder(6, 16, 6, 16));

        // Text fields
        UIManager.put("TextField.background",       BG_CARD);
        UIManager.put("TextField.foreground",       TEXT_PRIMARY);
        UIManager.put("TextField.caretForeground",  ACCENT_GOLD);

        // Tooltips
        UIManager.put("ToolTip.background",         BG_CARD);
        UIManager.put("ToolTip.foreground",         TEXT_PRIMARY);
        UIManager.put("ToolTip.border",             BorderFactory.createLineBorder(ACCENT_BLUE, 1));

        // Combo
        UIManager.put("ComboBox.background",        BG_CARD);
        UIManager.put("ComboBox.foreground",        TEXT_PRIMARY);
        UIManager.put("ComboBox.selectionBackground", ACCENT_BLUE);
        UIManager.put("ComboBox.selectionForeground", Color.WHITE);

        // Tabs — Nimbus state-based text colors
        UIManager.put("TabbedPane.selected",        BG_CARD);
        UIManager.put("TabbedPane.background",      BG_DARK);
        UIManager.put("TabbedPane.foreground",      TEXT_PRIMARY);
        UIManager.put("TabbedPane.contentAreaColor", BG_PANEL);
        UIManager.put("TabbedPane.tabAreaBackground", BG_DARK);
        UIManager.put("TabbedPane:Tab[Enabled].textForeground",                      TEXT_PRIMARY);
        UIManager.put("TabbedPane:Tab[Enabled+MouseOver].textForeground",            ACCENT_GOLD);
        UIManager.put("TabbedPane:Tab[Enabled+Pressed].textForeground",              ACCENT_GOLD);
        UIManager.put("TabbedPane:Tab[Selected].textForeground",                     ACCENT_GOLD);
        UIManager.put("TabbedPane:Tab[Focused+Selected].textForeground",             ACCENT_GOLD);
        UIManager.put("TabbedPane:Tab[MouseOver+Selected].textForeground",           ACCENT_GOLD);
        UIManager.put("TabbedPane:Tab[Pressed+Selected].textForeground",             ACCENT_GOLD);
        UIManager.put("TabbedPane:Tab[Focused+MouseOver+Selected].textForeground",   ACCENT_GOLD);
        UIManager.put("TabbedPane:Tab[Focused+Pressed+Selected].textForeground",     ACCENT_GOLD);

        // Labels
        UIManager.put("Label.foreground",                       TEXT_PRIMARY);
        UIManager.put("Label[Enabled].textForeground",          TEXT_PRIMARY);
        UIManager.put("Label[Disabled].textForeground",         TEXT_MUTED);

        // Checkboxes / radio buttons
        UIManager.put("CheckBox.foreground",                    TEXT_PRIMARY);
        UIManager.put("CheckBox[Enabled].textForeground",       TEXT_PRIMARY);
        UIManager.put("RadioButton.foreground",                 TEXT_PRIMARY);
        UIManager.put("RadioButton[Enabled].textForeground",    TEXT_PRIMARY);

        // Spinners and formatted text fields
        UIManager.put("Spinner.background",                     BG_CARD);
        UIManager.put("Spinner.foreground",                     TEXT_PRIMARY);
        UIManager.put("\"Spinner.formattedTextField\".foreground",          TEXT_PRIMARY);
        UIManager.put("\"Spinner.formattedTextField\"[Enabled].textForeground", TEXT_PRIMARY);
        UIManager.put("FormattedTextField.background",          BG_CARD);
        UIManager.put("FormattedTextField.foreground",          TEXT_PRIMARY);
        UIManager.put("FormattedTextField[Enabled].textForeground", TEXT_PRIMARY);
        UIManager.put("FormattedTextField.caretForeground",     ACCENT_GOLD);

        // Text areas
        UIManager.put("TextArea.background",    BG_CARD);
        UIManager.put("TextArea.foreground",    TEXT_PRIMARY);
        UIManager.put("TextPane.background",    BG_CARD);
        UIManager.put("TextPane.foreground",    TEXT_PRIMARY);

        // Titled borders (section headers like "Configuração do recibo")
        UIManager.put("TitledBorder.titleColor", ACCENT_GOLD);

        // Password field
        UIManager.put("PasswordField.background",  BG_CARD);
        UIManager.put("PasswordField.foreground",  TEXT_PRIMARY);
        UIManager.put("PasswordField.caretForeground", ACCENT_GOLD);

        // Menus
        UIManager.put("Menu.background",            BG_PANEL);
        UIManager.put("Menu.foreground",            TEXT_PRIMARY);
        UIManager.put("MenuItem.background",        BG_PANEL);
        UIManager.put("MenuItem.foreground",        TEXT_PRIMARY);
        UIManager.put("MenuItem.selectionBackground", ACCENT_BLUE);
        UIManager.put("MenuItem.selectionForeground", Color.WHITE);
        UIManager.put("MenuBar.background",         BG_DARK);
        UIManager.put("MenuBar.foreground",         ACCENT_GOLD);
        UIManager.put("PopupMenu.background",       BG_PANEL);
        UIManager.put("PopupMenu.border",           BorderFactory.createLineBorder(ACCENT_BLUE, 1));

        // Tree / list
        UIManager.put("Tree.background",            BG_PANEL);
        UIManager.put("Tree.foreground",            TEXT_PRIMARY);
        UIManager.put("Tree.selectionBackground",   ACCENT_BLUE);
        UIManager.put("Tree.selectionForeground",   Color.WHITE);
        UIManager.put("List.background",            BG_PANEL);
        UIManager.put("List.foreground",            TEXT_PRIMARY);
        UIManager.put("List.selectionBackground",   ACCENT_BLUE);
        UIManager.put("List.selectionForeground",   Color.WHITE);

        // Dialogs
        UIManager.put("Dialog.background",          BG_PANEL);
        UIManager.put("Window.background",          BG_DARK);
        UIManager.put("activeCaption",              BG_DARK);
        UIManager.put("activeCaptionText",          ACCENT_GOLD);
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

    /** Style a login user button — blue card with gold accent border. */
    public static void styleUserButton(JButton btn) {
        btn.setBackground(BG_CARD);
        btn.setForeground(TEXT_PRIMARY);
        btn.setFont(FONT_BUTTON);
        btn.setOpaque(true);
        btn.setBorderPainted(true);
        btn.setBorder(BorderFactory.createCompoundBorder(
            pillBorder(ACCENT_GOLD, 10),
            BorderFactory.createEmptyBorder(6, 10, 6, 10)));
        btn.setFocusPainted(false);
        btn.setContentAreaFilled(true);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override public void mouseEntered(java.awt.event.MouseEvent e) {
                btn.setBackground(ACCENT_BLUE);
                btn.setForeground(Color.WHITE);
            }
            @Override public void mouseExited(java.awt.event.MouseEvent e) {
                btn.setBackground(BG_CARD);
                btn.setForeground(TEXT_PRIMARY);
            }
        });
    }
}
