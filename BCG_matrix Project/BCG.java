package bcg;

import java.io.*;
import java.util.Scanner;
                                                                                  // JAVA 프로젝트 6조  김보성, 채재윤, 백승엽, 이연재, 서혁진, 정세윤, 이성헌
public class BCG {                                                                // 전체 로직 작성 및 수정 : 김보성. 백승엽. 서혁진
   static int Q1, Q2, Q3, Q4, Q5, Q6, k, sum;
   static int count = 0;
   static String C, A, B;

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      reader("C:/Bcg.txt");
      
      end:
          while (true) {
      System.out.println("");
      System.out.println("1번 시작하기                 2번 종료하기                3번 관리자 모드");

     
      
      
         int a = scan.nextInt();

         if (a == 1) {

            System.out.println("1번 일반 사업자 진단         2번 VIP 사업자 진단        3번 순수익 계산기");

            while (true) {

               int b = scan.nextInt();
               {

                  if (b == 1) {                                                          ///////////////////////////////////////////////////////////////////////

                     System.out.println("--------------------BCG test 시작합니다.--------------------");        // 1번 일반 사업자 진단 코딩부분 ( 채재윤, 이연재 )
                                                                                                             // 37번줄 ~ 146번줄
                     reader("C:/1_Q1.txt");
                     System.out.println("");
                     // System.out.println("Q1. 현재 지점(프렌차이즈 및 라이센스) 수?");
                     // System.out.println("1. 10개 지점 이하   2. 10개 지점 이상");
                     int QA[] = new int[2];

                     QA[0] = 5;
                     QA[1] = 10;

                     int SQ1 = 0;
                     loop: while (true) {
                        SQ1 = scan.nextInt();

                        if (SQ1 == 1 || SQ1 == 2) {
                           SQ1 -= 1;
                           break loop;
                        } else {
                           System.out.println("1번과  2번 숫자중에 선택해 주세요");
                        }
                     }

                     reader("C:/1_Q2.txt");
                     System.out.println("");
                     // System.out.println("Q2. 특허를 한 제품 및 서비스가 있는가?");
                     // System.out.println("1. O   2. X");
                     int QB[] = new int[2];
                     QB[0] = 10;
                     QB[1] = 5;
                     int SQ2 = 0;
                     loop: while (true) {
                        SQ2 = scan.nextInt();

                        if (SQ2 == 1 || SQ2 == 2) {
                           SQ2 -= 1;
                           break loop;
                        } else {
                           System.out.println("1번과  2번 숫자중에 선택해 주세요");
                        }
                     }

                     reader("C:/1_Q3.txt");
                     System.out.println("");
                     // System.out.println("Q3. 예상 되는 경쟁 기업의 수?");
                     // System.out.println("1. 10개 이하    2. 10개 이상   3. 없다.");
                     int QC[] = new int[3];
                     QC[0] = 10;
                     QC[1] = 5;
                     QC[2] = 5;
                     int SQ3 = 0;
                     loop: while (true) {
                        SQ3 = scan.nextInt();

                        if (SQ3 == 1 || SQ3 == 2 || SQ3 == 3) {
                           SQ3 -= 1;
                           break loop;
                        } else {
                           System.out
                                 .println("1번  2번  3번  숫자중에 선택해 주세요");
                        }
                     }
                     reader("C:/1_Q4.txt");
                     System.out.println("");
                     // System.out.println("Q4. 현재 상품 또는 서비스는 지속적인 발전이 가능한가?");
                     // System.out.println("1. O   2. X");
                     int QD[] = new int[2];
                     QD[0] = 10;
                     QD[1] = 5;
                     int SQ4 = 0;
                     loop: while (true) {
                        SQ4 = scan.nextInt();

                        if (SQ4 == 1 || SQ4 == 2) {
                           SQ4 -= 1;
                           break loop;
                        } else {
                           System.out.println("1번과  2번 숫자중에 선택해 주세요");
                        }
                     }
                     reader("C:/1_Q5.txt");
                     System.out.println("");
                     // System.out.println("Q5. 현금 유출과 유입 중 어느 부분의 비중이 큰가?");
                     // System.out.println("1. 유출      2. 유입");
                     int QE[] = new int[2];
                     QE[0] = 5;
                     QE[1] = 10;
                     int SQ5 = 0;
                     loop: while (true) {
                        SQ5 = scan.nextInt();

                        if (SQ5 == 1 || SQ5 == 2) {
                           SQ5 -= 1;
                           break loop;
                        } else {
                           System.out.println("1번과  2번 숫자중에 선택해 주세요");
                        }
                     }
                     int k = QA[SQ1] + QB[SQ2] + QC[SQ3] + QD[SQ4]
                           + QE[SQ5];
                     System.out.println("  test 점수 합계 >>>>>>>>>>>>" + k);

                     if (k <= 30) {
                        reader("C:/dog.txt");
                     } else {
                        if (k <= 40)
                           reader("C:/Question.txt");
                        else if (k <= 45)
                           reader("C:/Cashcow.txt");
                        else if (k <= 50)
                           reader("C:/star.txt");                         //    1번 일반 사업자 진단 코딩부분 ( 채재윤, 이연재 )    37번줄 ~ 146번줄  수정: 김보성, 서혁진
                     }                                                   /////////////////////////////////////////////////////////////////////////

                      
                        System.out.println("");                             // 김보성 150~159
                        System.out.println("한번더 실행 하시겠습니까?");
                        System.out.println("1번 - 한번더!       2번  - 종료");
                        a = scan.nextInt();
                        if(a == 1){
                           continue end;
                        }
                        else if(a == 2){
                           break end;
                        }                                                   ////////////////
                     
                  } else if (b == 2) {                               /////////////////////////////////////////////
                     users();                                                //2번 코딩부분 백승엽 162번~                     수정: 서혁진(users(), FileWriter())
                     FileWriter();

                     // 1번 문제
                     loop: while (true) {
                        reader("C:/1_Q1.txt");
                        System.out.println("");
                        // System.out.println("Q1. 현재 지점(프렌차이즈 및 라이센스) 수?");
                        // System.out.println("1. 10 지점 이하        2. 10 지점 이상");
                        int a1 = scan.nextInt();
                        if (a1 == 1) {
                           Q1 = 5;
                           break loop;

                        }

                        else if (a1 == 2) {
                           Q1 = 10;
                           break loop;
                        }

                        else {
                           System.out.println("1번과 2번 중에서만 선택하세요.");

                        }
                     }

                     // 2번 문제
                     loop: while (true) {
                        reader("C:/1_Q2.txt");
                        System.out.println("");
                        // System.out.println("Q2. 특허를 한 제품 및 서비스가 있는가?");
                        // System.out.println(" 1. O       2. X ");
                        int b1 = scan.nextInt();
                        if (b1 == 1) {
                           Q2 = 10;
                           break loop;
                        } else if (b1 == 2) {
                           Q2 = 5;
                           break loop;
                        } else {
                           System.out.println("1번과 2번 중에서만 선택하세요.");
                        }
                     }

                     // 3번 문제
                     loop: while (true) {
                        reader("C:/1_Q3.txt");
                        System.out.println("");
                        // System.out.println("Q3. 예상 되는 경쟁 기업의 수?");
                        // System.out.println("1. 10개 이하    2. 10개 이상   3. 없다.");
                        int c = scan.nextInt();
                        if (c == 1) {
                           Q3 = 10;
                           break loop;
                        } else if (c == 2) {
                           Q3 = 5;
                           break loop;
                        } else if (c == 3) {
                           Q3 = 5;
                           break loop;
                        } else {
                           System.out.println("1번 2번  3번 중에서만 선택하세요.");
                        }
                     }

                     // 4번 문제
                     loop: while (true) {
                        reader("C:/1_Q4.txt");
                        System.out.println("");
                        // System.out.println("Q4. 현재 상품 또는 서비스는 지속적인 발전이 가능한가?");
                        // System.out.println(" 1. O       2. X ");
                        int d = scan.nextInt();
                        if (d == 1) {
                           Q4 = 10;
                           break loop;
                        } else if (d == 2) {
                           Q4 = 5;
                           break loop;
                        } else {
                           System.out.println("1번과 2번 중에서만 선택하세요.");
                        }

                     }

                     // 5번 문제
                     loop: while (true) {
                        reader("C:/1_Q5.txt");
                        System.out.println("");
                        // System.out.println("Q5. 현금 유출과 유입 중 어느 부분의 비중이 큰가?");
                        // System.out.println("1. 유출      2. 유입");
                        int e = scan.nextInt();
                        if (e == 1) {
                           Q5 = 10;
                           break loop;
                        } else if (e == 2) {
                           Q5 = 5;
                           break loop;
                        } else {
                           System.out.println("1번과 2번 중에서만 선택하세요.");
                        }
                     }

                     // 6번 문제
                     loop: while (true) {
                        reader("C:/2_Q6.txt");
                        System.out.println("");
                        // System.out.println("Q6. 자본과 조달 중 어느 부분이 가장 큰 비중을 차지 하나요?");
                        // System.out.println("1. 자본      2. 조달");
                        int f = scan.nextInt();
                        if (f == 1) {
                           Q6 = 10;
                           break loop;
                        } else if (f == 2) {
                           Q6 = 5;
                           break loop;
                        } else {
                           System.out.println("1번과 2번 중에서만 선택하세요.");
                        }                                                                  /// 백승엽 코딩  162~ 280   수정: 서혁진(users(), FileWriter())
                     }                                                            /////////////////////////////////////////////

                     // 7번                                                                                    // 정세윤, 이성헌  283~ 319     수정 서혁진(reader())
                     reader("C:/2_Q7.txt");
                     System.out.println("");
                     // System.out.println("Q7. 총 수익을 입력해주세요");
                     // System.out.println("만원 단위로 입력해주세요");
                     int g = scan.nextInt();

                     // 8번
                     reader("C:/2_Q8.txt");
                     System.out.println("");
                     // System.out.println("Q8. 총 비용을 입력해주세요");
                     // System.out.println("만원 단위로 입력해주세요");
                     int h = scan.nextInt();

                     if (g < h) {
                        sum = Q1 + Q2 + Q3 + Q4 + Q5 + Q6 - 10;
                        System.out.println("합계 : " + sum);
                     } else if (g > h) {
                        sum = Q1 + Q2 + Q3 + Q4 + Q5 + Q6 + 10;
                        System.out.println("합계 : " + sum);
                     } else if (g == h) {
                        sum = Q1 + Q2 + Q3 + Q4 + Q5 + Q6;
                        System.out.println("합계 : " + sum);
                     }

                     int i = sum;
                     if (i <= 30) {
                        reader("C:/dog.txt");

                     } else {
                        if (i <= 45)
                           reader("C:/Question.txt");
                        else if (i <= 60)
                           reader("C:/Cashcow.txt");
                        else if (i<= 70)
                           reader("C:/star.txt");                          //    정세윤, 이성헌  283~ 319     수정 서혁진(reader())
                     }                                                     //////////////////////////////////////////////////////////
                     
                     System.out.println("");                               //  김보성 321 ~331
                     System.out.println("한번더 실행 하시겠습니까?");
                     System.out.println("1번 - 한번더!       2번  - 종료");
                     a = scan.nextInt();
                     if(a == 1){
                        continue end;
                     }
                     else if(a == 2){
                        break end;
                     }
                  }                                                         // 321 ~ 331
                 
                  else if (b == 3) {                                            ///////////////////////////////////////////////////
                                                                                // 채재윤, 백승엽   334~382
                         System.out.println("질문에 답해주세요. (단위 : 만)");
                         System.out.println("");
                         Scanner scanner = new Scanner(System.in);
                         
                         System.out.println("고정비용을 입력해주세요.");
                         double A = scanner.nextDouble();
                         System.out.println("");
                         
                         System.out.println("변동비를 입력해 주세요. ");
                         double B = scanner.nextDouble();
                         System.out.println("");
                         
                         System.out.println("가격(원가)을 입력해 주세요. ");
                         double C = scanner.nextDouble();
                         System.out.println("");
                         
                         System.out.println("기대 수요를 입력해 주세요. ");
                         double D = scanner.nextDouble();
                         System.out.println("");
                         
                         
                         double benefit = C*D;
                         
                         System.out.println("총 이익 : " + benefit);
                         System.out.println("");
                         
                         double cost = (B*D)+A;
                         
                         System.out.println("총 비용 : " + cost);
                         System.out.println("");

                         double realbenefit = benefit - cost;
                         
                         if(realbenefit > 0){
                            System.out.println("순이익 : " + realbenefit);
                            System.out.println("흑자입니다.");
                            System.out.println("");
                         }
                         else if (realbenefit<0){
                            System.out.println("순이익 : " + realbenefit);
                            System.out.println("적자입니다.");
                            System.out.println("");
                         }
                         else{
                            System.out.println("순이익 : " + realbenefit);
                            System.out.println("본전입니다.");
                            System.out.println("");                          // 채재윤, 백승엽   334~382
                         }                                                ///////////////////////////////////////////////
                         
                         System.out.println("");                       // 김보성 384~
                          System.out.println("한번더 실행 하시겠습니까?");
                          System.out.println("1번 - 한번더!       2번  - 종료");
                          a = scan.nextInt();
                          if(a == 1){
                             continue end;
                          }
                          else if(a == 2){
                             break end;
                          } 
                      
                   
                  }                                                      // 김보성384 ~ 396

               }
               
            }
         
         } else if (a == 2) {
            System.out.println(">>>>>>>>>>>>>>>>종료합니다.<<<<<<<<<<<<<<<<");
            break;

         }
         
         else if ( a== 3){                                                  /////////////////////////////////////////////////
            Scanner manager = new Scanner(System.in);                       // 관리자 모드  작성자:  김보성 409 ~ 661
            int ID[] = new int[2];
            int id = 14681001;
            int con = 2;

            
            System.out.println("***********관리자 모드입니다.***********");
            loop: for (int t = 0; t < 3; t++) {
               System.out.println(" 아이디와 비밀번호를 입력하세요. ");
               System.out.print("ID>>>>>");
               ID[0] = manager.nextInt();
               System.out.print("PW>>>>>");
               ID[1] = manager.nextInt();

               if (ID[0] == 14681001 && ID[1] == 12345 || ID[0] == 14681025 && ID[1] == 12345 || ID[0] == 14581014 && ID[1] == 12345
                     || ID[0] == 14381012 && ID[1] == 12345 || ID[0] == 14681021 && ID[1] == 12345 || ID[0] == 14681014 && ID[1] == 12345
                     || ID[0] == 14781016 && ID[1] == 12345) {
                  
                  System.out.println("이용하실 서비스 번호를 입력하세요.");
                  System.out.println("문제 수정하기 START");
                  
                  
                  
                  while(true){
                  
                  
                   System.out.println("<<문제 수정하기>>");
                   System.out.println("1번 - 일반 사업자 진단 , 2번 - VIP 사업자 진단");
                   
                   
                   
                   Q1 = manager.nextInt();
                   
                    if(Q1 == 1){
                     
                  System.out.println("<<문제 수정하기>>");
                  System.out.println("   일반 사업자 진단    ");
                  System.out.println("수정할 문제번호를 입력하세요. < 1번~5번 > ");

                  int Qch = 0;
                  String WR = null;
                  String test = null;
                  
                  
                  while(true){
                  Qch = manager.nextInt();
                  
                  switch (Qch) {
                  case 1:
                     reader("C:/1_Q1.txt");
                     System.out.println("");
                     System.out.println("문제를 다시 입력하세요.( 수정전  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q1.txt");

                     System.out.println("완료되었습니다.( 수정후  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                  case 2:
                     
                     reader("C:/1_Q2.txt");
                     System.out.println("");
                     System.out.println("문제를 다시 입력하세요.( 수정전  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q2.txt");

                     System.out.println("완료되었습니다.( 수정후  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                     
                  case 3:
                     
                     reader("C:/1_Q3.txt");
                     System.out.println("");
                     System.out.println("문제를 다시 입력하세요.( 수정전  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q3.txt");

                     System.out.println("완료되었습니다.( 수정후  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                     
                  case 4:
                     reader("C:/1_Q4.txt");
                     System.out.println("");
                     System.out.println("문제를 다시 입력하세요.( 수정전  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q4.txt");

                     System.out.println("완료되었습니다.( 수정후  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                  case 5:
                     reader("C:/1_Q5.txt");
                     System.out.println("");
                     System.out.println("문제를 다시 입력하세요.( 수정전  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q5.txt");

                     System.out.println("완료되었습니다.( 수정후  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                     default:
                        System.out.println("1~5 번의 문제만 수정할 수 있습니다. 다시 입력하세요");
                  }
                  }
                   }// 간편사업진단 if문
                    
                    
                    else if( Q1 == 2){
                                       
                        
                        System.out.println("<<문제 수정하기>>");
                        System.out.println("   VIP 사업자 진단     ");
                        System.out.println("수정할 문제번호를 입력하세요. < 1번~8번 > ");

                        int Qch = 0;
                        String WR = null;
                        String test = null;
                        
                        
                        while(true){
                        Qch = manager.nextInt();
                        
                     
                        
                        switch (Qch) {
                        case 1:
                           reader("C:/1_Q1.txt");
                           System.out.println("");
                           System.out.println("문제를 다시 입력하세요.( 수정전  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q1.txt");

                           System.out.println("완료되었습니다.( 수정후  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 2:
                           
                           reader("C:/1_Q2.txt");
                           System.out.println("");
                           System.out.println("문제를 다시 입력하세요.( 수정전  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q2.txt");

                           System.out.println("완료되었습니다.( 수정후  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                           
                        case 3:
                           
                           reader("C:/1_Q3.txt");
                           System.out.println("");
                           System.out.println("문제를 다시 입력하세요.( 수정전  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q3.txt");

                           System.out.println("완료되었습니다.( 수정후  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                           
                        case 4:
                           reader("C:/1_Q4.txt");
                           System.out.println("");
                           System.out.println("문제를 다시 입력하세요.( 수정전  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q4.txt");

                           System.out.println("완료되었습니다.( 수정후  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 5:
                           reader("C:/1_Q5.txt");
                           System.out.println("");
                           System.out.println("문제를 다시 입력하세요.( 수정전  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q5.txt");

                           System.out.println("완료되었습니다.( 수정후  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 6:
                           reader("C:/2_Q6.txt");
                           System.out.println("");
                           System.out.println("문제를 다시 입력하세요.( 수정전  )");

                           WR = manager.next();
                           writer(WR,"C:/2_Q6.txt");

                           System.out.println("완료되었습니다.( 수정후  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 7:
                           reader("C:/2_Q7.txt");
                           System.out.println("");
                           System.out.println("문제를 다시 입력하세요.( 수정전  )");

                           WR = manager.next();
                           writer(WR,"C:/2_Q7.txt");

                           System.out.println("완료되었습니다.( 수정후  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 8:
                           reader("C:/2_Q8.txt");
                           System.out.println("");
                           System.out.println("문제를 다시 입력하세요.( 수정전  )");

                           WR = manager.next();
                           writer(WR,"C:/2_Q8.txt");

                           System.out.println("완료되었습니다.( 수정후  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        default:
                              System.out.println("1~8 번의 문제만 수정할 수 있습니다. 다시 입력하세요");
                        }
                        }
                       
                    }// 자세한 사업 진단
                    
                    System.out.println("");
                     System.out.println("한번더 실행 하시겠습니까?");
                     System.out.println("1번 - 한번더!       2번  - 종료");
                     a = scan.nextInt();
                     if(a == 1){
                        continue end;
                     }
                     else if(a == 2){
                        break end;
                     }
                  
                  
               } //while문
               }// 아이디 와 비번 확인 if문
               else {

                  System.out.println("입력정보가 틀렸습니다 다시 입력해주세요");
                  System.out.print("앞으로 " + con + "번 남았습니다.  ");
                  con -= 1;
                  System.out.println("");
               }
                                                                  //    김보성 409 ~ 661
         }                                                        /////////////////////////////////////////////////////
         }

         else {
            System.out.println("1~3사이의 숫자만 입력해 주세요");
         }
         
         
      
      }

   }

   static void reader(String name) {               // 675 ~ 작성자  : 김보성  //////////////////////////////////////
      FileReader reader = null;
      BufferedReader br = null;
      try {
         int a = 0;
         reader = new FileReader(name);
         br = new BufferedReader(reader);
         while (true) {
            String data = br.readLine();
            System.out.println("");

            if (data == null)
               break;
            String ch = data;
            System.out.print(ch);

         }
      } catch (FileNotFoundException fnfe) {
         System.out.println("파일이 존재하지 않습니다.");
      } catch (IOException ioe) {
         System.out.println("파일을 읽을 수 없습니다.");
      } finally {
         try {
            reader.close();
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
         System.err.println(e); // 에러가 있다면 메시지 출력
         System.exit(1);
      }

   }                                                     //      ~ 719 작성자 김보성//////////////////////////////////////////
   
  
   

   static void users() {                                     // 작성자 : 서혁진    724~     /////////////////////////////////////////

      Scanner scan = new Scanner(System.in);

      System.out.println("VIP 사업자 진단입니다.");

      System.out.println("회사 이름을 입력해주세요.");
      A = scan.next();

      System.out.println("사업자 등록 번호 예)20101130 ");
      B = scan.next();

      System.out.println("회사 대표자");
      C = scan.next();

   }
   

   
      
   
   
   static void FileWriter() {

      String txt = A;
      String txt1 = B;
      String txt2 = C;

      String fileName = "C:/"+ C +".txt";

      try {

         // 파일 객체 생성
         File file = new File(fileName);

         // true 지정시 파일의 기존 내용에 이어서 작성
         BufferedWriter out = new BufferedWriter(new FileWriter(fileName));

         // 파일안에 문자열 쓰기
         out.write("회사 이름\n" + txt);
         out.newLine();
         out.newLine();
         out.write(txt);
         out.newLine();
         out.newLine();
         out.write("사업자 등록 번호");
         out.newLine();
         out.newLine();
         out.write(txt1);
         out.newLine();
         out.newLine();
         out.write("회사 대표자");
         out.newLine();
         out.newLine();
         out.write(txt2);
         out.newLine();
         out.newLine();
         out.write("BCG테스트의 저번 결과는");
         out.newLine();
         

         // 객체 닫기
         out.close();

      } catch (Exception e) {
         e.printStackTrace();
      }                 

   }                                                    // 작성자 : 서혁진    724~  792   /////////////////////////////////////////

}
   