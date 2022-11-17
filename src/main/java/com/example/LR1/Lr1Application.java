package com.example.LR1;

import com.google.gson.Gson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stax.StAXSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


@SpringBootApplication
@RestController
public class Lr1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lr1Application.class, args);
    }

    @GetMapping("/get")
    public String get(@RequestParam(value = "trid", defaultValue = "") String trid, @RequestParam(value = "name",
            defaultValue = "") String client) throws IOException, JAXBException, ParseException {
        File file = new File("src/main/resources/bank.xml");

        // Валидация
        boolean ok = schemaCheck();
        TranQueue tranQueue = new TranQueue();

        if (ok) {
            JAXBContext jaxbContext = JAXBContext.newInstance(TranQueue.class, Transactions.class, Client_list.class);

            // Анмаршалинг
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            tranQueue = (TranQueue) jaxbUnmarshaller.unmarshal(file);

            // Меняем объект
            Transaction trans = new Transaction();
            trans.setTran_id("997031BA-6D1E-4378-A6F0-0C57DC8D1FB9");
            trans.setTran_dadd(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss").parse("2021-12-07T11:35:46.683"));

            TypeTr typeTr = new TypeTr();
            typeTr.setTrtp_name("refill");
            typeTr.setTrtp_desc("Пополнение счёта");

            trans.setTran_type(typeTr);

            Acc_sender acc_sender = new Acc_sender();
            acc_sender.setAccs("id_B9599464-A973-4926-913D-344EF3A7B330");

            trans.setAcc_sender(acc_sender);

            Acc_recip acc_recip = new Acc_recip();
            acc_recip.setAccr("id_A9599464-A973-4926-913D-344EF3A7B330");

            trans.setAcc_recip(acc_recip);

            Model model = new Model();
            model.setTr_clid("4D01AF61-5817-4F0A-8357-4CF902EA4234");
            model.setSum(Float.valueOf("300.00"));

            trans.setModel(model);
            trans.setStatus("success");

            tranQueue.transactions.getTransaction().add(trans);

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss");

            // Создаём XML с измененными данными
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "src/main/resources/XMLScheme.xsd");

            OutputStream os = new FileOutputStream(".\\bank_xml.xml");
            jaxbMarshaller.marshal(tranQueue, os);

            try (FileWriter writer = new FileWriter("bank_json.json", false)) {
                writer.write(new Gson().toJson(tranQueue));
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            for (Transaction i : tranQueue.transactions.transaction) {
                if (i.tran_id.equals(trid)) {
                    return new Gson().toJson(i);
                }
            }

            for (Client i : tranQueue.client_list.client) {
                if (i.cl_name.equals(client)) {
                    return new Gson().toJson(i);
                }
            }
            return "{\"error\":\"Данных не найдено\"}";
        }
        return new Gson().toJson(tranQueue);
    }

    public static boolean schemaCheck() {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(".\\src\\main\\resources\\XMLScheme.xsd"));
            Validator validator = schema.newValidator();
            XMLStreamReader reader =
                    XMLInputFactory.newInstance().createXMLStreamReader(Files.newInputStream(Paths.get(".\\src\\main" +
                            "\\resources\\bank.xml")));
            validator.validate(new StAXSource(reader));

            System.out.println("XML-doc is correct");
            return true;
        } catch (Exception e) {
            System.out.println("XML-doc is not correct");
            return false;
        }
    }

    @GetMapping("/")
    public String list() throws IOException, JAXBException, ParseException {
        File file = new File("src/main/resources/bank.xml");

        // Валидация
        boolean ok = schemaCheck();
        TranQueue tranQueue = new TranQueue();

        if (ok) {
            JAXBContext jaxbContext = JAXBContext.newInstance(TranQueue.class, Transactions.class);

            // Анмаршалинг
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            tranQueue = (TranQueue) jaxbUnmarshaller.unmarshal(file);

            // Меняем объект
            Transaction trans = new Transaction();
            trans.setTran_id("997031BA-6D1E-4378-A6F0-0C57DC8D1FB9");
            trans.setTran_dadd(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.sss").parse("2021-12-07T11:35:46.683"));

            TypeTr typeTr = new TypeTr();
            typeTr.setTrtp_name("refill");
            typeTr.setTrtp_desc("Пополнение счёта");

            trans.setTran_type(typeTr);

            Acc_sender acc_sender = new Acc_sender();
            acc_sender.setAccs("id_B9599464-A973-4926-913D-344EF3A7B330");

            trans.setAcc_sender(acc_sender);

            Acc_recip acc_recip = new Acc_recip();
            acc_recip.setAccr("id_A9599464-A973-4926-913D-344EF3A7B330");

            trans.setAcc_recip(acc_recip);

            Model model = new Model();
            model.setTr_clid("4D01AF61-5817-4F0A-8357-4CF902EA4234");
            model.setSum(Float.valueOf("300.00"));

            trans.setModel(model);
            trans.setStatus("success");

            tranQueue.transactions.getTransaction().add(trans);

            // Создаём XML с измененными данными
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "src/main/resources/XMLScheme.xsd");

            OutputStream os = new FileOutputStream(".\\bank_xml.xml");
            jaxbMarshaller.marshal(tranQueue, os);

            try (FileWriter writer = new FileWriter("bank_json.json", false)) {
                writer.write(new Gson().toJson(tranQueue));
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return new Gson().toJson(tranQueue);
    }
}