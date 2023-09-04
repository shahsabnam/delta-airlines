package com.delta_airlines.utilities;

import com.delta_airlines.entity.Reservation;


import com.itextpdf.text.Document;

import com.itextpdf.text.Element;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;


import org.springframework.stereotype.Component;

@Component
public class PDFgenerator {
	
	
	
 public void generateItinerary(Reservation reservation, String filePath) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
           document.add(generateTable(reservation));
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
	public PdfPTable generateTable(Reservation reservation) {
		
		PdfPTable parentTable = new PdfPTable(1); // Parent container table
	    parentTable.setWidthPercentage(100);
		
		PdfPTable table=new PdfPTable(2);
		table.setWidthPercentage(100);
		
		 PdfPCell c1=new  PdfPCell (new Phrase("Flight Itinerary"));
		 c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		c1.setColspan(2);
		table.addCell(c1);
		
		
		 PdfPCell c2=new  PdfPCell (new Phrase("Passenger Details"));
		 c2.setHorizontalAlignment(Element.ALIGN_CENTER);
		 c2.setColspan(2);
		table.addCell(c2);
		
		table.addCell("First Name");
		table.addCell(reservation.getPassenger().getFirstName());
		table.addCell("Last Name");
		table.addCell(reservation.getPassenger().getLastName());
		table.addCell("Email Id");
		table.addCell(reservation.getPassenger().getEmail());
		table.addCell("Phone");
		table.addCell(reservation.getPassenger().getPhone());
		
		
		
		PdfPTable table1=new PdfPTable(2);
		table1.setWidthPercentage(100);
		
		 PdfPCell c3=new  PdfPCell (new Phrase("Flight Details"));
		 c3.setHorizontalAlignment(Element.ALIGN_CENTER);
		 c3.setColspan(2);
		table.addCell(c3);
		
		table.addCell("Flight Number");
		table.addCell(reservation.getFlight().getFlightNumber());
		table.addCell(" Operating Airlines");
		table.addCell(reservation.getFlight().getOperatingAirlines());
		table.addCell("Departure City");
		table.addCell(reservation.getFlight().getDepartureCity());
		table.addCell("Arrival City");
		table.addCell(reservation.getFlight().getArrivalCity());
		table.addCell(" Departure Date");
		table.addCell(reservation.getFlight().getDateOfDeparture().toString());
		
		parentTable.addCell(new PdfPCell(table)); // Add the first table to the parent container table
	    parentTable.addCell(new PdfPCell(table1)); // Add the second table to the parent container table
	    
	    return parentTable; // Return the parent container table with both tables
	}
		
	
	
}

