/*
  Created in IntelliJ IDEA
  Author: YUGAM
*/

package Old.InOrder;

/*
Write an Applet program to show different-different shapes in
        java.
*/

import java.applet.Applet;
import java.awt.*;

class GraphicsDemo extends Applet
{
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawString("Welcome",50, 50);
        g.drawLine(20,30,20,300);
        g.drawRect(70,100,30,30);
        g.fillRect(170,100,30,30);
        g.drawOval(70,200,30,30);
        g.setColor(Color.pink);
        g.fillOval(170,200,30,30);
        g.drawArc(90,150,30,30,30,270);
        g.fillArc(270,150,30,30,0,180);
    }
}

/*
<html>
<body>
<applet code="GraphicsDemo.class" width="300" height="300">
</applet>
</body>
</html> */