package com.mjv.app.service;

import com.mjv.app.enumaration.GenderType;
import com.mjv.app.model.Customer;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customerList;

    public CustomerService() {
    }

    public Customer createCustomer(String firstName,
                                   String lastName,
                                   String nationalCode,
                                   Date birthDate,
                                   GenderType gender,
                                   Boolean isActive,
                                   String phoneNumber,
                                   String idCardSer,
                                   Integer idCardNum) {
        Customer customer = new Customer();
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setNationalCode(nationalCode);
        customer.setBirthDate(birthDate);
        customer.setGender(gender);
        customer.setActive(isActive);
        customer.setPhoneNumber(phoneNumber);
        customer.setIdCardSer(idCardSer);
        customer.setIdCardNum(idCardNum);
        return customer;
    }


    public List<Customer> readCustomerDataFromFile() {
        FileService fileService = new FileService();
        List<String> fileData = fileService.readFile("account.csv");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        if (customerList == null)
            customerList = new ArrayList<>();
        else
            customerList.clear();
        for (String line : fileData) {
            String[] splitedData = line.split(",");
            Date date = null;
            try {
                date = simpleDateFormat.parse(splitedData[3]);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Customer customer = this.createCustomer(splitedData[0], // firstName
                    splitedData[1], //lastName
                    splitedData[2], //nationalCode
                    date,  //birthDate
                    GenderType.valueOf(splitedData[4]),  //gender
                    Boolean.valueOf(splitedData[5]),  //isActive
                    splitedData[6], //phoneNumber
                    splitedData[7], //idCardSer
                    Integer.valueOf(splitedData[8])//idCardNum
            );
            customerList.add(customer);
        }
        return customerList;

    }

    public void saveCustomerDataToFile() {
        FileService fileService = new FileService();
        List<String> fileContent = new ArrayList<String>();
        for (Customer customer : customerList) {
            fileContent.add(customer.toString());
        }
        fileService.writeFile("account.csv", fileContent);
    }

    public void addCustomer(String firstName,
                            String lastName,
                            String nationalCode,
                            Date birthDate,
                            GenderType gender,
                            Boolean isActive,
                            String phoneNumber,
                            String idCardSer,
                            Integer idCardNum) {
        Customer c = createCustomer(firstName, lastName, nationalCode,
                birthDate, gender, isActive,
                phoneNumber, idCardSer, idCardNum);
        customerList.add(c);

    }

    public void removeCustomer(String nationalCode) {
        for (Customer c : customerList) {
            if (nationalCode.equals(c.getNationalCode())) {
                customerList.remove(c);
                break;
            }
        }
    }
}
