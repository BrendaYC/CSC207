package login;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExampleUser implements SearchGroup {


    public void showUI(){
        JFrame jFrame = Interface.createInterface("Some Title", 540, 700);
        Interface.addUserInterface(jFrame,null, null,null);
        Interface.addSearchInterface(jFrame,this, false);
        jFrame.setVisible(true);
    }

    @Override
    public String getPage() {
        return "Page ?/?";
    }

    @Override
    public ActionListener getSortAction1() {
        return null;
    }

    @Override
    public ActionListener getSortAction2() {
        return null;
    }

    @Override
    public ActionListener getSortAction3() {
        return null;
    }

    @Override
    public ActionListener toNextPage() {
        return null;
    }

    @Override
    public ActionListener toPreviousPage() {
        return null;
    }

    @Override
    public ArrayList<SearchObject> getSearchObjects() {
        ArrayList<SearchObject> searchObjects = new ArrayList<>();
        for (int i = 0; i<10; i++){
            searchObjects.add(new ExampleObject());
        }
        return searchObjects;
    }

    @Override
    public String getSearchKey1() {
        return "Job";
    }

    @Override
    public String getSearchKey2() {
        return "StartDate";
    }

    @Override
    public String getSearchKey3() {
        return "EndDate";
    }

    @Override
    public String getSelectText() {
        return "Apply";
    }
}
