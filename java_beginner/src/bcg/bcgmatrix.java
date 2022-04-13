package bcg;

import java.io.*;
import java.util.Scanner;

public class bcgmatrix {
	static int Q1, Q2, Q3, Q4, Q5, Q6, k, sum;
    static int count = 0;
    static String C, A, B;
    
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("BCG matrix test를 시작합니다. 원하는 메뉴를 선택해주세요.");
    	end:
    		while (true) {
    			System.out.println("");
    			System.out.println("1. 시작                 2. 종료                3.관리자 모드");
    			
    			int m = scan.nextInt();
    			
    			if (m == 1) {
    				System.out.println("1. 일반 무료 회원         2. VIP 유료 회원        3. 수익 계산기");
    				while (true) {
    					int b = scan.nextInt();
    					if (b == 1) {
    						System.out.println("--------------------BCG test start.--------------------");        
	                        System.out.println("");
	                        reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q1.txt");
	                		int QA[] = new int[2];
	                		QA[0] = 5;
	                        QA[1] = 10;
	                        
	                        int SQ1 = 0;
	                        loop: while (true) {
	                        	SQ1 = scan.nextInt();
	                        	if (SQ1 == 1 || SQ1 == 2) {
	                        		SQ1 -= 1;
	                        		break loop;}
	                        	else {
	                        		System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}
	                        
	                        System.out.println("");
	                        reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q2.txt");
		                    int QB[] = new int[2];
		                    QB[0] = 10;
		                    QB[1] = 5;
		                    
		                    int SQ2 = 0;
		                    loop: while (true) {
		                    	SQ2 = scan.nextInt();
		                        if (SQ2 == 1 || SQ2 == 2) {
		                        	SQ2 -= 1;
		                        	break loop;}
		                        else {
		                        	System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}
		                    
		                    System.out.println("");
		                    reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q3.txt");
			                int QC[] = new int[3];
			                QC[0] = 10;
			                QC[1] = 5;
			                QC[2] = 5;
			                     
			                int SQ3 = 0;
			                loop: while (true) {
			                	SQ3 = scan.nextInt();
			                	if (SQ3 == 1 || SQ3 == 2 || SQ3 == 3) {
				                    SQ3 -= 1;
				                    break loop;}
			                	else {
			                		System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}
                     
			                System.out.println("");
			                reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q4.txt");
			                int QD[] = new int[2];
			                QD[0] = 10;
			                QD[1] = 5;
			                
			                int SQ4 = 0;
			                loop: while (true) {
			                	SQ4 = scan.nextInt();
			                	if (SQ4 == 1 || SQ4 == 2) {
			                		SQ4 -= 1;
			                    	break loop;} 
			                    else {
			                    	System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}
			                
		                    System.out.println("");
		                    reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q5.txt");
			                int QE[] = new int[2];
			                QE[0] = 5;
			                QE[1] = 10;
			                     
			                int SQ5 = 0;
			                loop: while (true) {
			                	SQ5 = scan.nextInt();
			                    if (SQ5 == 1 || SQ5 == 2) {
			                    	SQ5 -= 1;
			                    	break loop;} 
			                    else {
			                    	System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}
	                     
			                int k = QA[SQ1] + QB[SQ2] + QC[SQ3] + QD[SQ4] + QE[SQ5];
			                System.out.println("test 완료하였습니다. 고객님의 총점은 >>>>>>>>>>>>" + k);
			                if (k <= 30) {
			                	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\Dog.txt");}
			                else {
			                	if (k <= 40) {
			                		reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\Question.txt");}
			                    else if (k <= 45) {
			                    	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\Cashcow.txt");}
			                    else if (k <= 50) {
			                    	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\Star.txt");}}
			                     
			                     
			                System.out.println("");                             
			                System.out.println("도움이 되셨나요?");
			                System.out.println("1. 메인으로 돌아가기!       2. 종료");
			                int a = scan.nextInt();
			                    
			                if(a == 1){
			                	continue end;}
			                else if(a == 2){
			                	break end;}}
			                    	
		    			else if (b == 2) {
		    				users();
			                FileWriter();
			                
			                loop: while (true) {
			                	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q1.txt");
			                	System.out.println("");
		                        int a1 = scan.nextInt();
		                        if (a1 == 1) {
		                        	Q1 = 5;
		                            break loop;}
		                        else if (a1 == 2) {
		                        	Q1 = 10;
		                            break loop;}
		                        else {
		                           System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}

		                    loop: while (true) {
		                    	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q2.txt");
		                        System.out.println("");
		                        int b1 = scan.nextInt();
		                        if (b1 == 1) {
		                            Q2 = 10;
		                            break loop;} 
		                        else if (b1 == 2) {
		                        	Q2 = 5;
		                            break loop;} 
		                        else {
		                        	System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}

		                    loop: while (true) {
		                    	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q3.txt");
		                        System.out.println("");
		                        int c = scan.nextInt();
		                        if (c == 1) {
		                        	Q3 = 10;
		                            break loop;} 
		                        else if (c == 2) {
		                        	Q3 = 5;
		                            break loop;} 
		                        else if (c == 3) {
		                        	Q3 = 5;
		                            break loop;} 
		                        else {
		                        	System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}

		                    loop: while (true) {
		                    	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q4.txt");
		                        System.out.println("");
		                        int d = scan.nextInt();
		                        if (d == 1) {
		                            Q4 = 10;
		                            break loop;} 
		                        else if (d == 2) {
		                        	Q4 = 5;
		                            break loop;} 
		                        else {
		                        	System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}

		                    loop: while (true) {
		                    	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q5.txt");
		                        System.out.println("");
		                        int e = scan.nextInt();
		                        if (e == 1) {
		                           Q5 = 10;
		                           break loop;} 
		                        else if (e == 2) {
		                        	Q5 = 5;
		                            break loop;} 
		                        else {
		                        	System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}
		                                        
		                    loop: while (true) {
		                    	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\2_Q6.txt");
		                        System.out.println("");
		                        int f = scan.nextInt();
		                        if (f == 1) {
		                            Q6 = 10;
		                            break loop;} 
		                        else if (f == 2) {
		                        	Q6 = 5;
		                            break loop;} 
		                        else {
		                        	System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");}}
		                    
		                    reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\2_Q7.txt");
		                    System.out.println("");
		                    int g = scan.nextInt();
		
		                    reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\2_Q8.txt");
		                    System.out.println("");
		                    int h = scan.nextInt();

		                    if (g < h) {
		                    	sum = Q1 + Q2 + Q3 + Q4 + Q5 + Q6 - 10;
		                        System.out.println("총점 : " + sum);} 
		                    else if (g > h) {
		                        sum = Q1 + Q2 + Q3 + Q4 + Q5 + Q6 + 10;
		                        System.out.println("총점 : " + sum);} 
		                    else if (g == h) {
		                        sum = Q1 + Q2 + Q3 + Q4 + Q5 + Q6;
		                        System.out.println("총점 : " + sum);}

		                    int i = sum;
		                    if (i <= 30) {
		                    	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\Dog.txt");} 
		                    else {
		                    	if (i <= 45) {
		                    		reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\Question.txt");}
		                        else if (i <= 60) {
		                        	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\Cashcow.txt");}
		                        else if (i<= 70) {
		                        	reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\Star.txt");}}
		                    
		                     System.out.println("");                               
		                     System.out.println("도움이 되셨나요?");
		                     System.out.println("1. 메인으로 돌아가기!       2. 종료");
		                     int a = scan.nextInt();
		                     if(a == 1){
		                         continue end;}
		                     else if(a == 2){
		                    	 break end;}}
    					
    					else if (b == 3) {
    						System.out.println("실제 이익 측정 계산기");
	                        System.out.println("");
	                        Scanner scanner = new Scanner(System.in);
	                         
	                        System.out.println("제품 및 서비스 판매 가격 (단위 원)");
	                        double A = scanner.nextDouble();
	                        System.out.println("");
	                        System.out.println("예상 판매량 (단위 개수)");
	                        double B = scanner.nextDouble();
	                        System.out.println("");
	                        System.out.println("고정 비용 (단위 원)");
	                        double C = scanner.nextDouble();
	                        System.out.println("");
	                        System.out.println("변동 비용 (단위 원)");
	                        double D = scanner.nextDouble();
	                        System.out.println("");
	                         
	                        double benefit = A*B;
	                        System.out.println("매출액 : " + benefit);
	                        System.out.println("");
	                         
	                        double cost = C + D;
	                        System.out.println("매출 이익률 : " + cost);
	                        System.out.println("");
	
	                        double realbenefit = benefit - cost;
	                        if(realbenefit > 0){
	                            System.out.println("순수익 : " + realbenefit);
	                            System.out.println("흑자 입니다.");
	                            System.out.println("");}
	                         else if (realbenefit<0){
	                            System.out.println("순수익 : " + realbenefit);
	                            System.out.println("적자 입니다.");
	                            System.out.println("");}
	                         else{
	                            System.out.println("순수익 : " + realbenefit);
	                            System.out.println("손익 분기점입니다.");
	                            System.out.println("");}
	                        System.out.println("");                       // �躸�� 384~
	                        System.out.println("도움이 되셨나요?");
	                        System.out.println("1. 메인으로 돌아가기!       2. 종료");
	                        int a = scan.nextInt();
                            if(a == 1){
                            	continue end;}
                            else if(a == 2){
                            	break end;}}}}
    			
    			else if (m == 2) {
    				System.out.println("끝");
    				break;}
    			
    			else if (m == 3) {
    				Scanner manager = new Scanner(System.in);
    				int ID[] = new int[2];
    				int id = 14381012;
    				int con = 2;
    				
    				System.out.println("********** 관리자 모드 입니다. **********");
    				loop: for (int t = 0; t < 3; t++) {
    					System.out.println("아이디와 비번을 입력해주세요.");
    					System.out.print("ID >>>>");
    					ID[0] = manager.nextInt();
    					System.out.print("PW >>>>");
    					ID[1] = manager.nextInt();
    					
    					if (ID[0] == 14381012 && ID[1] == 12345) {
    						System.out.println("접속");
    					}
    				}
    				
    			}}}
         
	static void reader(String name) {
		FileReader r = null;
        BufferedReader br = null;
        try {
        	int a = 0;
            r = new FileReader(name);
            br = new BufferedReader(r);
            while (true) {
            	String data = br.readLine();
                System.out.println("");
                
                if (data == null) {
                	break;}
                
            String ch = data;
            System.out.print(ch);

         }
      } catch (FileNotFoundException fnfe) {
         System.out.println("������ �������� �ʽ��ϴ�.");
      } catch (IOException ioe) {
         System.out.println("������ ���� �� �����ϴ�.");
      } finally {
         try {
            r.close();
         } catch (Exception e) {

         }
      }

   }                                               
   
   static void writer(String WR,String test) {
      try {
         PrintWriter pw = new PrintWriter(test);
         
            String data =  WR;
            pw.println(data);
         
         pw.close();
      } catch (IOException e) {
         System.err.println(e); // ������ �ִٸ� �޽��� ���
         System.exit(1);
      }

   }                                                     //      ~ 719 �ۼ��� �躸��//////////////////////////////////////////
   
  
   

   static void users() {                                     // �ۼ��� : ������    724~     /////////////////////////////////////////

      Scanner scan = new Scanner(System.in);

      System.out.println("VIP 유료 회원 전용 입니다..");

      System.out.println("사업자 등록 번호를 입력해주세요.");
      A = scan.next();

      System.out.println("사업자 등록일을 입력해주세요 (20101130 ");
      B = scan.next();

      System.out.println("회사 명을 입력해주세요.");
      C = scan.next();

   }
   

   
      
   
   
   static void FileWriter() {

      String txt = A;
      String txt1 = B;
      String txt2 = C;
      reader("C:\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\1_Q1.txt");
      String fileName = "\\Users\\rnru1\\Java_AromA\\java_beginner\\src\\bcg\\"+ C +".txt";

      try {

         File file = new File(fileName);

         BufferedWriter out = new BufferedWriter(new FileWriter(fileName));

         // ���Ͼȿ� ���ڿ� ����
         out.write("회사 명 : " + txt2);
         out.newLine();
         out.newLine();
         out.write("사업자 등록 번호 : " + txt);
         out.newLine();
         out.newLine();
         out.write("사업자 등록일 : " + txt1);
         out.newLine();
         out.newLine();


         out.close();

      } catch (Exception e) {
         e.printStackTrace();
      }                 

   }                                                    // �ۼ��� : ������    724~  792   /////////////////////////////////////////

}
   