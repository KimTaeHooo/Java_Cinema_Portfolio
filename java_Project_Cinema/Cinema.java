package Project5;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        String [][] seat = new String[5][9]; //좌석배열 4열8행
        MovieinfoManager movieinformation = new MovieinfoManager();   //영화제목 객체생성
        SeatInfo seats = new SeatInfo();  //좌석 객체생성
        ViewTimeManager screentime = new ViewTimeManager();   //상영시간 객체생성

        seats.resetSeat();
        seats.resetSeat2();
        int seatnum;      //좌석번호
        int row;          //좌석 열
        String user;
        boolean flag = true;   //do while문에 이용
        boolean exit = true;
        int choice;   //번호선택 
        String cancel;

        System.out.println("==============영화관 입니다.==============");
        System.out.println();
        System.out.println("성함을 입력하세요: ");
        user = scan.nextLine();

        do{
    
            System.out.println("======="+ user + "님 환영합니다." + "======");
            System.out.println(" 원하시는 메뉴번호를 입력하세요.");
            System.out.println("================================");
            System.out.println(" 1. 영화 목록 보기 ");
            System.out.println(" 2. 상영 시간표 보기 ");
            System.out.println(" 3. 좌석 확인하기 " );
            System.out.println(" 4. 좌석 예매하기 ");
            System.out.println(" 5. 예매 취소하기 ");
            System.out.println(" 6. 종료하기 ");
            System.out.println("================================");
            int select = scan.nextInt();                     

            if (select == 1) {
                    
                System.out.println("=================영화 목록=================");
                System.out.println("번호     제목           러닝타임 장르 관람등급");
                System.out.println(movieinformation.todayShow());    
                System.out.println(movieinformation.todayshow2());    //영화제목 가져오기
                System.out.println();
                System.out.println("===========================================");
                System.out.println();
                }
            

            if (select == 2) {
                System.out.println("=================상영 시간표================");
                System.out.println("번호     날짜      요일     시간");
                System.out.println(screentime.todaytimetable()); 
                System.out.println(screentime.todaytimetable2());   //상영시간 가져오기
                System.out.println();
                System.out.println("============================================");
                System.out.println();
            }

            if (select == 3) {
                
                System.out.println("좌석조회 서비스 입니다.");
                System.out.println(" 몇번 영화 좌석을 보시겠습니까?" + "(1. 아이언맨 " + "2. 구슬치기)");
                choice =scan.nextInt();
                if(choice == 1) {
                    seats.reference();
                } else if(choice == 2) {
                    seats.reference2();
                } else if(select >= 3) {
                    System.out.println("메뉴 정보에 없는 번호입니다. 번호를 다시 확인하세요");
    
                }          
            
        }

            if (select == 4) {

                System.out.println(" 몇번 영화 좌석을 예약하시겠습니까?" + "(1. 아이언맨 " + "2. 구슬치기)");
                choice =scan.nextInt();
                if (choice == 1) {
                
                do{               
                    System.out.println("열을 선택하세요." + "(4열까지)");
                    row = scan.nextInt();
                    System.out.println("행을 선택하세요." + "(8행까지)");
                    seatnum = scan.nextInt();
                    if(seats.seat[row][seatnum].equals("___")){   //초기값일경우
                        seats.seat[row][seatnum] = user;                   
                        System.out.println( row + "열" + seatnum + "번" + "자리가 예약 되었습니다.");
                        System.out.println();
                        System.out.println("영화정보: " + movieinformation.todayShow());
                        System.out.println();
                        System.out.println("상영시간: " + screentime.todaytimetable());
                        System.out.println();
                        System.out.println("고객님의 예약코드는 성함이오니 참고하세요. \n " + "예약코드:  " + user + "\t입니다.");                     
                        System.out.println();

                        flag = false;

                    }else{
                        System.out.println("이미 예약된 자리입니다. 다른 좌석을 선택하세요.");
                    }
                    seats.reference();
                    
                    System.out.println();
                
                }while(flag);}

                else if(choice == 2) {
                    do{               
                        System.out.println("열을 선택하세요.");
                        row = scan.nextInt();
                        System.out.println("행을 선택하세요.");
                        seatnum = scan.nextInt();
                        if(seats.seat2[row][seatnum].equals("___")){   //초기값일경우
                            seats.seat2[row][seatnum] = user;                   
                            System.out.println(row + "열" + seatnum + "번" + "자리가 예약 되었습니다.");
                            System.out.println();
                            System.out.println("영화정보: " + movieinformation.todayshow2());
                            System.out.println();
                            System.out.println("상영시간: " + screentime.todaytimetable2());
                            System.out.println();
                            System.out.println("고객님의 예약코드는 성함이오니 참고하세요. \n " + "예약코드:  " + user + "\t입니다.");                     
                            System.out.println();
    
                            flag = false;
    
                        }else{
                            System.out.println("이미 예약된 자리입니다. 다른 좌석을 선택하세요.");
                        }
                        seats.reference2();
                        
                        System.out.println();
                    
                    }while(flag);
                   

                }else if(select >= 3) {
                    System.out.println("메뉴 정보에 없는 번호입니다. 번호를 다시 확인하세요");
    
                } 

            }

            if (select == 5) {  
                System.out.println(" 몇번 영화 예매를 취소하시겠습니까?");
                choice =scan.nextInt();
                if (choice == 1) {
                do{
                    System.out.println("예매를 취소하려면 예약코드를 입력하세요.");
                    cancel = scan.next();
                    System.out.println("좌석 열을 입력하세요.");
                    row = scan.nextInt();
                    System.out.println("좌석 행을 입력하세요.");
                    seatnum = scan.nextInt();
                    if(seats.seat[row][seatnum].equals(user)) {
                        seats.seat[row][seatnum] = "___";
                        System.out.println("예약이 취소 되었습니다.");
                        System.out.println();                    
                    }
                    
                }while(flag);}
                
                else if (choice == 2) {
                    do{                        
                        System.out.println("예매를 취소하려면 예약코드를 입력하세요.");
                        cancel = scan.next();
                        System.out.println("좌석 열을 입력하세요.");
                        row = scan.nextInt();
                        System.out.println("좌석 행을 입력하세요.");
                        seatnum = scan.nextInt();
                        if(seats.seat2[row][seatnum].equals(user)) {
                            seats.seat2[row][seatnum] = "___";
                            System.out.println("예약이 취소 되었습니다.");
                            System.out.println();                    
                        }
                        
                    }while(flag);
                }else if(select >= 3) {
                    System.out.println("메뉴 정보에 없는 번호입니다. 번호를 다시 확인하세요");
    
                } 
            }

            if (select == 6) {
                System.out.println("서비스를 종료합니다.");
                break;                                                      
                
            }
            else if(select >= 7) {
                System.out.println("메뉴 정보에 없는 번호입니다. 번호를 다시 확인하세요");

            }
                                                                                                                    
        }while(exit);           
        }               
        }
    
    
