public class DataDecorator implements IData {
    protected IData dataToBeDecorated;

    public DataDecorator(IData data) {
        this.dataToBeDecorated = data;
    }

    @Override
    public void setData(String data, String key) {
        dataToBeDecorated.setData(data, key);
    }

    @Override
    public String readData(String key) {
        return dataToBeDecorated.readData(key);
    }

}
