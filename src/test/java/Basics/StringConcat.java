package Basics;

public class StringConcat {

	public void stringAdd() {

		String url = "https://atlas-ho-it-sst1-i-ie-enf.service.np.iptho.co.uk/Caseworking/ipt-ms-service-delivery-view-webui/personview?personId=1358033068&searchTerm=1212-0000-0432-6850";
		String idd = url.substring(url.indexOf("=") + 1, url.indexOf("&"));
		System.out.println(idd);

		// String creation
		String s1 = "Gourav";
		String s2 = "Sourabh";

		// Adding the string
		String s3 = s1 + s2;

		// Printing the String of addition
		System.out.println(s3);
	}

	public static void main(String[] args) {

		// calling the function
		StringConcat sc = new StringConcat();
		sc.stringAdd();

	}

}
