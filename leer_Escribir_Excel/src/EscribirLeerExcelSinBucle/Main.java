package EscribirLeerExcelSinBucle;

public class Main {

	public static void main(String[] args) {
		
		//librer�a poi
		Excel excel = new Excel("tmp/ExcelDeEjemplo.xlsx");
		excel.escribirExcel();
		excel.leerExcel();
	}

}
