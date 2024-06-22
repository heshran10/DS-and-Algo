

public class StringBui {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}



// Commit timestamp: 2024-06-22 15:38:00