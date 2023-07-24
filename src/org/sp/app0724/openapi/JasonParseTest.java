package org.sp.app0724.openapi;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

//json이란 자바스크립트 객체 표기법
//xml 과 함께 이종기간 데이터 교환식 사용되는 데이터 포멧  (그냥 문자열이다)
//자바는 json 을 이해하지 못하기 따라서 문자열에 불과한 json 포맷을 자바언어가 이해하도록
//처리 즉 해석하는 프로그래밍을 배워보자 (파싱 법을 배워보자)
public class JasonParseTest {
	
	
	public static void main(String[] args) {
		
		
		//String 은 문자열 상수이므로 변할수 없다.
		//따라서 다수의 문자열을
		
		
		
		
		//외부의 라이브러리... maven repository
		
		//String 클래스의 특징 - 불변의 특징
		//즉 한번 선언된 String 객체는 수정이 불가 immutable
		//String m= "korea";
		//m="korean";
		//위의 결과는 두개의 상수가 생긴다.... 한마디로 밑에 제이슨 객체는 미친듯이 많은 상수를 만들었다.. 그래서 서버가 다운될수 있다한다.
		
		//명시적explicit 선언법
		String s = new String();
		
		
		
		
		
		//묵시적(암시적)implicit 선언법
		StringBuilder str = new StringBuilder();
		
		str.append("{");
		str.append("\"이름\":\"철수\",");
		str.append("\"나이\":28,");
		str.append("\"children\":[");
		str.append("{");
		str.append("\"type\":\"고양이\",");
		str.append("\"age\":2,");
		str.append("\"name\":\"나비\",");
		str.append("\"color\":\"검정\"");
		str.append("},");
		str.append("{");
		str.append("\"type\":\"강아지\",");
		str.append("\"age\":5,");
		str.append("\"name\":\"뽀미\",");
		str.append("\"color\":\"하양\"");
		str.append("}");
		str.append("]");
		str.append("}");
		
		 //System.out.println(str);
		 
		 JSONParser jsonParser = new JSONParser();
		 try {
			JSONObject obj = (JSONObject)jsonParser.parse(str.toString()); // 이제부터 객체 취급해야한다.
			
			System.out.println(obj.get("이름"));
			JSONArray array = (JSONArray)obj.get("children");
			System.out.println(array.size());
			for(int i=0; i<array.size();i++) {
				JSONObject pet = (JSONObject)array.get(i);
				System.out.println("종류"+pet.get("type"));
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
