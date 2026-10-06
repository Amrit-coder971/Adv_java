
# Java AWT Notes

## 1. Grid Layout

`GridLayout` arranges components in rows and columns.

```java
setLayout(new GridLayout(2, 2));
```

Example:

```text
+---------+---------+
| Button1 | Button2 |
+---------+---------+
| Button3 | Button4 |
+---------+---------+
```

---

# 2. Event Handling

**Event handling** is the process of responding to actions performed by the user.

Examples:

* Clicking a button
* Moving or clicking the mouse
* Pressing a keyboard key
* Closing a window
* Selecting an item

## Event Handling Components

```text
Event Source → Event Object → Event Listener → Event Handler
```

### Event Source

The component that generates an event.

Examples:

```text
Button       → JButton / Button
TextField    → JTextField / TextField
Checkbox     → Checkbox
List         → List
Window       → Frame
```

Example:

```java
Button button = new Button("Click");
```

Here, the button is the **event source**.

---

## Event Object

The object that contains information about the event.

Common event objects:

```text
ActionEvent
ItemEvent
WindowEvent
KeyEvent
MouseEvent
```

---

# 3. Types of Event Listeners

| Event Listener   | Event         | Common Use           |
| ---------------- | ------------- | -------------------- |
| `ActionListener` | `ActionEvent` | Button/action        |
| `ItemListener`   | `ItemEvent`   | Checkbox/List/Choice |
| `WindowListener` | `WindowEvent` | Window               |
| `KeyListener`    | `KeyEvent`    | Keyboard             |
| `MouseListener`  | `MouseEvent`  | Mouse                |

---

# 4. Event Listener and Adapter Classes

> Adapter classes provide empty implementations of listener methods. This allows us to override only the methods we need.

| Event Listener   | Event         | Adapter Class   |
| ---------------- | ------------- | --------------- |
| `ActionListener` | `ActionEvent` | No adapter      |
| `MouseListener`  | `MouseEvent`  | `MouseAdapter`  |
| `KeyListener`    | `KeyEvent`    | `KeyAdapter`    |
| `WindowListener` | `WindowEvent` | `WindowAdapter` |
| `ItemListener`   | `ItemEvent`   | No adapter      |

---

# 5. ActionListener

Used for actions such as button clicks.

### Event

```java
ActionEvent
```

### Listener

```java
ActionListener
```

### Method

```java
actionPerformed(ActionEvent e)
```

Example:

```java
button.addActionListener(e -> {
    System.out.println("Button clicked");
});
```

> There is no standard `ActionAdapter` in Java AWT.

---

# 6. MouseListener

Used to handle mouse events.

### Event

```java
MouseEvent
```

### Listener

```java
MouseListener
```

### Adapter

```java
MouseAdapter
```

### Methods

```java
mouseClicked()
mousePressed()
mouseReleased()
mouseEntered()
mouseExited()
```

Example:

```java
frame.addMouseListener(new MouseAdapter() {

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }

});
```

---

# 7. KeyListener

Used to handle keyboard events.

### Event

```java
KeyEvent
```

### Listener

```java
KeyListener
```

### Adapter

```java
KeyAdapter
```

### Methods

```java
keyPressed()
keyReleased()
keyTyped()
```

Example:

```java
textField.addKeyListener(new KeyAdapter() {

    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed");
    }

});
```

---

# 8. WindowListener

Used to handle window events.

### Event

```java
WindowEvent
```

### Listener

```java
WindowListener
```

### Adapter

```java
WindowAdapter
```

### Methods

```java
windowOpened()
windowClosing()
windowClosed()
windowIconified()
windowDeiconified()
windowActivated()
windowDeactivated()
```

Example:

```java
frame.addWindowListener(new WindowAdapter() {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

});
```

---

# 9. ItemListener

Used when the state of an item changes.

Examples:

* Checkbox selection
* Choice selection
* List item selection

### Event

```java
ItemEvent
```

### Listener

```java
ItemListener
```

### Method

```java
itemStateChanged(ItemEvent e)
```

Example:

```java
checkbox.addItemListener(e -> {
    System.out.println("Item state changed");
});
```

> There is no standard `ItemAdapter` in Java AWT.

---

# 10. XY Coordinates

Java AWT uses an **XY coordinate system**.

```text
(0,0) --------------------→ X
  |
  |
  |
  |
  ↓
  Y
```

* `X` increases from **left to right**
* `Y` increases from **top to bottom**
* `(0, 0)` is usually the top-left corner

Example:

```java
g.drawRect(100, 100, 50, 50);
```

Meaning:

```text
X = 100
Y = 100
Width  = 50
Height = 50
```

---

# 11. Drawing Shapes

Java AWT can draw different shapes.

## Square / Rectangle

```java
g.drawRect(100, 100, 50, 50);
```

Filled rectangle:

```java
g.fillRect(100, 100, 50, 50);
```

---

## Circle

A circle can be drawn using `drawOval()`.

```java
g.drawOval(100, 100, 50, 50);
```

Filled circle:

```java
g.fillOval(100, 100, 50, 50);
```

When width and height are equal, the oval becomes a circle.

---

## Ellipse

```java
g.drawOval(100, 100, 100, 50);
```

Here:

```text
Width  = 100
Height = 50
```

So the result is an ellipse.

---

# 12. Home Drawing Example

Example color and shape plan:

```text
Yellow → Square
Red    → Rectangle
Blue   → Circle
Black  → Ellipse
```

Example:

```java
import java.awt.*;

public class Home extends Frame {

    public Home() {
        setTitle("Home Drawing");
        setSize(500, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {

        // Yellow Square
        g.setColor(Color.YELLOW);
        g.fillRect(50, 100, 80, 80);

        // Red Rectangle
        g.setColor(Color.RED);
        g.fillRect(180, 100, 120, 60);

        // Blue Circle
        g.setColor(Color.BLUE);
        g.fillOval(330, 100, 80, 80);

        // Black Ellipse
        g.setColor(Color.BLACK);
        g.fillOval(150, 250, 150, 80);
    }

    public static void main(String[] args) {
        new Home();
    }
}
```

---

# 13. Quick Revision

```text
EVENT SOURCE
     ↓
EVENT OBJECT
     ↓
EVENT LISTENER
     ↓
EVENT METHOD
```

### Main Table

| Listener         | Event         | Adapter         | Main Methods                                                                                                                                  |
| ---------------- | ------------- | --------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| `ActionListener` | `ActionEvent` | None            | `actionPerformed()`                                                                                                                           |
| `MouseListener`  | `MouseEvent`  | `MouseAdapter`  | `mouseClicked()`, `mousePressed()`, `mouseReleased()`, `mouseEntered()`, `mouseExited()`                                                      |
| `KeyListener`    | `KeyEvent`    | `KeyAdapter`    | `keyPressed()`, `keyReleased()`, `keyTyped()`                                                                                                 |
| `WindowListener` | `WindowEvent` | `WindowAdapter` | `windowOpened()`, `windowClosing()`, `windowClosed()`, `windowIconified()`, `windowDeiconified()`, `windowActivated()`, `windowDeactivated()` |
| `ItemListener`   | `ItemEvent`   | None            | `itemStateChanged()`                                                                                                                          |

## Important

```text
ActionListener  → No ActionAdapter
ItemListener    → No ItemAdapter

MouseListener   → MouseAdapter
KeyListener     → KeyAdapter
WindowListener  → WindowAdapter
```

#  Mvc pattern  
- mode
  -> structure 
- view
  -> fronted
- controller
  -> logics

# JDBC 
- ITS is used to connet the database  java application
# tpyes of database

- mysql
- postgosql
- MangoDB

# DDL 

- CREATE  //create table and database 
- ALTER // modifia
- TRUNCATE. //empty table and database
- DROP   //delete tables 

# DML

-  select // * 
- insert
- update
- Delete

# 

 
