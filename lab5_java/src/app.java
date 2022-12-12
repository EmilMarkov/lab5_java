import org.jfree.ui.RefineryUtilities;
import view.components.GraphComponent;

import javax.swing.*;
import java.awt.*;

public class app {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                final GraphComponent demo_arraylist_sr = new GraphComponent("Add | Average", 1);
                demo_arraylist_sr.pack();
                RefineryUtilities.centerFrameOnScreen(demo_arraylist_sr);
                demo_arraylist_sr.setVisible(true);

                final GraphComponent demo_arraylist_ob = new GraphComponent("Add | Total", 2);
                demo_arraylist_ob.pack();
                RefineryUtilities.centerFrameOnScreen(demo_arraylist_ob);
                demo_arraylist_ob.setVisible(true);

                final GraphComponent demo_hashmap_sr = new GraphComponent("Remove | Average", 3);
                demo_hashmap_sr.pack();
                RefineryUtilities.centerFrameOnScreen(demo_hashmap_sr);
                demo_hashmap_sr.setVisible(true);

                final GraphComponent demo_hashmap_ob = new GraphComponent("Remove | Total", 4);
                demo_hashmap_ob.pack();
                RefineryUtilities.centerFrameOnScreen(demo_hashmap_ob);
                demo_hashmap_ob.setVisible(true);
            }
        });
    }
}
