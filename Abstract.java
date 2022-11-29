abstract class Abstract {
//    Variables
    private double USDollar;
    private double euro;
    private double yen;
    private double australianDollar;
    private double peso;
    private double dong;
    private double canadianDollar;
    private double poundSterling;
    private double total;

//    Constructor
    Abstract(double USDollar,double euro,double yen, double australianDollar, double peso, double dong, double canadianDollar, double poundSterling, double total){
        this.USDollar = USDollar;
        this.euro = euro;
        this.yen = yen;
        this.australianDollar = australianDollar;
        this.peso = peso;
        this.dong = dong;
        this.canadianDollar = canadianDollar;
        this.poundSterling = poundSterling;
        this.total = total;
    }

    
//    Setters

    public void setUSDollar(double USDollar) {
        this.USDollar = USDollar;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }

    public void setYen(double yen) {
        this.yen = yen;
    }

    public void setAustralianDollar(double australianDollar) {
        this.australianDollar = australianDollar;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDong(double dong) {
        this.dong = dong;
    }

    public void setCanadianDollar(double canadianDollar) {
        this.canadianDollar = canadianDollar;
    }

    public void setPoundSterling(double poundSterling) {
        this.poundSterling = poundSterling;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
//    Getters
    
    public double getUSDollar() {
        return USDollar;
    }

    public double getEuro() {
        return euro;
    }

    public double getYen() {
        return yen;
    }

    public double getAustralianDollar() {
        return australianDollar;
    }

    public double getPeso() {
        return peso;
    }

    public double getDong() {
        return dong;
    }

    public double getCanadianDollar() {
        return canadianDollar;
    }

    public double getPoundSterling() {
        return poundSterling;
    }

    public double getTotal() {
        return total;
    }
    
    
//  Add
    public void add_UsDollar(double us) {
        this.USDollar += us;
    }

    public void add_Euro(double euro) {
        this.euro += euro;
    }

    public void add_australianDollar(double japan) {
        this.australianDollar += japan;
    }

    public void add_canadianDollar(double australia) {
        this.canadianDollar += australia;
    }

    public void add_Yen(double china) {
        this.yen += china;
    }

    public void add_Dong(double mexico) {
        this.dong += mexico;
    }

    public void add_Peso(double canada) {
        this.peso += canada;
    }

    public void add_poundSterling(double vietnam) {
        this.poundSterling += vietnam;
    }

    
// Subtract   
    public void subtract_UsDollar(double us) {        
        try  
        {
            this.USDollar -= us;
            if(this.USDollar<0)
            {
                throw new UserDefinedException("Insufficient Amount");  
            }
            
        }  
        catch (UserDefinedException e)  
        {
            System.out.println(e.getMessage());
        }
    }

    public void subtract_Euro(double euro) {
        try  
        {
            this.euro -= euro;
            if(this.euro<0)
            {
                throw new UserDefinedException("Insufficient Amount");  
            }
            
        }  
        catch (UserDefinedException e)  
        {
            System.out.println(e.getMessage());
        }
    }

    public void subtract_australianDollar(double japan) {
        try  
        {
            this.australianDollar -= japan;
            if(this.australianDollar<0)
            {
                throw new UserDefinedException("Insufficient Amount");  
            }
            
        }  
        catch (UserDefinedException e)  
        {
            System.out.println(e.getMessage());
        }
    }

    public void subtract_canadianDollar(double australia) {
        try  
        {
            this.canadianDollar -= australia;
            if(this.canadianDollar<0)
            {
                throw new UserDefinedException("Insufficient Amount");  
            }
            
        }  
        catch (UserDefinedException e)  
        {
            System.out.println(e.getMessage());
        }
    }

    public void subtract_Yen(double china) {
        try  
        {
            this.yen -= china;
            if(this.yen<0)
            {
                throw new UserDefinedException("Insufficient Amount");  
            }
            
        }  
        catch (UserDefinedException e)  
        {
            System.out.println(e.getMessage());
        }
    }

    public void subtract_Dong(double mexico) {
        try  
        {
            this.dong -= mexico;
            if(this.dong<0)
            {
                throw new UserDefinedException("Insufficient Amount");  
            }
            
        }  
        catch (UserDefinedException e)  
        {
            System.out.println(e.getMessage());
        }
    }

    public void subtract_Peso(double canada) {
        try  
        {
            this.peso -= canada;
            if(this.peso<0)
            {
                throw new UserDefinedException("Insufficient Amount");  
            }
            
        }  
        catch (UserDefinedException e)  
        {
            System.out.println(e.getMessage());
        }
    }

    public void subtract_poundSterling(double vietnam){
        try  
        {
            this.poundSterling -= vietnam;
            if(this.poundSterling<0)
            {
                throw new UserDefinedException("Insufficient Amount");  
            }
            
        }  
        catch (UserDefinedException e)  
        {
            System.out.println(e.getMessage());
        }
    }
    
    
    abstract void record_action(String a,double w);
    abstract void description();
}
// class represents user-defined exception  
class UserDefinedException extends Exception  
{  
    public UserDefinedException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
}  