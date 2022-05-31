package mcm.edu.ph.marcos_multicalc;

//import  java.lang.Math,*;
public class Formulas {

    double x;
    double y;

    public static double coneAreaFormula(double radius, double height){
    //area = pi*radius(raidius +square root of h^2 + r^2)
        return (Math.PI*radius)*(radius + Math.sqrt(height*height) + (radius*radius));
    }
    public static double coneVolumeFormula(double radius, double height){
        //volume = pi*r^2(h/3)
        return Math.PI * (radius*radius) * (height/3);
}

}
