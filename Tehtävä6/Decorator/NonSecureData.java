public class NonSecureData extends DataDecorator{

    public NonSecureData(IData data) {
        super(data);
    }

    @Override
    public String readData(String filename) {
        return "Not Crypted text: " + super.readData(filename);
    }

    @Override
    public void setData(String data, String filename) {
        super.setData(data, filename);
    }
    
}
