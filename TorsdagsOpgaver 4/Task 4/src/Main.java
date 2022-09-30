<dependencies>
    <!--https://mvnrepository.com/artifact/org.processing/core -->
    <dependency>
        <groupId>org.processing</groupId>
        <artifactId>core</artifactId>
        <version>3.3.7</version>
    </dependency>
        <!--https://mvnrepository.com/artifact/org.processing/pde -->
    <dependency>
        <groupId>org.processing</groupId>
        <artifactId>pde</artifactId>
        <version>3.3.7</version>
    </dependency>
        <!--https://mvnrepository.com/artifact/org.processing/video -->
    <dependency>
        <groupId>org.processing</groupId>
        <artifactId>video</artifactId>
        <version>3.3.7</version>
    </dependency>

    <dependency>
     <groupId>org.openjdk.jol</groupId>
        <artifactId>jol-core</artifactId>
    <version>0.16</version>

</dependency>

</dependencies>

// == initialize battleground ==
    public static int[][]battleground=
        {
        {1,0,0,0,0},
        {1,0,0,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0}
        };

// == initialize battleMap ==
public static String[][]battleMap=
        {
        {"*|","0","1","2","3","4"},
        {"0|","*","*","*","*","*"},
        {"1|","*","*","*","*","*"},
        {"2|","*","*","*","*","*"},
        {"3|","*","*","*","*","*"},
        {"4|","*","*","*","*","*"},
        };

    public static void main(String[]args){

         boolean isRunning=true;
            int x;
            int y;

        while(isRunning){
        // 1 printer battleMap
            printBattleMap(battleMap);


        // 2 check if won
        boolean isWon=checkIfWon(battleground);

        if(isWon){
            System.out.println("You have destroyed the fleet!");
            break;
        }
        // 3 user input
        while(true){
            int[]pos=userInput();
            x=pos[0];
            y=pos[1];

        if(x>battleground[0].length-1||y>battleground[1].length-1){
            System.out.println("Coordinates are over the limit");
            }else{
            break;
            }

        }

        int hit=battleground[x][y];

        switch(hit){
        case 0:{
            System.out.println("You hit water!");
            battleMap[x+1][y+1]="W";
            break;
        }
        case 1:{
            System.out.println("HIT!!!!!!");
            battleMap[x+1][y+1]="H";
            battleground[x][y]=0;
            break;
        }
        }


        }
        }
public static int[]userInput(){

        System.out.println("Input your coordinates:");
        System.out.print("x: ");
        int x=input.nextInt();
        System.out.print("y: ");
        int y=input.nextInt();
        int[]coordinates={x,y};
        return coordinates;
    }

public static void printBattleMap(String[][]array){

        for(int i=0;i<array[0].length;i++){
        for(int j=0;j<array[1].length;j++){
        System.out.print(array[i][j]+" ");
            }
        System.out.println();
            }
    }

public static boolean checkIfWon(int[][]array){
         for(int i=0;i<array[0].length;i++){
          for(int j=0;j<array[1].length;j++){
            if(array[i][j]==1)return false;
            }
        }
        return true;
    }