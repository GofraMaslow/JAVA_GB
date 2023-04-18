import java.util.Scanner;
public class sem1_work4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение похожее на это q + w = e: ");
        String equation = scanner.nextLine();
        
      
        String[] parts = equation.split("=");
        String leftPart = parts[0].trim();
        String rightPart = parts[1].trim();
        
       
        String[] leftSummands = leftPart.split("\\+");
        int[] leftValues = new int[leftSummands.length];
        for (int i = 0; i < leftSummands.length; i++) {
            String summand = leftSummands[i].trim();
            if (summand.contains("?")) {
             
                for (int j = 0; j <= 9; j++) {
                    int value = Integer.parseInt(summand.replace("?", String.valueOf(j)));
                    if (value >= 0) {
                        leftValues[i] = value;
                        break;
                    }
                }
            } else {
                
                leftValues[i] = Integer.parseInt(summand);
            }
        }
        
     
        String[] rightSummands = rightPart.split("\\+");
        int[] rightValues = new int[rightSummands.length];
        for (int i = 0; i < rightSummands.length; i++) {
            String summand = rightSummands[i].trim();
            if (summand.contains("?")) {
            
                for (int j = 0; j <= 9; j++) {
                    int value = Integer.parseInt(summand.replace("?", String.valueOf(j)));
                    if (value >= 0) {
                        rightValues[i] = value;
                        break;
                    }
                }
            } else {
                rightValues[i] = Integer.parseInt(summand);
            }
        }
        
        boolean solutionFound = false;
        for (int i = 0; i < leftValues.length; i++) {
            for (int j = 0; j < rightValues.length; j++) {
                if (leftValues[i] + rightValues[j] == Integer.parseInt(rightPart)) {
                    System.out.println(leftPart.replace("?", String.valueOf(leftValues[i])) + " = " + rightPart);
                    solutionFound = true;
                }
            }
        }
        
        if (!solutionFound) {
            System.out.println("Решения нет");
        }
    }
}

