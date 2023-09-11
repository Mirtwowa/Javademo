package org.example;

public class BankofDalian extends Bank {
      double year;
      public double computerInterest() {
    	  super.year=(int)year;
    	  double r=year-(int)year;
    	  int day=(int)(r*1000);
    	  double yearInterest=super.computerInterest();
    	  double dayInterest=day*0.00012*saveMoney;
    	  interest=yearInterest+dayInterest;
    	  System.out.printf("%dԪ���ڴ�������%d����%d�����Ϣ��%fԪ\n",saveMoney,super.year,day,interest);
    	  return interest;
      }
}
