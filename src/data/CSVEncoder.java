package data;

import java.util.List;


public abstract class CSVEncoder<T> implements Encodable<T>{
    private String encodeFieldNames(){
        String[] fieldNames = getFieldNames();
        StringBuilder sb = new StringBuilder();

        sb.append(fieldNames[0]);
        for(int k = 1; k < fieldNames.length; k += 1){
            sb.append(",");
            sb.append(fieldNames[k]);
        }
        return sb.toString();
    }

    @Override
    public String encodeRecord(T type){
        String[] values = getValues(type);
        String output = values[0];
        for(int k = 1; k < values.length; k+=1){
            output += "," + values[k];
        }
        return output;
    }

    @Override
    public String encode(List<T> list){
        String output = "";
        output = encodeFieldNames() + "\n";
        for(T record : list){
            output += encodeRecord(record) + "\n";
        }
        return output;
    }
}
