package triangle;

public class TriangleJudge {

	public TriangleJudge() {
		// TODO Auto-generated constructor stub
	}
	//此题口袋里的钱少，可以用if列举，当数额多的时候，可以用数组存
	//然后用for循环遍历数组，本质上都是一一比较然后减掉
	public Boolean IsTriangle(int x){
		if(x>=50){
			x=x-50;
		}
		if(x>=20){
			x=x-20;
		}
		if(x>=5){
			x=x-5;
		}
		if(x>=5){
			x=x-5;
		}
		if(x<=3&&x>=0){
		return true;
		}else{
			return false;
		}
		
	}

}
