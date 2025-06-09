public class Main {

    static int findChar(String message, char find){
        for (int i = 0; i < message.length(); i++) {
            if(message.charAt(i) == find){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        String message = "Hello, World!";

        // 문자열 길이
        System.out.println(message.length());

        // 대문자 변환
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        // 부분 문자열 추출(subString) | 파이썬의 슬라이스
        System.out.println(message.substring(1));
        System.out.println(message.substring(0, 5));

        //특정 문자열 위치 찾기 (indexOf)
        // indexOf()는 찾고자 하는 문자를 왼쪽(문자열 시작)부터 찾아서 찾는 즉시 위치 반환.(찾고자 하는 문자가 문자열에 2개 이상이여도 처음 찾은것만 반환)
        // 오른쪽(끝) 에서부터 찾으려면 lastIndexOF
        // 3개 이상, 모두 찾으려면 반복문과 indexOf 사용. 혹은 정규표현식 Mathcer
        System.out.println(message.indexOf('W'));

        System.out.println(findChar(message, 'W'));

        String address = "0x120819f5573ac3A530e6172b1581613A09b4b338";

        //System.out.println(address.substring(0, 7) + "..." + address.substring(address.length()-5, address.length()));
        System.out.println(
                address.substring(0,7)
                + "..."
                + address.substring(address.length()-5)); // subString에서 인자를 1개만 하면 beginindex


    }
}
