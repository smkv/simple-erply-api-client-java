package ee.smkv.erply.api.client.models;

import java.util.List;

public class Package {
    List<Box> box;
    List<Box> crate;

    public List<Box> getBox() {
        return box;
    }

    public void setBox(List<Box> box) {
        this.box = box;
    }

    public List<Box> getCrate() {
        return crate;
    }

    public void setCrate(List<Box> crate) {
        this.crate = crate;
    }
}
