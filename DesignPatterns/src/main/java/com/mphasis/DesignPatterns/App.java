package com.mphasis.DesignPatterns;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//    	
//        DBConnection conn1=DBConnection.getInstance();
//        System.out.println(conn1.hashCode());
//        DBConnection conn2=DBConnection.getInstance();
//        System.out.println(conn2.hashCode());
//        DBConnection conn3=DBConnection.getInstance();
//        System.out.println(conn3.hashCode());
    	
    	
    	//Factory pattern
//    	Shape s=ShapesFactory.getShape("square");
//    	s.draw();
//    	
//    	Shape s1=ShapesFactory.getShape("circle");
//    	s.draw();
    	
    	//Abstract Factory Pattern
//    	GUIFactory gui=new WinFactory();
//    	Button button=gui.createButton();
//    	CheckBox checkbox=gui.createCheckBox();
//    	button.click();
//    	checkbox.check();
//    	
//    	GUIFactory gui1=new MacFactory();
//    	Button button1=gui1.createButton();
//    	CheckBox checkbox1=gui1.createCheckBox();
//    	button.click();
//    	checkbox.check();
    	
    	
    	//builder pattern
//    	
//    	Pizza pizza=new Pizza.Builder("medium")
//    			.cheese(true)
//    			.olives(false)
//    			.build();
//    	
//    	System.out.println(pizza);
    	
    	//template method pattern---behavioral
//    	DrinkMaker tea=new TeaMaker();
//    	tea.prepareDrink();
//    	
//    	DrinkMaker coffee=new CoffeeMaker();
//    	coffee.prepareDrink();
    	
    	//Structural Pattern
    	
    	//bridge pattern
    	
//    	Video youtubeHd=new Youtube(new HDProcessing());
//    	youtubeHd.playVideo();
//    	
//    	Video youtube4k=new Youtube(new FourKProcessing());
//    	youtube4k.playVideo();
//    	
//    	Video primeHd=new PrimeChannel(new HDProcessing());
//    	primeHd.playVideo();
//    	
    	
    	
    	//proxy pattern
    	Payment netbanking=new NetBanking();
    	netbanking.pay(5000);
    	System.out.println("********************************");
    	Payment upi=new UpiPayment();
    	upi.pay(7000);
    }
}
