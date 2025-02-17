import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class LookupZip {

    public static Place parseLineLoc(String line) {
        String[] values = line.split(",");
        String zip = values[0].replace("\"", "");
        String city = values[2].replace("\"", "");
        String state = values[3].replace("\"", "");

        if (values.length < 4 || values[5].isEmpty() || values[6].isEmpty()) {
            return new Place(zip, city, state);
        } else {
            double latitude = Double.parseDouble(values[5]);
            double longitude = Double.parseDouble(values[6]);
            return new LocatedPlace(zip, city, state, latitude, longitude);
        }
    }

    public static Place parseLine(String line) {
        String[] values = line.split(",");
        String zip = values[0];
        String city = values[1];
        String state = values[2];

        if (values.length < 4) {
            return new Place(zip, city, state);
        } else {
            return new PopulatedPlace(zip, city, state, -1, -1, Integer.parseInt(values[3]));
        }
    }

    public static ExpandableArray<Place> readZipCodes(String f_uszip, String f_ziploc) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(f_uszip));
        //Place[] places = new Place[numEntries];
        ExpandableArray<Place> places = new ExpandableArray<Place>();

        scanner.nextLine(); //skip the header line
       
        int i=0;
        //precondition: numEntries == the number of lines in filename + 1
        while (scanner.hasNextLine()) {
            Place p = parseLine(scanner.nextLine());
            places.insert(p, i); //INSERT AT END
            i++;
        }

        scanner.close();

        scanner = new Scanner(new File(f_ziploc));
        scanner.nextLine(); //skip the header line

        while (scanner.hasNextLine()) {
            Place p = parseLineLoc(scanner.nextLine());
            
            int matchingZipIdx = places.find(p);
            if (matchingZipIdx == -1) {
                places.insert(p, i); //INSERT AT END
                i++;
            } else {
                //place / populated place exists, add location data.
                Place matchingZip = places.get(matchingZipIdx);
                if (matchingZip instanceof PopulatedPlace) {
                    PopulatedPlace pp = (PopulatedPlace) matchingZip;

                    pp.setLatitude(((LocatedPlace)p).getLatitude());
                    pp.setLongitude(((LocatedPlace)p).getLongitude());
                    places.set(pp, matchingZipIdx);
                } else {
                    //in uszip, but not populated.
                    p.setTown(matchingZip.getTown());
                    places.set(p, matchingZipIdx);
                }
            }
        }

        
        scanner.close();

        return places;
    }

    public static Place lookupZip(ExpandableArray<Place> places, String zip) {
        for (int i = 0; i < places.size(); i++) {
            if (places.get(i).getZip().equals(zip)) {
                return places.get(i);
            }
        }
        return null;
    }
}
