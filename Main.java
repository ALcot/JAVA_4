class Main {
  public static void main(String[] args) {
    // 引数に「ALcot Nelly」を渡す
    printData("ALcot Nelly");
    
    // 引数に「HAWAI MOAI USAGI」を渡す
    printData("HAWAI MOAI USAGI");
    
  }

  // 引数を受け取るようにする
  public static void printData(String name) {
    // 「私の名前は◯◯です」と出力されるように書き換える
    System.out.println("私の名前は" + name + "です");
    
  }
}
