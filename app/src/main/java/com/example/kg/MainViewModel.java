package com.example.kg;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class MainViewModel extends BaseObservable {
    String forkg,forhalfkg,forthreefourthkg,foronefourthkg;

    public MainViewModel(String forkg, String forhalfkg, String forthreefourthkg, String foronefourthkg) {
        this.forkg = forkg;
        this.forhalfkg = forhalfkg;
        this.forthreefourthkg = forthreefourthkg;
        this.foronefourthkg = foronefourthkg;
    }

    public MainViewModel() {

    }

    @Bindable
   public String getForkg() {
        return forkg;
    }

    public void setForkg(String forkg) {
        this.forkg = forkg;
        notifyPropertyChanged(BR.forkg);
    }

    @Bindable
    public String getForhalfkg() {
        return forhalfkg;
    }

    public void setForhalfkg(String forhalfkg) {
        this.forhalfkg = forhalfkg;
        notifyPropertyChanged(BR.forhalfkg);
    }

    @Bindable
    public String getForthreefourthkg() {
        return forthreefourthkg;
    }

    public void setForthreefourthkg(String forthreefourthkg) {
        this.forthreefourthkg = forthreefourthkg;
        notifyPropertyChanged(BR.forthreefourthkg);
    }


    @Bindable
    public String getForonefourthkg() {
        return foronefourthkg;
    }

    public void setForonefourthkg(String foronefourthkg) {
        this.foronefourthkg = foronefourthkg;
        notifyPropertyChanged(BR.foronefourthkg);
    }
    public void onCalculateClick() {
        try {
            double num1 = Double.parseDouble(forkg);

            double difference1 = num1*0.75;
            setForthreefourthkg("For three fourth kg" + difference1);
            double difference2 = num1 *0.50;
            setForhalfkg("For Half kg" + difference2);
            double difference3 = num1 * 0.25;
            setForonefourthkg("For one fourth kg" + difference3);


        } catch (NumberFormatException e) {
            setForthreefourthkg("Invalid input");
            setForhalfkg("Invalid input");
            setForonefourthkg("Invalid input");
        }

    }
}
