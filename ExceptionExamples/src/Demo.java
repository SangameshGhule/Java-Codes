//public class Demo {
//
//    public static void main(String[] args) {
//        System.out.println("main( ) method started...");
//        try {
//            System.out.println("try block start");
//            String s = null;
//            s.length();// NPE
//            System.out.println("try block end");
//        } catch (Exception e) {
//            System.out.println("in catch block");
//            e.printStackTrace();
//        }
//        System.out.println("main( ) method ended...");
//    }
//}


//// in below scenario catch block will not be executed bcz there is no exception in try block
//public class Demo {
//
//    public static void main(String[] args) {
//        System.out.println("main( ) method started...");
//        try {
//            System.out.println("try block start");
//            String s = "hi";
//            int i = s.length();
//            System.out.println("try block end");
//        } catch (Exception e) {
//            System.out.println("in catch block");
//            e.printStackTrace();
//        }
//        System.out.println("main( ) method ended...");
//    }
//}

//// we can write one try block with multiple catch blocks also like below
//public class Demo {
//
//	public static void main(String[] args) {
//		System.out.println("main( ) method started...");
//		try {
//			System.out.println("try block start");
//			String s = "hi";
//			int i = s.length();
//			System.out.println("try block end");
//		} catch (ArithmeticException e) {
//			System.out.println("in catch block");
//			e.printStackTrace();
//		} catch (NullPointerException e) {
//			e.printStackTrace();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("main( ) method ended...");
//	}
//}

//Note: Catch blocks order should be child to parent

// below program will fail at compile time because of un-reachable second catch block
//public class Demo {
//
//    public static void main(String[] args) {
//        System.out.println("main( ) method started...");
//        try {
//            System.out.println("try block start");
//            String s = null;
//            s.length();
//            System.out.println("try block end");
//        }catch (Exception ne) {
//            System.out.println(ne.fillInStackTrace());
//        }
//        System.out.println("main( ) method ended...");
//    }
//}


// java program with try-catch-finally scenario
//public class Demo {
//
//    public static void main(String[] args) {
//        System.out.println("main( ) method started...");
//        try {
//            System.out.println("try block - start");
//            int i = 6 / 0;
//            System.out.println("try block - end");
//        } catch (Exception e) {
//            System.out.println("catch block");
//            System.out.println(e.fillInStackTrace());
//        } finally {
//            System.out.println("finally - block");
//        }
//        System.out.println("main( ) method ended...");
//    }
//}


// java program with try-finally scenario

//public class Demo {
//
//    public static void main(String[] args) {
//        System.out.println("main( ) method started...");
//        try {
//            System.out.println("try block - start");
//            int i = 10 / 0;
//            System.out.println("try block - end");
//        } finally {
//            System.out.println("finally - block");
//        }
//        System.out.println("main( ) method ended...");
//    }
//}