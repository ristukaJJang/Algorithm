class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int number = 0;
        int xNumber = 0;
        
        String[] hang = polynomial.split(" ");
        for(int i = 0; i < hang.length; i++) {
            if(hang[i].equals("+")) hang[i] = "";
        }
        
        for(int i = 0; i < hang.length; i++) {
            if(hang[i].matches("\\d+")) number += Integer.parseInt(hang[i]);
            else {
                if (hang[i].equals("x")) xNumber += 1;
                else if (hang[i].matches("\\d+x")) xNumber += Integer.parseInt(hang[i].replace("x", ""));
            }
        }
        
        if(xNumber == 1 && number == 0) answer = "x";
        else if(xNumber == 1 && number != 0) answer = "x + " + number;
        else if(xNumber >= 2 && number == 0) answer = xNumber + "x";
        else if(xNumber >= 2 && number != 0) answer = xNumber + "x + " + number;
        else if(xNumber == 0 && number != 0) answer = number + "";
        
        return answer;
    }
}