class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
  public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true; 
    }
    public static int count(BinNode<Integer> tree){
        if(tree==null)
            return 0;
        if(tree.hasLeft() && !tree.hasRight())
            if(isPrime(tree.getLeft().getValue())){
                return 1+count(tree.getLeft()) + count(tree.getRight());
            }
        if(!tree.hasLeft() && tree.hasRight())
            if(isPrime(tree.getRight().getValue())){
                return 1+count(tree.getLeft()) + count(tree.getRight());
            }
        if(tree.hasRight() && tree.hasLeft())
            if(isPrime(tree.getRight().getValue()+tree.getLeft().getValue()))
            return 1+count(tree.getLeft())+count(tree.getRight());
            
        return count(tree.getLeft())+count(tree.getRight());
        
}
}
