package Project5;

public class SeatInfo {
    public String[][] seat = new String[5][9];
	public String[][] seat2 = new String[5][9];

    public void resetSeat(){                 //자리 초기값
		for(int i=1; i<5; i++){
			for(int j=1; j<9; j++){
				seat[i][j]="___";
			}
		}
	}

	public void resetSeat2(){                 //자리 초기값1
		for(int i=1; i<5; i++){
			for(int j=1; j<9; j++){
				seat2[i][j]="___";
			}
		}
	}


	public void reference(){
		char row = 'A';           //열 문구 알파벳 사용
		for(int i=1; i<5; i++){   //4열까지 1열씩 증가
			System.out.print("\n"+row+"열  ");row++;
			for(int j=1; j<9; j++){      //8행까지 1행씩 증가, 자리가 초기값일때 표현문구 대입
				String seat = (this.seat[i][j].equals("___"))?"[]":"■"; //물음표 연산자: ? 참이면 value1[]실행 거짓이면 value2■실행
				System.out.print((j)+seat+"  ");   //행 방식 표현
			}
		}
		System.out.println();

}

	public void reference2(){          //좌석코드 2
		char row = 'A';           
		for(int i=1; i<5; i++){   
			System.out.print("\n"+row+"열  ");row++;
			for(int j=1; j<9; j++){      
				String seat2 = (this.seat2[i][j].equals("___"))?"[]":"■"; 
				System.out.print((j)+seat2+"  ");   
			}
		}
		System.out.println();

}
}


