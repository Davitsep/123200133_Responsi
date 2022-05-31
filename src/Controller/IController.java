package Controller;

import View.AslabView;


public interface IController {
    public boolean isInputEmpty(AslabView view);
    public boolean isLowwer(double nilai1, double nilai2, double nilai3);
    public boolean isHigher(double nilai1, double nilai2, double nilai3);
    public void clear(AslabView view);
}