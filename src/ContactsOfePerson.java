import java.util.List;

public class ContactsOfePerson {
    private String name;
    private String surname;
    private List<String> phones;
    private List<String> sites;
    private Adress adress;

    @Override
    public String toString() {
        StringBuilder phoneList = new StringBuilder();
        phoneList.append("Phone number:");
        int phoneNum = 1;
        for(String phone : phones) {
            phoneList.append("\n\t\t" + phoneNum + ") " + phone);
            phoneNum++;
        }

        StringBuilder webList = new StringBuilder();
        webList.append("Web sites:");
        int siteNum = 1;
        for(String site : sites) {
            webList.append("\n\t\t" + siteNum + ") "+ site);
            siteNum++;
        }
        return name + " " + surname +
                "\n\t" + phoneList +
                "\n\t" + webList +
                "\n\tAdress:" +
                "\n\t" +  adress;
    }
}