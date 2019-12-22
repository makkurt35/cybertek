package day32_custommethods;
  /*
  openBrowser
  navigateToEtsy
  searchForWoodenSpoon
  printResults
   */
public class EtsySearch {
      public static void main(String[] args) {
          openBrowser();
          navigateToEtsy();
          searchForWoodenSpoon();
          printResults();
         // GotoLunchBreak(2:20 PM);
      }
    /*
    openBrowser:
    "Click on Chrome icon"
    "Wait for browser to load"
     */
    public static void openBrowser(){
        System.out.println("-----------");
        System.out.println("Click Chrome Icon");
        System.out.println("Wait for browser to load");
        System.out.println("-----------");
    }

    /*
    navigateToEtsy:
    "Type etsy.com to address bar"
    "Click on Enter"
     */
    public static void navigateToEtsy(){
        System.out.println("-----------");
        System.out.println("Type etsy.com to address bar");
        System.out.println("Click on Enter");
        System.out.println("-----------");
    }

    /*
    searchForWoodenSpoon:
    "Type wooden spoon into search field"
    "Click on search icon"
     */
    public static void searchForWoodenSpoon(){
        System.out.println("-----------");
        System.out.println("Type wooden spoon into search field");
        System.out.println("Click on search icon");
        System.out.println("-----------");
    }

    /*
    printResults:
        "Total results: wooden spoon (14,581 Results)"
     */
    public static void printResults(){
        System.out.println("Total results: wooden spoon (14,581 Results)");
    }




}
