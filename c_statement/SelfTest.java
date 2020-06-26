package c_statement;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		String ans = null;
		String grade = null;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Y 또는 N로 대답해주세요.");
		System.out.print("1. 아침을 배불리 먹은 후 점심시간 전에 배가 고프다. ");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		System.out.print("2. 밥, 빵, 과자, 햄버거 등의 음식을 먹기 시작하면 끝이 없다. ");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		System.out.print("3. 음식을 금방 먹은 후에도 만족스럽지 못하고 더 먹는다. ");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		System.out.print("4. 정말 배가 고프지 않더라도 먹을 때가 있다. ");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		System.out.print("5. 저녁을 먹고 간식을 먹지 않으면 잠이 오지 않는다. ");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		System.out.print("6. 스트레스를 받으면 자꾸 먹고 싶어진다. ");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		System.out.print("7. 책상 속이나 식탁 위에 항상 과자, 초콜릿 등이 놓여있다.");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		System.out.print("8. 오후 5시가 되면 피곤함과 배고픔을 느끼고, 일이 손에 안 잡힌다. ");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		System.out.print("9. 빵, 과자, 초콜릿 등 단 음식을 상상만 해도 먹고 싶다는 자극을 많이 받는다. ");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		System.out.print("10. 다이어트를 위해 식이조절을 하는데 3일도 못간다. ");
		ans = sc.nextLine();
		if(ans.equals("Y")){
			sum += 1;
		}
		if(sum >= 7){
			grade = "중독";
		}else if(sum >=4){
			grade = "중독 위험";
		}else{
			grade = "중독 가능성";
		}
		System.out.println("당신의 점수는 " + sum + " / 등급은 " + grade + " 입니다.");
	}

}
