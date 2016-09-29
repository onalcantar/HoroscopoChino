package com.noealcantar.horoscopochino;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by noealcantar on 16-09-29.
 */

public class AssetHelper {

    private Context context;
    private String fileName;

    public AssetHelper(Context context, String fileName){
        this.context = context;
        this.fileName = fileName;
    }

    public String loadData(){
        String texto = "";

        try{
            InputStream stream = this.context.getAssets().open(fileName);
            int size = stream.available();
            byte[] buffer = new byte[size];
            stream.read(buffer);
            stream.close();
            texto =  new String(buffer);
        }catch (IOException ex){
            texto = "";
        }

        return texto;
    }

}
