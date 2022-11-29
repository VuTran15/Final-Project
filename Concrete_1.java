import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Concrete_1 implements Interface{
    
//    Portion of Data Structure (Linked List)
    LinkedList<String> transaction = new LinkedList<String>();


//    US    
    public double US_Euro_converter(double money)
    {
        return money*0.98;
    }
    public double US_Yen_converter(double money)
    {
        return money*142.08;
    }
    public double US_AustralianDollar_converter(double money)
    {
        return money*1.51;
    }
    public double US_Peso_converter(double money)
    {
        return money*57.39;
    }
    public double US_Dong_converter(double money)
    {
        return money*24842.50;
    }
    public double US_CanadianDollar_converter(double money)
    {
        return money*1.34;
    }
    public double US_PoundSterling_converter(double money)
    {
        return money*0.85;
    }
    
    
    
//    Euro
    public double Euro_US_converter(double money)
    {
        return money*1.02;
    }
    public double Euro_Yen_converter(double money)
    {
        return money*145.47;
    }
    public double Euro_AustralianDollar_converter(double money)
    {
        return money*1.55;
    }
    public double Euro_Peso_converter(double money)
    {
        return money*58.70;
    }
    public double Euro_Dong_converter(double money)
    {
        return money*25424.19;
    }
    public double Euro_CanadianDollar_converter(double money)
    {
        return money*1.38;
    }
    public double Euro_PoundSterling_converter(double money)
    {
        return money*0.87;
    }
    
    
    
//    Yen
    public double Yen_US_converter(double money)
    {
        return money*0.0070;
    }
    public double Yen_Euro_converter(double money)
    {
        return money*0.0069;
    }
    public double Yen_AustralianDollar_converter(double money)
    {
        return money*0.011;
    }
    public double Yen_Peso_converter(double money)
    {
        return money*0.40;
    }
    public double Yen_Dong_converter(double money)
    {
        return money*174.79;
    }
    public double Yen_CanadianDollar_converter(double money)
    {
        return money*0.0095;
    }
    public double Yen_PoundSterling_converter(double money)
    {
        return money*0.0060;
    }
    
    
//    Australian Dollar
    public double AustralianDollar_US_converter(double money)
    {
        return money*0.66;
    }
    public double AustralianDollar_Euro_converter(double money)
    {
        return money*0.64;
    }
    public double AustralianDollar_Yen_converter(double money)
    {
        return money*93.82;
    }
    public double AustralianDollar_Peso_converter(double money)
    {
        return money*37.89;
    }
    public double AustralianDollar_Dong_converter(double money)
    {
        return money*16394.68;
    }
    public double AustralianDollar_CanadianDollar_converter(double money)
    {
        return money*0.89;
    }
    public double AustralianDollar_PoundSterling_converter(double money)
    {
        return money*0.56;
    }
    
    
//    Peso
    public double Peso_US_converter(double money)
    {
        return money*0.051;
    }
    public double Peso_Euro_converter(double money)
    {
        return money*0.017;
    }
    public double Peso_Yen_converter(double money)
    {
        return money*2.48;
    }
    public double Peso_AustralianDollar_converter(double money)
    {
        return money*0.026;
    }
    public double Peso_Dong_converter(double money)
    {
        return money*432.82;
    }
    public double Peso_CanadianDollar_converter(double money)
    {
        return money*0.023;
    }
    public double Peso_PoundSterling_converter(double money)
    {
        return money*0.015;
    }
    
    
    
//    Dong
    public double Dong_US_converter(double money)
    {
        return money*0.000040;
    }
    public double Dong_Euro_converter(double money)
    {
        return money*0.000039;
    }
    public double Dong_Yen_converter(double money)
    {
        return money*0.0057;
    }
    public double Dong_AustralianDollar_converter(double money)
    {
        return money*0.000061;
    }
    public double Dong_Peso_converter(double money)
    {
        return money*0.0023;
    }
    public double Dong_CanadianDollar_converter(double money)
    {
        return money*0.000054;
    }
    public double Dong_PoundSterling_converter(double money)
    {
        return money*0.000034;
    }
    
    
//    Canadian Dollar
    public double CanadianDollar_US_converter(double money)
    {
        return money*0.74;
    }
    public double CanadianDollar_Euro_converter(double money)
    {
        return money*0.73;
    }
    public double CanadianDollar_Yen_converter(double money)
    {
        return money*105.71;
    }
    public double CanadianDollar_AustralianDollar_converter(double money)
    {
        return money*1.13;
    }
    public double CanadianDollar_Peso_converter(double money)
    {
        return money*42.69;
    }
    public double CanadianDollar_Dong_converter(double money)
    {
        return money*18479.47;
    }
    public double CanadianDollar_PoundSterling_converter(double money)
    {
        return money*0.63;
    }
    
    
//    Pound Sterling
    public double PoundSterling_US_converter(double money)
    {
        return money*1.18;
    }
    public double PoundSterling_Euro_converter(double money)
    {
        return money*1.15;
    }
    public double PoundSterling_Yen_converter(double money)
    {
        return money*167.95;
    }
    public double PoundSterling_AustralianDollar_converter(double money)
    {
        return money*1.79;
    }
    public double PoundSterling_Peso_converter(double money)
    {
        return money*67.83;
    }
    public double PoundSterling_Dong_converter(double money)
    {
        return money*29355.02;
    }
    public double PoundSterling_CanadianDollar_converter(double money)
    {
        return money*1.59;
    }
    
    
    
    
    public double transit(double money, String from_bank, String to_bank)
    {
        double converted_amount =  money;
//        Portion of If/Else
        if(from_bank == "USDollar")
        {
            if(to_bank == "euro")
            {
                converted_amount = US_Euro_converter(money);
            }
            else if(to_bank == "yen")
            {
                converted_amount = US_Yen_converter(money);
            }
            else if(to_bank == "australianDollar")
            {
                converted_amount = US_AustralianDollar_converter(money);
            }
            else if(to_bank == "peso")
            {
                converted_amount = US_Peso_converter(money);
            }
            else if(to_bank == "dong")
            {
                converted_amount = US_Dong_converter(money);
            }
            else if(to_bank == "canadianDollar")
            {
                converted_amount = US_CanadianDollar_converter(money);
            }   
            else if(to_bank == "poundSterling")
            {
                converted_amount = US_PoundSterling_converter(money);
            }
            
        }
        else if(from_bank == "euro")
        {
            if(to_bank == "USDollar")
            {
                converted_amount = Euro_US_converter(money);
            }
            else if(to_bank == "yen")
            {
                converted_amount = Euro_Yen_converter(money);
            }
            else if(to_bank == "australianDollar")
            {
                converted_amount = Euro_AustralianDollar_converter(money);
            }
            else if(to_bank == "peso")
            {
                converted_amount = Euro_Peso_converter(money);
            }
            else if(to_bank == "dong")
            {
                converted_amount = Euro_Dong_converter(money);
            }
            else if(to_bank == "canadianDollar")
            {
                converted_amount = Euro_CanadianDollar_converter(money);
            }   
            else if(to_bank == "poundSterling")
            {
                converted_amount = Euro_PoundSterling_converter(money);
            }
        }
        else if(from_bank == "yen")
        {
            if(to_bank == "USDollar")
            {
                converted_amount = Yen_US_converter(money);
            }
            else if(to_bank == "euro")
            {
                converted_amount = Yen_Euro_converter(money);
            }
            else if(to_bank == "australianDollar")
            {
                converted_amount = Yen_AustralianDollar_converter(money);
            }
            else if(to_bank == "peso")
            {
                converted_amount = Yen_Peso_converter(money);
            }
            else if(to_bank == "dong")
            {
                converted_amount = Yen_Dong_converter(money);
            }
            else if(to_bank == "canadianDollar")
            {
                converted_amount = Yen_CanadianDollar_converter(money);
            }   
            else if(to_bank == "poundSterling")
            {
                converted_amount = Yen_PoundSterling_converter(money);
            }
        }
        else if(from_bank == "australianDollar")
        {
            if(to_bank == "USDollar")
            {
                converted_amount = AustralianDollar_US_converter(money);
            }
            else if(to_bank == "euro")
            {
                converted_amount = AustralianDollar_Euro_converter(money);
            }
            else if(to_bank == "yen")
            {
                converted_amount = AustralianDollar_Yen_converter(money);
            }
            else if(to_bank == "peso")
            {
                converted_amount = AustralianDollar_Peso_converter(money);
            }
            else if(to_bank == "dong")
            {
                converted_amount = AustralianDollar_Dong_converter(money);
            }
            else if(to_bank == "canadianDollar")
            {
                converted_amount = AustralianDollar_CanadianDollar_converter(money);
            }   
            else if(to_bank == "poundSterling")
            {
                converted_amount = AustralianDollar_PoundSterling_converter(money);
            }
        }
        else if(from_bank == "peso")
        {
            if(to_bank == "USDollar")
            {
                converted_amount = Peso_US_converter(money);
            }
            else if(to_bank == "euro")
            {
                converted_amount = Peso_Euro_converter(money);
            }
            else if(to_bank == "yen")
            {
                converted_amount = Peso_Yen_converter(money);
            }
            else if(to_bank == "australianDollar")
            {
                converted_amount = Peso_AustralianDollar_converter(money);
            }
            else if(to_bank == "dong")
            {
                converted_amount = Peso_Dong_converter(money);
            }
            else if(to_bank == "canadianDollar")
            {
                converted_amount = Peso_CanadianDollar_converter(money);
            }   
            else if(to_bank == "poundSterling")
            {
                converted_amount = Peso_PoundSterling_converter(money);
            }
        }
        else if(from_bank == "dong")
        {
            if(to_bank == "USDollar")
            {
                converted_amount = Dong_US_converter(money);
            }
            else if(to_bank == "euro")
            {
                converted_amount = Dong_Euro_converter(money);
            }
            else if(to_bank == "yen")
            {
                converted_amount = Dong_Yen_converter(money);
            }
            else if(to_bank == "australianDollar")
            {
                converted_amount = Dong_AustralianDollar_converter(money);
            }
            else if(to_bank == "peso")
            {
                converted_amount = Dong_Peso_converter(money);
            }
            else if(to_bank == "canadianDollar")
            {
                converted_amount = Dong_CanadianDollar_converter(money);
            }   
            else if(to_bank == "poundSterling")
            {
                converted_amount = Dong_PoundSterling_converter(money);
            }
        }
        else if(from_bank == "canadianDollar")
        {
            if(to_bank == "USDollar")
            {
                converted_amount = CanadianDollar_US_converter(money);
            }
            else if(to_bank == "euro")
            {
                converted_amount = CanadianDollar_Euro_converter(money);
            }
            else if(to_bank == "yen")
            {
                converted_amount = CanadianDollar_Yen_converter(money);
            }
            else if(to_bank == "australianDollar")
            {
                converted_amount = CanadianDollar_AustralianDollar_converter(money);
            }
            else if(to_bank == "peso")
            {
                converted_amount = CanadianDollar_Peso_converter(money);
            }
            else if(to_bank == "dong")
            {
                converted_amount = CanadianDollar_Dong_converter(money);
            }   
            else if(to_bank == "poundSterling")
            {
                converted_amount = CanadianDollar_PoundSterling_converter(money);
            }
        }   
        else if(from_bank == "poundSterling")
        {
//            Portion of Switch
            switch(to_bank)
            {
                case "USDollar":
                    converted_amount = PoundSterling_US_converter(money);
                    break;
                case "euro":
                    converted_amount = PoundSterling_Euro_converter(money);
                    break;
                case "yen":
                    converted_amount = PoundSterling_Yen_converter(money);
                    break;
                case "australianDollar":
                    converted_amount = PoundSterling_AustralianDollar_converter(money);
                    break;
                case "peso":
                    converted_amount = PoundSterling_Peso_converter(money);
                    break;
                case "dong":
                    converted_amount = PoundSterling_Dong_converter(money);
                    break;
                case "canadianDollar":
                    converted_amount = PoundSterling_CanadianDollar_converter(money);
                    break;
            }
        }

        
        String trans = "Bank = " + from_bank + "\nAmount = " + String.valueOf(money) + "\nConvert Bank = " +to_bank+ "\nConvert amount = "+ String.valueOf(converted_amount);
        this.transaction.add(trans);
        
        
        
        return converted_amount;
    }
    
    
//    Write File Portion
    public void file_writer()
    {
//        Portion of Exception
        try {
            FileWriter fw = new FileWriter("transaction.txt");
            Iterator<String> itr = this.transaction.iterator();  
            writing(fw,itr); 
        } catch (IOException ex) {
            Logger.getLogger(Concrete_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void writing(FileWriter fw,Iterator<String> itr) throws IOException
    {
        if(itr.hasNext())
        {
            fw.append(itr.next()+"\n****************************************\n");     
//      Portion of Recursion
            writing(fw,itr);
        }
        else
        {
            fw.close();
        }
    }

//    Read File Portion
    public void file_reader()
    {
        try {
            FileReader fr = new FileReader("transaction.txt");
            int i;
//            Portion of Loops
            while((i=fr.read())!=-1)    
            System.out.print((char)i);    
            fr.close();    
        } catch (IOException ex) {
            Logger.getLogger(Concrete_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public double converter(double money) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
