package GoIT.teoria_modul4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Modul4Pract1_17 {
    //1
    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            String result = String.valueOf(prices[i]);
            System.out.println(result += " jup.");

        }
    }

    public void printPrices2(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    //2
    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else if (prices[i] >= 1000)
                prices[i] *= 1.5;

        }
    }

    //3
    public int[] findMinMaxPrices2(int[] prices) {
        Arrays.sort(prices);


        int maxPrice = prices[prices.length - 1];
        int minPrice = prices[0];

        if (prices.length > 0) {
            if (maxPrice == minPrice) {
                int[] result1 = new int[1];
                result1[0] = maxPrice;
                return result1;
            }
            if (maxPrice > minPrice) {
                int[] result2 = {minPrice, maxPrice};

                return result2;
            }
        }
        if (prices.length == 0) {


            return prices = new int[]{};
        }
        return prices;

    }

    public int[] findMinMaxPrices1(int[] prices) {
        Arrays.sort(prices);
        int maxPrice = prices[prices.length - 1];
        int minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice)
                minPrice = prices[i];
            else if (prices[i] > minPrice)
                maxPrice = prices[i];
        }
        if (minPrice == maxPrice)
            return new int[]{minPrice};
        if (minPrice < maxPrice)
            return new int[]{minPrice, maxPrice};
        else
            return new int[]{};

    }

    public static int[] findMinMaxPrices(int[] prices) {
        int n = prices.length;

        if (n == 0) {
            // Повертаємо порожній масив, якщо вхідний масив порожній
            return new int[]{};
        }

        int minPrice = prices[0];
        int maxPrice = prices[0];

        // Знаходимо мінімальну та максимальну ціни в масиві
        for (int i = 1; i < n; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }

        if (minPrice == maxPrice) {
            // Якщо мінімальна та максимальна ціни однакові, повертаємо одноелементний масив
            return new int[]{minPrice};
        } else {
            // Інакше, повертаємо двоелементний масив, спочатку мінімальна ціна, потім максимальна
            return new int[]{minPrice, maxPrice};
        }
    }

    //4
    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        } else {
            int minPrice = prices[0];
            int result = 0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                    result = 1;
                } else if (minPrice == prices[i]) {
                    result++;
                }

            }
            return result;
        }


    }

    //5 видаллення елемента з масиву
    public int[] removePrice(int[] prices, int toRemove) {
        if (prices.length == 0) {
            return new int[]{};
        }
        int count = 0;

        for (int i : prices) {
            if (i != toRemove) {
                count++;
            }
        }
        int[] newPrices = new int[count];
        int index = 0;
        for (int i : prices) {
            if (i != toRemove) {
                newPrices[index++] = i;
            }

        }
        return newPrices;
    }

    public int[] removePrice(int[] prices) {
        return new int[]{};
    }


    //6
    public int[] leavePrice9(int[] prices){
        int count = 0;
        if (prices.length==0){
            return new int[]{};}
        for (int i: prices){
            if (i%10==9){
                count++;
            }

        }
        int index=0;
        int[]rightPrice=new int[count];

        for (int i: prices){
            if (i%10==9){
                rightPrice[index++]=i;
                }

            }
        return rightPrice;
        }
//7
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks){
        if (showcaseStocks.length==0&&warehouseStocks.length==0){
            return new String[]{};}
            int index=0;

String[]mergeStocks=new String[showcaseStocks.length+warehouseStocks.length];
            for (int i = 0; i < showcaseStocks.length; i++) {
              mergeStocks[i]=showcaseStocks[i];

            }
            for (int i = 0; i < warehouseStocks.length; i++) {
                mergeStocks[i+showcaseStocks.length]=warehouseStocks[i];

            }

            return mergeStocks;
        }
        //7
        public int getPricesSum(int[] prices, int minPrice, int maxPrice){
int result=0;
            for (int i = 0; i < prices.length; i++) {
                if (prices[i]<maxPrice&&prices[i]>minPrice){
                    result+=prices[i];
                }

            }
            return result;
        }
//9

    public String getCheapStocks(String[] stocks){
        StringBuilder nameslist=new StringBuilder();
      String names;
      int price;
      String name = null;
        for (int i = 0; i < stocks.length; i++) {
         String []nameAndPrice=stocks[i].split(" ");
            price = Integer.parseInt(nameAndPrice[1]);
            names=nameAndPrice[0];
          if (price<200){
              nameslist.append(names).append(" ");

          }
        }
        return nameslist.toString().trim();
    }
    //РЕКУРСІЯ
public static int factorial(int number){
        if (number==0 || number==1)
            return 1;
        int result=number*factorial(number-1);
        return result;
}
    //10
    public String drawQuad(int n){
        StringBuilder stars=new StringBuilder();
        int i =0;
        char star ='*' ;

        while (i<n){
            int j=0;
            while (j<n){
                stars.append(star);
                j++;
            }
            stars.append('\n');
            i++;
        }
return stars.toString();
    }
    //11

    public String drawRect(int width, int height, char c){
        StringBuilder figura =new StringBuilder();
        int i=0;
        while (i<height){
            int j=0;
            while (j<width){
                figura.append(c);
                j++;
            }
            figura.append('\n');
            i++;
        }
        return figura.toString();
    }
    //12
    public String drawLine(int length){
        StringBuilder line =new StringBuilder();
        char a='*';
        char b='#';
        int i=0;
        while (i<length){

            line.append(a);
            i+=2;
            int j=0;
            while (j<1&&i<length+1){
                line.append(b);
                j++;
            }
        }
        return line.toString();
    }
//12
public String drawLine2(int length) {
    StringBuilder result = new StringBuilder();

    int i = 0;
    while (i < length) {
        // Перемінна, що вказує, який символ потрібно додати (* або #)
        char currentChar = (i % 2 == 0) ? '*' : '#';
        result.append(currentChar);
        i++;
    }

    return result.toString();
}
//13
public String drawPattern(char[] pattern, int repeatCount){
        StringBuilder stringBuilder=new StringBuilder();
        int i =0;
        while (i<repeatCount){
            int j=0;
            while (j<pattern.length){
                stringBuilder.append(pattern[j]);
                j++;
            }
            i++;
        }
        return stringBuilder.toString();
}
//14
public String drawTriangle(int side){
        StringBuilder stringBuilder=new StringBuilder();
        int i=0;
    int k=side;
        while (i<side){
            int j=0;
            while (j<1) {

                stringBuilder.append("*".repeat(k));
                k--;
                j++;
            }
            stringBuilder.append('\n');
            i++;
        }
        return stringBuilder.toString();
}
    public String drawTriangle2(int side) {
        StringBuilder result = new StringBuilder();

        int row = side;
        while (row > 0) {
            int stars = row;  // Кількість зірочок у поточному рядку

            // Додаємо '*' у поточний рядок за допомогою методу repeat
            result.append("*".repeat(stars));

            result.append('\n');  // Перехід на новий рядок після кожного рядку '*'
            row--;
        }

        return result.toString();
    }
    //15
    public int sumQuads(int n){

int result=0;
        int a=1;
        while (a<=n){

            result+=a*a;
            a++;
        }
        return result;
    }
    //16
    public int countSumOfDigits(int number){
        int a=0;
        int result=0;
        int digitCount = (int) Math.log10(number) + 1;
        while (a<=digitCount){
            result+=(number / (int) Math.pow(10, a)) % 10;
            a++;
        }
        return result;
    }
    //17
    public int countBanknotes(int sum){
        int a=0;
        int result=0;
        while (a<=sum){
            while ((sum-a)>=500){
                result++;
                a+=500;
            }
            while ((sum-a)>=200){
                result++;
                a+=200;
            }
            while ((sum-a)>=100){
                result++;
                a+=100;
            }
            while ((sum-a)>=50){
                result++;
                a+=50;
            }
            while ((sum-a)>=20){
                result++;
                a+=20;
            }
            while ((sum-a)>=10){
                result++;
                a+=10;
            }
            while ((sum-a)>=5){
                result++;
                a+=5;
            }
            while ((sum-a)>=2){
                result++;
                a+=2;
            }
            while ((sum-a)>=1){
                result++;
                a+=1;
            }
            break;
        }

        return result;
    }
    private static final int[] availableBanknotes = {500, 200, 100, 50, 20, 10, 5, 2, 1};

    public int countBanknotes2(int sum) {
        int count = 0;
        int index = 0;

        while (sum > 0 && index < availableBanknotes.length) {
            int banknote = availableBanknotes[index];
            int banknoteCount = sum / banknote;

            if (banknoteCount > 0) {
                count += banknoteCount;
                sum %= banknote * banknoteCount;
            }

            index++;
        }

        return count;
    }
}

