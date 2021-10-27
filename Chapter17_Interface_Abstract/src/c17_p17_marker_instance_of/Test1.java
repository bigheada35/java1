package c17_p17_marker_instance_of;

public class Test1 {
	public static void main(String[] args) {

		//Printable pr = new Report("marker?");
		Printable pr = new Report("MARKER?");
		System.out.println(pr.getContents());
		printContents(pr);
		
	}
	
	// 주의 : 꼭 static 붙이기
	public static void printContents(Printable doc) {
		   if(doc instanceof Upper) {
		      System.out.println((doc.getContents()).toUpperCase());
		   }
		   else if(doc instanceof Lower) {
		      System.out.println((doc.getContents()).toLowerCase());
		   }
		   else
		      System.out.println(doc.getContents());
		}
	
}


interface Upper { }   // 마커 인터페이스
interface Lower { }   // 마커 인터페이스

interface Printable {
   String getContents();
}

class Report implements Printable, Upper {
//class Report implements Printable, Lower {
   String cons;

   Report(String cons) {
      this.cons = cons;
   }
   public String getContents() {
      return cons;
   }
}



