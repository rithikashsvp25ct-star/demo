public class D8enum{
enum LANGUAGE{
 EN("English"),GR("German"),JP("Japanese"),TA("Tamil");
String description;
LANGUAGE(String description){
    this.description=description;

}
}
 static void main() {
    System.out.println("----------------");
    System.out.println("LANGUAGE");
    System.out.println("****************");
    System.out.println(LANGUAGE.EN+"-"+LANGUAGE.EN.description);
    System.out.println("****************");
    System.out.println(LANGUAGE.GR+"-"+LANGUAGE.GR.description);
    System.out.println("****************");
    System.out.println(LANGUAGE.JP+"-"+LANGUAGE.JP.description);
    System.out.println("****************"); 
    System.out.println(LANGUAGE.TA+"-"+LANGUAGE.TA.description);
    System.out.println("----------------"); 
}
}