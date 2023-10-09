package ecommerce;

public class Product{
    private int productId;
    private String productName;
    private double productWholsesaleCost;
    private static double taxRate;
    private double markUp;

    public Product(){
        setProductId(0);
        setName("");
        setCost(0.0);
        setTaxRate(0.13);
        setMarkUp(0.25);
    }

    // Package Private methods
    // Mutators
    void setProductId(int anId){
        productId = anId;
    }
    void setName(String aName){
        productName = aName;
    }
    void setCost(Double aPrice){
        if (aPrice < 0){
            productWholsesaleCost = 0;
        }else{
            productWholsesaleCost = aPrice;
        }
    }

    //Accessor
    // returns the wholesale cost of the item
    double getCost(){
        return productWholsesaleCost;
    }



    /* parameter is between 0 and 1.
    values outside this range should be ignored and a default value of .13 used */
    static void setTaxRate(double aTaxRate){
        if (aTaxRate < 0 || aTaxRate > 1){
            taxRate = 0.13;
        }else{
            taxRate = aTaxRate;
        }
    }

    /* parameter is between 0 and 1.
    values outside this range should be ignored and a default value of .25 used */
    void setMarkUp(Double aMarkUp){ // parameter is between 0 and 1
        if (aMarkUp < 0 || aMarkUp > 1){
            markUp = 0.25;
        }else{
            markUp = aMarkUp;
        }
    }

    // public methods
    public int getProductId(){
        return productId;
    }
    public String getName(){
        return productName;
    }

    /*returns the retail price for the item
    retail price = (wholesaleCost * (1 + markup)) * (1 + taxRate)
    */
    public double getRetailPrice(){
        return (productWholsesaleCost * (1 + markUp) * (1 + taxRate));
    }
    //returns the markup as a decimal between 0 and 1
    public double getMarkupRate(){
        return markUp;
    }

    //returns a string consisting of the item name, a colon, a space, and the retail price of the item rounded up to 2 d
    public String toString(){
        String roundedNumber = String.format("%.2f", getRetailPrice());
        return productName + ": " + roundedNumber;
    }
    //static method to return the tax rate
    //returns the tax rate as a decimal between 0 and 1 
    public static double getTaxRate(){
        return taxRate;
    }
}