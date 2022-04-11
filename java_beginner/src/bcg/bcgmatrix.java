package bcg;

import java.io.*;
import java.util.Scanner;
                                                                                  // JAVA ������Ʈ 6��  �躸��, ä����, ��¿�, �̿���, ������, ������, �̼���
public class bcgmatrix {                                                                // ��ü ���� �ۼ� �� ���� : �躸��. ��¿�. ������
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

     
      
      
         int a = scan.nextInt();

         if (a == 1) {

            System.out.println("1. 일반 무료 회원         2. VIP 유료 회원        3. 수익 계산기");

            while (true) {

               int b = scan.nextInt();
               {

                  if (b == 1) {             

                     System.out.println("--------------------BCG test start.--------------------");        
                                        
                     System.out.println("");
                     System.out.println("Q1. 현재 지점(프렌차이즈 및 라이센스) 수?");
                     System.out.println("1. 10개 지점 이하   2. 10개 지점 이상");
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
                           System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");
                        }
                     }

                     System.out.println("");
                     System.out.println("Q2. 특허를 한 제품 및 서비스가 있는가?");
                     System.out.println("1. O   2. X");
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
                           System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");
                        }
                     }

                     System.out.println("");
                     System.out.println("Q3. 예상 되는 경쟁 기업의 수?");
                     System.out.println("1. 10개 이하    2. 10개 이상   3. 없다");
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
                                 .println("보기의 숫자를 다시 한번 확인해 주세요.");
                        }
                     }
                     
                     System.out.println("");
                     System.out.println("Q4. 현재 상품 또는 서비스는 지속적인 발전이 가능한가");
                     System.out.println("1. O   2. X");
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
                           System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");
                        }
                     }
                     
                     System.out.println("");
                     System.out.println("Q5. 현금 유출과 유입 중 어느 부분의 비중이 큰가?");
                     System.out.println("1. 유출      2. 유입");
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
                           System.out.println("보기의 숫자를 다시 한번 확인해 주세요.");
                        }
                     }
                     int k = QA[SQ1] + QB[SQ2] + QC[SQ3] + QD[SQ4]
                           + QE[SQ5];
                     System.out.println("test 완료하였습니다. 고객님의 총점은 >>>>>>>>>>>>" + k);

                     if (k <= 30) {
                    	 System.out.println("C:/dog.txt");
                     } else {
                        if (k <= 40)
                        	System.out.println("C:/Question.txt");
                        else if (k <= 45)
                        	System.out.println("C:/Cashcow.txt");
                        else if (k <= 50)
                        	System.out.println("C:/star.txt");                        
                     }                                                   

                      
                        System.out.println("");                             // �躸�� 150~159
                        System.out.println("도움이 되셨나요?");
                        System.out.println("1. 메인으로 돌아가기!       2. 종료");
                        a = scan.nextInt();
                        if(a == 1){
                           continue end;
                        }
                        else if(a == 2){
                           break end;
                        }                                                 
                     
                  } else if (b == 2) {                              
                     users();                                                //2�� �ڵ��κ� ��¿� 162��~                     ����: ������(users(), FileWriter())
                     FileWriter();

                     // 1�� ����
                     loop: while (true) {
                        reader("C:/1_Q1.txt");
                        System.out.println("");
                        // System.out.println("Q1. ���� ����(���������� �� ���̼���) ��?");
                        // System.out.println("1. 10 ���� ����        2. 10 ���� �̻�");
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
                           System.out.println("1���� 2�� �߿����� �����ϼ���.");

                        }
                     }

                     // 2�� ����
                     loop: while (true) {
                        reader("C:/1_Q2.txt");
                        System.out.println("");
                        // System.out.println("Q2. Ư�㸦 �� ��ǰ �� ���񽺰� �ִ°�?");
                        // System.out.println(" 1. O       2. X ");
                        int b1 = scan.nextInt();
                        if (b1 == 1) {
                           Q2 = 10;
                           break loop;
                        } else if (b1 == 2) {
                           Q2 = 5;
                           break loop;
                        } else {
                           System.out.println("1���� 2�� �߿����� �����ϼ���.");
                        }
                     }

                     // 3�� ����
                     loop: while (true) {
                        reader("C:/1_Q3.txt");
                        System.out.println("");
                        // System.out.println("Q3. ���� �Ǵ� ���� ����� ��?");
                        // System.out.println("1. 10�� ����    2. 10�� �̻�   3. ����.");
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
                           System.out.println("1�� 2��  3�� �߿����� �����ϼ���.");
                        }
                     }

                     // 4�� ����
                     loop: while (true) {
                        reader("C:/1_Q4.txt");
                        System.out.println("");
                        // System.out.println("Q4. ���� ��ǰ �Ǵ� ���񽺴� �������� ������ �����Ѱ�?");
                        // System.out.println(" 1. O       2. X ");
                        int d = scan.nextInt();
                        if (d == 1) {
                           Q4 = 10;
                           break loop;
                        } else if (d == 2) {
                           Q4 = 5;
                           break loop;
                        } else {
                           System.out.println("1���� 2�� �߿����� �����ϼ���.");
                        }

                     }

                     // 5�� ����
                     loop: while (true) {
                        reader("C:/1_Q5.txt");
                        System.out.println("");
                        // System.out.println("Q5. ���� ����� ���� �� ��� �κ��� ������ ū��?");
                        // System.out.println("1. ����      2. ����");
                        int e = scan.nextInt();
                        if (e == 1) {
                           Q5 = 10;
                           break loop;
                        } else if (e == 2) {
                           Q5 = 5;
                           break loop;
                        } else {
                           System.out.println("1���� 2�� �߿����� �����ϼ���.");
                        }
                     }

                     // 6�� ����
                     loop: while (true) {
                        reader("C:/2_Q6.txt");
                        System.out.println("");
                        // System.out.println("Q6. �ں��� ���� �� ��� �κ��� ���� ū ������ ���� �ϳ���?");
                        // System.out.println("1. �ں�      2. ����");
                        int f = scan.nextInt();
                        if (f == 1) {
                           Q6 = 10;
                           break loop;
                        } else if (f == 2) {
                           Q6 = 5;
                           break loop;
                        } else {
                           System.out.println("1���� 2�� �߿����� �����ϼ���.");
                        }                                                                  /// ��¿� �ڵ�  162~ 280   ����: ������(users(), FileWriter())
                     }                                                            /////////////////////////////////////////////

                     // 7��                                                                                    // ������, �̼���  283~ 319     ���� ������(reader())
                     reader("C:/2_Q7.txt");
                     System.out.println("");
                     // System.out.println("Q7. �� ������ �Է����ּ���");
                     // System.out.println("���� ������ �Է����ּ���");
                     int g = scan.nextInt();

                     // 8��
                     reader("C:/2_Q8.txt");
                     System.out.println("");
                     // System.out.println("Q8. �� ����� �Է����ּ���");
                     // System.out.println("���� ������ �Է����ּ���");
                     int h = scan.nextInt();

                     if (g < h) {
                        sum = Q1 + Q2 + Q3 + Q4 + Q5 + Q6 - 10;
                        System.out.println("�հ� : " + sum);
                     } else if (g > h) {
                        sum = Q1 + Q2 + Q3 + Q4 + Q5 + Q6 + 10;
                        System.out.println("�հ� : " + sum);
                     } else if (g == h) {
                        sum = Q1 + Q2 + Q3 + Q4 + Q5 + Q6;
                        System.out.println("�հ� : " + sum);
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
                           reader("C:/star.txt");                          //    ������, �̼���  283~ 319     ���� ������(reader())
                     }                                                     //////////////////////////////////////////////////////////
                     
                     System.out.println("");                               //  �躸�� 321 ~331
                     System.out.println("�ѹ��� ���� �Ͻðڽ��ϱ�?");
                     System.out.println("1�� - �ѹ���!       2��  - ����");
                     a = scan.nextInt();
                     if(a == 1){
                        continue end;
                     }
                     else if(a == 2){
                        break end;
                     }
                  }                                                         // 321 ~ 331
                 
                  else if (b == 3) {                                            ///////////////////////////////////////////////////
                                                                                // ä����, ��¿�   334~382
                         System.out.println("������ �����ּ���. (���� : ��)");
                         System.out.println("");
                         Scanner scanner = new Scanner(System.in);
                         
                         System.out.println("��������� �Է����ּ���.");
                         double A = scanner.nextDouble();
                         System.out.println("");
                         
                         System.out.println("������ �Է��� �ּ���. ");
                         double B = scanner.nextDouble();
                         System.out.println("");
                         
                         System.out.println("����(����)�� �Է��� �ּ���. ");
                         double C = scanner.nextDouble();
                         System.out.println("");
                         
                         System.out.println("��� ���並 �Է��� �ּ���. ");
                         double D = scanner.nextDouble();
                         System.out.println("");
                         
                         
                         double benefit = C*D;
                         
                         System.out.println("�� ���� : " + benefit);
                         System.out.println("");
                         
                         double cost = (B*D)+A;
                         
                         System.out.println("�� ��� : " + cost);
                         System.out.println("");

                         double realbenefit = benefit - cost;
                         
                         if(realbenefit > 0){
                            System.out.println("������ : " + realbenefit);
                            System.out.println("�����Դϴ�.");
                            System.out.println("");
                         }
                         else if (realbenefit<0){
                            System.out.println("������ : " + realbenefit);
                            System.out.println("�����Դϴ�.");
                            System.out.println("");
                         }
                         else{
                            System.out.println("������ : " + realbenefit);
                            System.out.println("�����Դϴ�.");
                            System.out.println("");                          // ä����, ��¿�   334~382
                         }                                                ///////////////////////////////////////////////
                         
                         System.out.println("");                       // �躸�� 384~
                          System.out.println("�ѹ��� ���� �Ͻðڽ��ϱ�?");
                          System.out.println("1�� - �ѹ���!       2��  - ����");
                          a = scan.nextInt();
                          if(a == 1){
                             continue end;
                          }
                          else if(a == 2){
                             break end;
                          } 
                      
                   
                  }                                                      // �躸��384 ~ 396

               }
               
            }
         
         } else if (a == 2) {
            System.out.println(">>>>>>>>>>>>>>>>�����մϴ�.<<<<<<<<<<<<<<<<");
            break;

         }
         
         else if ( a== 3){                                                  /////////////////////////////////////////////////
            Scanner manager = new Scanner(System.in);                       // ������ ���  �ۼ���:  �躸�� 409 ~ 661
            int ID[] = new int[2];
            int id = 14681001;
            int con = 2;

            
            System.out.println("***********관리자 모드 입니다***********");
            loop: for (int t = 0; t < 3; t++) {
               System.out.println("아이디와 비번을 입력해주세요. ");
               System.out.print("ID>>>>>");
               ID[0] = manager.nextInt();
               System.out.print("PW>>>>>");
               ID[1] = manager.nextInt();

               if (ID[0] == 14681001 && ID[1] == 12345 || ID[0] == 14681025 && ID[1] == 12345 || ID[0] == 14581014 && ID[1] == 12345
                     || ID[0] == 14381012 && ID[1] == 12345 || ID[0] == 14681021 && ID[1] == 12345 || ID[0] == 14681014 && ID[1] == 12345
                     || ID[0] == 14781016 && ID[1] == 12345) {
                  
                  System.out.println("�̿��Ͻ� ���� ��ȣ�� �Է��ϼ���.");
                  System.out.println("���� �����ϱ� START");
                  
                  
                  
                  while(true){
                  
                  
                   System.out.println("<<���� �����ϱ�>>");
                   System.out.println("1�� - �Ϲ� ����� ���� , 2�� - VIP ����� ����");
                   
                   
                   
                   Q1 = manager.nextInt();
                   
                    if(Q1 == 1){
                     
                  System.out.println("<<���� �����ϱ�>>");
                  System.out.println("   �Ϲ� ����� ����    ");
                  System.out.println("������ ������ȣ�� �Է��ϼ���. < 1��~5�� > ");

                  int Qch = 0;
                  String WR = null;
                  String test = null;
                  
                  
                  while(true){
                  Qch = manager.nextInt();
                  
                  switch (Qch) {
                  case 1:
                     reader("C:/1_Q1.txt");
                     System.out.println("");
                     System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q1.txt");

                     System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                  case 2:
                     
                     reader("C:/1_Q2.txt");
                     System.out.println("");
                     System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q2.txt");

                     System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                     
                  case 3:
                     
                     reader("C:/1_Q3.txt");
                     System.out.println("");
                     System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q3.txt");

                     System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                     
                  case 4:
                     reader("C:/1_Q4.txt");
                     System.out.println("");
                     System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q4.txt");

                     System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                  case 5:
                     reader("C:/1_Q5.txt");
                     System.out.println("");
                     System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                     WR = manager.next();
                     writer(WR,"C:/1_Q5.txt");

                     System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                     System.out.println(">>>>>>>>>>>"+WR);
                     break loop;
                     default:
                        System.out.println("1~5 ���� ������ ������ �� �ֽ��ϴ�. �ٽ� �Է��ϼ���");
                  }
                  }
                   }// ����������� if��
                    
                    
                    else if( Q1 == 2){
                                       
                        
                        System.out.println("<<���� �����ϱ�>>");
                        System.out.println("   VIP ����� ����     ");
                        System.out.println("������ ������ȣ�� �Է��ϼ���. < 1��~8�� > ");

                        int Qch = 0;
                        String WR = null;
                        String test = null;
                        
                        
                        while(true){
                        Qch = manager.nextInt();
                        
                     
                        
                        switch (Qch) {
                        case 1:
                           reader("C:/1_Q1.txt");
                           System.out.println("");
                           System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q1.txt");

                           System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 2:
                           
                           reader("C:/1_Q2.txt");
                           System.out.println("");
                           System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q2.txt");

                           System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                           
                        case 3:
                           
                           reader("C:/1_Q3.txt");
                           System.out.println("");
                           System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q3.txt");

                           System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                           
                        case 4:
                           reader("C:/1_Q4.txt");
                           System.out.println("");
                           System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q4.txt");

                           System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 5:
                           reader("C:/1_Q5.txt");
                           System.out.println("");
                           System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                           WR = manager.next();
                           writer(WR,"C:/1_Q5.txt");

                           System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 6:
                           reader("C:/2_Q6.txt");
                           System.out.println("");
                           System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                           WR = manager.next();
                           writer(WR,"C:/2_Q6.txt");

                           System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 7:
                           reader("C:/2_Q7.txt");
                           System.out.println("");
                           System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                           WR = manager.next();
                           writer(WR,"C:/2_Q7.txt");

                           System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        case 8:
                           reader("C:/2_Q8.txt");
                           System.out.println("");
                           System.out.println("������ �ٽ� �Է��ϼ���.( ������  )");

                           WR = manager.next();
                           writer(WR,"C:/2_Q8.txt");

                           System.out.println("�Ϸ�Ǿ����ϴ�.( ������  )");
                           System.out.println(">>>>>>>>>>>"+WR);
                           break loop;
                        default:
                              System.out.println("1~8 ���� ������ ������ �� �ֽ��ϴ�. �ٽ� �Է��ϼ���");
                        }
                        }
                       
                    }// �ڼ��� ��� ����
                    
                    System.out.println("");
                     System.out.println("�ѹ��� ���� �Ͻðڽ��ϱ�?");
                     System.out.println("1�� - �ѹ���!       2��  - ����");
                     a = scan.nextInt();
                     if(a == 1){
                        continue end;
                     }
                     else if(a == 2){
                        break end;
                     }
                  
                  
               } //while��
               }// ���̵� �� ��� Ȯ�� if��
               else {

                  System.out.println("�Է������� Ʋ�Ƚ��ϴ� �ٽ� �Է����ּ���");
                  System.out.print("������ " + con + "�� ���ҽ��ϴ�.  ");
                  con -= 1;
                  System.out.println("");
               }
                                                                  //    �躸�� 409 ~ 661
         }                                                        /////////////////////////////////////////////////////
         }

         else {
            System.out.println("1~3������ ���ڸ� �Է��� �ּ���");
         }
         
         
      
      }

   }

   static void reader(String name) {               // 675 ~ �ۼ���  : �躸��  //////////////////////////////////////
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
         System.out.println("������ �������� �ʽ��ϴ�.");
      } catch (IOException ioe) {
         System.out.println("������ ���� �� �����ϴ�.");
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

      String fileName = "C:/"+ C +".txt";

      try {

         // ���� ��ü ����
         File file = new File(fileName);

         // true ������ ������ ���� ���뿡 �̾ �ۼ�
         BufferedWriter out = new BufferedWriter(new FileWriter(fileName));

         // ���Ͼȿ� ���ڿ� ����
         out.write("ȸ�� �̸�\n" + txt);
         out.newLine();
         out.newLine();
         out.write(txt);
         out.newLine();
         out.newLine();
         out.write("����� ��� ��ȣ");
         out.newLine();
         out.newLine();
         out.write(txt1);
         out.newLine();
         out.newLine();
         out.write("ȸ�� ��ǥ��");
         out.newLine();
         out.newLine();
         out.write(txt2);
         out.newLine();
         out.newLine();
         out.write("BCG�׽�Ʈ�� ���� �����");
         out.newLine();
         

         // ��ü �ݱ�
         out.close();

      } catch (Exception e) {
         e.printStackTrace();
      }                 

   }                                                    // �ۼ��� : ������    724~  792   /////////////////////////////////////////

}
   