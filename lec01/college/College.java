import java.util.Scanner;

//Part a: create a College class with name, number of students, year founded
public class College {
    private String name;
    private int numStudents;
    private int yearFounded;
    
    public College(String myName, int numStudents, int yearFounded) {
        name = myName; 
        this.numStudents = numStudents;
        this.yearFounded = yearFounded;
    }

    public String getName() {
        return name;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int year) {
        if (year < 0) return;
        this.yearFounded = year;
    }

    public String toString() {
        return name;
    } 

    public static void main(String[] args) {
        College brynMawr = new College("Bryn Mawr", 1400, 1885);
        System.out.println(brynMawr);
    
        College haverford = new College("Haverford", 1800, 1833);

        College swat = new College("Swat", 1500, 1864);

        College[] arr = new College[3];
        arr[0] = brynMawr;
        arr[1]  = haverford;
        arr[2] = swat;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a college name: ");
        String name = sc.nextLine();

        // for i in range (0, len(arr))
        for (int i=0; i<arr.length; i++) {
            if (arr[i].getName().equals(name)) {
                System.out.println(arr[i].getYearFounded()); 
            }
        }
}
}

//Part b: In the main, create 3 colleges and put them in an array

//Part c: Take college name as input and print the year it was founded
